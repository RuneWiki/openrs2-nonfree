import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fda")
public final class Class120 {

	@OriginalMember(owner = "client!fda", name = "j", descriptor = "F")
	public float aFloat29 = 1.0F;

	@OriginalMember(owner = "client!fda", name = "q", descriptor = "F")
	public float aFloat27 = 0.25F;

	@OriginalMember(owner = "client!fda", name = "c", descriptor = "F")
	public float aFloat31 = 1.0F;

	@OriginalMember(owner = "client!fda", name = "l", descriptor = "I")
	public final int anInt2508;

	@OriginalMember(owner = "client!fda", name = "m", descriptor = "I")
	public final int anInt2507;

	@OriginalMember(owner = "client!fda", name = "s", descriptor = "F")
	public final float aFloat28;

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "I")
	public final int anInt2503;

	@OriginalMember(owner = "client!fda", name = "d", descriptor = "I")
	public final int anInt2502;

	@OriginalMember(owner = "client!fda", name = "o", descriptor = "I")
	public final int anInt2506;

	@OriginalMember(owner = "client!fda", name = "i", descriptor = "F")
	public final float aFloat26;

	@OriginalMember(owner = "client!fda", name = "g", descriptor = "F")
	public final float aFloat30;

	@OriginalMember(owner = "client!fda", name = "r", descriptor = "Lclient!ol;")
	public final Class29 aClass29_1;

	@OriginalMember(owner = "client!fda", name = "p", descriptor = "I")
	public final int anInt2504;

	@OriginalMember(owner = "client!fda", name = "<init>", descriptor = "()V")
	public Class120() {
		this.anInt2508 = 0;
		this.anInt2507 = -50;
		this.aFloat28 = 1.2F;
		this.anInt2503 = -50;
		this.anInt2502 = Static279.anInt4837;
		this.anInt2506 = Static257.anInt6392;
		this.aFloat26 = 0.69921875F;
		this.aFloat30 = 1.1523438F;
		this.aClass29_1 = Static491.aClass29_4;
		this.anInt2504 = -60;
	}

	@OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(Lclient!ib;)V")
	public Class120(@OriginalArg(0) Class5_Sub23 arg0) {
		@Pc(16) int local16 = arg0.method8529();
		if (Static637.aClass5_Sub20_31.aClass24_Sub5_1.method2086() == 1 && Static60.aClass57_1.method7721() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt2506 = Static257.anInt6392;
			} else {
				this.anInt2506 = arg0.method8527();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat30 = 1.1523438F;
			} else {
				this.aFloat30 = (float) arg0.method8519() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat26 = 0.69921875F;
			} else {
				this.aFloat26 = (float) arg0.method8519() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat28 = 1.2F;
			} else {
				this.aFloat28 = (float) arg0.method8519() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method8527();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method8519();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method8519();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method8519();
			}
			this.anInt2506 = Static257.anInt6392;
			this.aFloat28 = 1.2F;
			this.aFloat30 = 1.1523438F;
			this.aFloat26 = 0.69921875F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt2507 = -50;
			this.anInt2504 = -60;
			this.anInt2503 = -50;
		} else {
			this.anInt2507 = arg0.method8516();
			this.anInt2504 = arg0.method8516();
			this.anInt2503 = arg0.method8516();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt2502 = Static279.anInt4837;
		} else {
			this.anInt2502 = arg0.method8527();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt2508 = 0;
		} else {
			this.anInt2508 = arg0.method8519();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass29_1 = Static491.aClass29_4;
		} else {
			@Pc(266) int local266 = arg0.method8519();
			@Pc(270) int local270 = arg0.method8519();
			@Pc(274) int local274 = arg0.method8519();
			@Pc(278) int local278 = arg0.method8519();
			@Pc(282) int local282 = arg0.method8519();
			@Pc(286) int local286 = arg0.method8519();
			this.aClass29_1 = Static312.method4753(local282, local270, local286, local278, local266, local274);
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(BLclient!fda;)Z")
	public boolean method2196(@OriginalArg(1) Class120 arg0) {
		return this.anInt2506 == arg0.anInt2506 && arg0.aFloat30 == this.aFloat30 && this.aFloat26 == arg0.aFloat26 && arg0.aFloat28 == this.aFloat28 && this.aFloat27 == arg0.aFloat27 && arg0.aFloat31 == this.aFloat31 && this.aFloat29 == arg0.aFloat29 && arg0.anInt2502 == this.anInt2502 && this.anInt2508 == arg0.anInt2508 && arg0.aClass29_1 == this.aClass29_1;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lclient!ib;I)V")
	public void method2197(@OriginalArg(0) Class5_Sub23 arg0) {
		this.aFloat31 = (float) (arg0.method8529() * 8) / 255.0F;
		this.aFloat27 = (float) (arg0.method8529() * 8) / 255.0F;
		this.aFloat29 = (float) (arg0.method8529() * 8) / 255.0F;
	}
}
