import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public final class Class1_Sub29_Sub1 extends Class1_Sub29 {

	@OriginalMember(owner = "client!nr", name = "t", descriptor = "I")
	public int anInt4329;

	@OriginalMember(owner = "client!nr", name = "u", descriptor = "J")
	public long aLong143;

	@OriginalMember(owner = "client!nr", name = "v", descriptor = "I")
	public int anInt4330;

	@OriginalMember(owner = "client!nr", name = "y", descriptor = "I")
	public int anInt4333;

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "(I)I")
	@Override
	public int method3484() {
		return this.anInt4329;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)I")
	@Override
	public int method3483() {
		return this.anInt4330;
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(B)J")
	@Override
	public long method3482() {
		return this.aLong143;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)I")
	@Override
	public int method3481() {
		return this.anInt4333;
	}
}
