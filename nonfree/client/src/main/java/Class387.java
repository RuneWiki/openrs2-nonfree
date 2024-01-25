import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class387 {

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
	public int anInt11245;

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
	public int anInt11247;

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
	public int anInt11248;

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "C")
	public char aChar6;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!ol;II)V")
	private void method9622(@OriginalArg(0) Class2_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar6 = Static386.method6507(arg0.method5175());
		} else if (arg1 == 2) {
			this.anInt11245 = arg0.method5211();
			this.anInt11248 = arg0.method5203();
			this.anInt11247 = arg0.method5203();
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLclient!ol;)V")
	public void method9625(@OriginalArg(1) Class2_Sub8 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5203();
			if (local17 == 0) {
				return;
			}
			this.method9622(arg0, local17);
		}
	}
}
