import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
	public static int anInt577;

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "Lclient!kd;")
	public static Class39 aClass39_300 = Static108.method1915("(X");

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "Lclient!kd;")
	private static Class39 aClass39_305 = Static108.method1915("Private chat");

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "Lclient!kd;")
	public static Class39 aClass39_301 = aClass39_305;

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "[I")
	public static int[] anIntArray98 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
	public static int anInt579 = 0;

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "Lclient!kd;")
	public static Class39 aClass39_302 = Static108.method1915("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "Lclient!kd;")
	private static Class39 aClass39_304 = Static108.method1915("Your ignore list is full)3 Max of 100 hit");

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "Lclient!kd;")
	public static Class39 aClass39_303 = aClass39_304;

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
	public static int anInt583 = 0;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)[Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1[] method328() {
		@Pc(8) Class1_Sub1_Sub4_Sub1[] local8 = new Class1_Sub1_Sub4_Sub1[Static4.anInt160];
		for (@Pc(10) int local10 = 0; local10 < Static4.anInt160; local10++) {
			@Pc(29) Class1_Sub1_Sub4_Sub1 local29 = local8[local10] = new Class1_Sub1_Sub4_Sub1();
			local29.anInt873 = Static95.anInt2872;
			local29.anInt874 = Static41.anInt3022;
			local29.anInt871 = Static21.anIntArray107[local10];
			local29.anInt872 = Static113.anIntArray436[local10];
			local29.anInt869 = Static64.anIntArray244[local10];
			local29.anInt870 = Static2.anIntArray21[local10];
			local29.anIntArray126 = Static23.anIntArray116;
			local29.aByteArray24 = Static81.aByteArrayArray8[local10];
		}
		Static52.method964();
		return local8;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	public static void method329() {
		Static55.aClass33_19.method1034();
		Static46.aClass33_38.method1034();
		Static69.aClass33_25.method1034();
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
	public static void method330() {
		anIntArray98 = null;
		aClass39_302 = null;
		aClass39_305 = null;
		aClass39_303 = null;
		aClass39_301 = null;
		aClass39_304 = null;
		aClass39_300 = null;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([Lclient!kd;IBI)Lclient!kd;")
	public static Class39 method331(@OriginalArg(0) Class39[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			if (arg0[arg2 + local9] == null) {
				arg0[local9 + arg2] = Static38.aClass39_543;
			}
			local3 += arg0[arg2 + local9].anInt1707;
		}
		@Pc(40) byte[] local40 = new byte[local3];
		@Pc(42) int local42 = 0;
		@Pc(60) Class39 local60;
		for (@Pc(52) int local52 = 0; local52 < arg1; local52++) {
			local60 = arg0[arg2 + local52];
			Static136.method1939(local60.aByteArray50, 0, local40, local42, local60.anInt1707);
			local42 += local60.anInt1707;
		}
		local60 = new Class39();
		local60.anInt1707 = local3;
		local60.aByteArray50 = local40;
		return local60;
	}
}
