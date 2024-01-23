import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class1_Sub2_Sub1 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ac", name = "R", descriptor = "I")
	public int anInt114 = 0;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!ql;II)V")
	private void method75(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt114 = arg0.method1764();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLclient!ql;)V")
	public void method79(@OriginalArg(1) Class1_Sub13 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1772();
			if (local9 == 0) {
				return;
			}
			this.method75(arg0, local9);
		}
	}
}
