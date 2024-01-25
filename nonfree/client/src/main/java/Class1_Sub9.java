import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class1_Sub9 extends Class1 {

	@OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
	public int anInt2348;

	@OriginalMember(owner = "client!ds", name = "j", descriptor = "Lclient!uh;")
	public Class288 aClass288_1;

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
	public int anInt2350;

	@OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
	public int anInt2351;

	@OriginalMember(owner = "client!ds", name = "n", descriptor = "Lclient!eg;")
	public Class1_Sub12_Sub1 aClass1_Sub12_Sub1_1;

	@OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
	public int anInt2352;

	@OriginalMember(owner = "client!ds", name = "p", descriptor = "I")
	public int anInt2353;

	@OriginalMember(owner = "client!ds", name = "q", descriptor = "I")
	public int anInt2354;

	@OriginalMember(owner = "client!ds", name = "r", descriptor = "[I")
	public int[] anIntArray188;

	@OriginalMember(owner = "client!ds", name = "s", descriptor = "I")
	public int anInt2355;

	@OriginalMember(owner = "client!ds", name = "w", descriptor = "I")
	public int anInt2359;

	@OriginalMember(owner = "client!ds", name = "y", descriptor = "Lclient!eg;")
	public Class1_Sub12_Sub1 aClass1_Sub12_Sub1_2;

	@OriginalMember(owner = "client!ds", name = "z", descriptor = "Z")
	public boolean aBoolean169;

	@OriginalMember(owner = "client!ds", name = "B", descriptor = "I")
	public int anInt2361;

	@OriginalMember(owner = "client!ds", name = "C", descriptor = "Lclient!ks;")
	public Class47_Sub2_Sub3_Sub2 aClass47_Sub2_Sub3_Sub2_2;

	@OriginalMember(owner = "client!ds", name = "F", descriptor = "Lclient!ica;")
	public Class47_Sub2_Sub3_Sub1 aClass47_Sub2_Sub3_Sub1_1;

	@OriginalMember(owner = "client!ds", name = "G", descriptor = "I")
	public int anInt2363;

	@OriginalMember(owner = "client!ds", name = "H", descriptor = "I")
	public int anInt2364;

	@OriginalMember(owner = "client!ds", name = "x", descriptor = "I")
	public int anInt2360 = 0;

	static {
		new Class114("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V")
	public void method2185() {
		@Pc(6) int local6 = this.anInt2359;
		if (this.aClass288_1 != null) {
			@Pc(83) Class288 local83 = this.aClass288_1.method7065(Static343.aClass286_1);
			if (local83 == null) {
				this.anIntArray188 = null;
				this.anInt2354 = 0;
				this.anInt2359 = -1;
				this.anInt2351 = 0;
				this.anInt2350 = 0;
				this.anInt2355 = 0;
			} else {
				this.anInt2355 = local83.anInt8350;
				this.anInt2359 = local83.anInt8340;
				this.anInt2351 = local83.anInt8334;
				this.anIntArray188 = local83.anIntArray652;
				this.anInt2350 = local83.anInt8348 << 7;
				this.anInt2354 = local83.anInt8328;
			}
		} else if (this.aClass47_Sub2_Sub3_Sub1_1 != null) {
			@Pc(39) int local39 = Static396.method5973(this.aClass47_Sub2_Sub3_Sub1_1);
			if (local39 != local6) {
				this.anInt2359 = local39;
				@Pc(49) Class238 local49 = this.aClass47_Sub2_Sub3_Sub1_1.aClass238_1;
				if (local49.anIntArray511 != null) {
					local49 = local49.method5866(Static343.aClass286_1);
				}
				if (local49 == null) {
					this.anInt2351 = this.anInt2350 = 0;
				} else {
					this.anInt2351 = local49.anInt6788;
					this.anInt2350 = local49.anInt6758 << 7;
				}
			}
		} else if (this.aClass47_Sub2_Sub3_Sub2_2 != null) {
			this.anInt2359 = Static179.method3452(this.aClass47_Sub2_Sub3_Sub2_2);
			this.anInt2351 = this.aClass47_Sub2_Sub3_Sub2_2.anInt5096;
			this.anInt2350 = this.aClass47_Sub2_Sub3_Sub2_2.anInt5094 << 7;
		}
		if (this.anInt2359 != local6 && this.aClass1_Sub12_Sub1_2 != null) {
			Static445.aClass1_Sub12_Sub3_2.method6363(this.aClass1_Sub12_Sub1_2);
			this.aClass1_Sub12_Sub1_2 = null;
		}
	}
}
