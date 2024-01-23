import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!k", name = "l", descriptor = "[I")
	public static int[] anIntArray213;

	@OriginalMember(owner = "client!k", name = "x", descriptor = "Lclient!te;")
	public static Class164 aClass164_1;

	@OriginalMember(owner = "client!k", name = "m", descriptor = "I")
	public static int anInt2664 = 0;

	@OriginalMember(owner = "client!k", name = "r", descriptor = "[S")
	public static short[] aShortArray55 = new short[256];

	@OriginalMember(owner = "client!k", name = "y", descriptor = "I")
	public static int anInt2668 = 0;

	@OriginalMember(owner = "client!k", name = "z", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray16 = new String[1000];

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)I")
	public static int method2354(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)Lclient!of;")
	public static Class1_Sub5_Sub16 method2355(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub5_Sub16 local6 = (Class1_Sub5_Sub16) Static293.aClass112_13.method2951((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(28) byte[] local28 = Static46.aClass119_16.method3235(arg0, 26);
		local6 = new Class1_Sub5_Sub16();
		if (local28 != null) {
			local6.method3386(new Class1_Sub13(local28));
		}
		Static293.aClass112_13.method2950((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method2356(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(30) int local30 = 0;
			@Pc(32) long local32 = arg0;
			while (local32 != 0L) {
				local32 /= 37L;
				local30++;
			}
			@Pc(50) StringBuffer local50 = new StringBuffer(local30);
			while (arg0 != 0L) {
				@Pc(58) long local58 = arg0;
				arg0 /= 37L;
				local50.append(Static305.aCharArray6[(int) (local58 - arg0 * 37L)]);
			}
			return local50.reverse().toString();
		}
	}
}
