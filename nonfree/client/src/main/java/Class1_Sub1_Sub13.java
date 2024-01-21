import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class1_Sub1_Sub13 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ta", name = "ib", descriptor = "I")
	public int anInt2530 = 0;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!rc;I)V")
	private void method1643(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5 arg1) {
		if (arg0 == 5) {
			this.anInt2530 = arg1.method715();
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!rc;)V")
	public void method1644(@OriginalArg(1) Class1_Sub5 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method716();
			if (local7 == 0) {
				return;
			}
			this.method1643(local7, arg0);
		}
	}
}
