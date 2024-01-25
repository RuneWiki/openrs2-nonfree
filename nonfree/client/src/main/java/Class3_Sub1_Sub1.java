import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public final class Class3_Sub1_Sub1 extends Class3_Sub1 {

	@OriginalMember(owner = "client!nf", name = "v", descriptor = "I")
	public int anInt6204;

	@OriginalMember(owner = "client!nf", name = "w", descriptor = "I")
	public int anInt6205;

	@OriginalMember(owner = "client!nf", name = "x", descriptor = "I")
	public int anInt6206;

	@OriginalMember(owner = "client!nf", name = "y", descriptor = "I")
	public int anInt6207;

	@OriginalMember(owner = "client!nf", name = "z", descriptor = "J")
	public long aLong161;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)I")
	@Override
	public int method5714() {
		return this.anInt6204;
	}

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "(B)I")
	@Override
	public int method5711() {
		return this.anInt6207;
	}

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "(B)I")
	@Override
	public int method5713() {
		return this.anInt6205;
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)J")
	@Override
	public long method5709() {
		return this.aLong161;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)I")
	@Override
	public int method5704() {
		return this.anInt6206;
	}
}
