import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class89 {

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
	public int anInt3393;

	@OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
	public int anInt3396;

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
	public int anInt3397;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!vf;B)V")
	private void method2512(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub26 arg1) {
		if (arg0 == 1) {
			this.anInt3396 = arg1.method2964();
			this.anInt3393 = arg1.method2945();
			this.anInt3397 = arg1.method2945();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLclient!vf;)V")
	public void method2513(@OriginalArg(1) Class1_Sub26 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2945();
			if (local13 == 0) {
				return;
			}
			this.method2512(local13, arg0);
		}
	}
}
