import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class31 {

	@OriginalMember(owner = "client!bw", name = "e", descriptor = "F")
	public float aFloat46 = 0.25F;

	@OriginalMember(owner = "client!bw", name = "r", descriptor = "F")
	public float aFloat49 = 1.0F;

	@OriginalMember(owner = "client!bw", name = "o", descriptor = "F")
	public float aFloat47 = 1.0F;

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "I")
	public final int anInt1290;

	@OriginalMember(owner = "client!bw", name = "i", descriptor = "I")
	public final int anInt1294;

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "F")
	public final float aFloat44;

	@OriginalMember(owner = "client!bw", name = "k", descriptor = "I")
	public final int anInt1296;

	@OriginalMember(owner = "client!bw", name = "n", descriptor = "I")
	public final int anInt1298;

	@OriginalMember(owner = "client!bw", name = "m", descriptor = "I")
	public final int anInt1297;

	@OriginalMember(owner = "client!bw", name = "d", descriptor = "F")
	public final float aFloat45;

	@OriginalMember(owner = "client!bw", name = "l", descriptor = "Lclient!mc;")
	public final Class59 aClass59_1;

	@OriginalMember(owner = "client!bw", name = "p", descriptor = "F")
	public final float aFloat48;

	@OriginalMember(owner = "client!bw", name = "h", descriptor = "I")
	public final int anInt1293;

	static {
		new Class242("Use", "Benutzen", "Utiliser", "Usar");
		new Class242("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "()V")
	public Class31() {
		this.anInt1290 = -60;
		this.anInt1294 = -50;
		this.aFloat44 = 1.1523438F;
		this.anInt1296 = -50;
		this.anInt1298 = Static356.anInt6380;
		this.anInt1297 = 0;
		this.aFloat45 = 0.69921875F;
		this.aClass59_1 = Static437.aClass59_4;
		this.aFloat48 = 1.2F;
		this.anInt1293 = Static91.anInt1984;
	}

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lclient!tl;)V")
	public Class31(@OriginalArg(0) Class4_Sub30 arg0) {
		@Pc(16) int local16 = arg0.method4864();
		if (Static126.aClass67_Sub1_1.method4524(Static286.anInt5207) && Static413.aClass30_12.method4657() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt1298 = Static356.anInt6380;
			} else {
				this.anInt1298 = arg0.method4872();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat44 = 1.1523438F;
			} else {
				this.aFloat44 = (float) arg0.method4877() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat45 = 0.69921875F;
			} else {
				this.aFloat45 = (float) arg0.method4877() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat48 = 1.2F;
			} else {
				this.aFloat48 = (float) arg0.method4877() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method4872();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method4877();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method4877();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method4877();
			}
			this.aFloat45 = 0.69921875F;
			this.aFloat48 = 1.2F;
			this.anInt1298 = Static356.anInt6380;
			this.aFloat44 = 1.1523438F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt1294 = -50;
			this.anInt1290 = -60;
			this.anInt1296 = -50;
		} else {
			this.anInt1294 = arg0.method4889();
			this.anInt1290 = arg0.method4889();
			this.anInt1296 = arg0.method4889();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt1293 = Static91.anInt1984;
		} else {
			this.anInt1293 = arg0.method4872();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt1297 = 0;
		} else {
			this.anInt1297 = arg0.method4877();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass59_1 = Static437.aClass59_4;
		} else {
			@Pc(223) int local223 = arg0.method4877();
			@Pc(227) int local227 = arg0.method4877();
			@Pc(231) int local231 = arg0.method4877();
			@Pc(235) int local235 = arg0.method4877();
			@Pc(239) int local239 = arg0.method4877();
			@Pc(243) int local243 = arg0.method4877();
			this.aClass59_1 = Static209.method2981(local223, local231, local235, local239, local243, local227);
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILclient!tl;)V")
	public void method980(@OriginalArg(1) Class4_Sub30 arg0) {
		this.aFloat49 = (float) (arg0.method4864() * 8) / 255.0F;
		this.aFloat46 = (float) (arg0.method4864() * 8) / 255.0F;
		this.aFloat47 = (float) (arg0.method4864() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lclient!bw;I)Z")
	public boolean method981(@OriginalArg(0) Class31 arg0) {
		return this.anInt1298 == arg0.anInt1298 && this.aFloat44 == arg0.aFloat44 && arg0.aFloat45 == this.aFloat45 && this.aFloat48 == arg0.aFloat48 && arg0.aFloat46 == this.aFloat46 && arg0.aFloat49 == this.aFloat49 && arg0.aFloat47 == this.aFloat47 && this.anInt1293 == arg0.anInt1293 && this.anInt1297 == arg0.anInt1297 && this.aClass59_1 == arg0.aClass59_1;
	}
}
