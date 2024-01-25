import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public final class Class3_Sub1_Sub2 extends Class3_Sub1 {

	@OriginalMember(owner = "client!om", name = "w", descriptor = "J")
	public long aLong184;

	@OriginalMember(owner = "client!om", name = "A", descriptor = "I")
	public int anInt6807;

	@OriginalMember(owner = "client!om", name = "C", descriptor = "I")
	public int anInt6809;

	@OriginalMember(owner = "client!om", name = "E", descriptor = "I")
	public int anInt6810;

	@OriginalMember(owner = "client!om", name = "F", descriptor = "I")
	public int anInt6811;

	@OriginalMember(owner = "client!om", name = "e", descriptor = "(B)I")
	@Override
	public int method5713() {
		return this.anInt6810;
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "(B)I")
	@Override
	public int method5711() {
		return this.anInt6809;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(Z)J")
	@Override
	public long method5709() {
		return this.aLong184;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(I)I")
	@Override
	public int method5714() {
		return this.anInt6807;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(B)I")
	@Override
	public int method5704() {
		return this.anInt6811;
	}
}
