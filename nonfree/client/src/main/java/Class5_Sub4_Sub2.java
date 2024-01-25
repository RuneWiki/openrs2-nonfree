import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public final class Class5_Sub4_Sub2 extends Class5_Sub4 {

	@OriginalMember(owner = "client!ov", name = "o", descriptor = "I")
	public int anInt4836;

	@OriginalMember(owner = "client!ov", name = "u", descriptor = "I")
	public int anInt4842;

	@OriginalMember(owner = "client!ov", name = "w", descriptor = "J")
	public long aLong148;

	@OriginalMember(owner = "client!ov", name = "y", descriptor = "I")
	public int anInt4844;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)I")
	@Override
	public int method3833() {
		return this.anInt4842;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Z)I")
	@Override
	public int method3837() {
		return this.anInt4836;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)I")
	@Override
	public int method3832() {
		return 0;
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)I")
	@Override
	public int method3834() {
		return this.anInt4844;
	}

	@OriginalMember(owner = "client!ov", name = "f", descriptor = "(I)J")
	@Override
	public long method3835() {
		return this.aLong148;
	}
}
