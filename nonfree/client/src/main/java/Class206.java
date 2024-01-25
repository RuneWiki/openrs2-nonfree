import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class206 {

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "F")
	public float aFloat63 = 0.25F;

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "F")
	public float aFloat64 = 1.0F;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "F")
	public float aFloat61 = 1.0F;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
	public final int anInt5194;

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
	public final int anInt5200;

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
	public final int anInt5199;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "Lclient!kc;")
	public final Class3 aClass3_3;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
	public final int anInt5196;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "F")
	public final float aFloat60;

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
	public final int anInt5201;

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "F")
	public final float aFloat62;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
	public final int anInt5195;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "F")
	public final float aFloat59;

	static {
		new Class15("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
		new Class15("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	public Class206() {
		this.anInt5194 = -50;
		this.anInt5200 = -60;
		this.anInt5199 = Static63.anInt5743;
		this.aClass3_3 = Static341.aClass3_4;
		this.anInt5196 = 0;
		this.aFloat60 = 1.1523438F;
		this.anInt5201 = Static171.anInt3111;
		this.aFloat62 = 1.2F;
		this.anInt5195 = -50;
		this.aFloat59 = 0.69921875F;
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!fh;)V")
	public Class206(@OriginalArg(0) Class4_Sub9 arg0) {
		@Pc(16) int local16 = arg0.method5007();
		if (Static413.aClass49_Sub1_1.method2481(Static341.anInt5549) && Static172.aClass135_4.method5362() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt5201 = Static171.anInt3111;
			} else {
				this.anInt5201 = arg0.method4997();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat60 = 1.1523438F;
			} else {
				this.aFloat60 = (float) arg0.method5028() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat59 = 0.69921875F;
			} else {
				this.aFloat59 = (float) arg0.method5028() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat62 = 1.2F;
			} else {
				this.aFloat62 = (float) arg0.method5028() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method4997();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method5028();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method5028();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method5028();
			}
			this.aFloat60 = 1.1523438F;
			this.aFloat59 = 0.69921875F;
			this.anInt5201 = Static171.anInt3111;
			this.aFloat62 = 1.2F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt5194 = -50;
			this.anInt5200 = -60;
			this.anInt5195 = -50;
		} else {
			this.anInt5195 = arg0.method5061();
			this.anInt5200 = arg0.method5061();
			this.anInt5194 = arg0.method5061();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt5199 = Static63.anInt5743;
		} else {
			this.anInt5199 = arg0.method4997();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt5196 = 0;
		} else {
			this.anInt5196 = arg0.method5028();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass3_3 = Static341.aClass3_4;
		} else {
			@Pc(225) int local225 = arg0.method5028();
			@Pc(229) int local229 = arg0.method5028();
			@Pc(233) int local233 = arg0.method5028();
			@Pc(237) int local237 = arg0.method5028();
			@Pc(241) int local241 = arg0.method5028();
			@Pc(245) int local245 = arg0.method5028();
			this.aClass3_3 = Static209.method2908(local237, local229, local245, local225, local233, local241);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!qc;)Z")
	public boolean method4233(@OriginalArg(1) Class206 arg0) {
		return this.anInt5201 == arg0.anInt5201 && this.aFloat60 == arg0.aFloat60 && arg0.aFloat59 == this.aFloat59 && this.aFloat62 == arg0.aFloat62 && arg0.aFloat63 == this.aFloat63 && arg0.aFloat64 == this.aFloat64 && arg0.aFloat61 == this.aFloat61 && arg0.anInt5199 == this.anInt5199 && this.anInt5196 == arg0.anInt5196 && arg0.aClass3_3 == this.aClass3_3;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!fh;B)V")
	public void method4234(@OriginalArg(0) Class4_Sub9 arg0) {
		this.aFloat64 = (float) (arg0.method5007() * 8) / 255.0F;
		this.aFloat63 = (float) (arg0.method5007() * 8) / 255.0F;
		this.aFloat61 = (float) (arg0.method5007() * 8) / 255.0F;
	}
}
