import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public final class Class3_Sub6_Sub8 extends Class3_Sub6 {

	@OriginalMember(owner = "client!dv", name = "x", descriptor = "I")
	public int anInt2359 = 0;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lclient!fca;II)V")
	private void method2174(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt2359 = arg0.method4858();
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILclient!fca;)V")
	public void method2176(@OriginalArg(1) Class3_Sub17 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method4888();
			if (local14 == 0) {
				return;
			}
			this.method2174(arg0, local14);
		}
	}
}
