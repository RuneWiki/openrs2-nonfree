import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public final class Class1_Sub17 extends Class1 {

	@OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
	public int anInt1641;

	@OriginalMember(owner = "client!eg", name = "v", descriptor = "I")
	public int anInt1643;

	@OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
	public int anInt1644;

	@OriginalMember(owner = "client!eg", name = "D", descriptor = "I")
	public int anInt1649;

	@OriginalMember(owner = "client!eg", name = "F", descriptor = "I")
	public int anInt1651;

	@OriginalMember(owner = "client!eg", name = "u", descriptor = "Z")
	public boolean aBoolean116 = false;

	@OriginalMember(owner = "client!eg", name = "r", descriptor = "I")
	public int anInt1640 = -1;

	static {
		new Class106("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(I)V")
	public Class1_Sub17(@OriginalArg(0) int arg0) {
		this.anInt1640 = arg0;
	}
}
