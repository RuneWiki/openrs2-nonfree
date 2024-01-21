import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "Lclient!pc;")
	public static Class12 aClass12_8;

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "[I")
	public static int[] anIntArray42;

	@OriginalMember(owner = "client!bd", name = "t", descriptor = "[I")
	public static int[] anIntArray44;

	@OriginalMember(owner = "client!bd", name = "u", descriptor = "Lclient!td;")
	public static Class54 aClass54_2;

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "Lclient!td;")
	public static Class54 aClass54_3;

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "Lclient!db;")
	public static Class14 aClass14_1 = new Class14(4096);

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "[I")
	public static int[] anIntArray41 = new int[50];

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "Z")
	public static boolean aBoolean12 = false;

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "Lclient!hb;")
	private static Class27 aClass27_111 = Static87.method1648("Use");

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "Lclient!hb;")
	private static Class27 aClass27_116 = Static87.method1648("Login limit exceeded)3");

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "Lclient!hb;")
	public static Class27 aClass27_112 = aClass27_116;

	@OriginalMember(owner = "client!bd", name = "o", descriptor = "Lclient!hb;")
	private static Class27 aClass27_114 = Static87.method1648("Friends");

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "Lclient!hb;")
	public static Class27 aClass27_113 = aClass27_114;

	@OriginalMember(owner = "client!bd", name = "p", descriptor = "Lclient!hb;")
	public static Class27 aClass27_115 = aClass27_111;

	@OriginalMember(owner = "client!bd", name = "r", descriptor = "[I")
	public static int[] anIntArray43 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "[I")
	public static int[] anIntArray45 = new int[128];

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "Lclient!hb;")
	public static Class27 aClass27_117 = Static87.method1648("Die Verbindung konnte");

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	public static void method176() {
		Static98.aBoolean125 = true;
		Static36.method692();
		@Pc(37) boolean local37;
		if (Static41.anInt1210 != -1) {
			local37 = Static28.method616(0, 0, -1, 190, 261, 1, 0, Static41.anInt1210);
			if (!local37) {
				Static75.aBoolean101 = true;
			}
		} else if (Static91.anIntArray372[Static34.anInt825] != -1) {
			local37 = Static28.method616(0, 0, -1, 190, 261, 1, 0, Static91.anIntArray372[Static34.anInt825]);
			if (!local37) {
				Static75.aBoolean101 = true;
			}
		}
		if (Static12.aBoolean16 && Static22.anInt582 == 1) {
			if (Static33.anInt817 == 1) {
				Static39.method753();
			} else {
				Static48.method1672();
			}
		}
		Static18.method314();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)I")
	public static int method177() {
		@Pc(9) int local9 = Static48.method1675(Static45.anInt371, Static68.anInt1747, Static108.anInt2777);
		return local9 - Static75.anInt2122 >= 800 || (Static89.aByteArrayArrayArray11[Static68.anInt1747][Static108.anInt2777 >> 7][Static45.anInt371 >> 7] & 0x4) == 0 ? 3 : Static68.anInt1747;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
	public static void method178() {
		anIntArray44 = null;
		aClass54_2 = null;
		aClass14_1 = null;
		aClass27_114 = null;
		aClass54_3 = null;
		aClass12_8 = null;
		anIntArray45 = null;
		anIntArray43 = null;
		aClass27_117 = null;
		anIntArray42 = null;
		aClass27_112 = null;
		aClass27_111 = null;
		aClass27_115 = null;
		anIntArray41 = null;
		aClass27_113 = null;
		aClass27_116 = null;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B[Lclient!hb;)[Lclient!hb;")
	public static Class27[] method179(@OriginalArg(1) Class27[] arg0) {
		@Pc(8) Class27[] local8 = new Class27[5];
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			local8[local18] = Static98.method1779(new Class27[] { Static97.method1616(local18), Static82.aClass27_1054 });
			if (arg0 != null && arg0[local18] != null) {
				local8[local18] = Static98.method1779(new Class27[] { local8[local18], arg0[local18] });
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I[BII)Lclient!hb;")
	public static Class27 method180(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class27 local5 = new Class27();
		local5.anInt963 = 0;
		local5.aByteArray9 = new byte[arg2];
		for (@Pc(23) int local23 = arg1; local23 < arg2 + arg1; local23++) {
			if (arg0[local23] != 0) {
				local5.aByteArray9[local5.anInt963++] = arg0[local23];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLjava/awt/Component;II)Lclient!pc;")
	public static Class12 method182(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(14) Class local14 = Class.forName("Class12_Sub2");
			@Pc(18) Class12 local18 = (Class12) local14.getDeclaredConstructor().newInstance();
			local18.method673(arg2, arg1, arg0);
			return local18;
		} catch (@Pc(27) Throwable local27) {
			@Pc(31) Class12_Sub1 local31 = new Class12_Sub1();
			local31.method673(arg2, arg1, arg0);
			return local31;
		}
	}
}
