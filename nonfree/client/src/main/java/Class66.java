import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class66 {

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
	public int anInt1629;

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
	public int anInt1631;

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
	public int anInt1632;

	static {
		new Class57("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!rp;B)V")
	public void method1317(@OriginalArg(0) Class3_Sub5 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2739();
			if (local9 == 0) {
				return;
			}
			this.method1321(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILclient!rp;B)V")
	private void method1321(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub5 arg1) {
		if (arg0 == 1) {
			this.anInt1629 = arg1.method2767();
			this.anInt1632 = arg1.method2739();
			this.anInt1631 = arg1.method2739();
		}
	}
}
