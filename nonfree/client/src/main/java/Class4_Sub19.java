import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public final class Class4_Sub19 extends Class4 {

	@OriginalMember(owner = "client!hv", name = "q", descriptor = "Z")
	public final boolean aBoolean215;

	@OriginalMember(owner = "client!hv", name = "w", descriptor = "I")
	public final int anInt3013;

	@OriginalMember(owner = "client!hv", name = "p", descriptor = "I")
	public final int anInt3008;

	@OriginalMember(owner = "client!hv", name = "u", descriptor = "I")
	public final int anInt3012;

	@OriginalMember(owner = "client!hv", name = "r", descriptor = "I")
	public final int anInt3009;

	@OriginalMember(owner = "client!hv", name = "o", descriptor = "I")
	public final int anInt3007;

	static {
		new Class242("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class4_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean215 = arg5;
		this.anInt3013 = arg1;
		this.anInt3008 = arg2;
		this.anInt3012 = arg0;
		this.anInt3009 = arg4;
		this.anInt3007 = arg3;
	}
}
