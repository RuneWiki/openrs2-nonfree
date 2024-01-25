import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class263 {

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "F")
	public float aFloat159 = 0.25F;

	@OriginalMember(owner = "client!pt", name = "l", descriptor = "F")
	public float aFloat162 = 1.0F;

	@OriginalMember(owner = "client!pt", name = "n", descriptor = "F")
	public float aFloat163 = 1.0F;

	@OriginalMember(owner = "client!pt", name = "g", descriptor = "F")
	public final float aFloat160;

	@OriginalMember(owner = "client!pt", name = "m", descriptor = "I")
	public final int anInt7482;

	@OriginalMember(owner = "client!pt", name = "k", descriptor = "I")
	public final int anInt7481;

	@OriginalMember(owner = "client!pt", name = "e", descriptor = "Lclient!dd;")
	public final Class47 aClass47_3;

	@OriginalMember(owner = "client!pt", name = "q", descriptor = "I")
	public final int anInt7484;

	@OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
	public final int anInt7478;

	@OriginalMember(owner = "client!pt", name = "j", descriptor = "F")
	public final float aFloat161;

	@OriginalMember(owner = "client!pt", name = "o", descriptor = "F")
	public final float aFloat164;

	@OriginalMember(owner = "client!pt", name = "h", descriptor = "I")
	public final int anInt7479;

	@OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
	public final int anInt7477;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "()V")
	public Class263() {
		this.aFloat160 = 1.1523438F;
		this.anInt7482 = -60;
		this.anInt7481 = -50;
		this.aClass47_3 = Static178.aClass47_2;
		this.anInt7484 = Static19.anInt200;
		this.anInt7478 = Static83.anInt2240;
		this.aFloat161 = 1.2F;
		this.aFloat164 = 0.69921875F;
		this.anInt7479 = -50;
		this.anInt7477 = 0;
	}

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lclient!ie;)V")
	public Class263(@OriginalArg(0) Class3_Sub26 arg0) {
		@Pc(16) int local16 = arg0.method6814();
		if (Static348.aClass3_Sub51_Sub1_5.method7824(Static37.anInt1122) && Static196.aClass31_8.method8026() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt7478 = Static83.anInt2240;
			} else {
				this.anInt7478 = arg0.method6816();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat160 = 1.1523438F;
			} else {
				this.aFloat160 = (float) arg0.method6811() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat164 = 0.69921875F;
			} else {
				this.aFloat164 = (float) arg0.method6811() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat161 = 1.2F;
			} else {
				this.aFloat161 = (float) arg0.method6811() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method6816();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method6811();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method6811();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method6811();
			}
			this.aFloat161 = 1.2F;
			this.anInt7478 = Static83.anInt2240;
			this.aFloat160 = 1.1523438F;
			this.aFloat164 = 0.69921875F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt7482 = -60;
			this.anInt7479 = -50;
			this.anInt7481 = -50;
		} else {
			this.anInt7481 = arg0.method6789();
			this.anInt7482 = arg0.method6789();
			this.anInt7479 = arg0.method6789();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt7484 = Static19.anInt200;
		} else {
			this.anInt7484 = arg0.method6816();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt7477 = 0;
		} else {
			this.anInt7477 = arg0.method6811();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass47_3 = Static178.aClass47_2;
		} else {
			@Pc(216) int local216 = arg0.method6811();
			@Pc(220) int local220 = arg0.method6811();
			@Pc(224) int local224 = arg0.method6811();
			@Pc(228) int local228 = arg0.method6811();
			@Pc(232) int local232 = arg0.method6811();
			@Pc(236) int local236 = arg0.method6811();
			this.aClass47_3 = Static295.method4426(local236, local216, local228, local220, local224, local232);
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILclient!pt;)Z")
	public boolean method5840(@OriginalArg(1) Class263 arg0) {
		return this.anInt7478 == arg0.anInt7478 && arg0.aFloat160 == this.aFloat160 && arg0.aFloat164 == this.aFloat164 && arg0.aFloat161 == this.aFloat161 && arg0.aFloat159 == this.aFloat159 && arg0.aFloat162 == this.aFloat162 && arg0.aFloat163 == this.aFloat163 && this.anInt7484 == arg0.anInt7484 && this.anInt7477 == arg0.anInt7477 && this.aClass47_3 == arg0.aClass47_3;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BLclient!ie;)V")
	public void method5841(@OriginalArg(1) Class3_Sub26 arg0) {
		this.aFloat162 = (float) (arg0.method6814() * 8) / 255.0F;
		this.aFloat159 = (float) (arg0.method6814() * 8) / 255.0F;
		this.aFloat163 = (float) (arg0.method6814() * 8) / 255.0F;
	}
}
