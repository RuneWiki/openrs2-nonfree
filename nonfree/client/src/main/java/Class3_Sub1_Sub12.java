import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class3_Sub1_Sub12 extends Class3_Sub1 {

	@OriginalMember(owner = "client!kg", name = "O", descriptor = "I")
	public int anInt1934 = 0;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZLclient!ff;)V")
	public void method1507(@OriginalArg(1) Class3_Sub12 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1354();
			if (local9 == 0) {
				return;
			}
			this.method1509(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILclient!ff;I)V")
	private void method1509(@OriginalArg(1) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt1934 = arg0.method1359();
		}
	}
}
