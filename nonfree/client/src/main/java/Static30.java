import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bq", name = "O", descriptor = "I")
	public static int anInt715;

	@OriginalMember(owner = "client!bq", name = "P", descriptor = "Lclient!mo;")
	public static Class143 aClass143_19;

	@OriginalMember(owner = "client!bq", name = "Q", descriptor = "[I")
	public static int[] anIntArray45;

	@OriginalMember(owner = "client!bq", name = "K", descriptor = "Lclient!hj;")
	public static final Class14_Sub4_Sub2 aClass14_Sub4_Sub2_1 = new Class14_Sub4_Sub2(5000);

	@OriginalMember(owner = "client!bq", name = "M", descriptor = "Lclient!ne;")
	public static Class146 aClass146_8 = null;

	@OriginalMember(owner = "client!bq", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString27 = "Your ignore list is full. Max of 100 users.";

	@OriginalMember(owner = "client!bq", name = "T", descriptor = "I")
	public static int anInt717 = 0;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(ZIB)V")
	public static void method746(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		Static256.anInt4894 = 99;
		Static294.aByteArrayArrayArray12 = new byte[arg1][Static195.anInt3965 + 1][Static298.anInt5716 + 1];
		Static263.aByteArrayArrayArray11 = new byte[arg1][Static195.anInt3965][Static298.anInt5716];
		Static277.anIntArray476 = new int[Static298.anInt5716];
		Static47.anIntArray67 = new int[Static298.anInt5716];
		Static1.anIntArrayArrayArray12 = new int[arg1][Static195.anInt3965 + 1][Static298.anInt5716 + 1];
		Static27.anIntArray40 = new int[5];
		Static208.aByteArrayArrayArray8 = new byte[arg1][Static195.anInt3965][Static298.anInt5716];
		Static101.anIntArray209 = new int[Static298.anInt5716];
		Static300.aByteArrayArrayArray14 = new byte[arg1][Static195.anInt3965][Static298.anInt5716];
		Static302.anIntArray529 = new int[Static298.anInt5716];
		Static210.anIntArray377 = new int[Static298.anInt5716];
		Static21.aByteArrayArrayArray4 = new byte[arg1][Static195.anInt3965][Static298.anInt5716];
		if (!arg0) {
			Static260.aByteArrayArrayArray10 = null;
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method749(@OriginalArg(0) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			local7 *= 37L;
			@Pc(27) char local27 = arg0.charAt(local17);
			if (local27 >= 'A' && local27 <= 'Z') {
				local7 += local27 + 1 - 65;
			} else if (local27 >= 'a' && local27 <= 'z') {
				local7 += local27 + 1 - 97;
			} else if (local27 >= '0' && local27 <= '9') {
				local7 += local27 - 21;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}
}
