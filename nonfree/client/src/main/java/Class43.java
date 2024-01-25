import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class43 {

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
	public int anInt1417 = 0;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!eb;I)V")
	public void method1392(@OriginalArg(0) Class1_Sub7 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3141();
			if (local5 == 0) {
				return;
			}
			this.method1394(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLclient!eb;I)V")
	private void method1394(@OriginalArg(1) Class1_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt1417 = arg0.method3115();
		}
	}
}
