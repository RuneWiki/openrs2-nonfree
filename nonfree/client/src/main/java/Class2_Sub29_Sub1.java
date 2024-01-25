import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public final class Class2_Sub29_Sub1 extends Class2_Sub29 {

	@OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
	public int anInt6070;

	@OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
	public int anInt6072;

	@OriginalMember(owner = "client!ni", name = "u", descriptor = "J")
	public long aLong164;

	@OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
	public int anInt6074;

	@OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
	public int anInt6077;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)J")
	@Override
	public long method6292() {
		return this.aLong164;
	}

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)I")
	@Override
	public int method6294() {
		return this.anInt6072;
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)I")
	@Override
	public int method6293() {
		return this.anInt6074;
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)I")
	@Override
	public int method6295() {
		return this.anInt6077;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)I")
	@Override
	public int method6291() {
		return this.anInt6070;
	}
}
