import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class61 {

	@OriginalMember(owner = "client!fi", name = "j", descriptor = "[Lclient!ko;")
	private Class121_Sub1[] aClass121_Sub1Array1;

	@OriginalMember(owner = "client!fi", name = "l", descriptor = "Lclient!jg;")
	private Class14_Sub4 aClass14_Sub4_4;

	@OriginalMember(owner = "client!fi", name = "m", descriptor = "Lclient!cq;")
	private final Class35 aClass35_1;

	@OriginalMember(owner = "client!fi", name = "n", descriptor = "Lclient!bi;")
	private final Class21 aClass21_2;

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "Lclient!ur;")
	private Class14_Sub2_Sub16_Sub2 aClass14_Sub2_Sub16_Sub2_2;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!cq;Lclient!bi;)V")
	public Class61(@OriginalArg(0) Class35 arg0, @OriginalArg(1) Class21 arg1) {
		this.aClass35_1 = arg0;
		this.aClass21_2 = arg1;
		if (!this.aClass35_1.method1153()) {
			this.aClass14_Sub2_Sub16_Sub2_2 = this.aClass35_1.method1154((byte) 0, 255, true, 255);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILclient!ug;IZLclient!ug;)Lclient!ko;")
	private Class121_Sub1 method2076(@OriginalArg(0) int arg0, @OriginalArg(1) Class199 arg1, @OriginalArg(4) Class199 arg2) {
		if (this.aClass14_Sub4_4 == null) {
			throw new RuntimeException();
		}
		this.aClass14_Sub4_4.anInt2637 = arg0 * 8 + 5;
		if (this.aClass14_Sub4_4.aByteArray74.length <= this.aClass14_Sub4_4.anInt2637) {
			throw new RuntimeException();
		} else if (this.aClass121_Sub1Array1[arg0] == null) {
			@Pc(56) int local56 = this.aClass14_Sub4_4.method2510();
			@Pc(61) int local61 = this.aClass14_Sub4_4.method2510();
			@Pc(75) Class121_Sub1 local75 = new Class121_Sub1(arg0, arg2, arg1, this.aClass35_1, this.aClass21_2, local56, local61, true);
			this.aClass121_Sub1Array1[arg0] = local75;
			return local75;
		} else {
			return this.aClass121_Sub1Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)Z")
	public boolean method2078() {
		if (this.aClass14_Sub4_4 != null) {
			return true;
		}
		if (this.aClass14_Sub2_Sub16_Sub2_2 == null) {
			if (this.aClass35_1.method1153()) {
				return false;
			}
			this.aClass14_Sub2_Sub16_Sub2_2 = this.aClass35_1.method1154((byte) 0, 255, true, 255);
		}
		if (this.aClass14_Sub2_Sub16_Sub2_2.aBoolean428) {
			return false;
		} else {
			this.aClass14_Sub4_4 = new Class14_Sub4(this.aClass14_Sub2_Sub16_Sub2_2.method5613());
			this.aClass121_Sub1Array1 = new Class121_Sub1[(this.aClass14_Sub4_4.aByteArray74.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!ug;BILclient!ug;)Lclient!ko;")
	public Class121_Sub1 method2082(@OriginalArg(0) Class199 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class199 arg2) {
		return this.method2076(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
	public void method2083() {
		if (this.aClass121_Sub1Array1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass121_Sub1Array1.length; local11++) {
			if (this.aClass121_Sub1Array1[local11] != null) {
				this.aClass121_Sub1Array1[local11].method3326();
			}
		}
		for (@Pc(40) int local40 = 0; local40 < this.aClass121_Sub1Array1.length; local40++) {
			if (this.aClass121_Sub1Array1[local40] != null) {
				this.aClass121_Sub1Array1[local40].method3325();
			}
		}
	}
}
