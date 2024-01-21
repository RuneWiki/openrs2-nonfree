import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "Lclient!ua;")
	public static Class62_Sub1 aClass62_Sub1_28;

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
	public static int anInt1062;

	@OriginalMember(owner = "client!fa", name = "m", descriptor = "Lclient!pb;")
	public static Class1_Sub1_Sub4_Sub4 aClass1_Sub1_Sub4_Sub4_3;

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "Lclient!kd;")
	public static Class39 aClass39_490 = Static108.method1915("mapedge");

	@OriginalMember(owner = "client!fa", name = "o", descriptor = "Lclient!kd;")
	private static Class39 aClass39_491 = Static108.method1915("Loading ignore list");

	@OriginalMember(owner = "client!fa", name = "p", descriptor = "Lclient!kd;")
	public static Class39 aClass39_492 = aClass39_491;

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
	public static int anInt1064 = 127;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BI)V")
	public static void method639(@OriginalArg(1) int arg0) {
		@Pc(18) Class1_Sub2 local18 = (Class1_Sub2) Static62.aClass70_11.method1961((long) arg0);
		if (local18 != null) {
			local18.method2128();
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V")
	public static void method640(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static62.aBooleanArray16[arg0]) {
			return;
		}
		Static44.aClass62_11.method2016(arg0);
		if (Static102.aClass1_Sub1_Sub1ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(25) boolean local25 = true;
		for (@Pc(27) int local27 = 0; local27 < Static102.aClass1_Sub1_Sub1ArrayArray1[arg0].length; local27++) {
			if (Static102.aClass1_Sub1_Sub1ArrayArray1[arg0][local27] != null) {
				if (Static102.aClass1_Sub1_Sub1ArrayArray1[arg0][local27].anInt91 == 2) {
					local25 = false;
				} else {
					Static102.aClass1_Sub1_Sub1ArrayArray1[arg0][local27] = null;
				}
			}
		}
		if (local25) {
			Static102.aClass1_Sub1_Sub1ArrayArray1[arg0] = null;
		}
		Static62.aBooleanArray16[arg0] = false;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!mf;II)V")
	public static void method641(@OriginalArg(0) Class1_Sub1_Sub2_Sub1 arg0, @OriginalArg(1) int arg1) {
		Static74.method1279(arg0.anInt2508, arg0.anInt2521, arg1);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
	public static void method642() {
		aClass39_491 = null;
		aClass39_492 = null;
		aClass62_Sub1_28 = null;
		aBigInteger1 = null;
		aClass39_490 = null;
		aClass1_Sub1_Sub4_Sub4_3 = null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZII)V")
	public static void method643(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		@Pc(10) int local10 = 1;
		local8[0] = arg0;
		@Pc(17) int[] local17 = new int[4];
		local17[0] = arg1;
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			if (Static122.anIntArray466[local23] != arg0) {
				local8[local10] = Static122.anIntArray466[local23];
				local17[local10] = Static101.anIntArray393[local23];
				local10++;
			}
		}
		Static122.anIntArray466 = local8;
		Static101.anIntArray393 = local17;
		Static23.method449(Static101.anIntArray393, Static122.anIntArray466, Static86.aClass80Array1.length - 1, 0, Static86.aClass80Array1);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!a;)Lclient!a;")
	public static Class1_Sub1_Sub1 method644(@OriginalArg(1) Class1_Sub1_Sub1 arg0) {
		@Pc(9) int local9 = Static108.method1907(Static129.method2213(arg0));
		if (local9 == 0) {
			return null;
		}
		for (@Pc(24) int local24 = 0; local24 < local9; local24++) {
			arg0 = Static41.method2106(arg0.anInt102);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}
}
