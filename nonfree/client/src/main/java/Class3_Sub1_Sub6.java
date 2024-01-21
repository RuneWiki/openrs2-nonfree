import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class3_Sub1_Sub6 extends Class3_Sub1 {

	@OriginalMember(owner = "client!h", name = "nb", descriptor = "I")
	public int anInt1123 = 0;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!b;I)V")
	private void method783(@OriginalArg(1) Class3_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt1123 = arg0.method276();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZLclient!b;)V")
	public void method787(@OriginalArg(1) Class3_Sub2 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method270();
			if (local9 == 0) {
				return;
			}
			this.method783(arg0, local9);
		}
	}
}
