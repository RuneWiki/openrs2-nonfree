import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class1_Sub1_Sub13 extends Class1_Sub1 {

	@OriginalMember(owner = "client!s", name = "cb", descriptor = "I")
	public int anInt2136;

	@OriginalMember(owner = "client!s", name = "gb", descriptor = "I")
	public int anInt2137;

	@OriginalMember(owner = "client!s", name = "mb", descriptor = "I")
	public int anInt2140;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IILclient!id;)V")
	private void method1539(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub6 arg1) {
		if (arg0 == 1) {
			this.anInt2140 = arg1.method1842();
			this.anInt2136 = arg1.method1837();
			this.anInt2137 = arg1.method1837();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!id;I)V")
	public void method1541(@OriginalArg(0) Class1_Sub6 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method1837();
			if (local17 == 0) {
				return;
			}
			this.method1539(local17, arg0);
		}
	}
}
