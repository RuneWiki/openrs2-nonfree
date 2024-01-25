import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public final class Class3_Sub5 extends Class3 implements Interface26 {

	@OriginalMember(owner = "client!aga", name = "l", descriptor = "J")
	public long aLong13;

	@OriginalMember(owner = "client!aga", name = "o", descriptor = "I")
	public int anInt209;

	@OriginalMember(owner = "client!aga", name = "q", descriptor = "I")
	public int anInt211;

	@OriginalMember(owner = "client!aga", name = "y", descriptor = "I")
	public int anInt216;

	@OriginalMember(owner = "client!aga", name = "A", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Z)I")
	@Override
	public int method214() {
		return this.anInt211;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)C")
	@Override
	public char method211() {
		return this.aChar1;
	}

	@OriginalMember(owner = "client!aga", name = "d", descriptor = "(I)I")
	@Override
	public int method215() {
		return this.anInt209;
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "(I)J")
	@Override
	public long method212() {
		return this.aLong13;
	}

	@OriginalMember(owner = "client!aga", name = "c", descriptor = "(I)I")
	@Override
	public int method213() {
		return this.anInt216;
	}
}
