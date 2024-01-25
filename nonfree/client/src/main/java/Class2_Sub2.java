import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!hb", name = "C", descriptor = "I")
	private int anInt3463 = 0;

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "Lclient!jba;")
	private final Class154 aClass154_1 = new Class154();

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLclient!sa;FII)V")
	@Override
	public void method3042(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class131 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		super.aByteArray48[super.anInt3445] = (byte) (arg0 ? arg3 + 40 : arg3 + 30);
		super.anObjectArray5[super.anInt3445] = arg1;
		super.aFloatArray26[super.anInt3445] = arg2;
		super.anInt3445++;
		if (super.anInt3445 >= 5000) {
			super.anInt3445 = 0;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)V")
	@Override
	public void method3043(@OriginalArg(1) int arg0) {
		super.aByteArray48[super.anInt3445] = (byte) arg0;
		super.anInt3445++;
		if (super.anInt3445 >= 5000) {
			super.anInt3445 = 0;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
	@Override
	public void method3039() {
		while (super.anInt3445 != super.anInt3449) {
			this.method3049();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!br;B)V")
	@Override
	public void method3040(@OriginalArg(0) Class37 arg0) {
		super.anInt3449--;
		if (super.anInt3449 < 0) {
			super.anInt3449 = 4999;
		}
		super.aByteArray48[super.anInt3449] = 21;
		super.anObjectArray5[super.anInt3449] = arg0;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	@Override
	public void method3037() {
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!br;)V")
	@Override
	public void method3046(@OriginalArg(1) Class37 arg0) {
		super.aByteArray48[super.anInt3445] = 20;
		super.anObjectArray5[super.anInt3445] = arg0;
		super.anInt3445++;
		if (super.anInt3445 >= 5000) {
			super.anInt3445 = 0;
		}
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(B)V")
	private void method3049() {
		@Pc(16) int local16 = super.anInt3449++;
		if (super.anInt3449 >= 5000) {
			super.anInt3449 = 0;
		}
		this.anInt3463 = super.aByteArray48[local16];
		@Pc(40) Object local40 = super.anObjectArray5[local16];
		super.anObjectArray5[local16] = null;
		if (this.anInt3463 == 21) {
			Static324.method5178(this.aClass154_1, (Class37) local40);
		} else if (this.anInt3463 == 20) {
			@Pc(160) Class37 local160 = (Class37) local40;
			if (local160.aClass15_Sub3_3 != null) {
				local160.aClass15_Sub3_3.method6862(Static60.aClass62_37);
			}
			if (local160.aClass15_Sub3_2 != null) {
				local160.aClass15_Sub3_2.method6862(Static60.aClass62_37);
			}
			if (local160.aClass15_Sub1_3 != null) {
				local160.aClass15_Sub1_3.method6862(Static60.aClass62_37);
			}
			if (local160.aClass15_Sub1_2 != null) {
				local160.aClass15_Sub1_2.method6862(Static60.aClass62_37);
			}
			if (local160.aClass15_Sub5_1 != null) {
				local160.aClass15_Sub5_1.method6862(Static60.aClass62_37);
			}
			for (@Pc(203) Class108 local203 = local160.aClass108_1; local203 != null; local203 = local203.aClass108_3) {
				local203.aClass15_Sub2_1.method6862(Static60.aClass62_37);
			}
		} else if (this.anInt3463 >= 30 && this.anInt3463 <= 33) {
			Static60.aClass62_37.la(3000.0F, super.aFloatArray26[local16] * 1.5F);
			((Class131) local40).method7190(Static489.anInt8410, Static461.anInt7924, Static479.anInt8261, Static398.aBooleanArrayArray4, this.anInt3463 - 30 == 0);
		} else if (this.anInt3463 >= 40 && this.anInt3463 <= 43) {
			Static60.aClass62_37.la(3000.0F, super.aFloatArray26[local16] * 1.5F);
			((Class131) local40).method7190(Static489.anInt8410, Static461.anInt7924, Static479.anInt8261, Static527.aBooleanArrayArray6, this.anInt3463 - 40 == 0);
		} else if (this.anInt3463 == 22) {
			Static60.aClass62_37.q(-1, 1583160, 40, 127);
		} else if (this.anInt3463 == 23) {
			Static60.aClass62_37.xa();
			return;
		} else if (this.anInt3463 == 24) {
			Static60.aClass62_37.method7059(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLclient!br;)V")
	@Override
	public void method3047(@OriginalArg(1) Class37 arg0) {
		super.aByteArray48[super.anInt3445] = 21;
		super.anObjectArray5[super.anInt3445] = arg0;
		super.anInt3445++;
		if (super.anInt3445 >= 5000) {
			super.anInt3445 = 0;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)V")
	@Override
	public void method3044(@OriginalArg(0) int arg0) {
	}
}
