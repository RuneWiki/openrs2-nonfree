import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public final class Class11_Sub12 extends Class11 {

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
	public final int anInt1492;

	@OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
	public final int anInt1497;

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "Z")
	public final boolean aBoolean90;

	@OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
	public final int anInt1494;

	@OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
	public final int anInt1493;

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
	public final int anInt1490;

	static {
		new Class117("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
	}

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class11_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt1492 = arg4;
		this.anInt1497 = arg2;
		this.aBoolean90 = arg5;
		this.anInt1494 = arg0;
		this.anInt1493 = arg3;
		this.anInt1490 = arg1;
	}
}
