import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iga")
public final class Class157 {

	@OriginalMember(owner = "client!iga", name = "e", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!iga", name = "h", descriptor = "I")
	public int anInt4174 = 1;

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(ZILclient!es;)V")
	private void method3489(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub15 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static128.method2158(arg1.method4304());
		} else if (arg0 == 2) {
			this.anInt4174 = 0;
		}
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(BLclient!es;)V")
	public void method3490(@OriginalArg(1) Class2_Sub15 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method4325();
			if (local10 == 0) {
				return;
			}
			this.method3489(local10, arg0);
		}
	}
}
