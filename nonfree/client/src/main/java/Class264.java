import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ow")
public final class Class264 {

	@OriginalMember(owner = "client!ow", name = "e", descriptor = "Lclient!uu;")
	public Class363 aClass363_2;

	@OriginalMember(owner = "client!ow", name = "f", descriptor = "I")
	public int anInt7718;

	@OriginalMember(owner = "client!ow", name = "k", descriptor = "I")
	private int anInt7722;

	@OriginalMember(owner = "client!ow", name = "l", descriptor = "I")
	public int anInt7723;

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(B)Lclient!re;")
	public synchronized Class301 method6552() {
		@Pc(13) Class301 local13 = (Class301) this.aClass363_2.aClass265_63.method6577((long) this.anInt7722);
		if (local13 != null) {
			return local13;
		}
		local13 = Static684.method7228(this.aClass363_2.aClass50_173, this.anInt7722, 0);
		if (local13 != null) {
			this.aClass363_2.aClass265_63.method6566(local13, (long) this.anInt7722);
		}
		return local13;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IBLclient!rv;)V")
	private void method6553(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt7722 = arg1.method3698();
		} else if (arg0 == 2) {
			this.anInt7723 = arg1.method3642();
			this.anInt7718 = arg1.method3642();
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(BLclient!rv;)V")
	public void method6556(@OriginalArg(1) Class5_Sub15 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3642();
			if (local13 == 0) {
				return;
			}
			this.method6553(local13, arg0);
		}
	}
}
