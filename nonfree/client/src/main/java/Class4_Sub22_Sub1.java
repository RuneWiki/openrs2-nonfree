import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public final class Class4_Sub22_Sub1 extends Class4_Sub22 {

	@OriginalMember(owner = "client!iba", name = "m", descriptor = "I")
	public int anInt4344;

	@OriginalMember(owner = "client!iba", name = "n", descriptor = "I")
	public int anInt4345;

	@OriginalMember(owner = "client!iba", name = "o", descriptor = "I")
	public int anInt4346;

	@OriginalMember(owner = "client!iba", name = "p", descriptor = "J")
	public long aLong104;

	@OriginalMember(owner = "client!iba", name = "q", descriptor = "I")
	public int anInt4347;

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)I")
	@Override
	public int method7271() {
		return this.anInt4344;
	}

	@OriginalMember(owner = "client!iba", name = "c", descriptor = "(B)I")
	@Override
	public int method7270() {
		return this.anInt4347;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(B)I")
	@Override
	public int method7269() {
		return this.anInt4346;
	}

	@OriginalMember(owner = "client!iba", name = "d", descriptor = "(B)J")
	@Override
	public long method7273() {
		return this.aLong104;
	}

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "(I)I")
	@Override
	public int method7272() {
		return this.anInt4345;
	}
}
