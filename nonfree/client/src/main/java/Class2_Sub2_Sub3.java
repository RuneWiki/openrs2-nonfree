import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class2_Sub2_Sub3 extends Class2_Sub2 {

	@OriginalMember(owner = "client!cb", name = "cb", descriptor = "I")
	public int anInt354;

	@OriginalMember(owner = "client!cb", name = "db", descriptor = "I")
	public int anInt355;

	@OriginalMember(owner = "client!cb", name = "ib", descriptor = "I")
	public int anInt358;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!ic;II)V")
	private void method269(@OriginalArg(0) Class2_Sub10 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt355 = arg0.method1517();
			this.anInt354 = arg0.method1514();
			this.anInt358 = arg0.method1514();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLclient!ic;)V")
	public void method272(@OriginalArg(1) Class2_Sub10 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1514();
			if (local5 == 0) {
				return;
			}
			this.method269(arg0, local5);
		}
	}
}
