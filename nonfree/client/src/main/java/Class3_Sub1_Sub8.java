import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class3_Sub1_Sub8 extends Class3_Sub1 {

	@OriginalMember(owner = "client!hc", name = "ab", descriptor = "I")
	public int anInt1411 = 0;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!la;I)V")
	public void method968(@OriginalArg(0) Class3_Sub12 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1936();
			if (local13 == 0) {
				return;
			}
			this.method970(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IILclient!la;)V")
	private void method970(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub12 arg1) {
		if (arg0 == 2) {
			this.anInt1411 = arg1.method1963();
		}
	}
}
