import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class1_Sub3_Sub16 extends Class1_Sub3 {

	@OriginalMember(owner = "client!lg", name = "S", descriptor = "I")
	public int anInt2461 = 0;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILclient!ka;)V")
	public void method1702(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3010();
			if (local9 == 0) {
				return;
			}
			this.method1704(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!ka;IB)V")
	private void method1704(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt2461 = arg0.method3023();
		}
	}
}
