import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!mk", name = "g", descriptor = "Lclient!ri;")
	public static Class284 aClass284_99;

	@OriginalMember(owner = "client!mk", name = "m", descriptor = "Lclient!ri;")
	public static Class284 aClass284_100;

	@OriginalMember(owner = "client!mk", name = "f", descriptor = "Lclient!qaa;")
	public static final Class266 aClass266_4 = new Class266();

	@OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
	public static int anInt6064 = 2;

	@OriginalMember(owner = "client!mk", name = "k", descriptor = "[I")
	public static final int[] anIntArray340 = new int[14];

	@OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
	public static int anInt6066 = 0;

	@OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
	public static int anInt6067 = 0;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILclient!er;I[I[II)Lclient!mba;")
	public static Class53_Sub2 method4908(@OriginalArg(0) int arg0, @OriginalArg(1) Class31_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(10) byte[] local10 = new byte[arg0 * arg2];
		for (@Pc(18) int local18 = 0; local18 < arg2; local18++) {
			@Pc(28) int local28 = local18 * arg0 + arg3[local18];
			for (@Pc(30) int local30 = 0; local30 < arg4[local18]; local30++) {
				local10[local28++] = -1;
			}
		}
		return new Class53_Sub2(arg1, arg0, arg2, local10);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)V")
	public static void method4909(@OriginalArg(0) int arg0) {
		if (!Static160.method2927(arg0)) {
			return;
		}
		@Pc(22) Class251[] local22 = Static449.aClass251ArrayArray1[arg0];
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Class251 local30 = local22[local24];
			if (local30 != null) {
				local30.anInt7271 = 0;
				local30.anInt7222 = 0;
				local30.anInt7270 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)[Lclient!hl;")
	public static Class126[] method4910() {
		return new Class126[] { Static556.aClass126_29, Static556.aClass126_30, Static556.aClass126_31, Static556.aClass126_32, Static556.aClass126_33, Static556.aClass126_34, Static556.aClass126_35, Static556.aClass126_36, Static556.aClass126_37, Static556.aClass126_38, Static556.aClass126_39, Static556.aClass126_40, Static556.aClass126_41, Static556.aClass126_42 };
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(BI)V")
	public static void method4911(@OriginalArg(1) int arg0) {
		Static310.aLong157 = 1000000000L / (long) arg0;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)Z")
	public static boolean method4912(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
