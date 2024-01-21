import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class3_Sub3_Sub6 extends Class3_Sub3 {

	@OriginalMember(owner = "client!dd", name = "N", descriptor = "I")
	public int anInt769 = 0;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IBLclient!ce;)V")
	private void method613(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 5) {
			this.anInt769 = arg1.method1270();
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!ce;)V")
	public void method616(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method1278();
			if (local11 == 0) {
				return;
			}
			this.method613(local11, arg0);
		}
	}
}
