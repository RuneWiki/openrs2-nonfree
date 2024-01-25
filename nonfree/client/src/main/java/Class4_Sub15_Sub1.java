import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dja")
public final class Class4_Sub15_Sub1 extends Class4_Sub15 {

	@OriginalMember(owner = "client!dja", name = "y", descriptor = "[I")
	public static final int[] anIntArray138 = new int[4096];

	@OriginalMember(owner = "client!dja", name = "t", descriptor = "I")
	public int anInt2062;

	@OriginalMember(owner = "client!dja", name = "v", descriptor = "I")
	public int anInt2064;

	@OriginalMember(owner = "client!dja", name = "x", descriptor = "I")
	public int anInt2066;

	@OriginalMember(owner = "client!dja", name = "B", descriptor = "J")
	public long aLong72;

	@OriginalMember(owner = "client!dja", name = "D", descriptor = "I")
	public int anInt2069;

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray138[local4] = Static412.method5192(local4);
		}
	}

	@OriginalMember(owner = "client!dja", name = "d", descriptor = "(I)I")
	@Override
	public int method4789() {
		return this.anInt2064;
	}

	@OriginalMember(owner = "client!dja", name = "c", descriptor = "(I)I")
	@Override
	public int method4787() {
		return this.anInt2062;
	}

	@OriginalMember(owner = "client!dja", name = "b", descriptor = "(I)J")
	@Override
	public long method4785() {
		return this.aLong72;
	}

	@OriginalMember(owner = "client!dja", name = "g", descriptor = "(I)I")
	@Override
	public int method4791() {
		return this.anInt2066;
	}

	@OriginalMember(owner = "client!dja", name = "b", descriptor = "(B)I")
	@Override
	public int method4793() {
		return this.anInt2069;
	}
}
