import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ba", name = "p", descriptor = "[Lclient!kf;")
	public static Class3_Sub1_Sub3_Sub3[] aClass3_Sub1_Sub3_Sub3Array5;

	@OriginalMember(owner = "client!ba", name = "r", descriptor = "[Lclient!re;")
	public static Class3_Sub1_Sub3_Sub4[] aClass3_Sub1_Sub3_Sub4Array2;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "Lclient!sd;")
	private static Class73 aClass73_163 = Static122.method531("white:");

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "Lclient!sd;")
	public static Class73 aClass73_164 = Static122.method531("title)3jpg");

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "Lclient!sd;")
	public static Class73 aClass73_165 = aClass73_163;

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "[I")
	public static int[] anIntArray13 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "Lclient!sd;")
	public static Class73 aClass73_167 = Static122.method531("");

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "Lclient!sd;")
	public static Class73 aClass73_166 = aClass73_167;

	@OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
	public static int anInt292 = 0;

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "Lclient!sd;")
	public static Class73 aClass73_168 = aClass73_167;

	@OriginalMember(owner = "client!ba", name = "n", descriptor = "Lclient!sd;")
	public static Class73 aClass73_169 = aClass73_163;

	@OriginalMember(owner = "client!ba", name = "o", descriptor = "Lclient!sd;")
	public static Class73 aClass73_170 = aClass73_167;

	@OriginalMember(owner = "client!ba", name = "q", descriptor = "[I")
	public static int[] anIntArray14 = new int[5];

	@OriginalMember(owner = "client!ba", name = "s", descriptor = "Lclient!sd;")
	public static Class73 aClass73_171 = aClass73_167;

	@OriginalMember(owner = "client!ba", name = "t", descriptor = "Lclient!sd;")
	public static Class73 aClass73_172 = aClass73_167;

	@OriginalMember(owner = "client!ba", name = "v", descriptor = "[I")
	public static int[] anIntArray15 = new int[25];

	@OriginalMember(owner = "client!ba", name = "w", descriptor = "Lclient!sd;")
	public static Class73 aClass73_173 = aClass73_167;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
	public static void method191() {
		@Pc(3) boolean local3 = false;
		while (!local3) {
			local3 = true;
			for (@Pc(17) int local17 = 0; local17 < Static142.anInt3262 - 1; local17++) {
				if (Static176.anIntArray419[local17] < 1000 && Static176.anIntArray419[local17 + 1] > 1000) {
					@Pc(37) Class73 local37 = Static162.aClass73Array24[local17];
					Static162.aClass73Array24[local17] = Static162.aClass73Array24[local17 + 1];
					Static162.aClass73Array24[local17 + 1] = local37;
					@Pc(55) Class73 local55 = Static11.aClass73Array3[local17];
					Static11.aClass73Array3[local17] = Static11.aClass73Array3[local17 + 1];
					Static11.aClass73Array3[local17 + 1] = local55;
					@Pc(73) int local73 = Static176.anIntArray419[local17];
					local3 = false;
					Static176.anIntArray419[local17] = Static176.anIntArray419[local17 + 1];
					Static176.anIntArray419[local17 + 1] = local73;
					@Pc(93) int local93 = Static14.anIntArray18[local17];
					Static14.anIntArray18[local17] = Static14.anIntArray18[local17 + 1];
					Static14.anIntArray18[local17 + 1] = local93;
					@Pc(111) int local111 = Static50.anIntArray120[local17];
					Static50.anIntArray120[local17] = Static50.anIntArray120[local17 + 1];
					Static50.anIntArray120[local17 + 1] = local111;
					@Pc(129) int local129 = Static143.anIntArray349[local17];
					Static143.anIntArray349[local17] = Static143.anIntArray349[local17 + 1];
					Static143.anIntArray349[local17 + 1] = local129;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)[Lclient!kf;")
	public static Class3_Sub1_Sub3_Sub3[] method192() {
		@Pc(8) Class3_Sub1_Sub3_Sub3[] local8 = new Class3_Sub1_Sub3_Sub3[Static96.anInt2130];
		for (@Pc(15) int local15 = 0; local15 < Static96.anInt2130; local15++) {
			@Pc(21) Class3_Sub1_Sub3_Sub3 local21 = new Class3_Sub1_Sub3_Sub3();
			local21.anInt1915 = Static86.anInt1939;
			local21.anInt1916 = Static57.anInt1344;
			local21.anInt1918 = Static42.anIntArray46[local15];
			local21.anInt1919 = Static72.anIntArray177[local15];
			local21.anInt1917 = Static37.anIntArray89[local15];
			local21.anInt1914 = Static143.anIntArray350[local15];
			local21.anIntArray196 = Static9.anIntArray12;
			local21.aByteArray17 = Static124.aByteArrayArray8[local15];
			local8[local15] = local21;
		}
		Static90.method1592();
		return local8;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!f;I)V")
	public static void method193(@OriginalArg(0) Class13 arg0) {
		Static37.aClass13_8 = arg0;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/util/Random;BI)I")
	public static int method194(@OriginalArg(0) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static163.method2275(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(37) int local37 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(40) int local40;
			do {
				local40 = arg0.nextInt();
			} while (local37 <= local40);
			return Static69.method1222(local40, arg1);
		}
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
	public static void method195() {
		aClass73_167 = null;
		aClass73_172 = null;
		aClass73_166 = null;
		aClass73_171 = null;
		aClass73_163 = null;
		anIntArray13 = null;
		aClass3_Sub1_Sub3_Sub4Array2 = null;
		aClass73_165 = null;
		aClass73_170 = null;
		anIntArray14 = null;
		aClass73_164 = null;
		aClass73_168 = null;
		aClass73_169 = null;
		aClass73_173 = null;
		aClass3_Sub1_Sub3_Sub3Array5 = null;
		anIntArray15 = null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)Lclient!n;")
	public static Class3_Sub1_Sub13 method196(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub1_Sub13 local10 = (Class3_Sub1_Sub13) Static10.aClass7_3.method183((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static160.aClass13_30.method348(13, arg0);
		local10 = new Class3_Sub1_Sub13();
		local10.anInt2373 = arg0;
		if (local20 != null) {
			local10.method1830(new Class3_Sub12(local20));
		}
		Static10.aClass7_3.method186(local10, (long) arg0);
		return local10;
	}
}
