import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bm", name = "F", descriptor = "Lclient!ci;")
	public static Class38 aClass38_8;

	@OriginalMember(owner = "client!bm", name = "L", descriptor = "I")
	public static int anInt518;

	@OriginalMember(owner = "client!bm", name = "M", descriptor = "Lclient!ci;")
	public static Class38 aClass38_9;

	@OriginalMember(owner = "client!bm", name = "U", descriptor = "I")
	public static int anInt525;

	@OriginalMember(owner = "client!bm", name = "V", descriptor = "Lclient!qa;")
	public static Class30 aClass30_3;

	@OriginalMember(owner = "client!bm", name = "G", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIII)V")
	public static void method445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class4_Sub1_Sub5 local8 = Static431.method5935(4, arg2);
		local8.method521();
		local8.anInt621 = arg1;
		local8.anInt616 = arg0;
		local8.anInt614 = arg3;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method446(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(31) int local31 = 0;
			@Pc(33) long local33 = arg0;
			while (local33 != 0L) {
				local33 /= 37L;
				local31++;
			}
			@Pc(54) StringBuffer local54 = new StringBuffer(local31);
			while (arg0 != 0L) {
				@Pc(58) long local58 = arg0;
				arg0 /= 37L;
				local54.append(Static355.aCharArray6[(int) (local58 - arg0 * 37L)]);
			}
			return local54.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(II)Z")
	public static boolean method447(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IILjava/lang/String;BIIII)V")
	public static void method448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class71_Sub2 local7 = new Class71_Sub2();
		local7.anInt2574 = arg4;
		local7.anInt2579 = arg0;
		local7.anInt2582 = arg1;
		local7.anInt2583 = Static277.anInt2834 + arg6;
		local7.aString18 = arg2;
		local7.anInt2571 = arg5;
		local7.anInt2573 = arg3;
		Static412.aClass273_5.method6247(local7);
	}
}
