import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class60 {

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
	public int anInt1288 = 0;

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
	public int anInt1287 = 0;

	@OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
	public int anInt1290 = 2048;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
	public int anInt1285 = 2048;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!gk;B)V")
	public void method1193(@OriginalArg(0) Class2_Sub7 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4464();
			if (local5 == 0) {
				return;
			}
			this.method1194(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILclient!gk;I)V")
	private void method1194(@OriginalArg(1) Class2_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1288 = arg0.method4464();
		} else if (arg1 == 2) {
			this.anInt1290 = arg0.method4518();
		} else if (arg1 == 3) {
			this.anInt1285 = arg0.method4518();
		} else if (arg1 == 4) {
			this.anInt1287 = arg0.method4478();
		}
	}
}
