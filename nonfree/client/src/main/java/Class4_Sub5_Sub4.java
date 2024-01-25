import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class4_Sub5_Sub4 extends Class4_Sub5 {

	@OriginalMember(owner = "client!dj", name = "z", descriptor = "I")
	public int anInt2215 = 0;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLclient!un;)V")
	public void method2099(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method4905();
			if (local15 == 0) {
				return;
			}
			this.method2102(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!un;B)V")
	private void method2102(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 2) {
			this.anInt2215 = arg1.method4936();
		}
	}
}
