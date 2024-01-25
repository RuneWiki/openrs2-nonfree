import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "Lclient!po;")
	public static Class184 aClass184_3;

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "Lclient!tl;")
	public static final Class227 aClass227_42 = new Class227(4);

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "I")
	public static int anInt5243 = 0;

	@OriginalMember(owner = "client!rp", name = "i", descriptor = "Z")
	public static boolean aBoolean495 = false;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method4596(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = (local10 << 5) + arg0.charAt(local17) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(DB)V")
	public static void method4597(@OriginalArg(0) double arg0) {
		if (Static277.aDouble9 == arg0) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(27) int local27 = (int) (Math.pow((double) local15 / 255.0D, arg0) * 255.0D);
			Static318.anIntArray633[local15] = local27 > 255 ? 255 : local27;
		}
		Static277.aDouble9 = arg0;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!re;I)Lclient!od;")
	public static Class171 method4598(@OriginalArg(0) Class1_Sub33 arg0) {
		@Pc(7) Class171 local7 = new Class171();
		local7.anInt4362 = arg0.method5177();
		local7.aClass1_Sub6_Sub13_1 = Static357.method5242(local7.anInt4362);
		return local7;
	}
}
