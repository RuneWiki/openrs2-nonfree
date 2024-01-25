import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class160 {

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "[I")
	public static final int[] anIntArray428 = new int[4096];

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
	public int anInt4567;

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "Lclient!tt;")
	public Class2_Sub13_Sub17 aClass2_Sub13_Sub17_1;

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "[I")
	public int[] anIntArray429;

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray428[local4] = Static546.method7804(local4);
		}
	}
}
