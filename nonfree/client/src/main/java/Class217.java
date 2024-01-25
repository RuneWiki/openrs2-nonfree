import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class217 {

	@OriginalMember(owner = "client!sp", name = "f", descriptor = "[I")
	public int[] anIntArray519;

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "I")
	public int anInt6314 = -1;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "I")
	public int anInt6311 = -1;

	static {
		new Class84("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IILclient!lh;)V")
	private void method5092(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		if (arg0 == 1) {
			this.anInt6314 = arg1.method4093();
		} else if (arg0 == 2) {
			this.anIntArray519 = new int[arg1.method4130()];
			for (@Pc(30) int local30 = 0; local30 < this.anIntArray519.length; local30++) {
				this.anIntArray519[local30] = arg1.method4093();
			}
		} else if (arg0 == 3) {
			this.anInt6311 = arg1.method4130();
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!lh;I)V")
	public void method5094(@OriginalArg(0) Class1_Sub1 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4130();
			if (local5 == 0) {
				return;
			}
			this.method5092(local5, arg0);
		}
	}
}
