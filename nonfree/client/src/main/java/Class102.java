import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class102 {

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
	public int anInt2498;

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
	public int anInt2499;

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "I")
	public int anInt2501;

	static {
		new Class15("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILclient!fh;Z)V")
	private void method1972(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub9 arg1) {
		if (arg0 == 1) {
			this.anInt2498 = arg1.method5028();
			this.anInt2499 = arg1.method5007();
			this.anInt2501 = arg1.method5007();
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(BLclient!fh;)V")
	public void method1974(@OriginalArg(1) Class4_Sub9 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method5007();
			if (local10 == 0) {
				return;
			}
			this.method1972(local10, arg0);
		}
	}
}
