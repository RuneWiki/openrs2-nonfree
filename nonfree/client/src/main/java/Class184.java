import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class184 {

	@OriginalMember(owner = "client!so", name = "g", descriptor = "F")
	public float aFloat71 = 1.0F;

	@OriginalMember(owner = "client!so", name = "r", descriptor = "F")
	public float aFloat74 = 1.0F;

	@OriginalMember(owner = "client!so", name = "v", descriptor = "F")
	public float aFloat75 = 0.25F;

	@OriginalMember(owner = "client!so", name = "y", descriptor = "I")
	public final int anInt5814;

	@OriginalMember(owner = "client!so", name = "o", descriptor = "F")
	public final float aFloat73;

	@OriginalMember(owner = "client!so", name = "m", descriptor = "F")
	public final float aFloat72;

	@OriginalMember(owner = "client!so", name = "n", descriptor = "I")
	public final int anInt5807;

	@OriginalMember(owner = "client!so", name = "h", descriptor = "I")
	public final int anInt5805;

	@OriginalMember(owner = "client!so", name = "w", descriptor = "I")
	public final int anInt5813;

	@OriginalMember(owner = "client!so", name = "e", descriptor = "F")
	public final float aFloat70;

	@OriginalMember(owner = "client!so", name = "p", descriptor = "I")
	public final int anInt5808;

	@OriginalMember(owner = "client!so", name = "i", descriptor = "Lclient!ke;")
	public final Class113 aClass113_3;

	@OriginalMember(owner = "client!so", name = "u", descriptor = "I")
	public final int anInt5812;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V")
	public Class184() {
		this.anInt5814 = Static290.anInt5810;
		this.aFloat73 = 1.1523438F;
		this.aFloat72 = 0.69921875F;
		this.anInt5807 = -50;
		this.anInt5805 = 0;
		this.anInt5813 = -50;
		this.aFloat70 = 1.2F;
		this.anInt5808 = Static18.anInt527;
		this.aClass113_3 = Static228.aClass113_2;
		this.anInt5812 = -60;
	}

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!fb;)V")
	public Class184(@OriginalArg(0) Class3_Sub4 arg0) {
		@Pc(16) int local16 = arg0.method3643();
		if (Static118.aBoolean141 && Static235.aClass122_9.method4800() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt5814 = Static290.anInt5810;
			} else {
				this.anInt5814 = arg0.method3642();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat73 = 1.1523438F;
			} else {
				this.aFloat73 = (float) arg0.method3649() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat72 = 0.69921875F;
			} else {
				this.aFloat72 = (float) arg0.method3649() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat70 = 1.2F;
			} else {
				this.aFloat70 = (float) arg0.method3649() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method3642();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method3649();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method3649();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method3649();
			}
			this.anInt5814 = Static290.anInt5810;
			this.aFloat72 = 0.69921875F;
			this.aFloat70 = 1.2F;
			this.aFloat73 = 1.1523438F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt5807 = -50;
			this.anInt5813 = -50;
			this.anInt5812 = -60;
		} else {
			this.anInt5807 = arg0.method3622();
			this.anInt5812 = arg0.method3622();
			this.anInt5813 = arg0.method3622();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt5808 = Static18.anInt527;
		} else {
			this.anInt5808 = arg0.method3642();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt5805 = 0;
		} else {
			this.anInt5805 = arg0.method3649();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass113_3 = Static228.aClass113_2;
		} else {
			this.aClass113_3 = Static294.method5392(arg0.method3649(), arg0.method3649(), arg0.method3649(), arg0.method3649(), arg0.method3649(), arg0.method3649());
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!so;B)Z")
	public boolean method4953(@OriginalArg(0) Class184 arg0) {
		return arg0.anInt5814 == this.anInt5814 && arg0.aFloat73 == this.aFloat73 && this.aFloat72 == arg0.aFloat72 && arg0.aFloat70 == this.aFloat70 && this.aFloat75 == arg0.aFloat75 && arg0.aFloat71 == this.aFloat71 && arg0.aFloat74 == this.aFloat74 && this.anInt5808 == arg0.anInt5808 && this.anInt5805 == arg0.anInt5805 && arg0.aClass113_3 == this.aClass113_3;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!fb;I)V")
	public void method4955(@OriginalArg(0) Class3_Sub4 arg0) {
		this.aFloat71 = (float) (arg0.method3643() * 8) / 255.0F;
		this.aFloat75 = (float) (arg0.method3643() * 8) / 255.0F;
		this.aFloat74 = (float) (arg0.method3643() * 8) / 255.0F;
	}
}
