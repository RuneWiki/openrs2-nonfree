import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class5_Sub1_Sub9 extends Class5_Sub1 {

	@OriginalMember(owner = "client!hd", name = "W", descriptor = "I")
	public int anInt1113 = 0;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!qe;)V")
	public void method798(@OriginalArg(1) Class5_Sub11 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method1546();
			if (local7 == 0) {
				return;
			}
			this.method799(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!qe;I)V")
	private void method799(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub11 arg1) {
		if (arg0 == 5) {
			this.anInt1113 = arg1.method1543();
		}
	}
}
