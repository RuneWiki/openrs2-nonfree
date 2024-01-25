import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public final class Class28_Sub1_Sub2 extends Class28_Sub1 {

	@OriginalMember(owner = "client!we", name = "v", descriptor = "I")
	public final int anInt7352 = (int) (Static158.method2342() / 1000L);

	@OriginalMember(owner = "client!we", name = "w", descriptor = "Ljava/lang/String;")
	public final String aString71;

	@OriginalMember(owner = "client!we", name = "z", descriptor = "S")
	public final short aShort101;

	static {
		new Class55("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
	}

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class28_Sub1_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString71 = arg0;
		this.aShort101 = (short) arg1;
	}
}
