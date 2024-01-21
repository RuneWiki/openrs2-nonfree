import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class8_Sub1_Sub15 extends Class8_Sub1 {

	@OriginalMember(owner = "client!qa", name = "U", descriptor = "I")
	public int anInt2334 = 0;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!wd;I)V")
	public void method1446(@OriginalArg(0) Class8_Sub20 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method1872();
			if (local15 == 0) {
				return;
			}
			this.method1448(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILclient!wd;)V")
	private void method1448(@OriginalArg(1) int arg0, @OriginalArg(2) Class8_Sub20 arg1) {
		if (arg0 == 2) {
			this.anInt2334 = arg1.method1839();
		}
	}
}
