import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public final class Class5_Sub7_Sub1 extends Class5_Sub7 {

	@OriginalMember(owner = "client!be", name = "p", descriptor = "I")
	public int anInt639;

	@OriginalMember(owner = "client!be", name = "q", descriptor = "J")
	public long aLong22;

	@OriginalMember(owner = "client!be", name = "r", descriptor = "I")
	public int anInt640;

	@OriginalMember(owner = "client!be", name = "s", descriptor = "I")
	public int anInt641;

	@OriginalMember(owner = "client!be", name = "t", descriptor = "I")
	public int anInt642;

	@OriginalMember(owner = "client!be", name = "g", descriptor = "(I)J")
	@Override
	public long method8707() {
		return this.aLong22;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)I")
	@Override
	public int method8704() {
		return this.anInt640;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)I")
	@Override
	public int method8702() {
		return this.anInt639;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(I)I")
	@Override
	public int method8703() {
		return this.anInt641;
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(I)I")
	@Override
	public int method8705() {
		return this.anInt642;
	}
}
