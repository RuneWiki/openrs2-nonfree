import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public final class Class37_Sub1 extends Class37 {

	@OriginalMember(owner = "client!co", name = "f", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_27 = new Class79("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!co", name = "l", descriptor = "I")
	public static int anInt1247 = 0;

	@OriginalMember(owner = "client!co", name = "s", descriptor = "Z")
	public static boolean aBoolean102 = false;

	@OriginalMember(owner = "client!co", name = "t", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_43 = new Class145(75, 11);

	@OriginalMember(owner = "client!co", name = "u", descriptor = "[I")
	public static final int[] anIntArray90 = new int[4096];

	@OriginalMember(owner = "client!co", name = "e", descriptor = "Z")
	public boolean aBoolean101;

	@OriginalMember(owner = "client!co", name = "g", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!co", name = "i", descriptor = "I")
	public int anInt1244;

	@OriginalMember(owner = "client!co", name = "n", descriptor = "J")
	public long aLong36;

	@OriginalMember(owner = "client!co", name = "o", descriptor = "I")
	public int anInt1249;

	@OriginalMember(owner = "client!co", name = "q", descriptor = "Lclient!co;")
	public Class37_Sub1 aClass37_Sub1_1;

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(I)C", line = 4)
	@Override
	public char method1458() {
		return this.aChar1;
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(I)I", line = 15)
	@Override
	public int method1463() {
		return this.anInt1244;
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(B)I", line = 30)
	@Override
	public int method1462() {
		return this.anInt1249;
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(I)J", line = 83)
	@Override
	public long method1459() {
		return this.aLong36;
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(B)Z", line = 161)
	@Override
	public boolean method1461() {
		return this.aBoolean101;
	}
}
