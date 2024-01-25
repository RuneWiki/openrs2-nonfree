import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class22 {

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "F")
	public float aFloat11 = 1.0F;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "F")
	public float aFloat6 = 1.0F;

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "F")
	public float aFloat10 = 0.25F;

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
	public final int anInt561;

	@OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
	public final int anInt563;

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "Lclient!mh;")
	public final Class155 aClass155_1;

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "F")
	public final float aFloat7;

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "F")
	public final float aFloat8;

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "F")
	public final float aFloat9;

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
	public final int anInt562;

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
	public final int anInt559;

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
	public final int anInt557;

	@OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
	public final int anInt565;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
	public Class22() {
		this.anInt561 = -50;
		this.anInt563 = -60;
		this.aClass155_1 = Static164.aClass155_2;
		this.aFloat7 = 1.2F;
		this.aFloat8 = 1.1523438F;
		this.aFloat9 = 0.69921875F;
		this.anInt562 = Static380.anInt6431;
		this.anInt559 = -50;
		this.anInt557 = Static387.anInt6504;
		this.anInt565 = 0;
	}

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!si;)V")
	public Class22(@OriginalArg(0) Class2_Sub23 arg0) {
		@Pc(16) int local16 = arg0.method5495();
		if (Static12.aClass79_Sub1_1.method3959(Static399.anInt6653) && Static195.aClass49_5.method4433() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt562 = Static380.anInt6431;
			} else {
				this.anInt562 = arg0.method5508();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat8 = 1.1523438F;
			} else {
				this.aFloat8 = (float) arg0.method5500() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat9 = 0.69921875F;
			} else {
				this.aFloat9 = (float) arg0.method5500() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat7 = 1.2F;
			} else {
				this.aFloat7 = (float) arg0.method5500() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method5508();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method5500();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method5500();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method5500();
			}
			this.aFloat7 = 1.2F;
			this.anInt562 = Static380.anInt6431;
			this.aFloat8 = 1.1523438F;
			this.aFloat9 = 0.69921875F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt561 = -50;
			this.anInt559 = -50;
			this.anInt563 = -60;
		} else {
			this.anInt559 = arg0.method5458();
			this.anInt563 = arg0.method5458();
			this.anInt561 = arg0.method5458();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt557 = Static387.anInt6504;
		} else {
			this.anInt557 = arg0.method5508();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt565 = 0;
		} else {
			this.anInt565 = arg0.method5500();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass155_1 = Static164.aClass155_2;
		} else {
			@Pc(229) int local229 = arg0.method5500();
			@Pc(233) int local233 = arg0.method5500();
			@Pc(237) int local237 = arg0.method5500();
			@Pc(241) int local241 = arg0.method5500();
			@Pc(245) int local245 = arg0.method5500();
			@Pc(249) int local249 = arg0.method5500();
			this.aClass155_1 = Static167.method2728(local229, local245, local237, local233, local249, local241);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!si;I)V")
	public void method482(@OriginalArg(0) Class2_Sub23 arg0) {
		this.aFloat11 = (float) (arg0.method5495() * 8) / 255.0F;
		this.aFloat10 = (float) (arg0.method5495() * 8) / 255.0F;
		this.aFloat6 = (float) (arg0.method5495() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILclient!bf;)Z")
	public boolean method485(@OriginalArg(1) Class22 arg0) {
		return arg0.anInt562 == this.anInt562 && this.aFloat8 == arg0.aFloat8 && arg0.aFloat9 == this.aFloat9 && this.aFloat7 == arg0.aFloat7 && arg0.aFloat10 == this.aFloat10 && this.aFloat11 == arg0.aFloat11 && this.aFloat6 == arg0.aFloat6 && this.anInt557 == arg0.anInt557 && this.anInt565 == arg0.anInt565 && this.aClass155_1 == arg0.aClass155_1;
	}
}
