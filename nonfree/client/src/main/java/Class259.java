import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class259 {

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "[Lclient!nf;")
	private Class96_Sub1[] aClass96_Sub1Array2;

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "Lclient!ha;")
	private Class6_Sub15 aClass6_Sub15_8;

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "Lclient!no;")
	private final Class179 aClass179_4;

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "Lclient!mf;")
	private final Class165 aClass165_3;

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "Lclient!ae;")
	private Class6_Sub1_Sub1_Sub1 aClass6_Sub1_Sub1_Sub1_2;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!no;Lclient!mf;)V")
	public Class259(@OriginalArg(0) Class179 arg0, @OriginalArg(1) Class165 arg1) {
		this.aClass179_4 = arg0;
		this.aClass165_3 = arg1;
		if (!this.aClass179_4.method4141()) {
			this.aClass6_Sub1_Sub1_Sub1_2 = this.aClass179_4.method4130(true, (byte) 0, 255, 255);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ap;ZLclient!ap;ZI)Lclient!nf;")
	private Class96_Sub1 method5887(@OriginalArg(0) Class14 arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(4) int arg2) {
		if (this.aClass6_Sub15_8 == null) {
			throw new RuntimeException();
		}
		this.aClass6_Sub15_8.anInt3487 = arg2 * 8 + 5;
		if (this.aClass6_Sub15_8.aByteArray51.length <= this.aClass6_Sub15_8.anInt3487) {
			throw new RuntimeException();
		} else if (this.aClass96_Sub1Array2[arg2] == null) {
			@Pc(54) int local54 = this.aClass6_Sub15_8.method3109();
			@Pc(59) int local59 = this.aClass6_Sub15_8.method3109();
			@Pc(73) Class96_Sub1 local73 = new Class96_Sub1(arg2, arg1, arg0, this.aClass179_4, this.aClass165_3, local54, local59, true);
			this.aClass96_Sub1Array2[arg2] = local73;
			return local73;
		} else {
			return this.aClass96_Sub1Array2[arg2];
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)Z")
	public boolean method5888() {
		if (this.aClass6_Sub15_8 != null) {
			return true;
		}
		if (this.aClass6_Sub1_Sub1_Sub1_2 == null) {
			if (this.aClass179_4.method4141()) {
				return false;
			}
			this.aClass6_Sub1_Sub1_Sub1_2 = this.aClass179_4.method4130(true, (byte) 0, 255, 255);
		}
		if (this.aClass6_Sub1_Sub1_Sub1_2.aBoolean481) {
			return false;
		} else {
			this.aClass6_Sub15_8 = new Class6_Sub15(this.aClass6_Sub1_Sub1_Sub1_2.method5786());
			this.aClass96_Sub1Array2 = new Class96_Sub1[(this.aClass6_Sub15_8.aByteArray51.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILclient!ap;Lclient!ap;)Lclient!nf;")
	public Class96_Sub1 method5890(@OriginalArg(1) int arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) Class14 arg2) {
		return this.method5887(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
	public void method5893() {
		if (this.aClass96_Sub1Array2 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass96_Sub1Array2.length; local11++) {
			if (this.aClass96_Sub1Array2[local11] != null) {
				this.aClass96_Sub1Array2[local11].method4058();
			}
		}
		for (@Pc(32) int local32 = 0; local32 < this.aClass96_Sub1Array2.length; local32++) {
			if (this.aClass96_Sub1Array2[local32] != null) {
				this.aClass96_Sub1Array2[local32].method4057();
			}
		}
	}
}
