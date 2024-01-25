import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class6_Sub2_Sub16 extends Class6_Sub2 {

	@OriginalMember(owner = "client!pm", name = "t", descriptor = "I")
	public int anInt8005 = 0;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BILclient!jc;)V")
	private void method7047(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub15 arg1) {
		if (arg0 == 2) {
			this.anInt8005 = arg1.method3018();
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BLclient!jc;)V")
	public void method7049(@OriginalArg(1) Class6_Sub15 arg0) {
		while (true) {
			@Pc(18) int local18 = arg0.method3030();
			if (local18 == 0) {
				return;
			}
			this.method7047(local18, arg0);
		}
	}
}
