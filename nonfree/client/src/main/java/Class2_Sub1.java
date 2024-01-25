import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
	private int anInt3022 = 0;

	@OriginalMember(owner = "client!jf", name = "u", descriptor = "Lclient!jd;")
	private final Class121 aClass121_1 = new Class121();

	static {
		new Class151("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZLclient!fl;)V")
	@Override
	public void method2555(@OriginalArg(1) Class82 arg0) {
		super.aByteArray34[super.anInt3080] = 20;
		super.anObjectArray4[super.anInt3080] = arg0;
		super.anInt3080++;
		if (super.anInt3080 >= 5000) {
			super.anInt3080 = 0;
		}
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
	private void method2486() {
		@Pc(8) int local8 = super.anInt3078++;
		if (super.anInt3078 >= 5000) {
			super.anInt3078 = 0;
		}
		this.anInt3022 = super.aByteArray34[local8];
		@Pc(42) Object local42 = super.anObjectArray4[local8];
		super.anObjectArray4[local8] = null;
		if (this.anInt3022 == 21) {
			Static446.method5580(this.aClass121_1, (Class82) local42);
		} else if (this.anInt3022 == 20) {
			@Pc(174) Class82 local174 = (Class82) local42;
			if (local174.aClass20_Sub1_2 != null) {
				local174.aClass20_Sub1_2.method5114(Static257.aClass128_36);
			}
			if (local174.aClass20_Sub1_3 != null) {
				local174.aClass20_Sub1_3.method5114(Static257.aClass128_36);
			}
			if (local174.aClass20_Sub4_1 != null) {
				local174.aClass20_Sub4_1.method5114(Static257.aClass128_36);
			}
			if (local174.aClass20_Sub4_2 != null) {
				local174.aClass20_Sub4_2.method5114(Static257.aClass128_36);
			}
			if (local174.aClass20_Sub2_1 != null) {
				local174.aClass20_Sub2_1.method5114(Static257.aClass128_36);
			}
			for (@Pc(217) Class146 local217 = local174.aClass146_1; local217 != null; local217 = local217.aClass146_3) {
				local217.aClass20_Sub3_1.method5114(Static257.aClass128_36);
			}
		} else if (this.anInt3022 >= 30 && this.anInt3022 <= 33) {
			Static257.aClass128_36.o(3000.0F, super.aFloatArray18[local8] * 1.5F);
			((Class163) local42).method4518(Static85.anInt4657, Static179.anInt2929, Static317.anInt5269, Static269.aBooleanArrayArray7, this.anInt3022 - 30 == 0);
		} else if (this.anInt3022 >= 40 && this.anInt3022 <= 43) {
			Static257.aClass128_36.o(3000.0F, super.aFloatArray18[local8] * 1.5F);
			((Class163) local42).method4518(Static85.anInt4657, Static179.anInt2929, Static317.anInt5269, Static82.aBooleanArrayArray1, this.anInt3022 - 40 == 0);
		} else if (this.anInt3022 == 22) {
			Static257.aClass128_36.fa(-1, 1583160, 40, 127);
		} else if (this.anInt3022 == 23) {
			Static257.aClass128_36.S();
		} else if (this.anInt3022 == 24) {
			Static257.aClass128_36.method3565(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
	@Override
	public void method2558() {
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILclient!fl;)V")
	@Override
	public void method2560(@OriginalArg(1) Class82 arg0) {
		super.aByteArray34[super.anInt3080] = 21;
		super.anObjectArray4[super.anInt3080] = arg0;
		super.anInt3080++;
		if (super.anInt3080 >= 5000) {
			super.anInt3080 = 0;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V")
	@Override
	public void method2556(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
	@Override
	public void method2561() {
		while (super.anInt3078 != super.anInt3080) {
			this.method2486();
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)V")
	@Override
	public void method2551(@OriginalArg(0) int arg0) {
		super.aByteArray34[super.anInt3080] = (byte) arg0;
		super.anInt3080++;
		if (super.anInt3080 >= 5000) {
			super.anInt3080 = 0;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BFLclient!na;IZ)V")
	@Override
	public void method2554(@OriginalArg(1) float arg0, @OriginalArg(2) Class163 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		super.aByteArray34[super.anInt3080] = (byte) (arg3 ? arg2 + 40 : arg2 + 30);
		super.anObjectArray4[super.anInt3080] = arg1;
		super.aFloatArray18[super.anInt3080] = arg0;
		super.anInt3080++;
		if (super.anInt3080 >= 5000) {
			super.anInt3080 = 0;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!fl;B)V")
	@Override
	public void method2557(@OriginalArg(0) Class82 arg0) {
		super.anInt3078--;
		if (super.anInt3078 < 0) {
			super.anInt3078 = 4999;
		}
		super.aByteArray34[super.anInt3078] = 21;
		super.anObjectArray4[super.anInt3078] = arg0;
	}
}
