import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class184 {

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "F")
	public float aFloat94 = 0.25F;

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "F")
	public float aFloat95 = 1.0F;

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "F")
	public float aFloat97 = 1.0F;

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
	public final int anInt5297;

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
	public final int anInt5300;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "F")
	public final float aFloat93;

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "Lclient!qg;")
	public final Class30 aClass30_5;

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
	public final int anInt5299;

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
	public final int anInt5298;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
	public final int anInt5292;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "F")
	public final float aFloat96;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
	public final int anInt5291;

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "F")
	public final float aFloat98;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
	public Class184() {
		this.anInt5297 = -50;
		this.anInt5300 = -50;
		this.aFloat93 = 0.69921875F;
		this.aClass30_5 = Static231.aClass30_3;
		this.anInt5299 = Static18.anInt319;
		this.anInt5298 = -60;
		this.anInt5292 = Static456.anInt7587;
		this.aFloat96 = 1.2F;
		this.anInt5291 = 0;
		this.aFloat98 = 1.1523438F;
	}

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lclient!nn;)V")
	public Class184(@OriginalArg(0) Class10_Sub8 arg0) {
		@Pc(16) int local16 = arg0.method2502();
		if (Static361.aClass85_Sub1_1.method2105(Static423.anInt7114) && Static56.aClass50_1.method5854() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt5299 = Static18.anInt319;
			} else {
				this.anInt5299 = arg0.method2459();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat98 = 1.1523438F;
			} else {
				this.aFloat98 = (float) arg0.method2485() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat93 = 0.69921875F;
			} else {
				this.aFloat93 = (float) arg0.method2485() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat96 = 1.2F;
			} else {
				this.aFloat96 = (float) arg0.method2485() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method2459();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method2485();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method2485();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method2485();
			}
			this.aFloat96 = 1.2F;
			this.aFloat93 = 0.69921875F;
			this.aFloat98 = 1.1523438F;
			this.anInt5299 = Static18.anInt319;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt5297 = -50;
			this.anInt5298 = -60;
			this.anInt5300 = -50;
		} else {
			this.anInt5300 = arg0.method2492();
			this.anInt5298 = arg0.method2492();
			this.anInt5297 = arg0.method2492();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt5292 = Static456.anInt7587;
		} else {
			this.anInt5292 = arg0.method2459();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt5291 = 0;
		} else {
			this.anInt5291 = arg0.method2485();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass30_5 = Static231.aClass30_3;
		} else {
			@Pc(219) int local219 = arg0.method2485();
			@Pc(223) int local223 = arg0.method2485();
			@Pc(227) int local227 = arg0.method2485();
			@Pc(231) int local231 = arg0.method2485();
			@Pc(235) int local235 = arg0.method2485();
			@Pc(239) int local239 = arg0.method2485();
			this.aClass30_5 = Static445.method5938(local227, local235, local239, local231, local219, local223);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!nn;)V")
	public void method4241(@OriginalArg(1) Class10_Sub8 arg0) {
		this.aFloat95 = (float) (arg0.method2502() * 8) / 255.0F;
		this.aFloat94 = (float) (arg0.method2502() * 8) / 255.0F;
		this.aFloat97 = (float) (arg0.method2502() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!pb;I)Z")
	public boolean method4243(@OriginalArg(0) Class184 arg0) {
		return arg0.anInt5299 == this.anInt5299 && arg0.aFloat98 == this.aFloat98 && arg0.aFloat93 == this.aFloat93 && this.aFloat96 == arg0.aFloat96 && arg0.aFloat94 == this.aFloat94 && this.aFloat95 == arg0.aFloat95 && arg0.aFloat97 == this.aFloat97 && this.anInt5292 == arg0.anInt5292 && this.anInt5291 == arg0.anInt5291 && this.aClass30_5 == arg0.aClass30_5;
	}
}
