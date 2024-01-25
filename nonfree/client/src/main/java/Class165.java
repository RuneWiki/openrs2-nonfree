import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class165 {

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "Lclient!rp;")
	private Class3_Sub5 aClass3_Sub5_7;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "[Lclient!kn;")
	private Class135_Sub1[] aClass135_Sub1Array3;

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "Lclient!ci;")
	private final Class40 aClass40_2;

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "Lclient!al;")
	private final Class11 aClass11_2;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "Lclient!qj;")
	private Class3_Sub7_Sub2_Sub2 aClass3_Sub7_Sub2_Sub2_2;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lclient!al;Lclient!ci;)V")
	public Class165(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class40 arg1) {
		this.aClass40_2 = arg1;
		this.aClass11_2 = arg0;
		if (!this.aClass11_2.method158()) {
			this.aClass3_Sub7_Sub2_Sub2_2 = this.aClass11_2.method157(true, 255, 255, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!rg;Lclient!rg;I)Lclient!kn;")
	public Class135_Sub1 method3843(@OriginalArg(1) Class204 arg0, @OriginalArg(2) Class204 arg1, @OriginalArg(3) int arg2) {
		return this.method3846(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)Z")
	public boolean method3845() {
		if (this.aClass3_Sub5_7 != null) {
			return true;
		}
		if (this.aClass3_Sub7_Sub2_Sub2_2 == null) {
			if (this.aClass11_2.method158()) {
				return false;
			}
			this.aClass3_Sub7_Sub2_Sub2_2 = this.aClass11_2.method157(true, 255, 255, (byte) 0);
		}
		if (this.aClass3_Sub7_Sub2_Sub2_2.aBoolean387) {
			return false;
		} else {
			this.aClass3_Sub5_7 = new Class3_Sub5(this.aClass3_Sub7_Sub2_Sub2_2.method4473());
			this.aClass135_Sub1Array3 = new Class135_Sub1[(this.aClass3_Sub5_7.aByteArray42.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!rg;ZILclient!rg;Z)Lclient!kn;")
	private Class135_Sub1 method3846(@OriginalArg(0) Class204 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class204 arg2) {
		if (this.aClass3_Sub5_7 == null) {
			throw new RuntimeException();
		}
		this.aClass3_Sub5_7.anInt3121 = arg1 * 8 + 5;
		if (this.aClass3_Sub5_7.anInt3121 >= this.aClass3_Sub5_7.aByteArray42.length) {
			throw new RuntimeException();
		} else if (this.aClass135_Sub1Array3[arg1] == null) {
			@Pc(45) int local45 = this.aClass3_Sub5_7.method2726();
			@Pc(61) int local61 = this.aClass3_Sub5_7.method2726();
			@Pc(75) Class135_Sub1 local75 = new Class135_Sub1(arg1, arg0, arg2, this.aClass11_2, this.aClass40_2, local45, local61, true);
			this.aClass135_Sub1Array3[arg1] = local75;
			return local75;
		} else {
			return this.aClass135_Sub1Array3[arg1];
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
	public void method3847() {
		if (this.aClass135_Sub1Array3 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass135_Sub1Array3.length; local11++) {
			if (this.aClass135_Sub1Array3[local11] != null) {
				this.aClass135_Sub1Array3[local11].method2992();
			}
		}
		for (@Pc(38) int local38 = 0; local38 < this.aClass135_Sub1Array3.length; local38++) {
			if (this.aClass135_Sub1Array3[local38] != null) {
				this.aClass135_Sub1Array3[local38].method2988();
			}
		}
	}
}
