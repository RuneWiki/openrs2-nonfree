import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaa")
public abstract class Class72 {

	static {
		new Class202(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(B)V")
	public abstract void method6795();

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(BJ)I")
	public final int method6798(@OriginalArg(1) long arg0) {
		@Pc(7) long local7 = this.method6801();
		if (local7 > 0L) {
			Static379.method5233(local7);
		}
		return this.method6800(arg0);
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(I)J")
	public abstract long method6799();

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(JI)I")
	protected abstract int method6800(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Z)J")
	protected abstract long method6801();
}
