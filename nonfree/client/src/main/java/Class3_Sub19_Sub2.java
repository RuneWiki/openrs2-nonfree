import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public final class Class3_Sub19_Sub2 extends Class3_Sub19 {

	@OriginalMember(owner = "client!mea", name = "q", descriptor = "I")
	public int anInt5943;

	@OriginalMember(owner = "client!mea", name = "s", descriptor = "J")
	public long aLong162;

	@OriginalMember(owner = "client!mea", name = "u", descriptor = "I")
	public int anInt5946;

	@OriginalMember(owner = "client!mea", name = "v", descriptor = "I")
	public int anInt5947;

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)I")
	@Override
	public int method4956() {
		return this.anInt5946;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(B)I")
	@Override
	public int method4957() {
		return this.anInt5943;
	}

	@OriginalMember(owner = "client!mea", name = "g", descriptor = "(I)I")
	@Override
	public int method4962() {
		return this.anInt5947;
	}

	@OriginalMember(owner = "client!mea", name = "f", descriptor = "(I)I")
	@Override
	public int method4961() {
		return 0;
	}

	@OriginalMember(owner = "client!mea", name = "e", descriptor = "(I)J")
	@Override
	public long method4958() {
		return this.aLong162;
	}
}
