import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bha")
public final class Class28 {

	@OriginalMember(owner = "client!bha", name = "m", descriptor = "F")
	public float aFloat11 = 1.0F;

	@OriginalMember(owner = "client!bha", name = "s", descriptor = "F")
	public float aFloat12 = 0.25F;

	@OriginalMember(owner = "client!bha", name = "l", descriptor = "F")
	public float aFloat8 = 1.0F;

	@OriginalMember(owner = "client!bha", name = "w", descriptor = "F")
	public float aFloat10;

	@OriginalMember(owner = "client!bha", name = "t", descriptor = "I")
	public int anInt811;

	@OriginalMember(owner = "client!bha", name = "i", descriptor = "I")
	public int anInt817;

	@OriginalMember(owner = "client!bha", name = "h", descriptor = "I")
	public int anInt806;

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "Lclient!op;")
	public Class275 aClass275_1;

	@OriginalMember(owner = "client!bha", name = "d", descriptor = "Lclient!dn;")
	public Class77 aClass77_2;

	@OriginalMember(owner = "client!bha", name = "n", descriptor = "I")
	public int anInt815;

	@OriginalMember(owner = "client!bha", name = "p", descriptor = "F")
	public float aFloat9;

	@OriginalMember(owner = "client!bha", name = "r", descriptor = "I")
	public int anInt809;

	@OriginalMember(owner = "client!bha", name = "v", descriptor = "I")
	public int anInt818;

	@OriginalMember(owner = "client!bha", name = "u", descriptor = "F")
	public float aFloat13;

	@OriginalMember(owner = "client!bha", name = "<init>", descriptor = "()V")
	public Class28() {
		this.aFloat10 = 1.2F;
		this.anInt811 = -60;
		this.anInt817 = -50;
		this.anInt806 = 0;
		this.aClass275_1 = Static132.aClass275_2;
		this.aClass77_2 = Static67.aClass77_3;
		this.anInt815 = -50;
		this.aFloat9 = 1.1523438F;
		this.anInt809 = Static463.anInt8122;
		this.anInt818 = Static486.anInt8433;
		this.aFloat13 = 0.69921875F;
	}

	@OriginalMember(owner = "client!bha", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class28(@OriginalArg(0) Class3_Sub28 arg0) {
		this.method639(arg0);
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(ILclient!bha;)Z")
	public boolean method634(@OriginalArg(1) Class28 arg0) {
		return arg0.anInt809 == this.anInt809 && arg0.aFloat9 == this.aFloat9 && arg0.aFloat13 == this.aFloat13 && this.aFloat10 == arg0.aFloat10 && this.aFloat12 == arg0.aFloat12 && arg0.aFloat8 == this.aFloat8 && this.aFloat11 == arg0.aFloat11 && arg0.anInt818 == this.anInt818 && this.anInt806 == arg0.anInt806 && arg0.aClass77_2 == this.aClass77_2 && arg0.aClass275_1 == this.aClass275_1;
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(Lclient!rba;I)V")
	public void method635(@OriginalArg(0) Class3_Sub28 arg0) {
		this.aFloat8 = (float) (arg0.method5322(-61) * 8) / 255.0F;
		this.aFloat12 = (float) (arg0.method5322(-15) * 8) / 255.0F;
		this.aFloat11 = (float) (arg0.method5322(-28) * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(Lclient!rba;B)V")
	public void method639(@OriginalArg(0) Class3_Sub28 arg0) {
		@Pc(9) int local9 = arg0.method5322(-48);
		if (Static713.aClass3_Sub55_31.aClass15_Sub28_1.method9169() == 1 && Static510.aClass67_17.method7634() > 0) {
			if ((local9 & 0x1) == 0) {
				this.anInt809 = Static463.anInt8122;
			} else {
				this.anInt809 = arg0.method5312();
			}
			if ((local9 & 0x2) == 0) {
				this.aFloat9 = 1.1523438F;
			} else {
				this.aFloat9 = (float) arg0.method5272() / 256.0F;
			}
			if ((local9 & 0x4) == 0) {
				this.aFloat13 = 0.69921875F;
			} else {
				this.aFloat13 = (float) arg0.method5272() / 256.0F;
			}
			if ((local9 & 0x8) == 0) {
				this.aFloat10 = 1.2F;
			} else {
				this.aFloat10 = (float) arg0.method5272() / 256.0F;
			}
		} else {
			if ((local9 & 0x1) != 0) {
				arg0.method5312();
			}
			if ((local9 & 0x2) != 0) {
				arg0.method5272();
			}
			if ((local9 & 0x4) != 0) {
				arg0.method5272();
			}
			if ((local9 & 0x8) != 0) {
				arg0.method5272();
			}
			this.aFloat10 = 1.2F;
			this.aFloat9 = 1.1523438F;
			this.aFloat13 = 0.69921875F;
			this.anInt809 = Static463.anInt8122;
		}
		if ((local9 & 0x10) == 0) {
			this.anInt817 = -50;
			this.anInt815 = -50;
			this.anInt811 = -60;
		} else {
			this.anInt817 = arg0.method5281();
			this.anInt811 = arg0.method5281();
			this.anInt815 = arg0.method5281();
		}
		if ((local9 & 0x20) == 0) {
			this.anInt818 = Static486.anInt8433;
		} else {
			this.anInt818 = arg0.method5312();
		}
		if ((local9 & 0x40) == 0) {
			this.anInt806 = 0;
		} else {
			this.anInt806 = arg0.method5272();
		}
		if ((local9 & 0x80) == 0) {
			this.aClass77_2 = Static67.aClass77_3;
			return;
		}
		@Pc(273) int local273 = arg0.method5272();
		@Pc(277) int local277 = arg0.method5272();
		@Pc(281) int local281 = arg0.method5272();
		@Pc(285) int local285 = arg0.method5272();
		@Pc(289) int local289 = arg0.method5272();
		@Pc(293) int local293 = arg0.method5272();
		this.aClass77_2 = Static433.method6364(local273, local277, local289, local281, local285, local293);
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(BLclient!rba;)V")
	public void method641(@OriginalArg(1) Class3_Sub28 arg0) {
		@Pc(7) int local7 = arg0.method5272();
		@Pc(11) int local11 = arg0.method5281();
		@Pc(15) int local15 = arg0.method5281();
		@Pc(19) int local19 = arg0.method5281();
		@Pc(23) int local23 = arg0.method5272();
		Static134.anInt2495 = local23;
		this.aClass275_1 = Static372.method5395(local15, local19, local11, local7);
	}
}
