import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class262 {

	@OriginalMember(owner = "client!we", name = "e", descriptor = "I")
	public int anInt7333 = 0;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IBLclient!fh;)V")
	private void method5868(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 5) {
			this.anInt7333 = arg1.method5028();
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!fh;)V")
	public void method5871(@OriginalArg(1) Class4_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5007();
			if (local5 == 0) {
				return;
			}
			this.method5868(local5, arg0);
		}
	}
}
