import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class52 {

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "Lclient!pi;")
	private Class4_Sub24 aClass4_Sub24_13;

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "[Lclient!ed;")
	private Class39_Sub1[] aClass39_Sub1Array2;

	@OriginalMember(owner = "client!fl", name = "l", descriptor = "Lclient!je;")
	private Class82 aClass82_2;

	@OriginalMember(owner = "client!fl", name = "n", descriptor = "Lclient!ho;")
	private Class70 aClass70_3;

	@OriginalMember(owner = "client!fl", name = "h", descriptor = "Lclient!vg;")
	private Class4_Sub2_Sub1_Sub2 aClass4_Sub2_Sub1_Sub2_1;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lclient!ho;Lclient!je;)V")
	public Class52(@OriginalArg(0) Class70 arg0, @OriginalArg(1) Class82 arg1) {
		this.aClass82_2 = arg1;
		this.aClass70_3 = arg0;
		if (!this.aClass70_3.method1838()) {
			this.aClass4_Sub2_Sub1_Sub2_1 = this.aClass70_3.method1833(255, true, (byte) 0, 255);
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BZILclient!g;Lclient!g;)Lclient!ed;")
	private Class39_Sub1 method1396(@OriginalArg(2) int arg0, @OriginalArg(3) Class55 arg1, @OriginalArg(4) Class55 arg2) {
		if (this.aClass4_Sub24_13 == null) {
			throw new RuntimeException();
		}
		this.aClass4_Sub24_13.anInt3822 = arg0 * 8 + 5;
		if (this.aClass4_Sub24_13.anInt3822 >= this.aClass4_Sub24_13.aByteArray47.length) {
			throw new RuntimeException();
		} else if (this.aClass39_Sub1Array2[arg0] == null) {
			@Pc(57) int local57 = this.aClass4_Sub24_13.method3084();
			@Pc(62) int local62 = this.aClass4_Sub24_13.method3084();
			@Pc(76) Class39_Sub1 local76 = new Class39_Sub1(arg0, arg1, arg2, this.aClass70_3, this.aClass82_2, local57, local62, true);
			this.aClass39_Sub1Array2[arg0] = local76;
			return local76;
		} else {
			return this.aClass39_Sub1Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)Z")
	public boolean method1398() {
		if (this.aClass4_Sub24_13 != null) {
			return true;
		}
		if (this.aClass4_Sub2_Sub1_Sub2_1 == null) {
			if (this.aClass70_3.method1838()) {
				return false;
			}
			this.aClass4_Sub2_Sub1_Sub2_1 = this.aClass70_3.method1833(255, true, (byte) 0, 255);
		}
		if (this.aClass4_Sub2_Sub1_Sub2_1.aBoolean388) {
			return false;
		} else {
			this.aClass4_Sub24_13 = new Class4_Sub24(this.aClass4_Sub2_Sub1_Sub2_1.method4495());
			this.aClass39_Sub1Array2 = new Class39_Sub1[(this.aClass4_Sub24_13.aByteArray47.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)V")
	public void method1399() {
		if (this.aClass39_Sub1Array2 == null) {
			return;
		}
		@Pc(12) int local12;
		for (local12 = 0; local12 < this.aClass39_Sub1Array2.length; local12++) {
			if (this.aClass39_Sub1Array2[local12] != null) {
				this.aClass39_Sub1Array2[local12].method1143();
			}
		}
		for (local12 = 0; local12 < this.aClass39_Sub1Array2.length; local12++) {
			if (this.aClass39_Sub1Array2[local12] != null) {
				this.aClass39_Sub1Array2[local12].method1141();
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!g;ILclient!g;I)Lclient!ed;")
	public Class39_Sub1 method1402(@OriginalArg(0) Class55 arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) int arg2) {
		return this.method1396(arg2, arg0, arg1);
	}
}
