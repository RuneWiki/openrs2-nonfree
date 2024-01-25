import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class1_Sub6_Sub17 extends Class1_Sub6 {

	@OriginalMember(owner = "client!ts", name = "y", descriptor = "I")
	public int anInt8678 = 0;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!mo;II)V")
	private void method7104(@OriginalArg(0) Class1_Sub35 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt8678 = arg0.method5771();
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILclient!mo;)V")
	public void method7106(@OriginalArg(1) Class1_Sub35 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5750();
			if (local5 == 0) {
				return;
			}
			this.method7104(arg0, local5);
		}
	}
}
