import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class1_Sub2_Sub7 extends Class1_Sub2 {

	@OriginalMember(owner = "client!db", name = "K", descriptor = "I")
	public int anInt960 = 0;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IBLclient!wa;)V")
	private void method639(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 5) {
			this.anInt960 = arg1.method1753();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!wa;)V")
	public void method640(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1738();
			if (local13 == 0) {
				return;
			}
			this.method639(local13, arg0);
		}
	}
}
