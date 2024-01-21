import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class8_Sub1_Sub17 extends Class8_Sub1 {

	@OriginalMember(owner = "client!sb", name = "gb", descriptor = "I")
	public int anInt2492;

	@OriginalMember(owner = "client!sb", name = "jb", descriptor = "I")
	public int anInt2494;

	@OriginalMember(owner = "client!sb", name = "kb", descriptor = "I")
	public int anInt2495;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!wd;)V")
	public void method1529(@OriginalArg(1) Class8_Sub20 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method1872();
			if (local14 == 0) {
				return;
			}
			this.method1532(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!wd;II)V")
	private void method1532(@OriginalArg(0) Class8_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2495 = arg0.method1839();
			this.anInt2492 = arg0.method1872();
			this.anInt2494 = arg0.method1872();
		}
	}
}
