import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class27 {

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
	public int anInt887 = 0;

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
	public int anInt888 = 2048;

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
	public int anInt889 = 0;

	@OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
	public int anInt892 = 2048;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!jj;ZI)V")
	public void method749(@OriginalArg(0) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(14) int local14 = arg0.method3122();
			if (local14 == 0) {
				return;
			}
			this.method752(arg1, arg0, local14);
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!jj;IB)V")
	private void method752(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub18 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			this.anInt889 = arg1.method3122();
		} else if (arg2 == 2) {
			this.anInt888 = arg1.method3107();
		} else if (arg2 == 3) {
			this.anInt892 = arg1.method3107();
		} else if (arg2 == 4) {
			this.anInt887 = arg1.method3064();
		}
	}
}
