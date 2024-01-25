import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class166 {

	@OriginalMember(owner = "client!is", name = "c", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!is", name = "f", descriptor = "I")
	public int anInt4784 = 1;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!sl;BI)V")
	private void method4178(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static95.method1918(arg0.method2860());
		} else if (arg1 == 2) {
			this.anInt4784 = 0;
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(BLclient!sl;)V")
	public void method4179(@OriginalArg(1) Class2_Sub17 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2859();
			if (local9 == 0) {
				return;
			}
			this.method4178(arg0, local9);
		}
	}
}
