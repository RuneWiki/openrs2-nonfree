import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class1_Sub1_Sub7 extends Class1_Sub1 {

	@OriginalMember(owner = "client!kc", name = "X", descriptor = "I")
	public int anInt1815 = 0;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLclient!mc;)V")
	public void method1275(@OriginalArg(1) Class1_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1190();
			if (local5 == 0) {
				return;
			}
			this.method1277(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZLclient!mc;)V")
	private void method1277(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub12 arg1) {
		if (arg0 == 5) {
			this.anInt1815 = arg1.method1176();
		}
	}
}
