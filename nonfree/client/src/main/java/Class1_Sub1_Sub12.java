import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class1_Sub1_Sub12 extends Class1_Sub1 {

	@OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
	private int anInt2383;

	@OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
	public int anInt2388;

	@OriginalMember(owner = "client!lf", name = "T", descriptor = "Lclient!hh;")
	public Class50 aClass50_831;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!pg;II)V")
	private void method1937(@OriginalArg(0) Class1_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2383 = arg0.method2142();
		} else if (arg1 == 2) {
			this.anInt2388 = arg0.method2140();
		} else if (arg1 == 5) {
			this.aClass50_831 = arg0.method2125();
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLclient!pg;)V")
	public void method1942(@OriginalArg(1) Class1_Sub17 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2142();
			if (local13 == 0) {
				return;
			}
			this.method1937(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)Z")
	public boolean method1943() {
		return this.anInt2383 == 115;
	}
}
