import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!daa")
public final class Class69 {

	@OriginalMember(owner = "client!daa", name = "h", descriptor = "I")
	public int anInt2128;

	@OriginalMember(owner = "client!daa", name = "i", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!daa", name = "d", descriptor = "I")
	public int anInt2130;

	@OriginalMember(owner = "client!daa", name = "c", descriptor = "I")
	public int anInt2131;

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(ILclient!ika;)V")
	public void method1969(@OriginalArg(1) Class3_Sub2 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2048(255);
			if (local5 == 0) {
				return;
			}
			this.method1972(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IZLclient!ika;)V")
	private void method1972(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static309.method4582(arg1.method2022());
		} else if (arg0 == 3) {
			this.anInt2131 = arg1.method2028(-14795);
			this.anInt2130 = arg1.method2048(255);
			this.anInt2128 = arg1.method2048(255);
		}
	}
}
