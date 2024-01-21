import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class5_Sub2_Sub1 extends Class5_Sub2 {

	@OriginalMember(owner = "client!bb", name = "eb", descriptor = "I")
	public int anInt170 = 0;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZLclient!hb;I)V")
	private void method116(@OriginalArg(1) Class5_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt170 = arg0.method1418();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!hb;I)V")
	public void method119(@OriginalArg(0) Class5_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1408();
			if (local5 == 0) {
				return;
			}
			this.method116(arg0, local5);
		}
	}
}
