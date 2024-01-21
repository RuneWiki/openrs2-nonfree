import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class4_Sub1_Sub1 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ac", name = "V", descriptor = "I")
	public int anInt76;

	@OriginalMember(owner = "client!ac", name = "eb", descriptor = "I")
	public int anInt79;

	@OriginalMember(owner = "client!ac", name = "hb", descriptor = "I")
	public int anInt81;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!jd;I)V")
	public void method36(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method719();
			if (local5 == 0) {
				return;
			}
			this.method37(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BILclient!jd;)V")
	private void method37(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt79 = arg1.method718();
			this.anInt76 = arg1.method719();
			this.anInt81 = arg1.method719();
		}
	}
}
