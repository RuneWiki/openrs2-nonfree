import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public final class Class14_Sub24 extends Class14 implements Interface7 {

	@OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
	public int anInt4144;

	@OriginalMember(owner = "client!hi", name = "v", descriptor = "J")
	public long aLong118;

	@OriginalMember(owner = "client!hi", name = "w", descriptor = "I")
	public int anInt4147;

	@OriginalMember(owner = "client!hi", name = "x", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!hi", name = "y", descriptor = "I")
	public int anInt4148;

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)C")
	@Override
	public char method3428() {
		return this.aChar3;
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)I")
	@Override
	public int method3429() {
		return this.anInt4144;
	}

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "(I)J")
	@Override
	public long method3431() {
		return this.aLong118;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)I")
	@Override
	public int method3427() {
		return this.anInt4147;
	}

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)I")
	@Override
	public int method3430() {
		return this.anInt4148;
	}
}
