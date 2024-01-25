import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public final class Class24_Sub2 extends Class24 {

	@OriginalMember(owner = "client!gn", name = "m", descriptor = "Lclient!js;")
	public final Class40_Sub3_Sub1 aClass40_Sub3_Sub1_2;

	static {
		new Class231("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
		new Class231("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
	}

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!bl;II[B)V")
	public Class24_Sub2(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass40_Sub3_Sub1_2 = Static339.method4788(arg2, arg1, arg0, arg3);
		this.aClass40_Sub3_Sub1_2.method3021(false, false);
	}
}
