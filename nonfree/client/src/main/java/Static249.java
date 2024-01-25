import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static249 {

	@OriginalMember(owner = "client!jk", name = "m", descriptor = "Lclient!qv;")
	public static final Class271 aClass271_4 = new Class271(5, 1);

	@OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
	public static int anInt5084 = 0;

	@OriginalMember(owner = "client!jk", name = "q", descriptor = "J")
	public static long aLong112 = -1L;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZII)Z")
	public static boolean method4397(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)I")
	public static int method4399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static448.anIntArrayArray53 == null ? 0 : Static448.anIntArrayArray53[arg0][arg1] & 0xFFFFFF;
	}
}
