import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public final class Class11 {

	@OriginalMember(owner = "client!am", name = "k", descriptor = "I")
	public final int anInt397;

	@OriginalMember(owner = "client!am", name = "i", descriptor = "I")
	public final int anInt395;

	@OriginalMember(owner = "client!am", name = "f", descriptor = "I")
	public final int anInt392;

	@OriginalMember(owner = "client!am", name = "e", descriptor = "I")
	public final int anInt391;

	static {
		new Class242("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	}

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(IIII)V")
	public Class11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt397 = arg2;
		this.anInt395 = arg1;
		this.anInt392 = arg3;
		this.anInt391 = arg0;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)Lclient!am;")
	public Class11 method321(@OriginalArg(0) int arg0) {
		return new Class11(this.anInt391, arg0, this.anInt397, this.anInt392);
	}
}
