import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class4_Sub6_Sub10 extends Class4_Sub6 {

	@OriginalMember(owner = "client!jq", name = "E", descriptor = "I")
	public int anInt5140 = 0;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!ek;B)V")
	public void method4001(@OriginalArg(0) Class4_Sub13 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method7004();
			if (local13 == 0) {
				return;
			}
			this.method4002(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IILclient!ek;)V")
	private void method4002(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub13 arg1) {
		if (arg0 == 2) {
			this.anInt5140 = arg1.method7054();
		}
	}
}
