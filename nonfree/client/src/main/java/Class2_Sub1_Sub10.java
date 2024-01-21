import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class2_Sub1_Sub10 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ld", name = "Z", descriptor = "I")
	public int anInt1576;

	@OriginalMember(owner = "client!ld", name = "db", descriptor = "I")
	public int anInt1579;

	@OriginalMember(owner = "client!ld", name = "jb", descriptor = "I")
	public int anInt1583;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!wd;I)V")
	private void method1099(@OriginalArg(1) Class2_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1576 = arg0.method1366();
			this.anInt1579 = arg0.method1399();
			this.anInt1583 = arg0.method1399();
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!wd;)V")
	public void method1100(@OriginalArg(1) Class2_Sub12 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1399();
			if (local13 == 0) {
				return;
			}
			this.method1099(arg0, local13);
		}
	}
}
