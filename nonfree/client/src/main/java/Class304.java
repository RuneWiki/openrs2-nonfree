import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rja")
public final class Class304 {

	@OriginalMember(owner = "client!rja", name = "k", descriptor = "F")
	public float aFloat223 = 1.0F;

	@OriginalMember(owner = "client!rja", name = "m", descriptor = "F")
	public float aFloat225 = 0.25F;

	@OriginalMember(owner = "client!rja", name = "b", descriptor = "F")
	public float aFloat220 = 1.0F;

	@OriginalMember(owner = "client!rja", name = "e", descriptor = "I")
	public final int anInt9029;

	@OriginalMember(owner = "client!rja", name = "n", descriptor = "F")
	public final float aFloat226;

	@OriginalMember(owner = "client!rja", name = "c", descriptor = "I")
	public final int anInt9028;

	@OriginalMember(owner = "client!rja", name = "l", descriptor = "F")
	public final float aFloat224;

	@OriginalMember(owner = "client!rja", name = "p", descriptor = "I")
	public final int anInt9035;

	@OriginalMember(owner = "client!rja", name = "h", descriptor = "I")
	public final int anInt9031;

	@OriginalMember(owner = "client!rja", name = "o", descriptor = "I")
	public final int anInt9034;

	@OriginalMember(owner = "client!rja", name = "d", descriptor = "F")
	public final float aFloat221;

	@OriginalMember(owner = "client!rja", name = "q", descriptor = "Lclient!qaa;")
	public final Class144 aClass144_3;

	@OriginalMember(owner = "client!rja", name = "g", descriptor = "I")
	public final int anInt9030;

	@OriginalMember(owner = "client!rja", name = "<init>", descriptor = "()V")
	public Class304() {
		this.anInt9029 = -50;
		this.aFloat226 = 1.1523438F;
		this.anInt9028 = Static510.anInt8990;
		this.aFloat224 = 0.69921875F;
		this.anInt9035 = -50;
		this.anInt9031 = -60;
		this.anInt9034 = Static453.anInt7942;
		this.aFloat221 = 1.2F;
		this.aClass144_3 = Static626.aClass144_4;
		this.anInt9030 = 0;
	}

	@OriginalMember(owner = "client!rja", name = "<init>", descriptor = "(Lclient!so;)V")
	public Class304(@OriginalArg(0) Class14_Sub29 arg0) {
		@Pc(16) int local16 = arg0.method5866();
		if (Static56.aClass14_Sub22_5.aClass21_Sub18_1.method5561() == 1 && Static354.aClass137_31.method7937() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt9034 = Static453.anInt7942;
			} else {
				this.anInt9034 = arg0.method5878();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat226 = 1.1523438F;
			} else {
				this.aFloat226 = (float) arg0.method5900() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat224 = 0.69921875F;
			} else {
				this.aFloat224 = (float) arg0.method5900() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat221 = 1.2F;
			} else {
				this.aFloat221 = (float) arg0.method5900() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method5878();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method5900();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method5900();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method5900();
			}
			this.aFloat221 = 1.2F;
			this.aFloat226 = 1.1523438F;
			this.aFloat224 = 0.69921875F;
			this.anInt9034 = Static453.anInt7942;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt9031 = -60;
			this.anInt9035 = -50;
			this.anInt9029 = -50;
		} else {
			this.anInt9029 = arg0.method5890();
			this.anInt9031 = arg0.method5890();
			this.anInt9035 = arg0.method5890();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt9028 = Static510.anInt8990;
		} else {
			this.anInt9028 = arg0.method5878();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt9030 = 0;
		} else {
			this.anInt9030 = arg0.method5900();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass144_3 = Static626.aClass144_4;
		} else {
			@Pc(222) int local222 = arg0.method5900();
			@Pc(226) int local226 = arg0.method5900();
			@Pc(230) int local230 = arg0.method5900();
			@Pc(234) int local234 = arg0.method5900();
			@Pc(238) int local238 = arg0.method5900();
			@Pc(242) int local242 = arg0.method5900();
			this.aClass144_3 = Static524.method7530(local230, local222, local226, local242, local238, local234);
		}
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lclient!so;I)V")
	public void method7475(@OriginalArg(0) Class14_Sub29 arg0) {
		this.aFloat220 = (float) (arg0.method5866() * 8) / 255.0F;
		this.aFloat225 = (float) (arg0.method5866() * 8) / 255.0F;
		this.aFloat223 = (float) (arg0.method5866() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(ILclient!rja;)Z")
	public boolean method7476(@OriginalArg(1) Class304 arg0) {
		return this.anInt9034 == arg0.anInt9034 && this.aFloat226 == arg0.aFloat226 && arg0.aFloat224 == this.aFloat224 && this.aFloat221 == arg0.aFloat221 && arg0.aFloat225 == this.aFloat225 && arg0.aFloat220 == this.aFloat220 && this.aFloat223 == arg0.aFloat223 && arg0.anInt9028 == this.anInt9028 && this.anInt9030 == arg0.anInt9030 && this.aClass144_3 == arg0.aClass144_3;
	}
}
