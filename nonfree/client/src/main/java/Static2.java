import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "U", descriptor = "[S")
	public static short[] aShortArray1;

	@OriginalMember(owner = "client!aa", name = "Z", descriptor = "Ljava/lang/String;")
	public static String aString1;

	@OriginalMember(owner = "client!aa", name = "hb", descriptor = "I")
	public static int anInt111;

	@OriginalMember(owner = "client!aa", name = "O", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_27 = Static81.method1507("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!aa", name = "T", descriptor = "Lclient!i;")
	public static final Class1_Sub2_Sub11 aClass1_Sub2_Sub11_1 = new Class1_Sub2_Sub11();

	@OriginalMember(owner = "client!aa", name = "db", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_29 = Static81.method1507("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!aa", name = "eb", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_30 = Static81.method1507("Connection timed out)3");

	@OriginalMember(owner = "client!aa", name = "fb", descriptor = "Lclient!dj;")
	public static Class24 aClass24_31 = aClass24_30;

	@OriginalMember(owner = "client!aa", name = "gb", descriptor = "J")
	public static long aLong6 = 0L;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!ve;BI)[Lclient!le;")
	public static Class1_Sub2_Sub8_Sub2[] method83(@OriginalArg(0) Class69 arg0, @OriginalArg(2) int arg1) {
		return Static136.method2383(arg1, arg0) ? Static91.method1651() : null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)Z")
	public static boolean method84(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!dj;ILclient!dj;Lclient!ve;Lclient!ve;)Lclient!gb;")
	public static Class1_Sub2_Sub8_Sub1_Sub1 method85(@OriginalArg(0) Class24 arg0, @OriginalArg(2) Class24 arg1, @OriginalArg(3) Class69 arg2, @OriginalArg(4) Class69 arg3) {
		@Pc(13) int local13 = arg3.method2205(arg1);
		@Pc(19) int local19 = arg3.method2203(local13, arg0);
		return Static183.method3171(arg3, arg2, local19, local13);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)I")
	public static int method86(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
		@Pc(21) int local21 = (local10 & 0x33333333) + ((local10 & 0xCCCCCCCE) >>> 2);
		@Pc(35) int local35 = local21 + (local21 >>> 4) & 0xF0F0F0F;
		@Pc(41) int local41 = local35 + (local35 >>> 8);
		@Pc(51) int local51 = local41 + (local41 >>> 16);
		return local51 & 0xFF;
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(B)V")
	public static void method87() {
		while (true) {
			@Pc(9) Class87 local9 = Static12.aClass87_6;
			@Pc(16) Class1_Sub25 local16;
			synchronized (Static12.aClass87_6) {
				local16 = (Class1_Sub25) Static87.aClass87_14.method2825();
			}
			if (local16 == null) {
				return;
			}
			local16.aClass69_Sub1_147.method2229((int) local16.aLong149, false, local16.aByteArray55, local16.aClass6_4);
		}
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(III)V")
	public static void method88(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub8 local7 = Static29.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass19_1 = null;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!vc;)Z")
	public static boolean method91(@OriginalArg(1) Class98 arg0) {
		if (arg0.anInt4351 == 205) {
			Static48.anInt1203 = 250;
			return true;
		} else {
			return false;
		}
	}
}
