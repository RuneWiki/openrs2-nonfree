import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public final class Class121 {

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "[B")
	public static final byte[] aByteArray35 = new byte[520];

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "Z")
	public static boolean aBoolean225 = false;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_132;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "Lclient!rt;")
	public static final Class209 aClass209_1;

	static {
		new Class79("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
		aClass145_132 = new Class145(9, 15);
		aClass209_1 = new Class209("RC", 1);
	}
}
