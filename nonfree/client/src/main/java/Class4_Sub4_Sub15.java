import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class4_Sub4_Sub15 extends Class4_Sub4 {

	@OriginalMember(owner = "client!r", name = "Q", descriptor = "I")
	public int anInt2272;

	@OriginalMember(owner = "client!r", name = "S", descriptor = "I")
	public int anInt2273;

	@OriginalMember(owner = "client!r", name = "T", descriptor = "I")
	public int anInt2274;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!ne;I)V")
	private void method1572(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2272 = arg0.method604();
			this.anInt2273 = arg0.method599();
			this.anInt2274 = arg0.method599();
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZLclient!ne;)V")
	public void method1574(@OriginalArg(1) Class4_Sub10 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method599();
			if (local10 == 0) {
				return;
			}
			this.method1572(arg0, local10);
		}
	}
}
