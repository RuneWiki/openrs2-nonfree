import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class119 {

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "Lclient!fd;")
	private Class4_Sub10 aClass4_Sub10_6;

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "[Lclient!wb;")
	private Class62_Sub1[] aClass62_Sub1Array1;

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "Lclient!en;")
	private Class51 aClass51_1;

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "Lclient!ja;")
	private Class93 aClass93_2;

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "Lclient!ul;")
	private Class4_Sub3_Sub1_Sub2 aClass4_Sub3_Sub1_Sub2_2;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lclient!en;Lclient!ja;)V")
	public Class119(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class93 arg1) {
		this.aClass51_1 = arg0;
		this.aClass93_2 = arg1;
		if (!this.aClass51_1.method1083()) {
			this.aClass4_Sub3_Sub1_Sub2_2 = this.aClass51_1.method1088((byte) 0, 255, true, 255);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V")
	public void method2719() {
		if (this.aClass62_Sub1Array1 == null) {
			return;
		}
		@Pc(12) int local12;
		for (local12 = 0; local12 < this.aClass62_Sub1Array1.length; local12++) {
			if (this.aClass62_Sub1Array1[local12] != null) {
				this.aClass62_Sub1Array1[local12].method4703();
			}
		}
		for (local12 = 0; local12 < this.aClass62_Sub1Array1.length; local12++) {
			if (this.aClass62_Sub1Array1[local12] != null) {
				this.aClass62_Sub1Array1[local12].method4710();
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)Z")
	public boolean method2720() {
		if (this.aClass4_Sub10_6 != null) {
			return true;
		}
		if (this.aClass4_Sub3_Sub1_Sub2_2 == null) {
			if (this.aClass51_1.method1083()) {
				return false;
			}
			this.aClass4_Sub3_Sub1_Sub2_2 = this.aClass51_1.method1088((byte) 0, 255, true, 255);
		}
		if (this.aClass4_Sub3_Sub1_Sub2_2.aBoolean365) {
			return false;
		} else {
			this.aClass4_Sub10_6 = new Class4_Sub10(this.aClass4_Sub3_Sub1_Sub2_2.method4389());
			this.aClass62_Sub1Array1 = new Class62_Sub1[(this.aClass4_Sub10_6.aByteArray71.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!fm;BLclient!fm;ZI)Lclient!wb;")
	private Class62_Sub1 method2725(@OriginalArg(0) Class60 arg0, @OriginalArg(2) Class60 arg1, @OriginalArg(4) int arg2) {
		if (this.aClass4_Sub10_6 == null) {
			throw new RuntimeException();
		}
		this.aClass4_Sub10_6.anInt5713 = arg2 * 8 + 5;
		if (this.aClass4_Sub10_6.aByteArray71.length <= this.aClass4_Sub10_6.anInt5713) {
			throw new RuntimeException();
		} else if (this.aClass62_Sub1Array1[arg2] == null) {
			@Pc(48) int local48 = this.aClass4_Sub10_6.method4632();
			@Pc(55) int local55 = this.aClass4_Sub10_6.method4632();
			@Pc(76) Class62_Sub1 local76 = new Class62_Sub1(arg2, arg1, arg0, this.aClass51_1, this.aClass93_2, local48, local55, true);
			this.aClass62_Sub1Array1[arg2] = local76;
			return local76;
		} else {
			return this.aClass62_Sub1Array1[arg2];
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!fm;Lclient!fm;IB)Lclient!wb;")
	public Class62_Sub1 method2727(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) int arg2) {
		return this.method2725(arg0, arg1, arg2);
	}
}
