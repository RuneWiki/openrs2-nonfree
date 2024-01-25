import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dja")
public final class Class2_Sub18_Sub1 extends Class2_Sub18 {

	@OriginalMember(owner = "client!dja", name = "r", descriptor = "I")
	public int anInt1977;

	@OriginalMember(owner = "client!dja", name = "t", descriptor = "I")
	public int anInt1978;

	@OriginalMember(owner = "client!dja", name = "s", descriptor = "I")
	public int anInt1979;

	@OriginalMember(owner = "client!dja", name = "v", descriptor = "I")
	public int anInt1980;

	@OriginalMember(owner = "client!dja", name = "u", descriptor = "J")
	public long aLong70;

	@OriginalMember(owner = "client!dja", name = "c", descriptor = "(I)J")
	@Override
	public long method7125() {
		return this.aLong70;
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(I)I")
	@Override
	public int method7126() {
		return this.anInt1980;
	}

	@OriginalMember(owner = "client!dja", name = "f", descriptor = "(I)I")
	@Override
	public int method7123() {
		return this.anInt1979;
	}

	@OriginalMember(owner = "client!dja", name = "b", descriptor = "(I)I")
	@Override
	public int method7124() {
		return this.anInt1978;
	}

	@OriginalMember(owner = "client!dja", name = "g", descriptor = "(I)I")
	@Override
	public int method7122() {
		return this.anInt1977;
	}
}
