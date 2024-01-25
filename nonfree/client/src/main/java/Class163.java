import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class163 {

	@OriginalMember(owner = "client!md", name = "h", descriptor = "I")
	public int anInt4095 = 0;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BLclient!ha;)V")
	public void method3727(@OriginalArg(1) Class6_Sub15 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3111();
			if (local13 == 0) {
				return;
			}
			this.method3728(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IILclient!ha;)V")
	private void method3728(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub15 arg1) {
		if (arg0 == 5) {
			this.anInt4095 = arg1.method3108();
		}
	}
}
