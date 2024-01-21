import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class4_Sub1_Sub13 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ld", name = "E", descriptor = "I")
	public int anInt2536 = 0;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BLclient!h;)V")
	public void method1917(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1253();
			if (local5 == 0) {
				return;
			}
			this.method1918(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!h;II)V")
	private void method1918(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt2536 = arg0.method1252();
		}
	}
}
