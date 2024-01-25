import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class105 {

	@OriginalMember(owner = "client!js", name = "q", descriptor = "F")
	public float aFloat47 = 1.0F;

	@OriginalMember(owner = "client!js", name = "c", descriptor = "F")
	public float aFloat44 = 0.25F;

	@OriginalMember(owner = "client!js", name = "t", descriptor = "F")
	public float aFloat48 = 1.0F;

	@OriginalMember(owner = "client!js", name = "m", descriptor = "F")
	public final float aFloat45;

	@OriginalMember(owner = "client!js", name = "u", descriptor = "F")
	public final float aFloat49;

	@OriginalMember(owner = "client!js", name = "h", descriptor = "I")
	public final int anInt3257;

	@OriginalMember(owner = "client!js", name = "e", descriptor = "I")
	public final int anInt3254;

	@OriginalMember(owner = "client!js", name = "o", descriptor = "Lclient!bm;")
	public final Class22 aClass22_1;

	@OriginalMember(owner = "client!js", name = "d", descriptor = "I")
	public final int anInt3253;

	@OriginalMember(owner = "client!js", name = "s", descriptor = "I")
	public final int anInt3263;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "I")
	public final int anInt3251;

	@OriginalMember(owner = "client!js", name = "j", descriptor = "I")
	public final int anInt3259;

	@OriginalMember(owner = "client!js", name = "p", descriptor = "F")
	public final float aFloat46;

	static {
		new Class93("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
	}

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "()V")
	public Class105() {
		this.aFloat45 = 1.1523438F;
		this.aFloat49 = 1.2F;
		this.anInt3257 = Static332.anInt3541;
		this.anInt3254 = 0;
		this.aClass22_1 = Static318.aClass22_4;
		this.anInt3253 = -60;
		this.anInt3263 = Static260.anInt5270;
		this.anInt3251 = -50;
		this.anInt3259 = -50;
		this.aFloat46 = 0.69921875F;
	}

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lclient!dg;)V")
	public Class105(@OriginalArg(0) Class2_Sub10 arg0) {
		@Pc(16) int local16 = arg0.method4421();
		if (Static348.aBoolean606 && Static214.aClass4_9.method4263() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt3263 = Static260.anInt5270;
			} else {
				this.anInt3263 = arg0.method4444();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat45 = 1.1523438F;
			} else {
				this.aFloat45 = (float) arg0.method4464() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat46 = 0.69921875F;
			} else {
				this.aFloat46 = (float) arg0.method4464() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat49 = 1.2F;
			} else {
				this.aFloat49 = (float) arg0.method4464() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method4444();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method4464();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method4464();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method4464();
			}
			this.aFloat49 = 1.2F;
			this.anInt3263 = Static260.anInt5270;
			this.aFloat46 = 0.69921875F;
			this.aFloat45 = 1.1523438F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt3253 = -60;
			this.anInt3259 = -50;
			this.anInt3251 = -50;
		} else {
			this.anInt3259 = arg0.method4460();
			this.anInt3253 = arg0.method4460();
			this.anInt3251 = arg0.method4460();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt3257 = Static332.anInt3541;
		} else {
			this.anInt3257 = arg0.method4444();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt3254 = 0;
		} else {
			this.anInt3254 = arg0.method4464();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass22_1 = Static318.aClass22_4;
		} else {
			this.aClass22_1 = Static252.method4567(arg0.method4464(), arg0.method4464(), arg0.method4464(), arg0.method4464(), arg0.method4464(), arg0.method4464());
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!dg;I)V")
	public void method3035(@OriginalArg(0) Class2_Sub10 arg0) {
		this.aFloat47 = (float) (arg0.method4421() * 8) / 255.0F;
		this.aFloat44 = (float) (arg0.method4421() * 8) / 255.0F;
		this.aFloat48 = (float) (arg0.method4421() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!js;B)Z")
	public boolean method3037(@OriginalArg(0) Class105 arg0) {
		return arg0.anInt3263 == this.anInt3263 && this.aFloat45 == arg0.aFloat45 && this.aFloat46 == arg0.aFloat46 && this.aFloat49 == arg0.aFloat49 && arg0.aFloat44 == this.aFloat44 && this.aFloat47 == arg0.aFloat47 && this.aFloat48 == arg0.aFloat48 && arg0.anInt3257 == this.anInt3257 && arg0.anInt3254 == this.anInt3254 && this.aClass22_1 == arg0.aClass22_1;
	}
}
