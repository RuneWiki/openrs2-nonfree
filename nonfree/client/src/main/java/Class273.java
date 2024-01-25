import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public final class Class273 {

	@OriginalMember(owner = "client!tda", name = "f", descriptor = "I")
	public final int anInt7667;

	@OriginalMember(owner = "client!tda", name = "e", descriptor = "I")
	public final int anInt7666;

	@OriginalMember(owner = "client!tda", name = "g", descriptor = "I")
	public final int anInt7668;

	@OriginalMember(owner = "client!tda", name = "c", descriptor = "I")
	public final int anInt7665;

	static {
		new Class114("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
	}

	@OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(IIII)V")
	public Class273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7667 = arg2;
		this.anInt7666 = arg0;
		this.anInt7668 = arg3;
		this.anInt7665 = arg1;
	}

	@OriginalMember(owner = "client!tda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
