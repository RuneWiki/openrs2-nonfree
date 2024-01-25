import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class1_Sub1_Sub7 extends Class1_Sub1 {

	@OriginalMember(owner = "client!dp", name = "w", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!dp", name = "D", descriptor = "I")
	public int anInt1413 = 1;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILclient!eb;B)V")
	private void method1383(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub7 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static307.method5174(arg1.method3130());
		} else if (arg0 == 2) {
			this.anInt1413 = 0;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILclient!eb;)V")
	public void method1388(@OriginalArg(1) Class1_Sub7 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3141();
			if (local5 == 0) {
				return;
			}
			this.method1383(local5, arg0);
		}
	}
}
