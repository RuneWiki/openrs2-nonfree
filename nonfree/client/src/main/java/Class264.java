import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class264 {

	@OriginalMember(owner = "client!np", name = "a", descriptor = "F")
	public float aFloat117 = 1.0F;

	@OriginalMember(owner = "client!np", name = "i", descriptor = "F")
	public float aFloat118 = 1.0F;

	@OriginalMember(owner = "client!np", name = "t", descriptor = "F")
	public float aFloat121 = 0.25F;

	@OriginalMember(owner = "client!np", name = "q", descriptor = "F")
	public float aFloat116;

	@OriginalMember(owner = "client!np", name = "m", descriptor = "I")
	public int anInt7054;

	@OriginalMember(owner = "client!np", name = "v", descriptor = "F")
	public float aFloat119;

	@OriginalMember(owner = "client!np", name = "l", descriptor = "I")
	public int anInt7049;

	@OriginalMember(owner = "client!np", name = "p", descriptor = "Lclient!to;")
	public Class358 aClass358_26;

	@OriginalMember(owner = "client!np", name = "h", descriptor = "I")
	public int anInt7053;

	@OriginalMember(owner = "client!np", name = "k", descriptor = "F")
	public float aFloat120;

	@OriginalMember(owner = "client!np", name = "e", descriptor = "Lclient!db;")
	public Class74 aClass74_4;

	@OriginalMember(owner = "client!np", name = "u", descriptor = "I")
	public int anInt7050;

	@OriginalMember(owner = "client!np", name = "b", descriptor = "I")
	public int anInt7044;

	@OriginalMember(owner = "client!np", name = "f", descriptor = "I")
	public int anInt7051;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "()V")
	public Class264() {
		this.aFloat116 = 1.2F;
		this.anInt7054 = Static224.anInt11064;
		this.aFloat119 = 0.69921875F;
		this.anInt7049 = Static93.anInt1639;
		this.aClass358_26 = Static682.aClass358_35;
		this.anInt7053 = -50;
		this.aFloat120 = 1.1523438F;
		this.aClass74_4 = Static302.aClass74_3;
		this.anInt7050 = 0;
		this.anInt7044 = -60;
		this.anInt7051 = -50;
	}

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class264(@OriginalArg(0) Class2_Sub20 arg0) {
		this.method6283(arg0);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BLclient!et;)V")
	public void method6283(@OriginalArg(1) Class2_Sub20 arg0) {
		@Pc(9) int local9 = arg0.method8581(-17416);
		if (Static650.aClass2_Sub30_29.aClass11_Sub29_1.method9323() == 1 && Static587.aClass145_12.method9694() > 0) {
			if ((local9 & 0x1) == 0) {
				this.anInt7054 = Static224.anInt11064;
			} else {
				this.anInt7054 = arg0.method8555(-9372);
			}
			if ((local9 & 0x2) == 0) {
				this.aFloat120 = 1.1523438F;
			} else {
				this.aFloat120 = (float) arg0.method8575() / 256.0F;
			}
			if ((local9 & 0x4) == 0) {
				this.aFloat119 = 0.69921875F;
			} else {
				this.aFloat119 = (float) arg0.method8575() / 256.0F;
			}
			if ((local9 & 0x8) == 0) {
				this.aFloat116 = 1.2F;
			} else {
				this.aFloat116 = (float) arg0.method8575() / 256.0F;
			}
		} else {
			if ((local9 & 0x1) != 0) {
				arg0.method8555(-9372);
			}
			if ((local9 & 0x2) != 0) {
				arg0.method8575();
			}
			if ((local9 & 0x4) != 0) {
				arg0.method8575();
			}
			if ((local9 & 0x8) != 0) {
				arg0.method8575();
			}
			this.aFloat120 = 1.1523438F;
			this.anInt7054 = Static224.anInt11064;
			this.aFloat116 = 1.2F;
			this.aFloat119 = 0.69921875F;
		}
		if ((local9 & 0x10) == 0) {
			this.anInt7053 = -50;
			this.anInt7051 = -50;
			this.anInt7044 = -60;
		} else {
			this.anInt7053 = arg0.method8598();
			this.anInt7044 = arg0.method8598();
			this.anInt7051 = arg0.method8598();
		}
		if ((local9 & 0x20) == 0) {
			this.anInt7049 = Static93.anInt1639;
		} else {
			this.anInt7049 = arg0.method8555(-9372);
		}
		if ((local9 & 0x40) == 0) {
			this.anInt7050 = 0;
		} else {
			this.anInt7050 = arg0.method8575();
		}
		if ((local9 & 0x80) == 0) {
			this.aClass74_4 = Static302.aClass74_3;
			return;
		}
		@Pc(260) int local260 = arg0.method8575();
		@Pc(264) int local264 = arg0.method8575();
		@Pc(268) int local268 = arg0.method8575();
		@Pc(272) int local272 = arg0.method8575();
		@Pc(276) int local276 = arg0.method8575();
		@Pc(280) int local280 = arg0.method8575();
		this.aClass74_4 = Static629.method8511(local260, local280, local272, local268, local264, local276);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ILclient!et;)V")
	public void method6284(@OriginalArg(1) Class2_Sub20 arg0) {
		this.aFloat118 = (float) (arg0.method8581(-17416) * 8) / 255.0F;
		this.aFloat121 = (float) (arg0.method8581(-17416) * 8) / 255.0F;
		this.aFloat117 = (float) (arg0.method8581(-17416) * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BLclient!np;)Z")
	public boolean method6285(@OriginalArg(1) Class264 arg0) {
		return arg0.anInt7054 == this.anInt7054 && this.aFloat120 == arg0.aFloat120 && arg0.aFloat119 == this.aFloat119 && arg0.aFloat116 == this.aFloat116 && this.aFloat121 == arg0.aFloat121 && this.aFloat118 == arg0.aFloat118 && this.aFloat117 == arg0.aFloat117 && this.anInt7049 == arg0.anInt7049 && this.anInt7050 == arg0.anInt7050 && arg0.aClass74_4 == this.aClass74_4 && arg0.aClass358_26 == this.aClass358_26;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!et;I)V")
	public void method6287(@OriginalArg(0) Class2_Sub20 arg0) {
		@Pc(7) int local7 = arg0.method8575();
		@Pc(11) int local11 = arg0.method8598();
		@Pc(22) int local22 = arg0.method8598();
		@Pc(26) int local26 = arg0.method8598();
		@Pc(30) int local30 = arg0.method8575();
		Static437.anInt7121 = local30;
		this.aClass358_26 = Static313.method4363(local22, local11, local26, local7);
	}
}
