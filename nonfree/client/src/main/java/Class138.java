import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class138 {

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "[Lclient!go;")
	private Class82_Sub1[] aClass82_Sub1Array2;

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "Lclient!rg;")
	private Class5_Sub12 aClass5_Sub12_4;

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "Lclient!pn;")
	private final Class162 aClass162_3;

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "Lclient!ee;")
	private final Class56 aClass56_3;

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "Lclient!n;")
	private Class5_Sub1_Sub4_Sub1 aClass5_Sub1_Sub4_Sub1_1;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lclient!pn;Lclient!ee;)V")
	public Class138(@OriginalArg(0) Class162 arg0, @OriginalArg(1) Class56 arg1) {
		this.aClass162_3 = arg0;
		this.aClass56_3 = arg1;
		if (!this.aClass162_3.method4445()) {
			this.aClass5_Sub1_Sub4_Sub1_1 = this.aClass162_3.method4453((byte) 0, true, 255, 255);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)Z")
	public boolean method3848() {
		if (this.aClass5_Sub12_4 != null) {
			return true;
		}
		if (this.aClass5_Sub1_Sub4_Sub1_1 == null) {
			if (this.aClass162_3.method4445()) {
				return false;
			}
			this.aClass5_Sub1_Sub4_Sub1_1 = this.aClass162_3.method4453((byte) 0, true, 255, 255);
		}
		if (this.aClass5_Sub1_Sub4_Sub1_1.aBoolean467) {
			return false;
		} else {
			this.aClass5_Sub12_4 = new Class5_Sub12(this.aClass5_Sub1_Sub4_Sub1_1.method5000());
			this.aClass82_Sub1Array2 = new Class82_Sub1[(this.aClass5_Sub12_4.aByteArray90.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!nf;Lclient!nf;II)Lclient!go;")
	public Class82_Sub1 method3849(@OriginalArg(0) Class140 arg0, @OriginalArg(1) Class140 arg1, @OriginalArg(2) int arg2) {
		return this.method3850(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!nf;Lclient!nf;ZB)Lclient!go;")
	private Class82_Sub1 method3850(@OriginalArg(0) int arg0, @OriginalArg(1) Class140 arg1, @OriginalArg(2) Class140 arg2) {
		if (this.aClass5_Sub12_4 == null) {
			throw new RuntimeException();
		}
		this.aClass5_Sub12_4.anInt5731 = arg0 * 8 + 5;
		if (this.aClass5_Sub12_4.anInt5731 >= this.aClass5_Sub12_4.aByteArray90.length) {
			throw new RuntimeException();
		} else if (this.aClass82_Sub1Array2[arg0] == null) {
			@Pc(51) int local51 = this.aClass5_Sub12_4.method5067();
			@Pc(58) int local58 = this.aClass5_Sub12_4.method5067();
			@Pc(72) Class82_Sub1 local72 = new Class82_Sub1(arg0, arg2, arg1, this.aClass162_3, this.aClass56_3, local51, local58, true);
			this.aClass82_Sub1Array2[arg0] = local72;
			return local72;
		} else {
			return this.aClass82_Sub1Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
	public void method3852() {
		if (this.aClass82_Sub1Array2 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass82_Sub1Array2.length; local11++) {
			if (this.aClass82_Sub1Array2[local11] != null) {
				this.aClass82_Sub1Array2[local11].method1939();
			}
		}
		for (@Pc(34) int local34 = 0; local34 < this.aClass82_Sub1Array2.length; local34++) {
			if (this.aClass82_Sub1Array2[local34] != null) {
				this.aClass82_Sub1Array2[local34].method1940();
			}
		}
	}
}
