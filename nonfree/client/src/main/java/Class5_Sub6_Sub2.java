import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public final class Class5_Sub6_Sub2 extends Class5_Sub6 {

	@OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
	public int anInt6796;

	@OriginalMember(owner = "client!nj", name = "s", descriptor = "J")
	public long aLong210;

	@OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
	public int anInt6800;

	@OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
	public int anInt6802;

	@OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
	public int anInt6805;

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)J")
	@Override
	public long method5802() {
		return this.aLong210;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)I")
	@Override
	public int method5804() {
		return this.anInt6802;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)I")
	@Override
	public int method5803() {
		return this.anInt6805;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I")
	@Override
	public int method5808() {
		return this.anInt6796;
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(B)I")
	@Override
	public int method5806() {
		return this.anInt6800;
	}
}
