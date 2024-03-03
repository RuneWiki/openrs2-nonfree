import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public final class Class2_Sub7 extends Class2 {

	@OriginalMember(owner = "client!cu", name = "w", descriptor = "I")
	public static int anInt1367;

	@OriginalMember(owner = "client!cu", name = "u", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_28;

	@OriginalMember(owner = "client!cu", name = "x", descriptor = "I")
	public int anInt1368;

	@OriginalMember(owner = "client!cu", name = "A", descriptor = "I")
	public int anInt1371;

	static {
		new Class79("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
		anInt1367 = 0;
		aClass79_28 = new Class79("red:", "rot:", "rouge:", "vermelho:");
	}
}
