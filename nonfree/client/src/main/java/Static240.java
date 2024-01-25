import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "Lclient!la;")
	public static final Class136 aClass136_173 = new Class136(59, -2);

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "[I")
	public static final int[] anIntArray390 = new int[500];

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "Z")
	public static boolean aBoolean428 = false;

	@OriginalMember(owner = "client!lo", name = "h", descriptor = "[I")
	public static final int[] anIntArray391 = new int[8];

	@OriginalMember(owner = "client!lo", name = "i", descriptor = "[I")
	public static final int[] anIntArray392 = new int[1];

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIZ)Z")
	public static boolean method5191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(III)Lclient!uq;")
	public static Class1_Sub5 method5192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class227 local7 = Static389.aClass227ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class1_Sub5 local14 = local7.aClass1_Sub5_1;
			local7.aClass1_Sub5_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!ga;I)V")
	public static void method5193(@OriginalArg(0) Class82 arg0) {
		if (arg0.anInt2252 == 5 && arg0.anInt2200 != -1) {
			Static407.method5562(Static413.aClass167_11, arg0);
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IBI)B")
	public static byte method5195(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "([BZLjava/lang/String;I)I")
	public static int method5196(@OriginalArg(0) byte[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = arg1.length();
		@Pc(15) int local15 = arg2;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			@Pc(23) char local23 = arg1.charAt(local17);
			if (local23 <= '\u007f') {
				arg0[local15++] = (byte) local23;
			} else if (local23 <= '\u07ff') {
				arg0[local15++] = (byte) (local23 >> 6 | 0xC0);
				arg0[local15++] = (byte) (local23 & 0x3F | 0x80);
			} else {
				arg0[local15++] = (byte) (local23 >> 12 | 0xE0);
				arg0[local15++] = (byte) (local23 >> 6 & 0x3F | 0x80);
				arg0[local15++] = (byte) (local23 & 0x3F | 0x80);
			}
		}
		return local15 - arg2;
	}
}
