import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public final class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!aa", name = "B", descriptor = "I")
	public int anInt47;

	@OriginalMember(owner = "client!aa", name = "G", descriptor = "I")
	public int anInt52;

	@OriginalMember(owner = "client!aa", name = "K", descriptor = "J")
	public long aLong4;

	@OriginalMember(owner = "client!aa", name = "M", descriptor = "I")
	public int anInt56;

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)J")
	@Override
	public long method47() {
		return this.aLong4;
	}

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)I")
	@Override
	public int method53() {
		return this.anInt47;
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(B)I")
	@Override
	public int method51() {
		return this.anInt52;
	}

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)I")
	@Override
	public int method49() {
		return this.anInt56;
	}
}
