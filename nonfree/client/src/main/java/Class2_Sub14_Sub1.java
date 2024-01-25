import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public final class Class2_Sub14_Sub1 extends Class2_Sub14 {

	@OriginalMember(owner = "client!vl", name = "p", descriptor = "J")
	public long aLong210;

	@OriginalMember(owner = "client!vl", name = "r", descriptor = "I")
	public int anInt6943;

	@OriginalMember(owner = "client!vl", name = "s", descriptor = "I")
	public int anInt6944;

	@OriginalMember(owner = "client!vl", name = "z", descriptor = "I")
	public int anInt6951;

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(B)I")
	@Override
	public int method5383() {
		return this.anInt6951;
	}

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)I")
	@Override
	public int method5382() {
		return this.anInt6944;
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)I")
	@Override
	public int method5381() {
		return this.anInt6943;
	}

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "(I)J")
	@Override
	public long method5384() {
		return this.aLong210;
	}
}
