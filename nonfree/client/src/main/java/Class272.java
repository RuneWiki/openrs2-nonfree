import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rba")
public final class Class272 {

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!rba", name = "f", descriptor = "I")
	public int anInt7801 = 1;

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lclient!jr;IB)V")
	private void method6211(@OriginalArg(0) Class6_Sub12 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar3 = Static58.method838(arg0.method6049());
		} else if (arg1 == 2) {
			this.anInt7801 = 0;
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lclient!jr;I)V")
	public void method6212(@OriginalArg(0) Class6_Sub12 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method6019();
			if (local16 == 0) {
				return;
			}
			this.method6211(arg0, local16);
		}
	}
}
