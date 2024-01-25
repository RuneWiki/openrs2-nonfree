import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nw")
public final class Class178 {

	@OriginalMember(owner = "client!nw", name = "d", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!nw", name = "h", descriptor = "I")
	public int anInt4884 = 1;

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IILclient!wm;)V")
	private void method3893(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub19 arg1) {
		if (arg0 == 1) {
			this.aChar2 = Static95.method5199(arg1.method2917());
		} else if (arg0 == 2) {
			this.anInt4884 = 0;
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lclient!wm;B)V")
	public void method3895(@OriginalArg(0) Class1_Sub19 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2915();
			if (local5 == 0) {
				return;
			}
			this.method3893(local5, arg0);
		}
	}
}
