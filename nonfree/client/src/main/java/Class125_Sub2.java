import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class125_Sub2 extends Class125 {

	@OriginalMember(owner = "client!je", name = "l", descriptor = "I")
	private int anInt3692 = 0;

	@OriginalMember(owner = "client!je", name = "y", descriptor = "Lclient!bi;")
	private final Class22 aClass22_1 = new Class22();

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(ILclient!ht;)V")
	@Override
	public void method2952(@OriginalArg(1) Class113 arg0) {
		super.aByteArray112[super.anInt3691] = 21;
		super.anObjectArray35[super.anInt3691] = arg0;
		super.anInt3691++;
		if (super.anInt3691 >= 5000) {
			super.anInt3691 = 0;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	@Override
	public void method2947() {
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!ht;)V")
	@Override
	public void method2949(@OriginalArg(1) Class113 arg0) {
		super.aByteArray112[super.anInt3691] = 20;
		super.anObjectArray35[super.anInt3691] = arg0;
		super.anInt3691++;
		if (super.anInt3691 >= 5000) {
			super.anInt3691 = 0;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IFZLclient!na;I)V")
	@Override
	public void method2950(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class106 arg3) {
		super.aByteArray112[super.anInt3691] = (byte) (arg2 ? arg0 + 40 : arg0 + 30);
		super.anObjectArray35[super.anInt3691] = arg3;
		super.aFloatArray22[super.anInt3691] = arg1;
		super.anInt3691++;
		if (super.anInt3691 >= 5000) {
			super.anInt3691 = 0;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)V")
	@Override
	public void method2948(@OriginalArg(0) int arg0) {
		super.aByteArray112[super.anInt3691] = (byte) arg0;
		super.anInt3691++;
		if (super.anInt3691 >= 5000) {
			super.anInt3691 = 0;
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V")
	@Override
	public void method2955() {
		while (super.anInt3691 != super.anInt3687) {
			this.method2959();
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!ht;I)V")
	@Override
	public void method2953(@OriginalArg(0) Class113 arg0) {
		super.anInt3687--;
		if (super.anInt3687 < 0) {
			super.anInt3687 = 4999;
		}
		super.aByteArray112[super.anInt3687] = 21;
		super.anObjectArray35[super.anInt3687] = arg0;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V")
	@Override
	public void method2951(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
	private void method2959() {
		@Pc(8) int local8 = super.anInt3687++;
		if (super.anInt3687 >= 5000) {
			super.anInt3687 = 0;
		}
		this.anInt3692 = super.aByteArray112[local8];
		@Pc(36) Object local36 = super.anObjectArray35[local8];
		super.anObjectArray35[local8] = null;
		if (this.anInt3692 == 21) {
			Static322.method4615(this.aClass22_1, (Class113) local36);
		} else if (this.anInt3692 == 20) {
			@Pc(58) Class113 local58 = (Class113) local36;
			if (local58.aClass4_Sub4_2 != null) {
				local58.aClass4_Sub4_2.method5893(Static444.aClass26_11);
			}
			if (local58.aClass4_Sub4_1 != null) {
				local58.aClass4_Sub4_1.method5893(Static444.aClass26_11);
			}
			if (local58.aClass4_Sub1_2 != null) {
				local58.aClass4_Sub1_2.method5893(Static444.aClass26_11);
			}
			if (local58.aClass4_Sub1_3 != null) {
				local58.aClass4_Sub1_3.method5893(Static444.aClass26_11);
			}
			if (local58.aClass4_Sub3_1 != null) {
				local58.aClass4_Sub3_1.method5893(Static444.aClass26_11);
			}
			for (@Pc(101) Class134 local101 = local58.aClass134_1; local101 != null; local101 = local101.aClass134_2) {
				local101.aClass4_Sub2_1.method5893(Static444.aClass26_11);
			}
		} else if (this.anInt3692 >= 30 && this.anInt3692 <= 33) {
			Static444.aClass26_11.o(3000.0F, super.aFloatArray22[local8] * 1.5F);
			((Class106) local36).method5479(Static249.anInt4746, Static404.anInt7034, Static178.anInt3432, Static348.aBooleanArrayArray7, this.anInt3692 - 30 == 0);
		} else if (this.anInt3692 >= 40 && this.anInt3692 <= 43) {
			Static444.aClass26_11.o(3000.0F, super.aFloatArray22[local8] * 1.5F);
			((Class106) local36).method5479(Static249.anInt4746, Static404.anInt7034, Static178.anInt3432, Static24.aBooleanArrayArray1, this.anInt3692 - 40 == 0);
		} else if (this.anInt3692 == 22) {
			Static444.aClass26_11.fa(-1, 1583160, 40, 127);
		} else if (this.anInt3692 == 23) {
			Static444.aClass26_11.S();
			return;
		} else if (this.anInt3692 == 24) {
			Static444.aClass26_11.method2265(0, null);
			return;
		}
	}
}
