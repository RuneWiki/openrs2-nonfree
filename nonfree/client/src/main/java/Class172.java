import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class172 {

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "Lclient!ti;")
	private Class1_Sub14 aClass1_Sub14_4;

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "[Lclient!nr;")
	private Class113_Sub1[] aClass113_Sub1Array2;

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "Lclient!ml;")
	private final Class164 aClass164_3;

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "Lclient!ik;")
	private final Class119 aClass119_1;

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "Lclient!wd;")
	private Class1_Sub1_Sub11_Sub2 aClass1_Sub1_Sub11_Sub2_2;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lclient!ml;Lclient!ik;)V")
	public Class172(@OriginalArg(0) Class164 arg0, @OriginalArg(1) Class119 arg1) {
		this.aClass164_3 = arg0;
		this.aClass119_1 = arg1;
		if (!this.aClass164_3.method3578()) {
			this.aClass1_Sub1_Sub11_Sub2_2 = this.aClass164_3.method3588(255, (byte) 0, true, 255);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)Z")
	public boolean method3698() {
		if (this.aClass1_Sub14_4 != null) {
			return true;
		}
		if (this.aClass1_Sub1_Sub11_Sub2_2 == null) {
			if (this.aClass164_3.method3578()) {
				return false;
			}
			this.aClass1_Sub1_Sub11_Sub2_2 = this.aClass164_3.method3588(255, (byte) 0, true, 255);
		}
		if (this.aClass1_Sub1_Sub11_Sub2_2.aBoolean649) {
			return false;
		} else {
			this.aClass1_Sub14_4 = new Class1_Sub14(this.aClass1_Sub1_Sub11_Sub2_2.method5898());
			this.aClass113_Sub1Array2 = new Class113_Sub1[(this.aClass1_Sub14_4.aByteArray65.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BILclient!kn;Lclient!kn;)Lclient!nr;")
	public Class113_Sub1 method3699(@OriginalArg(1) int arg0, @OriginalArg(2) Class141 arg1, @OriginalArg(3) Class141 arg2) {
		return this.method3702(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!kn;Lclient!kn;IZI)Lclient!nr;")
	private Class113_Sub1 method3702(@OriginalArg(0) Class141 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(4) int arg2) {
		if (this.aClass1_Sub14_4 == null) {
			throw new RuntimeException();
		}
		this.aClass1_Sub14_4.anInt5695 = arg2 * 8 + 5;
		if (this.aClass1_Sub14_4.aByteArray65.length <= this.aClass1_Sub14_4.anInt5695) {
			throw new RuntimeException();
		} else if (this.aClass113_Sub1Array2[arg2] == null) {
			@Pc(51) int local51 = this.aClass1_Sub14_4.method4500();
			@Pc(56) int local56 = this.aClass1_Sub14_4.method4500();
			@Pc(70) Class113_Sub1 local70 = new Class113_Sub1(arg2, arg0, arg1, this.aClass164_3, this.aClass119_1, local51, local56, true);
			this.aClass113_Sub1Array2[arg2] = local70;
			return local70;
		} else {
			return this.aClass113_Sub1Array2[arg2];
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
	public void method3703() {
		if (this.aClass113_Sub1Array2 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass113_Sub1Array2.length; local11++) {
			if (this.aClass113_Sub1Array2[local11] != null) {
				this.aClass113_Sub1Array2[local11].method3795();
			}
		}
		for (@Pc(32) int local32 = 0; local32 < this.aClass113_Sub1Array2.length; local32++) {
			if (this.aClass113_Sub1Array2[local32] != null) {
				this.aClass113_Sub1Array2[local32].method3791();
			}
		}
	}
}
