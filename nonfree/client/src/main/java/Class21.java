import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class21 {

	@OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
	public static int anInt642;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "F")
	public float aFloat21 = 1.0F;

	@OriginalMember(owner = "client!bh", name = "q", descriptor = "F")
	public float aFloat25 = 0.25F;

	@OriginalMember(owner = "client!bh", name = "r", descriptor = "F")
	public float aFloat26 = 1.0F;

	@OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
	public final int anInt636;

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
	public final int anInt632;

	@OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
	public final int anInt641;

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
	public final int anInt634;

	@OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
	public final int anInt637;

	@OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
	public final int anInt640;

	@OriginalMember(owner = "client!bh", name = "k", descriptor = "Lclient!rc;")
	public final Class42 aClass42_1;

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "F")
	public final float aFloat22;

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "F")
	public final float aFloat23;

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "F")
	public final float aFloat24;

	static {
		new Class79("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
		anInt642 = 0;
	}

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V", line = 124)
	public Class21() {
		this.anInt636 = -60;
		this.anInt632 = -50;
		this.anInt641 = Canvas_Sub1.anInt5151;
		this.anInt634 = 0;
		this.anInt637 = Class25_Sub1.anInt686;
		this.anInt640 = -50;
		this.aClass42_1 = Static58.aClass42_5;
		this.aFloat22 = 0.69921875F;
		this.aFloat23 = 1.2F;
		this.aFloat24 = 1.1523438F;
	}

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!bt;)V", line = 140)
	public Class21(@OriginalArg(0) Class2_Sub4 arg0) {
		@Pc(16) int local16 = arg0.method4816();
		if (Static203.aClass177_Sub1_2.aBoolean364 && Static61.aClass19_3.method2888() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt637 = Class25_Sub1.anInt686;
			} else {
				this.anInt637 = arg0.method4837();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat24 = 1.1523438F;
			} else {
				this.aFloat24 = (float) arg0.method4830() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat22 = 0.69921875F;
			} else {
				this.aFloat22 = (float) arg0.method4830() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat23 = 1.2F;
			} else {
				this.aFloat23 = (float) arg0.method4830() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method4837();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method4830();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method4830();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method4830();
			}
			this.anInt637 = Class25_Sub1.anInt686;
			this.aFloat24 = 1.1523438F;
			this.aFloat23 = 1.2F;
			this.aFloat22 = 0.69921875F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt636 = -60;
			this.anInt632 = -50;
			this.anInt640 = -50;
		} else {
			this.anInt632 = arg0.method4824();
			this.anInt636 = arg0.method4824();
			this.anInt640 = arg0.method4824();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt641 = Canvas_Sub1.anInt5151;
		} else {
			this.anInt641 = arg0.method4837();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt634 = 0;
		} else {
			this.anInt634 = arg0.method4830();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass42_1 = Static58.aClass42_5;
		} else {
			this.aClass42_1 = Static274.method5108(arg0.method4830(), arg0.method4830(), arg0.method4830(), arg0.method4830(), arg0.method4830(), arg0.method4830());
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!bt;)V", line = 5)
	public void method851(@OriginalArg(1) Class2_Sub4 arg0) {
		this.aFloat26 = (float) (arg0.method4816() * 8) / 255.0F;
		this.aFloat25 = (float) (arg0.method4816() * 8) / 255.0F;
		this.aFloat21 = (float) (arg0.method4816() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLclient!bh;)Z", line = 52)
	public boolean method854(@OriginalArg(1) Class21 arg0) {
		return arg0.anInt637 == this.anInt637 && this.aFloat24 == arg0.aFloat24 && arg0.aFloat22 == this.aFloat22 && this.aFloat23 == arg0.aFloat23 && this.aFloat25 == arg0.aFloat25 && this.aFloat26 == arg0.aFloat26 && this.aFloat21 == arg0.aFloat21 && this.anInt641 == arg0.anInt641 && this.anInt634 == arg0.anInt634 && this.aClass42_1 == arg0.aClass42_1;
	}
}
