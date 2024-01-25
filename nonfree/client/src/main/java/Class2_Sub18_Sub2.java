import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public final class Class2_Sub18_Sub2 extends Class2_Sub18 {

	@OriginalMember(owner = "client!pu", name = "v", descriptor = "I")
	public int anInt7984;

	@OriginalMember(owner = "client!pu", name = "z", descriptor = "I")
	public int anInt7987;

	@OriginalMember(owner = "client!pu", name = "G", descriptor = "J")
	public long aLong249;

	@OriginalMember(owner = "client!pu", name = "D", descriptor = "I")
	public int anInt7993;

	@OriginalMember(owner = "client!pu", name = "r", descriptor = "I")
	public int anInt7994;

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)I")
	@Override
	public int method7126() {
		return this.anInt7994;
	}

	@OriginalMember(owner = "client!pu", name = "g", descriptor = "(I)I")
	@Override
	public int method7122() {
		return this.anInt7984;
	}

	@OriginalMember(owner = "client!pu", name = "f", descriptor = "(I)I")
	@Override
	public int method7123() {
		return this.anInt7987;
	}

	@OriginalMember(owner = "client!pu", name = "c", descriptor = "(I)J")
	@Override
	public long method7125() {
		return this.aLong249;
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)I")
	@Override
	public int method7124() {
		return this.anInt7993;
	}
}
