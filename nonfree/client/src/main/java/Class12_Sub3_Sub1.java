import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public final class Class12_Sub3_Sub1 extends Class12_Sub3 {

	@OriginalMember(owner = "client!aq", name = "v", descriptor = "J")
	public long aLong9;

	@OriginalMember(owner = "client!aq", name = "w", descriptor = "I")
	public int anInt349;

	@OriginalMember(owner = "client!aq", name = "A", descriptor = "I")
	public int anInt353;

	@OriginalMember(owner = "client!aq", name = "C", descriptor = "I")
	public int anInt355;

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(I)J")
	@Override
	public long method6280() {
		return this.aLong9;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Z)I")
	@Override
	public int method6274() {
		return this.anInt353;
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)I")
	@Override
	public int method6276() {
		return 0;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)I")
	@Override
	public int method6275() {
		return this.anInt355;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)I")
	@Override
	public int method6279() {
		return this.anInt349;
	}
}
