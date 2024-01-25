import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "Lclient!jg;")
	public static Class124 aClass124_3;

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_82 = new Class41(74, -1);

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_86 = new Class77(15, 8);

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "[S")
	public static final short[] aShortArray59 = new short[] { 10, 49, 15, 8, 25, 20, 21, 12 };

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)[Lclient!bd;")
	public static Class17[] method2736() {
		return new Class17[] { Static321.aClass17_18, Static320.aClass17_17, Static286.aClass17_16, Static154.aClass17_12, Static115.aClass17_9, Static358.aClass17_19, Static170.aClass17_13, Static277.aClass17_11, Static255.aClass17_7, Static231.aClass17_15, Static98.aClass17_8, Static64.aClass17_3, Static73.aClass17_6, Static217.aClass17_14, Static119.aClass17_10 };
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZIFIIIBI)[I")
	public static int[] method2740(@OriginalArg(2) float arg0) {
		@Pc(12) int[] local12 = new int[2048];
		@Pc(16) Class2_Sub6_Sub39 local16 = new Class2_Sub6_Sub39();
		local16.aBoolean492 = true;
		local16.anInt6602 = 4;
		local16.anInt6599 = (int) (arg0 * 4096.0F);
		local16.anInt6600 = 35;
		local16.anInt6596 = 8;
		local16.anInt6593 = 8;
		local16.method5639();
		Static31.method736(1, 2048);
		local16.method5645(0, local12);
		return local12;
	}
}
