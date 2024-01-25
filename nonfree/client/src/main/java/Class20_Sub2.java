import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class20_Sub2 extends Class20 {

	@OriginalMember(owner = "client!um", name = "l", descriptor = "I")
	private int anInt7094 = 0;

	@OriginalMember(owner = "client!um", name = "q", descriptor = "Lclient!ot;")
	private final Class12 aClass12_1 = new Class12();

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(I)V")
	private void method5686() {
		@Pc(8) int local8 = super.anInt7091++;
		if (super.anInt7091 >= 5000) {
			super.anInt7091 = 0;
		}
		this.anInt7094 = super.aByteArray87[local8];
		@Pc(40) Object local40 = super.anObjectArray36[local8];
		super.anObjectArray36[local8] = null;
		if (this.anInt7094 == 21) {
			Static238.method3236(this.aClass12_1, (Class36) local40);
		} else if (this.anInt7094 == 20) {
			@Pc(60) Class36 local60 = (Class36) local40;
			if (local60.aClass11_Sub1_2 != null) {
				local60.aClass11_Sub1_2.method6210(Static29.aClass75_4);
			}
			if (local60.aClass11_Sub1_3 != null) {
				local60.aClass11_Sub1_3.method6210(Static29.aClass75_4);
			}
			if (local60.aClass11_Sub2_1 != null) {
				local60.aClass11_Sub2_1.method6210(Static29.aClass75_4);
			}
			if (local60.aClass11_Sub2_2 != null) {
				local60.aClass11_Sub2_2.method6210(Static29.aClass75_4);
			}
			if (local60.aClass11_Sub3_1 != null) {
				local60.aClass11_Sub3_1.method6210(Static29.aClass75_4);
			}
			for (@Pc(103) Class195 local103 = local60.aClass195_1; local103 != null; local103 = local103.aClass195_2) {
				local103.aClass11_Sub5_1.method6210(Static29.aClass75_4);
			}
		} else if (this.anInt7094 >= 30 && this.anInt7094 <= 33) {
			Static29.aClass75_4.da(3000.0F, super.aFloatArray31[local8] * 1.5F);
			((Class22) local40).method2328(Static308.anInt5540, Static109.anInt1838, Static30.anInt535, Static409.aBooleanArrayArray5, this.anInt7094 - 30 == 0);
		} else if (this.anInt7094 >= 40 && this.anInt7094 <= 43) {
			Static29.aClass75_4.da(3000.0F, super.aFloatArray31[local8] * 1.5F);
			((Class22) local40).method2328(Static308.anInt5540, Static109.anInt1838, Static30.anInt535, Static150.aBooleanArrayArray20, this.anInt7094 - 40 == 0);
		} else if (this.anInt7094 == 22) {
			Static29.aClass75_4.s(-1, 1583160, 40, 127);
		} else if (this.anInt7094 == 23) {
			Static29.aClass75_4.n();
			return;
		} else if (this.anInt7094 == 24) {
			Static29.aClass75_4.method6018(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(FLclient!ya;BIZ)V")
	@Override
	public void method5675(@OriginalArg(0) float arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		super.aByteArray87[super.anInt7089] = (byte) (arg3 ? arg2 + 40 : arg2 + 30);
		super.anObjectArray36[super.anInt7089] = arg1;
		super.aFloatArray31[super.anInt7089] = arg0;
		super.anInt7089++;
		if (super.anInt7089 >= 5000) {
			super.anInt7089 = 0;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(II)V")
	@Override
	public void method5677(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(BLclient!ce;)V")
	@Override
	public void method5679(@OriginalArg(1) Class36 arg0) {
		super.anInt7091--;
		if (super.anInt7091 < 0) {
			super.anInt7091 = 4999;
		}
		super.aByteArray87[super.anInt7091] = 21;
		super.anObjectArray36[super.anInt7091] = arg0;
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(II)V")
	@Override
	public void method5678(@OriginalArg(0) int arg0) {
		super.aByteArray87[super.anInt7089] = (byte) arg0;
		super.anInt7089++;
		if (super.anInt7089 >= 5000) {
			super.anInt7089 = 0;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ILclient!ce;)V")
	@Override
	public void method5680(@OriginalArg(1) Class36 arg0) {
		super.aByteArray87[super.anInt7089] = 21;
		super.anObjectArray36[super.anInt7089] = arg0;
		super.anInt7089++;
		if (super.anInt7089 >= 5000) {
			super.anInt7089 = 0;
		}
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(BLclient!ce;)V")
	@Override
	public void method5681(@OriginalArg(1) Class36 arg0) {
		super.aByteArray87[super.anInt7089] = 20;
		super.anObjectArray36[super.anInt7089] = arg0;
		super.anInt7089++;
		if (super.anInt7089 >= 5000) {
			super.anInt7089 = 0;
		}
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(I)V")
	@Override
	public void method5684() {
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
	@Override
	public void method5682() {
		while (super.anInt7089 != super.anInt7091) {
			this.method5686();
		}
	}
}
