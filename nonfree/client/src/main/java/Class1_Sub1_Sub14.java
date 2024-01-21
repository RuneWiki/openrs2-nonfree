import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class1_Sub1_Sub14 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ob", name = "L", descriptor = "I")
	public int anInt3338 = 0;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZLclient!fa;)V")
	public void method2494(@OriginalArg(1) Class1_Sub9 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method1234();
			if (local10 == 0) {
				return;
			}
			this.method2497(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!fa;IZ)V")
	private void method2497(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt3338 = arg0.method1280();
		}
	}
}
