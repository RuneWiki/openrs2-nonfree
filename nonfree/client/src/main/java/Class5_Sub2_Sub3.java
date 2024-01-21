import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class5_Sub2_Sub3 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ce", name = "eb", descriptor = "I")
	public int anInt527 = 0;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!pa;IB)V")
	private void method401(@OriginalArg(0) Class5_Sub14 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt527 = arg0.method1478();
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!pa;)V")
	public void method403(@OriginalArg(1) Class5_Sub14 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method1471();
			if (local17 == 0) {
				return;
			}
			this.method401(arg0, local17);
		}
	}
}
