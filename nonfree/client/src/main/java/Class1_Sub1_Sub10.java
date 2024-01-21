import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class1_Sub1_Sub10 extends Class1_Sub1 {

	@OriginalMember(owner = "client!n", name = "kb", descriptor = "I")
	public int anInt1615 = 0;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!id;B)V")
	public void method1177(@OriginalArg(0) Class1_Sub6 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method1837();
			if (local10 == 0) {
				return;
			}
			this.method1179(local10, arg0);
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IILclient!id;)V")
	private void method1179(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub6 arg1) {
		if (arg0 == 5) {
			this.anInt1615 = arg1.method1842();
		}
	}
}
