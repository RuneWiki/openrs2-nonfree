import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public final class Class65_Sub1 extends Class65 {

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "Ljava/lang/String;")
	public String aString10;

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "Ljava/lang/String;")
	public String aString11;

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
	public int anInt1486;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
	public int anInt1485 = -1;

	static {
		new Class231("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)Lclient!nr;")
	public Class184 method1364() {
		return Static300.aClass184Array1[super.anInt1472];
	}
}
