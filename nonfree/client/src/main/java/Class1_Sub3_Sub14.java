import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class1_Sub3_Sub14 extends Class1_Sub3 {

	@OriginalMember(owner = "client!oe", name = "R", descriptor = "I")
	public int anInt2222;

	@OriginalMember(owner = "client!oe", name = "S", descriptor = "I")
	public int anInt2223;

	@OriginalMember(owner = "client!oe", name = "bb", descriptor = "I")
	public int anInt2227;

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(ILclient!rd;)V")
	public void method1560(@OriginalArg(1) Class1_Sub20 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method2053();
			if (local17 == 0) {
				return;
			}
			this.method1562(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!rd;B)V")
	private void method1562(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 1) {
			this.anInt2227 = arg1.method2087();
			this.anInt2223 = arg1.method2053();
			this.anInt2222 = arg1.method2053();
		}
	}
}
