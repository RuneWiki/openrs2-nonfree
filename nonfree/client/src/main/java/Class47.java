import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!caa")
public final class Class47 {

	@OriginalMember(owner = "client!caa", name = "e", descriptor = "I")
	public int anInt1220;

	@OriginalMember(owner = "client!caa", name = "g", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!caa", name = "h", descriptor = "I")
	public int anInt1222;

	@OriginalMember(owner = "client!caa", name = "j", descriptor = "I")
	public int anInt1224;

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(BLclient!jp;I)V")
	private void method1273(@OriginalArg(1) Class3_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static375.method5437(arg0.method8621());
		} else if (arg1 == 2) {
			this.anInt1220 = arg0.method8593();
			this.anInt1224 = arg0.method8632();
			this.anInt1222 = arg0.method8632();
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(Lclient!jp;I)V")
	public void method1274(@OriginalArg(0) Class3_Sub25 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8632();
			if (local13 == 0) {
				return;
			}
			this.method1273(arg0, local13);
		}
	}
}
