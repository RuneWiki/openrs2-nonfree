import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class3_Sub3_Sub16 extends Class3_Sub3 {

	@OriginalMember(owner = "client!le", name = "H", descriptor = "I")
	public int anInt2398 = 0;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!ce;IB)V")
	private void method1709(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt2398 = arg0.method1270();
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!ce;)V")
	public void method1711(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1278();
			if (local13 == 0) {
				return;
			}
			this.method1709(arg0, local13);
		}
	}
}
