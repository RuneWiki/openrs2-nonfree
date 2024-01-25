import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public final class Class3_Sub27_Sub1 extends Class3_Sub27 {

	@OriginalMember(owner = "client!jc", name = "A", descriptor = "I")
	public int anInt4780;

	@OriginalMember(owner = "client!jc", name = "C", descriptor = "I")
	public int anInt4781;

	@OriginalMember(owner = "client!jc", name = "F", descriptor = "I")
	public int anInt4784;

	@OriginalMember(owner = "client!jc", name = "H", descriptor = "J")
	public long aLong114;

	@OriginalMember(owner = "client!jc", name = "M", descriptor = "I")
	public int anInt4789;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(B)I")
	@Override
	public int method5341() {
		return this.anInt4781;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)I")
	@Override
	public int method5337() {
		return this.anInt4780;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)J")
	@Override
	public long method5339() {
		return this.aLong114;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)I")
	@Override
	public int method5340() {
		return this.anInt4789;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)I")
	@Override
	public int method5338() {
		return this.anInt4784;
	}
}
