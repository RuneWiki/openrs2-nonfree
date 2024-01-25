import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class7_Sub1_Sub7 extends Class7_Sub1 {

	@OriginalMember(owner = "client!dj", name = "G", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!dj", name = "I", descriptor = "I")
	public int anInt1529 = 1;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BILclient!ap;)V")
	private void method1210(@OriginalArg(1) int arg0, @OriginalArg(2) Class7_Sub3 arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static224.method3944(arg1.method2779());
		} else if (arg0 == 2) {
			this.anInt1529 = 0;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!ap;I)V")
	public void method1211(@OriginalArg(0) Class7_Sub3 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2772();
			if (local13 == 0) {
				return;
			}
			this.method1210(local13, arg0);
		}
	}
}
