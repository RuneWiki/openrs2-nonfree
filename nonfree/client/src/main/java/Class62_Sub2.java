import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public final class Class62_Sub2 extends Class62 implements Interface7 {

	@OriginalMember(owner = "client!or", name = "g", descriptor = "I")
	private int anInt4801;

	static {
		new Class15("Your friends list is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
	}

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!ug;I[BI)V")
	public Class62_Sub2(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt4801 = arg1;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(B)I")
	@Override
	public int method3827() {
		return this.anInt4801;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(III[B)V")
	@Override
	public void method3829(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method3825(arg1, arg0);
		this.anInt4801 = 5123;
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(B)I")
	@Override
	public int method3828() {
		return 0;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)J")
	@Override
	public long method3826() {
		return super.aNativeBuffer3.c();
	}
}
