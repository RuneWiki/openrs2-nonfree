import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class2_Sub1_Sub11 extends Class2_Sub1 {

	@OriginalMember(owner = "client!pa", name = "Z", descriptor = "I")
	public int anInt2157 = 0;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!wb;)V")
	public void method1317(@OriginalArg(1) Class2_Sub17 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method1780();
			if (local12 == 0) {
				return;
			}
			this.method1321(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!wb;II)V")
	private void method1321(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt2157 = arg0.method1783();
		}
	}
}
