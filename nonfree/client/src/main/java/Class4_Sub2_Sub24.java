import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class4_Sub2_Sub24 extends Class4_Sub2 {

	static {
		new Class242("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
	}

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5838(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass9_41.method279(arg0);
		if (super.aClass9_41.aBoolean15) {
			Static457.method1217(local14, 0, Static350.anInt6330, Static293.anIntArray461[arg0]);
		}
		return local14;
	}
}
