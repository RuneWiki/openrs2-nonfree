import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class285 {

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
	private int anInt8470;

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
	public int anInt8471;

	@OriginalMember(owner = "client!tr", name = "g", descriptor = "Lclient!ss;")
	public Class273 aClass273_2;

	@OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
	public int anInt8473;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILclient!os;I)V")
	private void method7400(@OriginalArg(1) Class1_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt8470 = arg0.method4494();
		} else if (arg1 == 2) {
			this.anInt8473 = arg0.method4487();
			this.anInt8471 = arg0.method4487();
		}
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(I)Lclient!dp;")
	public synchronized Class70 method7402() {
		@Pc(15) Class70 local15 = (Class70) this.aClass273_2.aClass277_63.method7014((long) this.anInt8470);
		if (local15 != null) {
			return local15;
		}
		local15 = Static547.method1922(this.aClass273_2.aClass69_88, this.anInt8470, 0);
		if (local15 != null) {
			this.aClass273_2.aClass277_63.method7016(local15, (long) this.anInt8470);
		}
		return local15;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!os;I)V")
	public void method7403(@OriginalArg(0) Class1_Sub17 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method4487();
			if (local11 == 0) {
				return;
			}
			this.method7400(arg0, local11);
		}
	}
}
