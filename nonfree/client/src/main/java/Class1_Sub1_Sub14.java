import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class1_Sub1_Sub14 extends Class1_Sub1 {

	@OriginalMember(owner = "client!td", name = "S", descriptor = "I")
	public int anInt2800 = 0;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!of;II)V")
	private void method1864(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt2800 = arg0.method2051();
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BLclient!of;)V")
	public void method1865(@OriginalArg(1) Class1_Sub19 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2072();
			if (local13 == 0) {
				return;
			}
			this.method1864(arg0, local13);
		}
	}
}
