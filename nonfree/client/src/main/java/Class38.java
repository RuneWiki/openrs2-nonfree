import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class38 {

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
	public int anInt1204;

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
	public int anInt1205;

	@OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
	public int anInt1207;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILclient!sl;)V")
	public void method1176(@OriginalArg(1) Class2_Sub17 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method2859();
			if (local11 == 0) {
				return;
			}
			this.method1178(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!sl;II)V")
	private void method1178(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1207 = arg0.method2825();
			this.anInt1205 = arg0.method2859();
			this.anInt1204 = arg0.method2859();
		}
	}
}
