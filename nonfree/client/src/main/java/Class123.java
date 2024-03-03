import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public abstract class Class123 {

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
	public static int anInt3359 = 0;

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
	public static int anInt3361 = 0;

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
	public static int anInt3364;

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "Lclient!h;")
	public static final Class89 aClass89_140;

	@OriginalMember(owner = "client!nj", name = "k", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_72;

	static {
		new Class79("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
		anInt3364 = 0;
		aClass89_140 = new Class89(42, 3);
		aClass79_72 = new Class79("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");
	}

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V", line = 200)
	protected Class123() {
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
	public abstract void method3338();

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V")
	public abstract void method3339();

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)Lclient!rk;")
	public abstract Class37 method3343();

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BI)Z")
	public abstract boolean method3344(@OriginalArg(1) int arg0);
}
