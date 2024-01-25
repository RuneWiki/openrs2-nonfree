import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class77_Sub2 extends Class77 {

	@OriginalMember(owner = "client!kg", name = "A", descriptor = "I")
	private int anInt3611 = 0;

	@OriginalMember(owner = "client!kg", name = "w", descriptor = "Lclient!bc;")
	private final Class18 aClass18_1 = new Class18();

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BI)V")
	@Override
	public void method2859(@OriginalArg(1) int arg0) {
		super.aByteArray51[super.anInt3606] = (byte) arg0;
		super.anInt3606++;
		if (super.anInt3606 >= 5000) {
			super.anInt3606 = 0;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!ya;IIZF)V")
	@Override
	public void method2853(@OriginalArg(0) Class125 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) float arg3) {
		super.aByteArray51[super.anInt3606] = (byte) (arg2 ? arg1 + 40 : arg1 + 30);
		super.anObjectArray34[super.anInt3606] = arg0;
		super.aFloatArray6[super.anInt3606] = arg3;
		super.anInt3606++;
		if (super.anInt3606 >= 5000) {
			super.anInt3606 = 0;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
	@Override
	public void method2849() {
		while (super.anInt3606 != super.anInt3600) {
			this.method2864();
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)V")
	@Override
	public void method2860(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V")
	private void method2864() {
		@Pc(8) int local8 = super.anInt3600++;
		if (super.anInt3600 >= 5000) {
			super.anInt3600 = 0;
		}
		this.anInt3611 = super.aByteArray51[local8];
		@Pc(37) Object local37 = super.anObjectArray34[local8];
		super.anObjectArray34[local8] = null;
		if (this.anInt3611 == 21) {
			Static67.method1021(this.aClass18_1, (Class258) local37);
		} else if (this.anInt3611 == 20) {
			@Pc(55) Class258 local55 = (Class258) local37;
			if (local55.aClass2_Sub4_2 != null) {
				local55.aClass2_Sub4_2.method6021(Static293.aClass200_5);
			}
			if (local55.aClass2_Sub4_3 != null) {
				local55.aClass2_Sub4_3.method6021(Static293.aClass200_5);
			}
			if (local55.aClass2_Sub2_2 != null) {
				local55.aClass2_Sub2_2.method6021(Static293.aClass200_5);
			}
			if (local55.aClass2_Sub2_3 != null) {
				local55.aClass2_Sub2_3.method6021(Static293.aClass200_5);
			}
			if (local55.aClass2_Sub3_2 != null) {
				local55.aClass2_Sub3_2.method6021(Static293.aClass200_5);
			}
			for (@Pc(98) Class122 local98 = local55.aClass122_3; local98 != null; local98 = local98.aClass122_1) {
				local98.aClass2_Sub1_1.method6021(Static293.aClass200_5);
			}
		} else if (this.anInt3611 >= 30 && this.anInt3611 <= 33) {
			Static293.aClass200_5.da(3000.0F, super.aFloatArray6[local8] * 1.5F);
			((Class125) local37).method4992(Static448.anInt7370, Static17.anInt369, Static70.anInt1271, Static309.aBooleanArrayArray6, this.anInt3611 - 30 == 0);
		} else if (this.anInt3611 >= 40 && this.anInt3611 <= 43) {
			Static293.aClass200_5.da(3000.0F, super.aFloatArray6[local8] * 1.5F);
			((Class125) local37).method4992(Static448.anInt7370, Static17.anInt369, Static70.anInt1271, Static37.aBooleanArrayArray1, this.anInt3611 - 40 == 0);
		} else if (this.anInt3611 == 22) {
			Static293.aClass200_5.s(-1, 1583160, 40, 127);
		} else if (this.anInt3611 == 23) {
			Static293.aClass200_5.n();
			return;
		} else if (this.anInt3611 == 24) {
			Static293.aClass200_5.method5846(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
	@Override
	public void method2861() {
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!vt;I)V")
	@Override
	public void method2850(@OriginalArg(0) Class258 arg0) {
		super.anInt3600--;
		if (super.anInt3600 < 0) {
			super.anInt3600 = 4999;
		}
		super.aByteArray51[super.anInt3600] = 21;
		super.anObjectArray34[super.anInt3600] = arg0;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILclient!vt;)V")
	@Override
	public void method2848(@OriginalArg(1) Class258 arg0) {
		super.aByteArray51[super.anInt3606] = 20;
		super.anObjectArray34[super.anInt3606] = arg0;
		super.anInt3606++;
		if (super.anInt3606 >= 5000) {
			super.anInt3606 = 0;
		}
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(ILclient!vt;)V")
	@Override
	public void method2858(@OriginalArg(1) Class258 arg0) {
		super.aByteArray51[super.anInt3606] = 21;
		super.anObjectArray34[super.anInt3606] = arg0;
		super.anInt3606++;
		if (super.anInt3606 >= 5000) {
			super.anInt3606 = 0;
		}
	}
}
