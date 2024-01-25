import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class121 {

	@OriginalMember(owner = "client!g", name = "e", descriptor = "F")
	public float aFloat99 = 1.0F;

	@OriginalMember(owner = "client!g", name = "s", descriptor = "F")
	public float aFloat102 = 1.0F;

	@OriginalMember(owner = "client!g", name = "t", descriptor = "F")
	public float aFloat103 = 0.25F;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "I")
	public final int anInt3713;

	@OriginalMember(owner = "client!g", name = "q", descriptor = "I")
	public final int anInt3720;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "I")
	public final int anInt3712;

	@OriginalMember(owner = "client!g", name = "j", descriptor = "F")
	public final float aFloat101;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "F")
	public final float aFloat98;

	@OriginalMember(owner = "client!g", name = "n", descriptor = "I")
	public final int anInt3718;

	@OriginalMember(owner = "client!g", name = "g", descriptor = "F")
	public final float aFloat100;

	@OriginalMember(owner = "client!g", name = "o", descriptor = "I")
	public final int anInt3719;

	@OriginalMember(owner = "client!g", name = "k", descriptor = "Lclient!sfa;")
	public final Class22 aClass22_2;

	@OriginalMember(owner = "client!g", name = "i", descriptor = "I")
	public final int anInt3715;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
	public Class121() {
		this.anInt3713 = Static445.anInt7863;
		this.anInt3720 = 0;
		this.anInt3712 = -50;
		this.aFloat101 = 0.69921875F;
		this.aFloat98 = 1.1523438F;
		this.anInt3718 = Static273.anInt5256;
		this.aFloat100 = 1.2F;
		this.anInt3719 = -60;
		this.aClass22_2 = Static296.aClass22_3;
		this.anInt3715 = -50;
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!ud;)V")
	public Class121(@OriginalArg(0) Class2_Sub34 arg0) {
		@Pc(16) int local16 = arg0.method6904();
		if (Static404.aClass2_Sub13_2.aClass33_Sub28_1.method8390() == 1 && Static555.aClass87_14.method7953() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt3713 = Static445.anInt7863;
			} else {
				this.anInt3713 = arg0.method6865();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat98 = 1.1523438F;
			} else {
				this.aFloat98 = (float) arg0.method6884() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat101 = 0.69921875F;
			} else {
				this.aFloat101 = (float) arg0.method6884() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat100 = 1.2F;
			} else {
				this.aFloat100 = (float) arg0.method6884() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method6865();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method6884();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method6884();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method6884();
			}
			this.anInt3713 = Static445.anInt7863;
			this.aFloat98 = 1.1523438F;
			this.aFloat100 = 1.2F;
			this.aFloat101 = 0.69921875F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt3719 = -60;
			this.anInt3715 = -50;
			this.anInt3712 = -50;
		} else {
			this.anInt3715 = arg0.method6856();
			this.anInt3719 = arg0.method6856();
			this.anInt3712 = arg0.method6856();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt3718 = Static273.anInt5256;
		} else {
			this.anInt3718 = arg0.method6865();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt3720 = 0;
		} else {
			this.anInt3720 = arg0.method6884();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass22_2 = Static296.aClass22_3;
		} else {
			@Pc(216) int local216 = arg0.method6884();
			@Pc(220) int local220 = arg0.method6884();
			@Pc(224) int local224 = arg0.method6884();
			@Pc(228) int local228 = arg0.method6884();
			@Pc(232) int local232 = arg0.method6884();
			@Pc(236) int local236 = arg0.method6884();
			this.aClass22_2 = Static610.method8345(local216, local228, local220, local236, local232, local224);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!ud;I)V")
	public void method3080(@OriginalArg(0) Class2_Sub34 arg0) {
		this.aFloat102 = (float) (arg0.method6904() * 8) / 255.0F;
		this.aFloat103 = (float) (arg0.method6904() * 8) / 255.0F;
		this.aFloat99 = (float) (arg0.method6904() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!g;)Z")
	public boolean method3083(@OriginalArg(1) Class121 arg0) {
		return this.anInt3713 == arg0.anInt3713 && this.aFloat98 == arg0.aFloat98 && this.aFloat101 == arg0.aFloat101 && this.aFloat100 == arg0.aFloat100 && this.aFloat103 == arg0.aFloat103 && arg0.aFloat102 == this.aFloat102 && this.aFloat99 == arg0.aFloat99 && this.anInt3718 == arg0.anInt3718 && this.anInt3720 == arg0.anInt3720 && this.aClass22_2 == arg0.aClass22_2;
	}
}
