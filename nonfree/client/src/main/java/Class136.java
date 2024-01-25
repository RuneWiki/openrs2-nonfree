import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class136 {

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
	public int anInt3921 = 0;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZILclient!eh;)V")
	private void method3425(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 5) {
			this.anInt3921 = arg1.method5982();
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!eh;Z)V")
	public void method3426(@OriginalArg(0) Class4_Sub9 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6015();
			if (local9 == 0) {
				return;
			}
			this.method3425(local9, arg0);
		}
	}
}
