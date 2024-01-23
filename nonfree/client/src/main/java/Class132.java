import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class132 {

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
	public int anInt4005 = 0;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IILclient!fh;)V")
	private void method3467(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub13 arg1) {
		if (arg0 == 5) {
			this.anInt4005 = arg1.method1879();
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!fh;I)V")
	public void method3470(@OriginalArg(0) Class1_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1853();
			if (local5 == 0) {
				return;
			}
			this.method3467(local5, arg0);
		}
	}
}
