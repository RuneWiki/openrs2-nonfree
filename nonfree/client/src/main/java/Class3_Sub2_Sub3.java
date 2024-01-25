import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class3_Sub2_Sub3 extends Class3_Sub2 {

	static {
		new Class189("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
	}

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5895(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = super.aClass62_41.method1670(arg0);
		if (super.aClass62_41.aBoolean169) {
			Static462.method4617(local13, 0, Static406.anInt6694, Static441.anIntArray522[arg0]);
		}
		return local13;
	}
}
