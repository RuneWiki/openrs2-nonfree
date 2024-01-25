import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
	public static int anInt853 = 0;

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
	public static int anInt860 = 0;

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
	public static int anInt861 = 0;

	@OriginalMember(owner = "client!cl", name = "n", descriptor = "S")
	public static short aShort3 = 205;

	@OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
	public static final int anInt863 = 0;

	@OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
	public static int anInt864 = 0;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)I")
	public static int method733(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0x55555555);
		@Pc(23) int local23 = (local9 >>> 2 & 0x33333333) + (local9 & 0x33333333);
		@Pc(31) int local31 = local23 + (local23 >>> 4) & 0xF0F0F0F;
		@Pc(37) int local37 = local31 + (local31 >>> 8);
		@Pc(48) int local48 = local37 + (local37 >>> 16);
		return local48 & 0xFF;
	}
}
