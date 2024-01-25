import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public final class Class6_Sub30 extends Class6 {

	@OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
	public volatile int anInt5547 = -1;

	@OriginalMember(owner = "client!qj", name = "u", descriptor = "Ljava/lang/String;")
	public final String aString37;

	static {
		new Class267("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
	}

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class6_Sub30(@OriginalArg(0) String arg0) {
		this.aString37 = arg0;
	}
}
