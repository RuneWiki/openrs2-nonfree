import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!b", name = "fb", descriptor = "I")
	public int anInt394 = 0;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!of;II)V")
	private void method231(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 5) {
			this.anInt394 = arg0.method2051();
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ZLclient!of;)V")
	public void method232(@OriginalArg(1) Class1_Sub19 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method2072();
			if (local15 == 0) {
				return;
			}
			this.method231(arg0, local15);
		}
	}
}
