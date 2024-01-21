import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class3_Sub1_Sub11 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ob", name = "bb", descriptor = "I")
	public int anInt2220 = 0;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!b;I)V")
	public void method1469(@OriginalArg(0) Class3_Sub2 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method270();
			if (local14 == 0) {
				return;
			}
			this.method1470(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!b;I)V")
	private void method1470(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub2 arg1) {
		if (arg0 == 2) {
			this.anInt2220 = arg1.method276();
		}
	}
}
