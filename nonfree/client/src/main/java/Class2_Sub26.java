import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public final class Class2_Sub26 extends Class2 {

	@OriginalMember(owner = "client!lu", name = "n", descriptor = "I")
	public int anInt4485;

	static {
		new Class209("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
	}

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "()V")
	private Class2_Sub26() {
	}

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(I)V")
	public Class2_Sub26(@OriginalArg(0) int arg0) {
		this.anInt4485 = arg0;
	}
}
