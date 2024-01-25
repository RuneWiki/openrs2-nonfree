import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public final class Class5_Sub10_Sub2 extends Class5_Sub10 {

	@OriginalMember(owner = "client!rea", name = "x", descriptor = "I")
	public int anInt8148;

	@OriginalMember(owner = "client!rea", name = "s", descriptor = "J")
	public long aLong237;

	@OriginalMember(owner = "client!rea", name = "o", descriptor = "I")
	public int anInt8151;

	@OriginalMember(owner = "client!rea", name = "w", descriptor = "I")
	public int anInt8152;

	@OriginalMember(owner = "client!rea", name = "y", descriptor = "I")
	public int anInt8155;

	@OriginalMember(owner = "client!rea", name = "d", descriptor = "(I)I")
	@Override
	public int method7046() {
		return this.anInt8152;
	}

	@OriginalMember(owner = "client!rea", name = "c", descriptor = "(I)I")
	@Override
	public int method7042() {
		return this.anInt8155;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(I)I")
	@Override
	public int method7039() {
		return this.anInt8148;
	}

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "(I)I")
	@Override
	public int method7043() {
		return this.anInt8151;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(B)J")
	@Override
	public long method7041() {
		return this.aLong237;
	}
}
