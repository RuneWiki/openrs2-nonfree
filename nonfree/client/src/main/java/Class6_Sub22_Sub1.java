import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public final class Class6_Sub22_Sub1 extends Class6_Sub22 {

	@OriginalMember(owner = "client!gfa", name = "q", descriptor = "I")
	public int anInt4008;

	@OriginalMember(owner = "client!gfa", name = "r", descriptor = "I")
	public int anInt4009;

	@OriginalMember(owner = "client!gfa", name = "v", descriptor = "I")
	public int anInt4013;

	@OriginalMember(owner = "client!gfa", name = "x", descriptor = "J")
	public long aLong113;

	@OriginalMember(owner = "client!gfa", name = "B", descriptor = "I")
	public int anInt4017;

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Z)J")
	@Override
	public long method3461() {
		return this.aLong113;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I)I")
	@Override
	public int method3458() {
		return this.anInt4013;
	}

	@OriginalMember(owner = "client!gfa", name = "e", descriptor = "(I)I")
	@Override
	public int method3463() {
		return this.anInt4017;
	}

	@OriginalMember(owner = "client!gfa", name = "c", descriptor = "(I)I")
	@Override
	public int method3462() {
		return this.anInt4009;
	}

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "(I)I")
	@Override
	public int method3459() {
		return this.anInt4008;
	}
}
