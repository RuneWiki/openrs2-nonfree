import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class2_Sub10_Sub13 extends Class2_Sub10 {

	@OriginalMember(owner = "client!pd", name = "F", descriptor = "I")
	public int anInt4544 = 0;

	static {
		new Class32("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BILclient!kk;)V")
	private void method4021(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub16 arg1) {
		if (arg0 == 2) {
			this.anInt4544 = arg1.method5312();
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!kk;I)V")
	public void method4022(@OriginalArg(0) Class2_Sub16 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5350();
			if (local9 == 0) {
				return;
			}
			this.method4021(local9, arg0);
		}
	}
}
