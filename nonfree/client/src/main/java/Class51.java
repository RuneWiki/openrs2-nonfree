import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class51 {

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "[Lclient!ne;")
	private Class13_Sub1[] aClass13_Sub1Array2;

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "Lclient!qm;")
	private Class1_Sub14 aClass1_Sub14_6;

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "Lclient!ea;")
	private Class41 aClass41_1;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "Lclient!io;")
	private Class81 aClass81_1;

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "Lclient!ol;")
	private Class1_Sub3_Sub4_Sub2 aClass1_Sub3_Sub4_Sub2_2;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!ea;Lclient!io;)V")
	public Class51(@OriginalArg(0) Class41 arg0, @OriginalArg(1) Class81 arg1) {
		this.aClass41_1 = arg0;
		this.aClass81_1 = arg1;
		if (!this.aClass41_1.method1032()) {
			this.aClass1_Sub3_Sub4_Sub2_2 = this.aClass41_1.method1035(true, 255, 255, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZLclient!ja;Lclient!ja;)Lclient!ne;")
	public Class13_Sub1 method1176(@OriginalArg(0) int arg0, @OriginalArg(2) Class83 arg1, @OriginalArg(3) Class83 arg2) {
		return this.method1182(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)Z")
	public boolean method1178() {
		if (this.aClass1_Sub14_6 != null) {
			return true;
		}
		if (this.aClass1_Sub3_Sub4_Sub2_2 == null) {
			if (this.aClass41_1.method1032()) {
				return false;
			}
			this.aClass1_Sub3_Sub4_Sub2_2 = this.aClass41_1.method1035(true, 255, 255, (byte) 0);
		}
		if (this.aClass1_Sub3_Sub4_Sub2_2.aBoolean275) {
			return false;
		} else {
			this.aClass1_Sub14_6 = new Class1_Sub14(this.aClass1_Sub3_Sub4_Sub2_2.method3229());
			this.aClass13_Sub1Array2 = new Class13_Sub1[(this.aClass1_Sub14_6.aByteArray55.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
	public void method1181() {
		if (this.aClass13_Sub1Array2 == null) {
			return;
		}
		@Pc(12) int local12;
		for (local12 = 0; local12 < this.aClass13_Sub1Array2.length; local12++) {
			if (this.aClass13_Sub1Array2[local12] != null) {
				this.aClass13_Sub1Array2[local12].method2967();
			}
		}
		for (local12 = 0; local12 < this.aClass13_Sub1Array2.length; local12++) {
			if (this.aClass13_Sub1Array2[local12] != null) {
				this.aClass13_Sub1Array2[local12].method2972();
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!ja;ZBLclient!ja;I)Lclient!ne;")
	private Class13_Sub1 method1182(@OriginalArg(0) Class83 arg0, @OriginalArg(3) Class83 arg1, @OriginalArg(4) int arg2) {
		if (this.aClass1_Sub14_6 == null) {
			throw new RuntimeException();
		}
		this.aClass1_Sub14_6.anInt3000 = arg2 * 8 + 5;
		if (this.aClass1_Sub14_6.anInt3000 >= this.aClass1_Sub14_6.aByteArray55.length) {
			throw new RuntimeException();
		} else if (this.aClass13_Sub1Array2[arg2] == null) {
			@Pc(57) int local57 = this.aClass1_Sub14_6.method2194();
			@Pc(62) int local62 = this.aClass1_Sub14_6.method2194();
			@Pc(76) Class13_Sub1 local76 = new Class13_Sub1(arg2, arg0, arg1, this.aClass41_1, this.aClass81_1, local57, local62, true);
			this.aClass13_Sub1Array2[arg2] = local76;
			return local76;
		} else {
			return this.aClass13_Sub1Array2[arg2];
		}
	}
}
