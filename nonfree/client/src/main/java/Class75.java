import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class75 {

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "F")
	public float aFloat38 = 0.25F;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "F")
	public float aFloat37 = 1.0F;

	@OriginalMember(owner = "client!dj", name = "i", descriptor = "F")
	public float aFloat39 = 1.0F;

	@OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
	public final int anInt1724;

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "Lclient!rs;")
	public final Class17 aClass17_1;

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
	public final int anInt1719;

	@OriginalMember(owner = "client!dj", name = "q", descriptor = "I")
	public final int anInt1725;

	@OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
	public final int anInt1722;

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
	public final int anInt1717;

	@OriginalMember(owner = "client!dj", name = "r", descriptor = "F")
	public final float aFloat41;

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
	public final int anInt1716;

	@OriginalMember(owner = "client!dj", name = "s", descriptor = "F")
	public final float aFloat42;

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "F")
	public final float aFloat40;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
	public Class75() {
		this.anInt1724 = -50;
		this.aClass17_1 = Static198.aClass17_2;
		this.anInt1719 = 0;
		this.anInt1725 = -60;
		this.anInt1722 = Static268.anInt4385;
		this.anInt1717 = -50;
		this.aFloat41 = 0.69921875F;
		this.anInt1716 = Static179.anInt2669;
		this.aFloat42 = 1.1523438F;
		this.aFloat40 = 1.2F;
	}

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lclient!gk;)V")
	public Class75(@OriginalArg(0) Class2_Sub7 arg0) {
		@Pc(16) int local16 = arg0.method4464();
		if (Static257.aClass2_Sub35_Sub1_1.method6036(Static226.anInt3318) && Static15.aClass162_1.method6851() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt1722 = Static268.anInt4385;
			} else {
				this.anInt1722 = arg0.method4509();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat42 = 1.1523438F;
			} else {
				this.aFloat42 = (float) arg0.method4518() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat41 = 0.69921875F;
			} else {
				this.aFloat41 = (float) arg0.method4518() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat40 = 1.2F;
			} else {
				this.aFloat40 = (float) arg0.method4518() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method4509();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method4518();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method4518();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method4518();
			}
			this.anInt1722 = Static268.anInt4385;
			this.aFloat41 = 0.69921875F;
			this.aFloat40 = 1.2F;
			this.aFloat42 = 1.1523438F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt1725 = -60;
			this.anInt1724 = -50;
			this.anInt1717 = -50;
		} else {
			this.anInt1717 = arg0.method4478();
			this.anInt1725 = arg0.method4478();
			this.anInt1724 = arg0.method4478();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt1716 = Static179.anInt2669;
		} else {
			this.anInt1716 = arg0.method4509();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt1719 = 0;
		} else {
			this.anInt1719 = arg0.method4518();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass17_1 = Static198.aClass17_2;
		} else {
			@Pc(220) int local220 = arg0.method4518();
			@Pc(224) int local224 = arg0.method4518();
			@Pc(228) int local228 = arg0.method4518();
			@Pc(232) int local232 = arg0.method4518();
			@Pc(236) int local236 = arg0.method4518();
			@Pc(240) int local240 = arg0.method4518();
			this.aClass17_1 = Static385.method5333(local220, local224, local232, local228, local240, local236);
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!gk;I)V")
	public void method1455(@OriginalArg(0) Class2_Sub7 arg0) {
		this.aFloat39 = (float) (arg0.method4464() * 8) / 255.0F;
		this.aFloat38 = (float) (arg0.method4464() * 8) / 255.0F;
		this.aFloat37 = (float) (arg0.method4464() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLclient!dj;)Z")
	public boolean method1458(@OriginalArg(1) Class75 arg0) {
		return arg0.anInt1722 == this.anInt1722 && this.aFloat42 == arg0.aFloat42 && this.aFloat41 == arg0.aFloat41 && this.aFloat40 == arg0.aFloat40 && arg0.aFloat38 == this.aFloat38 && this.aFloat39 == arg0.aFloat39 && this.aFloat37 == arg0.aFloat37 && this.anInt1716 == arg0.anInt1716 && arg0.anInt1719 == this.anInt1719 && this.aClass17_1 == arg0.aClass17_1;
	}
}
