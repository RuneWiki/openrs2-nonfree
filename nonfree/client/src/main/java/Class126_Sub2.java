import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class126_Sub2 extends Class126 {

	@OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
	private int anInt8924 = 0;

	@OriginalMember(owner = "client!ul", name = "r", descriptor = "Lclient!vs;")
	private final Class253 aClass253_1 = new Class253();

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZLclient!bo;)V")
	@Override
	public void method7344(@OriginalArg(1) Class37 arg0) {
		super.aByteArray112[super.anInt8918] = 20;
		super.anObjectArray36[super.anInt8918] = arg0;
		super.anInt8918++;
		if (super.anInt8918 >= 5000) {
			super.anInt8918 = 0;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(FIILclient!sa;Z)V")
	@Override
	public void method7339(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class215 arg2, @OriginalArg(4) boolean arg3) {
		super.aByteArray112[super.anInt8918] = (byte) (arg3 ? arg1 + 40 : arg1 + 30);
		super.anObjectArray36[super.anInt8918] = arg2;
		super.aFloatArray69[super.anInt8918] = arg0;
		super.anInt8918++;
		if (super.anInt8918 >= 5000) {
			super.anInt8918 = 0;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!bo;)V")
	@Override
	public void method7343(@OriginalArg(1) Class37 arg0) {
		super.anInt8917--;
		if (super.anInt8917 < 0) {
			super.anInt8917 = 4999;
		}
		super.aByteArray112[super.anInt8917] = 21;
		super.anObjectArray36[super.anInt8917] = arg0;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
	@Override
	public void method7341() {
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)V")
	@Override
	public void method7345(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V")
	@Override
	public void method7342() {
		while (super.anInt8917 != super.anInt8918) {
			this.method7352();
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V")
	private void method7352() {
		@Pc(8) int local8 = super.anInt8917++;
		if (super.anInt8917 >= 5000) {
			super.anInt8917 = 0;
		}
		this.anInt8924 = super.aByteArray112[local8];
		@Pc(40) Object local40 = super.anObjectArray36[local8];
		super.anObjectArray36[local8] = null;
		if (this.anInt8924 == 21) {
			Static265.method4440(this.aClass253_1, (Class37) local40);
		} else if (this.anInt8924 == 20) {
			@Pc(62) Class37 local62 = (Class37) local40;
			if (local62.aClass30_Sub2_2 != null) {
				local62.aClass30_Sub2_2.method7903(Static286.aClass42_5);
			}
			if (local62.aClass30_Sub2_1 != null) {
				local62.aClass30_Sub2_1.method7903(Static286.aClass42_5);
			}
			if (local62.aClass30_Sub4_2 != null) {
				local62.aClass30_Sub4_2.method7903(Static286.aClass42_5);
			}
			if (local62.aClass30_Sub4_1 != null) {
				local62.aClass30_Sub4_1.method7903(Static286.aClass42_5);
			}
			if (local62.aClass30_Sub3_1 != null) {
				local62.aClass30_Sub3_1.method7903(Static286.aClass42_5);
			}
			for (@Pc(105) Class243 local105 = local62.aClass243_3; local105 != null; local105 = local105.aClass243_11) {
				local105.aClass30_Sub1_2.method7903(Static286.aClass42_5);
			}
		} else if (this.anInt8924 >= 30 && this.anInt8924 <= 33) {
			Static286.aClass42_5.la(3000.0F, super.aFloatArray69[local8] * 1.5F);
			((Class215) local40).method7835(Static176.anInt3987, Static412.anInt7717, Static307.anInt5970, Static243.aBooleanArrayArray6, this.anInt8924 - 30 == 0);
		} else if (this.anInt8924 >= 40 && this.anInt8924 <= 43) {
			Static286.aClass42_5.la(3000.0F, super.aFloatArray69[local8] * 1.5F);
			((Class215) local40).method7835(Static176.anInt3987, Static412.anInt7717, Static307.anInt5970, Static143.aBooleanArrayArray3, this.anInt8924 - 40 == 0);
		} else if (this.anInt8924 == 22) {
			Static286.aClass42_5.q(-1, 1583160, 40, 127);
		} else if (this.anInt8924 == 23) {
			Static286.aClass42_5.xa();
		} else if (this.anInt8924 == 24) {
			Static286.aClass42_5.method5824(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)V")
	@Override
	public void method7340(@OriginalArg(0) int arg0) {
		super.aByteArray112[super.anInt8918] = (byte) arg0;
		super.anInt8918++;
		if (super.anInt8918 >= 5000) {
			super.anInt8918 = 0;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!bo;Z)V")
	@Override
	public void method7347(@OriginalArg(0) Class37 arg0) {
		super.aByteArray112[super.anInt8918] = 21;
		super.anObjectArray36[super.anInt8918] = arg0;
		super.anInt8918++;
		if (super.anInt8918 >= 5000) {
			super.anInt8918 = 0;
		}
	}
}
