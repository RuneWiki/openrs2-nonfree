import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public final class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!aq", name = "l", descriptor = "I")
	public int anInt228;

	@OriginalMember(owner = "client!aq", name = "p", descriptor = "I")
	public int anInt231;

	@OriginalMember(owner = "client!aq", name = "r", descriptor = "I")
	public int anInt233;

	@OriginalMember(owner = "client!aq", name = "u", descriptor = "I")
	public int anInt235;

	@OriginalMember(owner = "client!aq", name = "w", descriptor = "I")
	public int anInt236;

	@OriginalMember(owner = "client!aq", name = "m", descriptor = "Z")
	public boolean aBoolean27 = false;

	@OriginalMember(owner = "client!aq", name = "s", descriptor = "I")
	public int anInt234 = -1;

	static {
		new Class83("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(I)V")
	public Class4_Sub3(@OriginalArg(0) int arg0) {
		this.anInt234 = arg0;
	}
}
