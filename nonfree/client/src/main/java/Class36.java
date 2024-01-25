import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class36 {

	@OriginalMember(owner = "client!de", name = "c", descriptor = "I")
	public int anInt1300 = 2048;

	@OriginalMember(owner = "client!de", name = "d", descriptor = "I")
	public int anInt1301 = 2048;

	@OriginalMember(owner = "client!de", name = "f", descriptor = "I")
	public int anInt1303 = 0;

	@OriginalMember(owner = "client!de", name = "h", descriptor = "I")
	public int anInt1305 = 0;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BIILclient!eb;)V")
	private void method1256(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub7 arg2) {
		if (arg1 == 1) {
			this.anInt1303 = arg2.method3141();
		} else if (arg1 == 2) {
			this.anInt1300 = arg2.method3115();
		} else if (arg1 == 3) {
			this.anInt1301 = arg2.method3115();
		} else if (arg1 == 4) {
			this.anInt1305 = arg2.method3090();
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!eb;II)V")
	public void method1259(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(15) int local15 = arg0.method3141();
			if (local15 == 0) {
				return;
			}
			this.method1256(arg1, local15, arg0);
		}
	}
}
