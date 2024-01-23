import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class117 {

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
	public int anInt4553 = 0;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!ql;II)V")
	private void method3441(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt4553 = arg0.method1764();
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILclient!ql;)V")
	public void method3443(@OriginalArg(1) Class1_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1772();
			if (local5 == 0) {
				return;
			}
			this.method3441(arg0, local5);
		}
	}
}
