import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class4_Sub4_Sub17 extends Class4_Sub4 {

	@OriginalMember(owner = "client!ve", name = "N", descriptor = "I")
	public int anInt2968 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!re;I)V")
	private void method2099(@OriginalArg(1) Class4_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt2968 = arg0.method1244();
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!re;)V")
	public void method2103(@OriginalArg(1) Class4_Sub13 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method1223();
			if (local17 == 0) {
				return;
			}
			this.method2099(arg0, local17);
		}
	}
}
