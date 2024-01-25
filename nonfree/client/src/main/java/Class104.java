import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class104 {

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "Lclient!gk;")
	private Class7_Sub14 aClass7_Sub14_2;

	@OriginalMember(owner = "client!hi", name = "n", descriptor = "[Lclient!ws;")
	private Class4_Sub1[] aClass4_Sub1Array1;

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "Lclient!cd;")
	private final Class36 aClass36_1;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "Lclient!iv;")
	private final Class120 aClass120_2;

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "Lclient!rp;")
	private Class7_Sub4_Sub8_Sub2 aClass7_Sub4_Sub8_Sub2_1;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lclient!iv;Lclient!cd;)V")
	public Class104(@OriginalArg(0) Class120 arg0, @OriginalArg(1) Class36 arg1) {
		this.aClass36_1 = arg1;
		this.aClass120_2 = arg0;
		if (!this.aClass120_2.method2656()) {
			this.aClass7_Sub4_Sub8_Sub2_1 = this.aClass120_2.method2658(255, 255, true, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILclient!ur;Lclient!ur;IZ)Lclient!ws;")
	private Class4_Sub1 method2303(@OriginalArg(0) int arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) Class250 arg2) {
		if (this.aClass7_Sub14_2 == null) {
			throw new RuntimeException();
		}
		this.aClass7_Sub14_2.anInt4989 = arg0 * 8 + 5;
		if (this.aClass7_Sub14_2.aByteArray75.length <= this.aClass7_Sub14_2.anInt4989) {
			throw new RuntimeException();
		} else if (this.aClass4_Sub1Array1[arg0] == null) {
			@Pc(50) int local50 = this.aClass7_Sub14_2.method3938();
			@Pc(55) int local55 = this.aClass7_Sub14_2.method3938();
			@Pc(69) Class4_Sub1 local69 = new Class4_Sub1(arg0, arg1, arg2, this.aClass120_2, this.aClass36_1, local50, local55, true);
			this.aClass4_Sub1Array1[arg0] = local69;
			return local69;
		} else {
			return this.aClass4_Sub1Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(B)V")
	public void method2307() {
		if (this.aClass4_Sub1Array1 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.aClass4_Sub1Array1.length; local17++) {
			if (this.aClass4_Sub1Array1[local17] != null) {
				this.aClass4_Sub1Array1[local17].method5785();
			}
		}
		for (@Pc(42) int local42 = 0; local42 < this.aClass4_Sub1Array1.length; local42++) {
			if (this.aClass4_Sub1Array1[local42] != null) {
				this.aClass4_Sub1Array1[local42].method5790();
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)Z")
	public boolean method2309() {
		if (this.aClass7_Sub14_2 != null) {
			return true;
		}
		if (this.aClass7_Sub4_Sub8_Sub2_1 == null) {
			if (this.aClass120_2.method2656()) {
				return false;
			}
			this.aClass7_Sub4_Sub8_Sub2_1 = this.aClass120_2.method2658(255, 255, true, (byte) 0);
		}
		if (this.aClass7_Sub4_Sub8_Sub2_1.aBoolean380) {
			return false;
		} else {
			this.aClass7_Sub14_2 = new Class7_Sub14(this.aClass7_Sub4_Sub8_Sub2_1.method4536());
			this.aClass4_Sub1Array1 = new Class4_Sub1[(this.aClass7_Sub14_2.aByteArray75.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!ur;ILclient!ur;I)Lclient!ws;")
	public Class4_Sub1 method2311(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		return this.method2303(arg1, arg0, arg2);
	}
}
