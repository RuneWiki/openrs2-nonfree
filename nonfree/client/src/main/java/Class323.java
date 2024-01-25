import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class323 {

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
	public int anInt8533;

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
	public int anInt8534;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "Lclient!me;")
	public Class233 aClass233_2;

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
	private int anInt8541;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!wq;BI)V")
	private void method7357(@OriginalArg(0) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt8541 = arg0.method7333();
		} else if (arg1 == 2) {
			this.anInt8534 = arg0.method7291();
			this.anInt8533 = arg0.method7291();
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)Lclient!uh;")
	public synchronized Class362 method7359() {
		@Pc(25) Class362 local25 = (Class362) this.aClass233_2.aClass168_50.method3860((long) this.anInt8541);
		if (local25 != null) {
			return local25;
		}
		local25 = Static692.method8275(this.aClass233_2.aClass126_164, this.anInt8541, 0);
		if (local25 != null) {
			this.aClass233_2.aClass168_50.method3853((long) this.anInt8541, local25);
		}
		return local25;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!wq;B)V")
	public void method7361(@OriginalArg(0) Class5_Sub36 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7291();
			if (local5 == 0) {
				return;
			}
			this.method7357(arg0, local5);
		}
	}
}
