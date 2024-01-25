import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public final class Class6_Sub40 extends Class6 {

	@OriginalMember(owner = "client!tb", name = "w", descriptor = "Ljava/lang/String;")
	public final String aString56;

	@OriginalMember(owner = "client!tb", name = "y", descriptor = "Z")
	public final boolean aBoolean429;

	@OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
	public final int anInt6719;

	@OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
	public final int anInt6721;

	@OriginalMember(owner = "client!tb", name = "q", descriptor = "Ljava/lang/String;")
	public String aString55;

	@OriginalMember(owner = "client!tb", name = "p", descriptor = "Z")
	public final boolean aBoolean428;

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
	public final int anInt6720;

	@OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
	public int anInt6722;

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "J")
	public final long aLong192;

	@OriginalMember(owner = "client!tb", name = "x", descriptor = "I")
	public final int anInt6723;

	static {
		new Class267("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class6_Sub40(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.aString56 = arg0;
		this.aBoolean429 = arg9;
		this.anInt6719 = arg6;
		this.anInt6721 = arg4;
		this.aString55 = arg1;
		this.aBoolean428 = arg8;
		this.anInt6720 = arg7;
		this.anInt6722 = arg3;
		this.aLong192 = arg5;
		this.anInt6723 = arg2;
	}
}
