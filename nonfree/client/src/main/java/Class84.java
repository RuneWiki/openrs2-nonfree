import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class84 {

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "[I")
	public int[] anIntArray205;

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
	public int anInt2070 = -1;

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
	public int anInt2072 = -1;

	static {
		new Class57("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILclient!rp;I)V")
	private void method1726(@OriginalArg(1) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2072 = arg0.method2767();
		} else if (arg1 == 2) {
			this.anIntArray205 = new int[arg0.method2739()];
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray205.length; local19++) {
				this.anIntArray205[local19] = arg0.method2767();
			}
		} else if (arg1 == 3) {
			this.anInt2070 = arg0.method2739();
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILclient!rp;)V")
	public void method1727(@OriginalArg(1) Class3_Sub5 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2739();
			if (local9 == 0) {
				return;
			}
			this.method1726(arg0, local9);
		}
	}
}
