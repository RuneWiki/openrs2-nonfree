import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class3_Sub1_Sub13 extends Class3_Sub1 {

	@OriginalMember(owner = "client!sb", name = "bb", descriptor = "I")
	public int anInt2415 = 0;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILclient!ob;)V")
	private void method1691(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		if (arg0 == 2) {
			this.anInt2415 = arg1.method602();
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!ob;)V")
	public void method1695(@OriginalArg(1) Class3_Sub7 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method647();
			if (local15 == 0) {
				return;
			}
			this.method1691(local15, arg0);
		}
	}
}
