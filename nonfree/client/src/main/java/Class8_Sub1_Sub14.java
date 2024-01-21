import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class8_Sub1_Sub14 extends Class8_Sub1 {

	@OriginalMember(owner = "client!me", name = "ib", descriptor = "I")
	public int anInt1956 = 0;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BLclient!wd;I)V")
	private void method1189(@OriginalArg(1) Class8_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt1956 = arg0.method1839();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!wd;)V")
	public void method1190(@OriginalArg(1) Class8_Sub20 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method1872();
			if (local11 == 0) {
				return;
			}
			this.method1189(arg0, local11);
		}
	}
}
