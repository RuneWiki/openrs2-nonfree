import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public final class Class2_Sub15_Sub1 extends Class2_Sub15 {

	@OriginalMember(owner = "client!h", name = "r", descriptor = "I")
	public int anInt2916;

	@OriginalMember(owner = "client!h", name = "u", descriptor = "J")
	public long aLong91;

	@OriginalMember(owner = "client!h", name = "A", descriptor = "I")
	public int anInt2924;

	@OriginalMember(owner = "client!h", name = "B", descriptor = "I")
	public int anInt2925;

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(I)I")
	@Override
	public int method2337() {
		return this.anInt2924;
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(I)I")
	@Override
	public int method2336() {
		return this.anInt2916;
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(I)I")
	@Override
	public int method2334() {
		return this.anInt2925;
	}

	@OriginalMember(owner = "client!h", name = "g", descriptor = "(I)J")
	@Override
	public long method2338() {
		return this.aLong91;
	}
}
