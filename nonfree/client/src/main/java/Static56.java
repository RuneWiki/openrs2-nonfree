import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!je", name = "f", descriptor = "[Z")
	public static boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!je", name = "h", descriptor = "[[B")
	public static byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!je", name = "k", descriptor = "Lclient!c;")
	public static Class10 aClass10_18;

	@OriginalMember(owner = "client!je", name = "z", descriptor = "J")
	public static long aLong49;

	@OriginalMember(owner = "client!je", name = "g", descriptor = "I")
	public static int anInt1507 = 0;

	@OriginalMember(owner = "client!je", name = "i", descriptor = "Lclient!ob;")
	public static Class59 aClass59_2 = new Class59();

	@OriginalMember(owner = "client!je", name = "n", descriptor = "Z")
	public static boolean aBoolean47 = false;

	@OriginalMember(owner = "client!je", name = "p", descriptor = "Lclient!od;")
	public static Class60 aClass60_544 = Static41.method597("(Z");

	@OriginalMember(owner = "client!je", name = "q", descriptor = "[I")
	public static int[] anIntArray150 = new int[32];

	@OriginalMember(owner = "client!je", name = "t", descriptor = "Lclient!od;")
	private static Class60 aClass60_545 = Static41.method597("No response from server)3");

	@OriginalMember(owner = "client!je", name = "u", descriptor = "I")
	public static int anInt1514 = 0;

	@OriginalMember(owner = "client!je", name = "v", descriptor = "Lclient!od;")
	public static Class60 aClass60_546 = Static41.method597("Hier wechseln");

	@OriginalMember(owner = "client!je", name = "w", descriptor = "Lclient!od;")
	public static Class60 aClass60_547 = Static41.method597("<col=ffffff> )4 ");

	@OriginalMember(owner = "client!je", name = "x", descriptor = "Lclient!od;")
	public static Class60 aClass60_548 = Static41.method597("rect_debug=");

	@OriginalMember(owner = "client!je", name = "y", descriptor = "Lclient!od;")
	public static Class60 aClass60_549 = aClass60_545;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public static void method884() {
		aClass10_18 = null;
		aClass60_546 = null;
		aByteArrayArray7 = null;
		anIntArray150 = null;
		aClass60_545 = null;
		aClass60_547 = null;
		aClass60_548 = null;
		aBooleanArray9 = null;
		aClass60_549 = null;
		aClass59_2 = null;
		aClass60_544 = null;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IJ)Lclient!od;")
	public static Class60 method885(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(32) long local32 = arg0;
			@Pc(34) int local34 = 0;
			while (local32 != 0L) {
				local32 /= 37L;
				local34++;
			}
			@Pc(50) byte[] local50 = new byte[local34];
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				local34--;
				local50[local34] = Static35.aByteArray3[(int) (local54 - arg0 * 37L)];
			}
			@Pc(81) Class60 local81 = new Class60();
			local81.aByteArray21 = local50;
			local81.anInt1991 = local50.length;
			return local81;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BLclient!tf;)V")
	public static void method886(@OriginalArg(1) Class4_Sub9 arg0) {
		if (Static77.aClass16_8 != null) {
			try {
				Static77.aClass16_8.method431(0L);
				Static77.aClass16_8.method425(24, arg0.aByteArray6, arg0.anInt1312);
			} catch (@Pc(20) Exception local20) {
			}
		}
		arg0.anInt1312 += 24;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)I")
	public static int method887(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local10 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local10 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local10 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local10 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local10++;
		}
		return arg0 + local10;
	}
}
