import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public final class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!mu", name = "q", descriptor = "I")
	private int anInt4638 = 0;

	@OriginalMember(owner = "client!mu", name = "u", descriptor = "Lclient!ke;")
	private final Class17 aClass17_1 = new Class17();

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILclient!ak;)V")
	@Override
	public void method3751(@OriginalArg(1) Class11 arg0) {
		super.aByteArray53[super.anInt4634] = 20;
		super.anObjectArray34[super.anInt4634] = arg0;
		super.anInt4634++;
		if (super.anInt4634 >= 5000) {
			super.anInt4634 = 0;
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(BI)V")
	@Override
	public void method3754(@OriginalArg(1) int arg0) {
		super.aByteArray53[super.anInt4634] = (byte) arg0;
		super.anInt4634++;
		if (super.anInt4634 >= 5000) {
			super.anInt4634 = 0;
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!ak;I)V")
	@Override
	public void method3757(@OriginalArg(0) Class11 arg0) {
		super.anInt4631--;
		if (super.anInt4631 < 0) {
			super.anInt4631 = 4999;
		}
		super.aByteArray53[super.anInt4631] = 21;
		super.anObjectArray34[super.anInt4631] = arg0;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(BLclient!ak;)V")
	@Override
	public void method3746(@OriginalArg(1) Class11 arg0) {
		super.aByteArray53[super.anInt4634] = 21;
		super.anObjectArray34[super.anInt4634] = arg0;
		super.anInt4634++;
		if (super.anInt4634 >= 5000) {
			super.anInt4634 = 0;
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V")
	@Override
	public void method3750() {
		while (super.anInt4631 != super.anInt4634) {
			this.method3760();
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(FIZLclient!ya;I)V")
	@Override
	public void method3749(@OriginalArg(0) float arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class154 arg2, @OriginalArg(4) int arg3) {
		super.aByteArray53[super.anInt4634] = (byte) (arg1 ? arg3 + 40 : arg3 + 30);
		super.anObjectArray34[super.anInt4634] = arg2;
		super.aFloatArray27[super.anInt4634] = arg0;
		super.anInt4634++;
		if (super.anInt4634 >= 5000) {
			super.anInt4634 = 0;
		}
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(II)V")
	@Override
	public void method3752(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)V")
	private void method3760() {
		@Pc(16) int local16 = super.anInt4631++;
		if (super.anInt4631 >= 5000) {
			super.anInt4631 = 0;
		}
		this.anInt4638 = super.aByteArray53[local16];
		@Pc(40) Object local40 = super.anObjectArray34[local16];
		super.anObjectArray34[local16] = null;
		if (this.anInt4638 == 21) {
			Static199.method3241(this.aClass17_1, (Class11) local40);
		} else if (this.anInt4638 == 20) {
			@Pc(62) Class11 local62 = (Class11) local40;
			if (local62.aClass24_Sub5_1 != null) {
				local62.aClass24_Sub5_1.method5685(Static142.aClass50_5);
			}
			if (local62.aClass24_Sub5_2 != null) {
				local62.aClass24_Sub5_2.method5685(Static142.aClass50_5);
			}
			if (local62.aClass24_Sub1_2 != null) {
				local62.aClass24_Sub1_2.method5685(Static142.aClass50_5);
			}
			if (local62.aClass24_Sub1_1 != null) {
				local62.aClass24_Sub1_1.method5685(Static142.aClass50_5);
			}
			if (local62.aClass24_Sub4_1 != null) {
				local62.aClass24_Sub4_1.method5685(Static142.aClass50_5);
			}
			for (@Pc(105) Class1 local105 = local62.aClass1_3; local105 != null; local105 = local105.aClass1_1) {
				local105.aClass24_Sub3_1.method5685(Static142.aClass50_5);
			}
		} else if (this.anInt4638 >= 30 && this.anInt4638 <= 33) {
			Static142.aClass50_5.da(3000.0F, super.aFloatArray27[local16] * 1.5F);
			((Class154) local40).method6076(Static18.anInt316, Static265.anInt4683, Static451.anInt7524, Static460.aBooleanArrayArray9, this.anInt4638 - 30 == 0);
		} else if (this.anInt4638 >= 40 && this.anInt4638 <= 43) {
			Static142.aClass50_5.da(3000.0F, super.aFloatArray27[local16] * 1.5F);
			((Class154) local40).method6076(Static18.anInt316, Static265.anInt4683, Static451.anInt7524, Static432.aBooleanArrayArray7, this.anInt4638 - 40 == 0);
		} else if (this.anInt4638 == 22) {
			Static142.aClass50_5.s(-1, 1583160, 40, 127);
		} else if (this.anInt4638 == 23) {
			Static142.aClass50_5.n();
		} else if (this.anInt4638 == 24) {
			Static142.aClass50_5.method5869(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)V")
	@Override
	public void method3755() {
	}
}
