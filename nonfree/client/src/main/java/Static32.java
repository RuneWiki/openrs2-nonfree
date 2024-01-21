import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "[I")
	public static int[] anIntArray117;

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
	public static int anInt917;

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
	public static int anInt920;

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "Lclient!sd;")
	public static Class2 aClass2_5;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "Lclient!ae;")
	public static Class5 aClass5_420 = Static56.method972("titlebox");

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "Lclient!ae;")
	private static Class5 aClass5_423 = Static56.method972("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "Lclient!ae;")
	public static Class5 aClass5_421 = aClass5_423;

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "[[B")
	public static byte[][] aByteArrayArray5 = new byte[250][];

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "Lclient!ae;")
	public static Class5 aClass5_422 = aClass5_423;

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
	public static volatile int anInt921 = 0;

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "Lclient!ae;")
	private static Class5 aClass5_425 = Static56.method972("Your ignore list is full)3 Max of 100 hit");

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "Lclient!ae;")
	public static Class5 aClass5_424 = aClass5_425;

	@OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
	public static int anInt922 = 0;

	@OriginalMember(owner = "client!fd", name = "r", descriptor = "Lclient!p;")
	public static Class51 aClass51_8 = new Class51();

	@OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
	public static int anInt923 = -1;

	@OriginalMember(owner = "client!fd", name = "v", descriptor = "Lclient!ae;")
	private static Class5 aClass5_427 = Static56.method972("Ok");

	@OriginalMember(owner = "client!fd", name = "u", descriptor = "Lclient!ae;")
	public static Class5 aClass5_426 = aClass5_427;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
	public static void method644() {
		if (Static74.aBoolean91 && Static12.anInt480 != Static83.anInt2037) {
			Static30.method605(Static12.anInt480, Static109.anInt2877, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], Static67.anInt1780);
		} else if (Static78.anInt1959 != Static12.anInt480) {
			Static78.anInt1959 = Static12.anInt480;
			Static82.method1305(Static12.anInt480);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
	public static void method645() {
		aClass5_423 = null;
		aClass5_425 = null;
		aClass2_5 = null;
		aCRC32_1 = null;
		aClass5_420 = null;
		aClass51_8 = null;
		aClass5_424 = null;
		aClass5_427 = null;
		aClass5_426 = null;
		aClass5_422 = null;
		anIntArray117 = null;
		aByteArrayArray5 = null;
		aClass5_421 = null;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IBILclient!bf;)[Lclient!q;")
	public static Class3_Sub1_Sub2_Sub3[] method646(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11 arg2) {
		return Static16.method398(arg1, arg0, arg2) ? Static102.method1723() : null;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)I")
	public static int method647() {
		@Pc(5) int local5 = Static15.method358(Static60.anInt2989, Static12.anInt480, Static89.anInt2280);
		return local5 - Static85.anInt2111 >= 800 || (Static93.aByteArrayArrayArray5[Static12.anInt480][Static89.anInt2280 >> 7][Static60.anInt2989 >> 7] & 0x4) == 0 ? 3 : Static12.anInt480;
	}
}
