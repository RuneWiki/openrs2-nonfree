import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public final class Class1_Sub22_Sub2 extends Class1_Sub22 {

	@OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
	public int anInt5193;

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
	public int anInt5194;

	@OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
	public int anInt5195;

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
	public int anInt5196;

	@OriginalMember(owner = "client!pd", name = "u", descriptor = "J")
	public long aLong170;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)I")
	@Override
	public int method4156() {
		return this.anInt5194;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)J")
	@Override
	public long method4157() {
		return this.aLong170;
	}

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)I")
	@Override
	public int method4161() {
		return this.anInt5193;
	}

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)I")
	@Override
	public int method4158() {
		return this.anInt5195;
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(B)I")
	@Override
	public int method4162() {
		return this.anInt5196;
	}
}
