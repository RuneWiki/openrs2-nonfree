import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public final class Class4_Sub15_Sub2 extends Class4_Sub15 {

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "I")
	public int anInt6117;

	@OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
	public int anInt6121;

	@OriginalMember(owner = "client!rd", name = "x", descriptor = "J")
	public long aLong182;

	@OriginalMember(owner = "client!rd", name = "E", descriptor = "I")
	public int anInt6127;

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(B)J")
	@Override
	public long method5051() {
		return this.aLong182;
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(B)I")
	@Override
	public int method5053() {
		return 0;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)I")
	@Override
	public int method5048() {
		return this.anInt6121;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)I")
	@Override
	public int method5049() {
		return this.anInt6127;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)I")
	@Override
	public int method5050() {
		return this.anInt6117;
	}
}
