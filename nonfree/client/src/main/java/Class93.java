import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class93 {

	@OriginalMember(owner = "client!gq", name = "j", descriptor = "F")
	public float aFloat18 = 1.0F;

	@OriginalMember(owner = "client!gq", name = "q", descriptor = "F")
	public float aFloat20 = 0.25F;

	@OriginalMember(owner = "client!gq", name = "t", descriptor = "F")
	public float aFloat21 = 1.0F;

	@OriginalMember(owner = "client!gq", name = "h", descriptor = "I")
	public final int anInt2699;

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "I")
	public final int anInt2695;

	@OriginalMember(owner = "client!gq", name = "n", descriptor = "I")
	public final int anInt2703;

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "I")
	public final int anInt2696;

	@OriginalMember(owner = "client!gq", name = "k", descriptor = "F")
	public final float aFloat19;

	@OriginalMember(owner = "client!gq", name = "g", descriptor = "Lclient!pc;")
	public final Class16 aClass16_4;

	@OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
	public final int anInt2702;

	@OriginalMember(owner = "client!gq", name = "r", descriptor = "I")
	public final int anInt2705;

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "F")
	public final float aFloat17;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "F")
	public final float aFloat16;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "()V")
	public Class93() {
		this.anInt2699 = -60;
		this.anInt2695 = Static268.anInt4756;
		this.anInt2703 = Static144.anInt2776;
		this.anInt2696 = -50;
		this.aFloat19 = 1.1523438F;
		this.aClass16_4 = Static48.aClass16_1;
		this.anInt2702 = 0;
		this.anInt2705 = -50;
		this.aFloat17 = 1.2F;
		this.aFloat16 = 0.69921875F;
	}

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!hp;)V")
	public Class93(@OriginalArg(0) Class1_Sub5 arg0) {
		@Pc(16) int local16 = arg0.method5366();
		if (Static38.aClass135_Sub1_1.method4237(Static143.anInt2766) && Static201.aClass39_6.method4520() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt2703 = Static144.anInt2776;
			} else {
				this.anInt2703 = arg0.method5407();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat19 = 1.1523438F;
			} else {
				this.aFloat19 = (float) arg0.method5362() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat16 = 0.69921875F;
			} else {
				this.aFloat16 = (float) arg0.method5362() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat17 = 1.2F;
			} else {
				this.aFloat17 = (float) arg0.method5362() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method5407();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method5362();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method5362();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method5362();
			}
			this.aFloat17 = 1.2F;
			this.anInt2703 = Static144.anInt2776;
			this.aFloat19 = 1.1523438F;
			this.aFloat16 = 0.69921875F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt2705 = -50;
			this.anInt2696 = -50;
			this.anInt2699 = -60;
		} else {
			this.anInt2705 = arg0.method5380();
			this.anInt2699 = arg0.method5380();
			this.anInt2696 = arg0.method5380();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt2695 = Static268.anInt4756;
		} else {
			this.anInt2695 = arg0.method5407();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt2702 = 0;
		} else {
			this.anInt2702 = arg0.method5362();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass16_4 = Static48.aClass16_1;
		} else {
			@Pc(226) int local226 = arg0.method5362();
			@Pc(230) int local230 = arg0.method5362();
			@Pc(234) int local234 = arg0.method5362();
			@Pc(238) int local238 = arg0.method5362();
			@Pc(242) int local242 = arg0.method5362();
			@Pc(246) int local246 = arg0.method5362();
			this.aClass16_4 = Static265.method3925(local238, local246, local230, local242, local226, local234);
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!hp;Z)V")
	public void method2325(@OriginalArg(0) Class1_Sub5 arg0) {
		this.aFloat18 = (float) (arg0.method5366() * 8) / 255.0F;
		this.aFloat20 = (float) (arg0.method5366() * 8) / 255.0F;
		this.aFloat21 = (float) (arg0.method5366() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!gq;I)Z")
	public boolean method2326(@OriginalArg(0) Class93 arg0) {
		return this.anInt2703 == arg0.anInt2703 && arg0.aFloat19 == this.aFloat19 && arg0.aFloat16 == this.aFloat16 && arg0.aFloat17 == this.aFloat17 && arg0.aFloat20 == this.aFloat20 && this.aFloat18 == arg0.aFloat18 && arg0.aFloat21 == this.aFloat21 && arg0.anInt2695 == this.anInt2695 && arg0.anInt2702 == this.anInt2702 && arg0.aClass16_4 == this.aClass16_4;
	}
}
