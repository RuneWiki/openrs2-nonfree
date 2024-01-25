import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class101_Sub1 extends Class101 {

	@OriginalMember(owner = "client!jo", name = "y", descriptor = "I")
	private int anInt3229 = 0;

	@OriginalMember(owner = "client!jo", name = "r", descriptor = "Lclient!ol;")
	private final Class145 aClass145_1 = new Class145();

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(II)V")
	@Override
	public void method3253(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILclient!ak;)V")
	@Override
	public void method3247(@OriginalArg(1) Class8 arg0) {
		super.aByteArray51[super.anInt3542] = 20;
		super.anObjectArray3[super.anInt3542] = arg0;
		super.anInt3542++;
		if (super.anInt3542 >= 5000) {
			super.anInt3542 = 0;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IZFBLclient!gh;)V")
	@Override
	public void method3251(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) float arg2, @OriginalArg(4) Class73 arg3) {
		super.aByteArray51[super.anInt3542] = (byte) (arg1 ? arg0 + 40 : arg0 + 30);
		super.anObjectArray3[super.anInt3542] = arg3;
		super.aFloatArray16[super.anInt3542] = arg2;
		super.anInt3542++;
		if (super.anInt3542 >= 5000) {
			super.anInt3542 = 0;
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V")
	@Override
	public void method3254() {
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
	@Override
	public void method3248() {
		while (super.anInt3542 != super.anInt3535) {
			this.method3020();
		}
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(II)V")
	@Override
	public void method3255(@OriginalArg(0) int arg0) {
		super.aByteArray51[super.anInt3542] = (byte) arg0;
		super.anInt3542++;
		if (super.anInt3542 >= 5000) {
			super.anInt3542 = 0;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!ak;Z)V")
	@Override
	public void method3250(@OriginalArg(0) Class8 arg0) {
		super.aByteArray51[super.anInt3542] = 21;
		super.anObjectArray3[super.anInt3542] = arg0;
		super.anInt3542++;
		if (super.anInt3542 >= 5000) {
			super.anInt3542 = 0;
		}
	}

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)V")
	private void method3020() {
		@Pc(8) int local8 = super.anInt3535++;
		if (super.anInt3535 >= 5000) {
			super.anInt3535 = 0;
		}
		this.anInt3229 = super.aByteArray51[local8];
		@Pc(32) Object local32 = super.anObjectArray3[local8];
		super.anObjectArray3[local8] = null;
		if (this.anInt3229 == 21) {
			Static81.method1820(this.aClass145_1, (Class8) local32);
		} else if (this.anInt3229 == 20) {
			@Pc(63) Class8 local63 = (Class8) local32;
			if (local63.aClass62_Sub4_2 != null) {
				local63.aClass62_Sub4_2.method5567(Static50.aClass4_5);
			}
			if (local63.aClass62_Sub4_1 != null) {
				local63.aClass62_Sub4_1.method5567(Static50.aClass4_5);
			}
			if (local63.aClass62_Sub5_2 != null) {
				local63.aClass62_Sub5_2.method5567(Static50.aClass4_5);
			}
			if (local63.aClass62_Sub5_1 != null) {
				local63.aClass62_Sub5_1.method5567(Static50.aClass4_5);
			}
			if (local63.aClass62_Sub3_1 != null) {
				local63.aClass62_Sub3_1.method5567(Static50.aClass4_5);
			}
			for (@Pc(106) Class172 local106 = local63.aClass172_1; local106 != null; local106 = local106.aClass172_4) {
				local106.aClass62_Sub1_1.method5567(Static50.aClass4_5);
			}
		} else if (this.anInt3229 >= 30 && this.anInt3229 <= 33) {
			Static50.aClass4_5.method4306(3000.0F, super.aFloatArray16[local8] * 1.5F);
			((Class73) local32).method4922(Static250.anInt4943, Static230.anInt4394, Static206.anInt4000, Static207.aBooleanArrayArray25, this.anInt3229 - 30 == 0);
		} else if (this.anInt3229 >= 40 && this.anInt3229 <= 43) {
			Static50.aClass4_5.method4306(3000.0F, super.aFloatArray16[local8] * 1.5F);
			((Class73) local32).method4922(Static250.anInt4943, Static230.anInt4394, Static206.anInt4000, Static162.aBooleanArrayArray13, this.anInt3229 - 40 == 0);
		} else if (this.anInt3229 == 22) {
			Static50.aClass4_5.method4270();
		} else if (this.anInt3229 == 23) {
			Static50.aClass4_5.method4209();
		} else if (this.anInt3229 == 24) {
			Static50.aClass4_5.method4284(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(ILclient!ak;)V")
	@Override
	public void method3252(@OriginalArg(1) Class8 arg0) {
		super.anInt3535--;
		if (super.anInt3535 < 0) {
			super.anInt3535 = 4999;
		}
		super.aByteArray51[super.anInt3535] = 21;
		super.anObjectArray3[super.anInt3535] = arg0;
	}
}
