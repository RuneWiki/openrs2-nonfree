import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!qi", name = "G", descriptor = "Lclient!bu;")
	public static Class30 aClass30_10;

	@OriginalMember(owner = "client!qi", name = "I", descriptor = "Z")
	public static boolean aBoolean637 = false;

	@OriginalMember(owner = "client!qi", name = "M", descriptor = "I")
	public static int anInt5608 = 0;

	@OriginalMember(owner = "client!qi", name = "O", descriptor = "[S")
	public static short[] aShortArray98 = new short[256];

	@OriginalMember(owner = "client!qi", name = "Q", descriptor = "Lclient!wq;")
	public static final Class269 aClass269_43 = new Class269(3, 7);

	@OriginalMember(owner = "client!qi", name = "R", descriptor = "I")
	public static final int anInt5611 = 0;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method4413(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 == '<' || local23 == '>') {
				local15 += 3;
			}
		}
		@Pc(44) StringBuffer local44 = new StringBuffer(local13 + local15);
		for (@Pc(46) int local46 = 0; local46 < local13; local46++) {
			@Pc(52) char local52 = arg0.charAt(local46);
			if (local52 == '<') {
				local44.append("<lt>");
			} else if (local52 == '>') {
				local44.append("<gt>");
			} else {
				local44.append(local52);
			}
		}
		return local44.toString();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBI)Z")
	public static boolean method4414(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(III)Z")
	public static boolean method4415(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I[BII)I")
	public static int method4417(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = -1;
		for (@Pc(14) int local14 = arg1; local14 < arg2; local14++) {
			local12 = local12 >>> 8 ^ Class1_Sub2.anIntArray8[(arg0[local14] ^ local12) & 0xFF];
		}
		return ~local12;
	}
}
