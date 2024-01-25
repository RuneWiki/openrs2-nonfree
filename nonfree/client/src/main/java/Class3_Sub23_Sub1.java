import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public final class Class3_Sub23_Sub1 extends Class3_Sub23 {

	@OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
	public int anInt3123;

	@OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
	public int anInt3124;

	@OriginalMember(owner = "client!fi", name = "n", descriptor = "J")
	public long aLong123;

	@OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
	public int anInt3125;

	@OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
	public int anInt3126;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)I")
	@Override
	public int method3194() {
		return this.anInt3124;
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)I")
	@Override
	public int method3198() {
		return this.anInt3126;
	}

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "(I)I")
	@Override
	public int method3196() {
		return this.anInt3123;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)J")
	@Override
	public long method3199() {
		return this.aLong123;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)I")
	@Override
	public int method3197() {
		return this.anInt3125;
	}
}
