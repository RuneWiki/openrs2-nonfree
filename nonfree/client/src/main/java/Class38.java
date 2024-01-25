import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bu")
public final class Class38 {

	@OriginalMember(owner = "client!bu", name = "h", descriptor = "I")
	public int anInt1053 = 0;

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lclient!rt;BI)V")
	private void method981(@OriginalArg(0) Class3_Sub27 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt1053 = arg0.method7591();
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(BLclient!rt;)V")
	public void method982(@OriginalArg(1) Class3_Sub27 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7548();
			if (local5 == 0) {
				return;
			}
			this.method981(arg0, local5);
		}
	}
}
