import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public final class Class2_Sub11_Sub1 extends Class2_Sub11 {

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
	public int anInt1794;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
	public int anInt1796;

	@OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
	public int anInt1799;

	@OriginalMember(owner = "client!fb", name = "x", descriptor = "J")
	public long aLong114;

	static {
		new Class91("", 73);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)I")
	@Override
	public int method4366() {
		return 0;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)J")
	@Override
	public long method4367() {
		return this.aLong114;
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)I")
	@Override
	public int method4368() {
		return this.anInt1794;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)I")
	@Override
	public int method4365() {
		return this.anInt1799;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)I")
	@Override
	public int method4364() {
		return this.anInt1796;
	}
}
