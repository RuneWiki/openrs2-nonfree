import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public final class Class29 {

	@OriginalMember(owner = "client!bu", name = "c", descriptor = "I")
	public int anInt699;

	@OriginalMember(owner = "client!bu", name = "d", descriptor = "I")
	public int anInt700;

	@OriginalMember(owner = "client!bu", name = "e", descriptor = "I")
	public int anInt701;

	@OriginalMember(owner = "client!bu", name = "f", descriptor = "I")
	public int anInt702;

	@OriginalMember(owner = "client!bu", name = "g", descriptor = "Lclient!bu;")
	public Class29 aClass29_1;

	@OriginalMember(owner = "client!bu", name = "h", descriptor = "I")
	public int anInt703;

	@OriginalMember(owner = "client!bu", name = "l", descriptor = "I")
	public int anInt707;

	@OriginalMember(owner = "client!bu", name = "m", descriptor = "I")
	public int anInt708;

	@OriginalMember(owner = "client!bu", name = "n", descriptor = "I")
	public int anInt709;

	@OriginalMember(owner = "client!bu", name = "p", descriptor = "I")
	public int anInt711;

	@OriginalMember(owner = "client!bu", name = "u", descriptor = "B")
	public final byte aByte12;

	@OriginalMember(owner = "client!bu", name = "s", descriptor = "I")
	public final int anInt713;

	@OriginalMember(owner = "client!bu", name = "k", descriptor = "I")
	public final int anInt706;

	@OriginalMember(owner = "client!bu", name = "t", descriptor = "I")
	private final int anInt714;

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "I")
	public final int anInt698;

	static {
		new Class83("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
		new Class83("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
	}

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(IIIIB)V")
	public Class29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.aByte12 = arg4;
		this.anInt713 = arg2;
		this.anInt706 = arg1;
		this.anInt714 = arg0;
		this.anInt698 = arg3;
	}

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lclient!bu;I)V")
	public Class29(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1) {
		this.aClass29_1 = arg0;
		this.anInt714 = this.aClass29_1.anInt714;
		this.aByte12 = this.aClass29_1.aByte12;
		this.anInt698 = this.aClass29_1.anInt698 + arg1;
		this.anInt713 = this.aClass29_1.anInt713 + arg1;
		this.anInt706 = arg1 + this.aClass29_1.anInt706;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIII)Lclient!bu;")
	public Class29 method694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class29(this.anInt714, arg0, arg1, arg2, this.aByte12);
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(B)Lclient!jv;")
	public Class123 method695() {
		return Static274.method3927(this.anInt714);
	}
}
