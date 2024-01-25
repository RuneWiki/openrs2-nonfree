import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class169 {

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "F")
	public float aFloat70 = 1.0F;

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "F")
	public float aFloat71 = 0.25F;

	@OriginalMember(owner = "client!nf", name = "p", descriptor = "F")
	public float aFloat75 = 1.0F;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
	public final int anInt5002;

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "F")
	public final float aFloat74;

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
	public final int anInt5004;

	@OriginalMember(owner = "client!nf", name = "r", descriptor = "Lclient!kv;")
	public final Class41 aClass41_5;

	@OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
	public final int anInt5009;

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "F")
	public final float aFloat72;

	@OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
	public final int anInt5014;

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
	public final int anInt5008;

	@OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
	public final int anInt5011;

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "F")
	public final float aFloat73;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
	public Class169() {
		this.anInt5002 = -50;
		this.aFloat74 = 0.69921875F;
		this.anInt5004 = Static219.anInt4437;
		this.aClass41_5 = Static459.aClass41_6;
		this.anInt5009 = 0;
		this.aFloat72 = 1.2F;
		this.anInt5014 = -60;
		this.anInt5008 = Static182.anInt3700;
		this.anInt5011 = -50;
		this.aFloat73 = 1.1523438F;
	}

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lclient!wn;)V")
	public Class169(@OriginalArg(0) Class4_Sub20 arg0) {
		@Pc(16) int local16 = arg0.method4614();
		if (Static157.aClass185_Sub1_1.method4632(Static192.anInt3828) && Static182.aClass30_12.method2104() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt5004 = Static219.anInt4437;
			} else {
				this.anInt5004 = arg0.method4595();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat73 = 1.1523438F;
			} else {
				this.aFloat73 = (float) arg0.method4560() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat74 = 0.69921875F;
			} else {
				this.aFloat74 = (float) arg0.method4560() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat72 = 1.2F;
			} else {
				this.aFloat72 = (float) arg0.method4560() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method4595();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method4560();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method4560();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method4560();
			}
			this.anInt5004 = Static219.anInt4437;
			this.aFloat74 = 0.69921875F;
			this.aFloat73 = 1.1523438F;
			this.aFloat72 = 1.2F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt5011 = -50;
			this.anInt5014 = -60;
			this.anInt5002 = -50;
		} else {
			this.anInt5002 = arg0.method4586();
			this.anInt5014 = arg0.method4586();
			this.anInt5011 = arg0.method4586();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt5008 = Static182.anInt3700;
		} else {
			this.anInt5008 = arg0.method4595();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt5009 = 0;
		} else {
			this.anInt5009 = arg0.method4560();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass41_5 = Static459.aClass41_6;
		} else {
			@Pc(216) int local216 = arg0.method4560();
			@Pc(220) int local220 = arg0.method4560();
			@Pc(224) int local224 = arg0.method4560();
			@Pc(228) int local228 = arg0.method4560();
			@Pc(232) int local232 = arg0.method4560();
			@Pc(236) int local236 = arg0.method4560();
			this.aClass41_5 = Static215.method3944(local236, local228, local220, local232, local224, local216);
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!nf;I)Z")
	public boolean method4245(@OriginalArg(0) Class169 arg0) {
		return arg0.anInt5004 == this.anInt5004 && arg0.aFloat73 == this.aFloat73 && arg0.aFloat74 == this.aFloat74 && arg0.aFloat72 == this.aFloat72 && arg0.aFloat71 == this.aFloat71 && this.aFloat75 == arg0.aFloat75 && this.aFloat70 == arg0.aFloat70 && this.anInt5008 == arg0.anInt5008 && this.anInt5009 == arg0.anInt5009 && arg0.aClass41_5 == this.aClass41_5;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILclient!wn;)V")
	public void method4247(@OriginalArg(1) Class4_Sub20 arg0) {
		this.aFloat75 = (float) (arg0.method4614() * 8) / 255.0F;
		this.aFloat71 = (float) (arg0.method4614() * 8) / 255.0F;
		this.aFloat70 = (float) (arg0.method4614() * 8) / 255.0F;
	}
}
