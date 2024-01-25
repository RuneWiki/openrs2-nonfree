import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public final class Class6_Sub5_Sub2 extends Class6_Sub5 {

	@OriginalMember(owner = "client!efa", name = "p", descriptor = "I")
	public int anInt2171;

	@OriginalMember(owner = "client!efa", name = "q", descriptor = "J")
	public long aLong64;

	@OriginalMember(owner = "client!efa", name = "r", descriptor = "I")
	public int anInt2172;

	@OriginalMember(owner = "client!efa", name = "s", descriptor = "I")
	public int anInt2173;

	@OriginalMember(owner = "client!efa", name = "t", descriptor = "I")
	public int anInt2174;

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "(Z)I")
	@Override
	public int method1991() {
		return this.anInt2172;
	}

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "(B)I")
	@Override
	public int method1992() {
		return this.anInt2173;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)I")
	@Override
	public int method1982() {
		return this.anInt2171;
	}

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "(I)J")
	@Override
	public long method1985() {
		return this.aLong64;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(B)I")
	@Override
	public int method1986() {
		return this.anInt2174;
	}
}
