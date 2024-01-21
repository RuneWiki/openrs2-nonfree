import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class4_Sub1_Sub7 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
	public int anInt1404 = 0;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(Lclient!jd;B)V")
	public void method964(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method719();
			if (local7 == 0) {
				return;
			}
			this.method967(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!jd;II)V")
	private void method967(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt1404 = arg0.method718();
		}
	}
}
