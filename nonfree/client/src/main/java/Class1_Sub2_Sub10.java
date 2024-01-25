import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class1_Sub2_Sub10 extends Class1_Sub2 {

	@OriginalMember(owner = "client!nl", name = "z", descriptor = "I")
	public int anInt4743 = 0;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!hp;I)V")
	public void method3941(@OriginalArg(0) Class1_Sub5 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method5366();
			if (local3 == 0) {
				return;
			}
			this.method3945(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BLclient!hp;I)V")
	private void method3945(@OriginalArg(1) Class1_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt4743 = arg0.method5362();
		}
	}
}
