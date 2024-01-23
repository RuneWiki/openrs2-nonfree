import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!ei", name = "A", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!ei", name = "bb", descriptor = "I")
	public static int anInt1171;

	@OriginalMember(owner = "client!ei", name = "cb", descriptor = "Z")
	public static boolean aBoolean94;

	@OriginalMember(owner = "client!ei", name = "Fb", descriptor = "I")
	public static int anInt1191;

	@OriginalMember(owner = "client!ei", name = "Kb", descriptor = "I")
	public static int anInt1196;

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "Lclient!g;")
	public static Class58 aClass58_2 = new Class58(64);

	@OriginalMember(owner = "client!ei", name = "w", descriptor = "[[I")
	public static int[][] anIntArrayArray2 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!ei", name = "y", descriptor = "I")
	public static int anInt1155 = 100;

	@OriginalMember(owner = "client!ei", name = "W", descriptor = "Ljava/lang/String;")
	public static String aString34 = "flash3:";

	@OriginalMember(owner = "client!ei", name = "kb", descriptor = "I")
	public static int anInt1177 = -1;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(SLjava/lang/String;IILjava/lang/String;IIJ)V")
	public static void method1004(@OriginalArg(0) short arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6) {
		if (Static108.aBoolean161 || Static316.anInt5941 >= 500) {
			return;
		}
		Static213.aStringArray35[Static316.anInt5941] = arg1;
		Static54.aStringArray7[Static316.anInt5941] = arg4;
		Static244.anIntArray441[Static316.anInt5941] = arg2 == -1 ? Static5.anInt69 : arg2;
		Static241.aShortArray76[Static316.anInt5941] = arg0;
		Static168.aLongArray123[Static316.anInt5941] = arg6;
		Static159.anIntArray270[Static316.anInt5941] = arg3;
		Static44.anIntArray74[Static316.anInt5941] = arg5;
		Static316.anInt5941++;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)V")
	public static void method1015() {
		anInt1191 = 0;
		Static78.anInt1449 = 1;
		Static97.anInt1804 = -1;
		Static185.anInt3720 = -1;
		Static75.aClass138_21 = null;
		Static177.anInt2083 = 2;
		Static86.aBoolean123 = false;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(III)Lclient!ge;")
	public static Class61 method1018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static122.aClass1_Sub17ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class61 local14 = local7.aClass61_1;
			local7.aClass61_1 = null;
			return local14;
		}
	}
}
