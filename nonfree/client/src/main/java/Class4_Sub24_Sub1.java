import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public final class Class4_Sub24_Sub1 extends Class4_Sub24 {

	@OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
	public int anInt4076;

	@OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
	public int anInt4077;

	@OriginalMember(owner = "client!hl", name = "v", descriptor = "J")
	public long aLong109;

	@OriginalMember(owner = "client!hl", name = "w", descriptor = "I")
	public int anInt4078;

	@OriginalMember(owner = "client!hl", name = "x", descriptor = "I")
	public int anInt4079;

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)I")
	@Override
	public int method6394() {
		return this.anInt4078;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)I")
	@Override
	public int method6389() {
		return this.anInt4076;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)I")
	@Override
	public int method6390() {
		return this.anInt4077;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)I")
	@Override
	public int method6391() {
		return this.anInt4079;
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)J")
	@Override
	public long method6392() {
		return this.aLong109;
	}
}
