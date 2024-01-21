import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class1_Sub1_Sub10 extends Class1_Sub1 {

	@OriginalMember(owner = "client!me", name = "sb", descriptor = "I")
	public int anInt1931 = 0;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IILclient!rc;)V")
	private void method1223(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 2) {
			this.anInt1931 = arg1.method715();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!rc;)V")
	public void method1228(@OriginalArg(1) Class1_Sub5 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method716();
			if (local3 == 0) {
				return;
			}
			this.method1223(local3, arg0);
		}
	}
}
