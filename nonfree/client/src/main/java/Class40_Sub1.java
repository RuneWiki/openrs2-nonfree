import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class40_Sub1 extends Class40 {

	@OriginalMember(owner = "client!bw", name = "y", descriptor = "I")
	private int anInt1300 = 0;

	@OriginalMember(owner = "client!bw", name = "B", descriptor = "Lclient!lp;")
	private final Class111 aClass111_1 = new Class111();

	static {
		new Class45("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lclient!dg;Z)V")
	@Override
	public void method8213(@OriginalArg(0) Class64 arg0) {
		super.aByteArray118[super.anInt9534] = 21;
		super.anObjectArray36[super.anInt9534] = arg0;
		super.anInt9534++;
		if (super.anInt9534 >= 5000) {
			super.anInt9534 = 0;
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lclient!dg;B)V")
	@Override
	public void method8217(@OriginalArg(0) Class64 arg0) {
		super.aByteArray118[super.anInt9534] = 20;
		super.anObjectArray36[super.anInt9534] = arg0;
		super.anInt9534++;
		if (super.anInt9534 >= 5000) {
			super.anInt9534 = 0;
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V")
	@Override
	public void method8209() {
		while (super.anInt9534 != super.anInt9535) {
			this.method1360();
		}
	}

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "(I)V")
	private void method1360() {
		@Pc(8) int local8 = super.anInt9535++;
		if (super.anInt9535 >= 5000) {
			super.anInt9535 = 0;
		}
		this.anInt1300 = super.aByteArray118[local8];
		@Pc(38) Object local38 = super.anObjectArray36[local8];
		super.anObjectArray36[local8] = null;
		if (this.anInt1300 == 21) {
			Static503.method5019(this.aClass111_1, (Class64) local38);
		} else if (this.anInt1300 == 20) {
			@Pc(164) Class64 local164 = (Class64) local38;
			if (local164.aClass20_Sub2_1 != null) {
				local164.aClass20_Sub2_1.method8030(Static281.aClass4_9);
			}
			if (local164.aClass20_Sub2_2 != null) {
				local164.aClass20_Sub2_2.method8030(Static281.aClass4_9);
			}
			if (local164.aClass20_Sub4_2 != null) {
				local164.aClass20_Sub4_2.method8030(Static281.aClass4_9);
			}
			if (local164.aClass20_Sub4_1 != null) {
				local164.aClass20_Sub4_1.method8030(Static281.aClass4_9);
			}
			if (local164.aClass20_Sub5_1 != null) {
				local164.aClass20_Sub5_1.method8030(Static281.aClass4_9);
			}
			for (@Pc(211) Class232 local211 = local164.aClass232_2; local211 != null; local211 = local211.aClass232_3) {
				local211.aClass20_Sub1_2.method8030(Static281.aClass4_9);
			}
		} else if (this.anInt1300 >= 30 && this.anInt1300 <= 33) {
			Static281.aClass4_9.la(3000.0F, super.aFloatArray79[local8] * 1.5F);
			((Class7) local38).method8249(Static539.anInt9517, Static421.anInt7325, Static466.anInt8044, Static38.aBooleanArrayArray1, this.anInt1300 - 30 == 0);
		} else if (this.anInt1300 >= 40 && this.anInt1300 <= 43) {
			Static281.aClass4_9.la(3000.0F, super.aFloatArray79[local8] * 1.5F);
			((Class7) local38).method8249(Static539.anInt9517, Static421.anInt7325, Static466.anInt8044, Static442.aBooleanArrayArray10, this.anInt1300 - 40 == 0);
		} else if (this.anInt1300 == 22) {
			Static281.aClass4_9.q(-1, 1583160, 40, 127);
		} else if (this.anInt1300 == 23) {
			Static281.aClass4_9.xa();
		} else if (this.anInt1300 == 24) {
			Static281.aClass4_9.method7222(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lclient!sa;IIZF)V")
	@Override
	public void method8216(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) float arg3) {
		super.aByteArray118[super.anInt9534] = (byte) (arg2 ? arg1 + 40 : arg1 + 30);
		super.anObjectArray36[super.anInt9534] = arg0;
		super.aFloatArray79[super.anInt9534] = arg3;
		super.anInt9534++;
		if (super.anInt9534 >= 5000) {
			super.anInt9534 = 0;
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)V")
	@Override
	public void method8219(@OriginalArg(1) int arg0) {
		super.aByteArray118[super.anInt9534] = (byte) arg0;
		super.anInt9534++;
		if (super.anInt9534 >= 5000) {
			super.anInt9534 = 0;
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILclient!dg;)V")
	@Override
	public void method8212(@OriginalArg(1) Class64 arg0) {
		super.anInt9535--;
		if (super.anInt9535 < 0) {
			super.anInt9535 = 4999;
		}
		super.aByteArray118[super.anInt9535] = 21;
		super.anObjectArray36[super.anInt9535] = arg0;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V")
	@Override
	public void method8215() {
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8210(@OriginalArg(0) int arg0) {
	}
}
