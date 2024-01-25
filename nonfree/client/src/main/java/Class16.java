import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class16 {

	@OriginalMember(owner = "client!al", name = "a", descriptor = "F")
	public float aFloat39 = 1.0F;

	@OriginalMember(owner = "client!al", name = "l", descriptor = "F")
	public float aFloat42 = 0.25F;

	@OriginalMember(owner = "client!al", name = "r", descriptor = "F")
	public float aFloat44 = 1.0F;

	@OriginalMember(owner = "client!al", name = "h", descriptor = "I")
	public final int anInt818;

	@OriginalMember(owner = "client!al", name = "f", descriptor = "I")
	public final int anInt817;

	@OriginalMember(owner = "client!al", name = "b", descriptor = "I")
	public final int anInt814;

	@OriginalMember(owner = "client!al", name = "g", descriptor = "Lclient!ss;")
	public final Class205 aClass205_1;

	@OriginalMember(owner = "client!al", name = "p", descriptor = "F")
	public final float aFloat43;

	@OriginalMember(owner = "client!al", name = "e", descriptor = "I")
	public final int anInt816;

	@OriginalMember(owner = "client!al", name = "k", descriptor = "I")
	public final int anInt819;

	@OriginalMember(owner = "client!al", name = "d", descriptor = "F")
	public final float aFloat40;

	@OriginalMember(owner = "client!al", name = "n", descriptor = "I")
	public final int anInt820;

	@OriginalMember(owner = "client!al", name = "j", descriptor = "F")
	public final float aFloat41;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V")
	public Class16() {
		this.anInt818 = -60;
		this.anInt817 = Static394.anInt7316;
		this.anInt814 = Static596.anInt9743;
		this.aClass205_1 = Static526.aClass205_3;
		this.aFloat43 = 1.1523438F;
		this.anInt816 = 0;
		this.anInt819 = -50;
		this.aFloat40 = 1.2F;
		this.anInt820 = -50;
		this.aFloat41 = 0.69921875F;
	}

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!sl;)V")
	public Class16(@OriginalArg(0) Class3_Sub3 arg0) {
		@Pc(16) int local16 = arg0.method4225();
		if (Static262.aClass3_Sub27_12.aClass21_Sub12_1.method4533() == 1 && Static383.aClass5_12.method7517() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt817 = Static394.anInt7316;
			} else {
				this.anInt817 = arg0.method4207();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat43 = 1.1523438F;
			} else {
				this.aFloat43 = (float) arg0.method4221() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat41 = 0.69921875F;
			} else {
				this.aFloat41 = (float) arg0.method4221() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat40 = 1.2F;
			} else {
				this.aFloat40 = (float) arg0.method4221() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method4207();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method4221();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method4221();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method4221();
			}
			this.aFloat43 = 1.1523438F;
			this.anInt817 = Static394.anInt7316;
			this.aFloat41 = 0.69921875F;
			this.aFloat40 = 1.2F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt818 = -60;
			this.anInt819 = -50;
			this.anInt820 = -50;
		} else {
			this.anInt819 = arg0.method4209();
			this.anInt818 = arg0.method4209();
			this.anInt820 = arg0.method4209();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt814 = Static596.anInt9743;
		} else {
			this.anInt814 = arg0.method4207();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt816 = 0;
		} else {
			this.anInt816 = arg0.method4221();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass205_1 = Static526.aClass205_3;
		} else {
			@Pc(226) int local226 = arg0.method4221();
			@Pc(230) int local230 = arg0.method4221();
			@Pc(234) int local234 = arg0.method4221();
			@Pc(238) int local238 = arg0.method4221();
			@Pc(242) int local242 = arg0.method4221();
			@Pc(246) int local246 = arg0.method4221();
			this.aClass205_1 = Static226.method1811(local230, local234, local238, local246, local226, local242);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ILclient!sl;)V")
	public void method906(@OriginalArg(1) Class3_Sub3 arg0) {
		this.aFloat44 = (float) (arg0.method4225() * 8) / 255.0F;
		this.aFloat42 = (float) (arg0.method4225() * 8) / 255.0F;
		this.aFloat39 = (float) (arg0.method4225() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ILclient!al;)Z")
	public boolean method908(@OriginalArg(1) Class16 arg0) {
		return arg0.anInt817 == this.anInt817 && this.aFloat43 == arg0.aFloat43 && arg0.aFloat41 == this.aFloat41 && this.aFloat40 == arg0.aFloat40 && arg0.aFloat42 == this.aFloat42 && this.aFloat44 == arg0.aFloat44 && arg0.aFloat39 == this.aFloat39 && this.anInt814 == arg0.anInt814 && arg0.anInt816 == this.anInt816 && this.aClass205_1 == arg0.aClass205_1;
	}
}
