import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class57 {

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
	public int anInt1479;

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
	public int anInt1480;

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
	public int anInt1481;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IZLclient!sb;)V")
	private void method1222(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt1481 = arg1.method2593();
			this.anInt1479 = arg1.method2595();
			this.anInt1480 = arg1.method2595();
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!sb;B)V")
	public void method1225(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method2595();
			if (local11 == 0) {
				return;
			}
			this.method1222(local11, arg0);
		}
	}
}
