import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class137_Sub1 extends Class137 {

	@OriginalMember(owner = "client!kp", name = "w", descriptor = "I")
	private int anInt3451 = 0;

	@OriginalMember(owner = "client!kp", name = "q", descriptor = "Lclient!qc;")
	private final Class191 aClass191_1 = new Class191();

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)V")
	@Override
	public void method4825(@OriginalArg(1) int arg0) {
		super.aByteArray79[super.anInt5410] = (byte) arg0;
		super.anInt5410++;
		if (super.anInt5410 >= 5000) {
			super.anInt5410 = 0;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILclient!ct;)V")
	@Override
	public void method4823(@OriginalArg(1) Class48 arg0) {
		super.aByteArray79[super.anInt5410] = 21;
		super.anObjectArray34[super.anInt5410] = arg0;
		super.anInt5410++;
		if (super.anInt5410 >= 5000) {
			super.anInt5410 = 0;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IFLclient!pl;ZI)V")
	@Override
	public void method4816(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class7 arg2, @OriginalArg(3) boolean arg3) {
		super.aByteArray79[super.anInt5410] = (byte) (arg3 ? arg0 + 40 : arg0 + 30);
		super.anObjectArray34[super.anInt5410] = arg2;
		super.aFloatArray25[super.anInt5410] = arg1;
		super.anInt5410++;
		if (super.anInt5410 >= 5000) {
			super.anInt5410 = 0;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(BI)V")
	@Override
	public void method4819(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "(I)V")
	private void method3021() {
		@Pc(8) int local8 = super.anInt5409++;
		if (super.anInt5409 >= 5000) {
			super.anInt5409 = 0;
		}
		this.anInt3451 = super.aByteArray79[local8];
		@Pc(38) Object local38 = super.anObjectArray34[local8];
		super.anObjectArray34[local8] = null;
		if (this.anInt3451 == 21) {
			Static248.method4060(this.aClass191_1, (Class48) local38);
		} else if (this.anInt3451 == 20) {
			@Pc(58) Class48 local58 = (Class48) local38;
			if (local58.aClass28_Sub3_1 != null) {
				local58.aClass28_Sub3_1.method5406(Static121.aClass155_1);
			}
			if (local58.aClass28_Sub3_2 != null) {
				local58.aClass28_Sub3_2.method5406(Static121.aClass155_1);
			}
			if (local58.aClass28_Sub4_2 != null) {
				local58.aClass28_Sub4_2.method5406(Static121.aClass155_1);
			}
			if (local58.aClass28_Sub4_1 != null) {
				local58.aClass28_Sub4_1.method5406(Static121.aClass155_1);
			}
			if (local58.aClass28_Sub2_2 != null) {
				local58.aClass28_Sub2_2.method5406(Static121.aClass155_1);
			}
			for (@Pc(101) Class50 local101 = local58.aClass50_1; local101 != null; local101 = local101.aClass50_2) {
				local101.aClass28_Sub1_1.method5406(Static121.aClass155_1);
			}
		} else if (this.anInt3451 >= 30 && this.anInt3451 <= 33) {
			Static121.aClass155_1.method4856(3000.0F, super.aFloatArray25[local8] * 1.5F);
			((Class7) local38).method5647(Static12.anInt167, Static327.anInt5555, Static68.anInt1339, Static191.aBooleanArrayArray3, this.anInt3451 - 30 == 0);
		} else if (this.anInt3451 >= 40 && this.anInt3451 <= 43) {
			Static121.aClass155_1.method4856(3000.0F, super.aFloatArray25[local8] * 1.5F);
			((Class7) local38).method5647(Static12.anInt167, Static327.anInt5555, Static68.anInt1339, Static202.aBooleanArrayArray4, this.anInt3451 - 40 == 0);
		} else if (this.anInt3451 == 22) {
			Static121.aClass155_1.method4878();
		} else if (this.anInt3451 == 23) {
			Static121.aClass155_1.method4892();
		} else if (this.anInt3451 == 24) {
			Static121.aClass155_1.method4945(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V")
	@Override
	public void method4821() {
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
	@Override
	public void method4820() {
		while (super.anInt5410 != super.anInt5409) {
			this.method3021();
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(BLclient!ct;)V")
	@Override
	public void method4822(@OriginalArg(1) Class48 arg0) {
		super.aByteArray79[super.anInt5410] = 20;
		super.anObjectArray34[super.anInt5410] = arg0;
		super.anInt5410++;
		if (super.anInt5410 >= 5000) {
			super.anInt5410 = 0;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!ct;I)V")
	@Override
	public void method4818(@OriginalArg(0) Class48 arg0) {
		super.anInt5409--;
		if (super.anInt5409 < 0) {
			super.anInt5409 = 4999;
		}
		super.aByteArray79[super.anInt5409] = 21;
		super.anObjectArray34[super.anInt5409] = arg0;
	}
}
