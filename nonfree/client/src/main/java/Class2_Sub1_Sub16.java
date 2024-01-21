import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class2_Sub1_Sub16 extends Class2_Sub1 {

	@OriginalMember(owner = "client!sd", name = "wb", descriptor = "I")
	public int anInt2564 = 0;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!wd;B)V")
	public void method1807(@OriginalArg(0) Class2_Sub12 arg0) {
		while (true) {
			@Pc(19) int local19 = arg0.method1399();
			if (local19 == 0) {
				return;
			}
			this.method1809(local19, arg0);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILclient!wd;)V")
	private void method1809(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 5) {
			this.anInt2564 = arg1.method1366();
		}
	}
}
