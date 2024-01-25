import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public final class Class4_Sub34 extends Class4 implements Interface19 {

	@OriginalMember(owner = "client!nt", name = "q", descriptor = "J")
	public long aLong186;

	@OriginalMember(owner = "client!nt", name = "r", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!nt", name = "v", descriptor = "I")
	public int anInt6981;

	@OriginalMember(owner = "client!nt", name = "x", descriptor = "I")
	public int anInt6983;

	@OriginalMember(owner = "client!nt", name = "B", descriptor = "I")
	public int anInt6986;

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "(I)I")
	@Override
	public int method5462() {
		return this.anInt6983;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)I")
	@Override
	public int method5458() {
		return this.anInt6986;
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(I)J")
	@Override
	public long method5460() {
		return this.aLong186;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)I")
	@Override
	public int method5459() {
		return this.anInt6981;
	}

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "(I)C")
	@Override
	public char method5461() {
		return this.aChar4;
	}
}
