import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public final class Class98 {

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
	public final int anInt3058;

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
	public final int anInt3060;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
	public final int anInt3056;

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "I")
	public final int anInt3057;

	static {
		new Class83("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
	}

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(IIII)V")
	public Class98(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3058 = arg2;
		this.anInt3060 = arg0;
		this.anInt3056 = arg1;
		this.anInt3057 = arg3;
	}

	@OriginalMember(owner = "client!ho", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
