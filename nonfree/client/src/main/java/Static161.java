import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!fda", name = "Eb", descriptor = "Lclient!mu;")
	public static Class237 aClass237_3;

	@OriginalMember(owner = "client!fda", name = "nc", descriptor = "Lclient!wm;")
	public static Class390 aClass390_71;

	@OriginalMember(owner = "client!fda", name = "wc", descriptor = "Lclient!pu;")
	public static Class50 aClass50_25;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(BI)I")
	public static int method4588(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAB) >>> 1);
		@Pc(24) int local24 = (local10 >>> 2 & 0x33333333) + (local10 & 0x33333333);
		@Pc(32) int local32 = (local24 >>> 4) + local24 & 0xF0F0F0F;
		@Pc(38) int local38 = local32 + (local32 >>> 8);
		@Pc(49) int local49 = local38 + (local38 >>> 16);
		return local49 & 0xFF;
	}

	@OriginalMember(owner = "client!fda", name = "c", descriptor = "(III)Z")
	public static boolean method4592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lclient!vba;I)Ljava/lang/String;")
	public static String method4598(@OriginalArg(0) Class5_Sub3_Sub20 arg0) {
		if (arg0.aString102 == null || arg0.aString102.length() == 0) {
			return arg0.aString101 == null || arg0.aString101.length() <= 0 ? arg0.aString100 : arg0.aString100 + Static64.aClass52_32.method907(Static544.anInt8937) + arg0.aString101;
		} else if (arg0.aString101 == null || arg0.aString101.length() <= 0) {
			return arg0.aString100 + Static64.aClass52_32.method907(Static544.anInt8937) + arg0.aString102;
		} else {
			return arg0.aString100 + Static64.aClass52_32.method907(Static544.anInt8937) + arg0.aString101 + Static64.aClass52_32.method907(Static544.anInt8937) + arg0.aString102;
		}
	}
}
