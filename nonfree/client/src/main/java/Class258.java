import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public final class Class258 {

	@OriginalMember(owner = "client!uv", name = "d", descriptor = "I")
	public int anInt6811 = 0;

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IILclient!wm;)V")
	private void method5397(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub19 arg1) {
		if (arg0 == 5) {
			this.anInt6811 = arg1.method2896();
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!wm;I)V")
	public void method5399(@OriginalArg(0) Class1_Sub19 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2915();
			if (local5 == 0) {
				return;
			}
			this.method5397(local5, arg0);
		}
	}
}
