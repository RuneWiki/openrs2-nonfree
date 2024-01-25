import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public final class Class239 {

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
	public int anInt6771;

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
	public int anInt6772;

	@OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
	public int anInt6775;

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
	public int anInt6769 = 128;

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
	public int anInt6770 = 128;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
	public int anInt6768;

	static {
		new Class231("Your friends list is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
	}

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(I)V")
	public Class239(@OriginalArg(0) int arg0) {
		this.anInt6768 = arg0;
	}

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(IIIIII)V")
	private Class239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6770 = arg2;
		this.anInt6769 = arg1;
		this.anInt6768 = arg0;
		this.anInt6771 = arg5;
		this.anInt6775 = arg4;
		this.anInt6772 = arg3;
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(Z)Lclient!tl;")
	public Class239 method5438() {
		return new Class239(this.anInt6768, this.anInt6769, this.anInt6770, this.anInt6772, this.anInt6775, this.anInt6771);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(BLclient!tl;)V")
	public void method5439(@OriginalArg(1) Class239 arg0) {
		this.anInt6769 = arg0.anInt6769;
		this.anInt6771 = arg0.anInt6771;
		this.anInt6770 = arg0.anInt6770;
		this.anInt6775 = arg0.anInt6775;
		this.anInt6768 = arg0.anInt6768;
		this.anInt6772 = arg0.anInt6772;
	}
}
