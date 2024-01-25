import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class93 {

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
	public int anInt2267 = 0;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IILclient!ec;)V")
	private void method2419(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub10 arg1) {
		if (arg0 == 5) {
			this.anInt2267 = arg1.method4021();
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!ec;I)V")
	public void method2421(@OriginalArg(0) Class6_Sub10 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3972();
			if (local13 == 0) {
				return;
			}
			this.method2419(local13, arg0);
		}
	}
}
