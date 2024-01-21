import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "Z")
	public static boolean aBoolean121;

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_18;

	@OriginalMember(owner = "client!qb", name = "q", descriptor = "[I")
	public static int[] anIntArray309;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1063 = Static24.method441("Loaded fonts");

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1065 = Static24.method441("On");

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1064 = aClass65_1065;

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1066 = Static24.method441(" weitere Optionen");

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1067 = Static24.method441("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
	public static int anInt2378 = 127;

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1068 = Static24.method441("scrollbar");

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
	public static int anInt2381 = 0;

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1069 = aClass65_1063;

	@OriginalMember(owner = "client!qb", name = "t", descriptor = "J")
	public static volatile long aLong69 = 0L;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIBI)I")
	public static int method1430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if ((arg4 & 0x1) == 1) {
			@Pc(8) int local8 = arg5;
			arg5 = arg0;
			arg0 = local8;
		}
		@Pc(23) int local23 = arg1 & 0x3;
		if (local23 == 0) {
			return arg3;
		} else if (local23 == 1) {
			return 1 + 7 - arg5 - arg2;
		} else if (local23 == 2) {
			return 7 + 1 - arg3 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
	public static void method1431() {
		aClass2_Sub1_Sub4_Sub3_18 = null;
		aClass65_1068 = null;
		aClass65_1063 = null;
		aClass65_1064 = null;
		aClass65_1069 = null;
		aClass65_1066 = null;
		aClass65_1067 = null;
		aClass65_1065 = null;
		anIntArray309 = null;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method1432(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class2_Sub8 local13 = new Class2_Sub8(arg0);
		@Pc(17) int local17 = local13.method1410();
		@Pc(21) int local21 = local13.method1406();
		if (local21 < 0 || Static76.anInt2212 != 0 && Static76.anInt2212 < local21) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(104) byte[] local104 = new byte[local21];
			local13.method1373(local21, local104);
			return local104;
		} else {
			@Pc(41) int local41 = local13.method1406();
			if (local41 < 0 || Static76.anInt2212 != 0 && Static76.anInt2212 < local41) {
				throw new RuntimeException();
			}
			@Pc(65) byte[] local65 = new byte[local41];
			if (local17 == 1) {
				Static64.method1122(local65, local41, arg0, local21);
			} else {
				try {
					@Pc(83) DataInputStream local83 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, local21)));
					local83.readFully(local65);
					local83.close();
				} catch (@Pc(90) IOException local90) {
				}
			}
			return local65;
		}
	}
}
