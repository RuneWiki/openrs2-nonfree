import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "x", descriptor = "I")
	public static int anInt38;

	@OriginalMember(owner = "client!a", name = "u", descriptor = "[I")
	public static final int[] anIntArray1 = new int[100];

	@OriginalMember(owner = "client!a", name = "w", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_1 = new Class70(4);

	@OriginalMember(owner = "client!a", name = "y", descriptor = "Z")
	public static boolean aBoolean1 = false;

	@OriginalMember(owner = "client!a", name = "z", descriptor = "Z")
	public static boolean aBoolean2 = false;

	@OriginalMember(owner = "client!a", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString1 = "Face here";

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIILclient!ug;II)V")
	public static void method33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class6_Sub39 arg3, @OriginalArg(5) int arg4) {
		if (arg3.anInt5873 == -1 && arg3.anIntArray667 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		if (arg3.anInt5877 < arg4) {
			local15 = arg4 - arg3.anInt5877;
		} else if (arg4 < arg3.anInt5876) {
			local15 = arg3.anInt5876 - arg4;
		}
		@Pc(48) int local48 = arg3.anInt5883 * Static243.anInt4564 >> 8;
		if (arg1 > arg3.anInt5881) {
			local15 += arg1 - arg3.anInt5881;
		} else if (arg3.anInt5888 > arg1) {
			local15 += arg3.anInt5888 - arg1;
		}
		if (arg3.anInt5869 == 0 || arg3.anInt5869 < local15 - 64 || Static243.anInt4564 == 0 || arg0 != arg3.anInt5886) {
			if (arg3.aClass6_Sub12_Sub4_3 != null) {
				Static241.aClass6_Sub12_Sub3_6.method4902(arg3.aClass6_Sub12_Sub4_3);
				arg3.aClass6_Sub12_Sub4_3 = null;
			}
			if (arg3.aClass6_Sub12_Sub4_2 != null) {
				Static241.aClass6_Sub12_Sub3_6.method4902(arg3.aClass6_Sub12_Sub4_2);
				arg3.aClass6_Sub12_Sub4_2 = null;
			}
			return;
		}
		local15 -= 64;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(151) int local151 = local48 * (arg3.anInt5869 - local15) / arg3.anInt5869;
		if (arg3.aClass6_Sub12_Sub4_3 != null) {
			arg3.aClass6_Sub12_Sub4_3.method5670(local151);
		} else if (arg3.anInt5873 >= 0) {
			@Pc(169) Class12 local169 = Static357.method221(Static15.aClass53_14, arg3.anInt5873, 0);
			if (local169 != null) {
				@Pc(176) Class6_Sub11_Sub1 local176 = local169.method222().method2389(Static191.aClass63_1);
				@Pc(181) Class6_Sub12_Sub4 local181 = Static369.method5691(local176, local151);
				local181.method5675(-1);
				Static241.aClass6_Sub12_Sub3_6.method4904(local181);
				arg3.aClass6_Sub12_Sub4_3 = local181;
			}
		}
		if (arg3.aClass6_Sub12_Sub4_2 != null) {
			arg3.aClass6_Sub12_Sub4_2.method5670(local151);
			if (!arg3.aClass6_Sub12_Sub4_2.method5757()) {
				arg3.aClass6_Sub12_Sub4_2 = null;
			}
		} else if (arg3.anIntArray667 != null && (arg3.anInt5879 -= arg2) <= 0) {
			@Pc(228) int local228 = (int) (Math.random() * (double) arg3.anIntArray667.length);
			@Pc(236) Class12 local236 = Static357.method221(Static15.aClass53_14, arg3.anIntArray667[local228], 0);
			if (local236 != null) {
				@Pc(243) Class6_Sub11_Sub1 local243 = local236.method222().method2389(Static191.aClass63_1);
				@Pc(248) Class6_Sub12_Sub4 local248 = Static369.method5691(local243, local151);
				local248.method5675(0);
				Static241.aClass6_Sub12_Sub3_6.method4904(local248);
				arg3.aClass6_Sub12_Sub4_2 = local248;
				arg3.anInt5879 = (int) ((double) (arg3.anInt5880 - arg3.anInt5885) * Math.random()) + arg3.anInt5885;
				return;
			}
		}
	}
}
