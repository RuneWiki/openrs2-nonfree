import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class61 {

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
	public int anInt1352;

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
	public int anInt1353;

	@OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
	public int anInt1356;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILclient!ec;B)V")
	private void method1270(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub10 arg1) {
		if (arg0 == 1) {
			this.anInt1353 = arg1.method4021();
			this.anInt1356 = arg1.method3972();
			this.anInt1352 = arg1.method3972();
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!ec;B)V")
	public void method1272(@OriginalArg(0) Class6_Sub10 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3972();
			if (local5 == 0) {
				return;
			}
			this.method1270(local5, arg0);
		}
	}
}
