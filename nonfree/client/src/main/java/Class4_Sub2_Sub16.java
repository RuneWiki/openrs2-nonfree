import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class4_Sub2_Sub16 extends Class4_Sub2 {

	@OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
	public int anInt3996 = 0;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!p;B)V")
	public void method3257(@OriginalArg(0) Class4_Sub17 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1874();
			if (local13 == 0) {
				return;
			}
			this.method3259(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZILclient!p;)V")
	private void method3259(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub17 arg1) {
		if (arg0 == 2) {
			this.anInt3996 = arg1.method1837();
		}
	}
}
