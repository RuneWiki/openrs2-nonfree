import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class1_Sub2_Sub4 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
	public int anInt873 = 0;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!ce;II)V")
	private void method768(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 5) {
			this.anInt873 = arg0.method1642();
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!ce;B)V")
	public void method769(@OriginalArg(0) Class1_Sub8 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method1607();
			if (local17 == 0) {
				return;
			}
			this.method768(arg0, local17);
		}
	}
}
