import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class80 {

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
	public int anInt2132;

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
	public int anInt2134;

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
	public int anInt2136;

	@OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
	public int anInt2137;

	@OriginalMember(owner = "client!fm", name = "k", descriptor = "Z")
	public boolean aBoolean246;

	@OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
	public int anInt2142;

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
	public int anInt2135 = 8;

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
	public int anInt2139 = 16777215;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!ug;I)V")
	public void method1802(@OriginalArg(0) Class1_Sub28 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5337();
			if (local17 == 0) {
				return;
			}
			this.method1805(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IBLclient!ug;)V")
	private void method1805(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub28 arg1) {
		if (arg0 == 1) {
			this.anInt2135 = arg1.method5335();
		} else if (arg0 == 2) {
			this.aBoolean246 = true;
		} else if (arg0 == 3) {
			this.anInt2132 = arg1.method5382();
			this.anInt2136 = arg1.method5382();
			this.anInt2137 = arg1.method5382();
		} else if (arg0 == 4) {
			this.anInt2142 = arg1.method5337();
		} else if (arg0 == 5) {
			this.anInt2134 = arg1.method5335();
		} else if (arg0 == 6) {
			this.anInt2139 = arg1.method5345();
		}
	}
}
