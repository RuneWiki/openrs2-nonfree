import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class85 {

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
	public int anInt2165 = 1;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZLclient!mo;)V")
	public void method1760(@OriginalArg(1) Class1_Sub35 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5750();
			if (local13 == 0) {
				return;
			}
			this.method1762(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILclient!mo;)V")
	private void method1762(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub35 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static546.method7462(arg1.method5751());
		} else if (arg0 == 2) {
			this.anInt2165 = 0;
		}
	}
}
