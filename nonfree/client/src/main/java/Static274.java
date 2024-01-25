import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!kw", name = "l", descriptor = "I")
	public static int anInt3317;

	@OriginalMember(owner = "client!kw", name = "n", descriptor = "I")
	public static int anInt3319;

	@OriginalMember(owner = "client!kw", name = "h", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_78 = new Class40(28, -1);

	@OriginalMember(owner = "client!kw", name = "i", descriptor = "[I")
	public static final int[] anIntArray385 = new int[1024];

	@OriginalMember(owner = "client!kw", name = "k", descriptor = "Lclient!rh;")
	public static final Class275 aClass275_64 = new Class275();

	@OriginalMember(owner = "client!kw", name = "m", descriptor = "I")
	public static int anInt3318 = 0;

	@OriginalMember(owner = "client!kw", name = "o", descriptor = "F")
	public static float aFloat47 = 0.0F;

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!oa;IILclient!rh;I)V")
	public static void method2851(@OriginalArg(0) Class121 arg0, @OriginalArg(3) Class275 arg1) {
		Static553.aClass275_194.method6357();
		if (Static191.aBoolean218) {
			return;
		}
		for (@Pc(16) Class6_Sub34 local16 = (Class6_Sub34) arg1.method6366(); local16 != null; local16 = (Class6_Sub34) arg1.method6364()) {
			@Pc(24) Class179 local24 = Static349.aClass276_3.method6396(local16.anInt4907);
			if (Static317.method4929(local24)) {
				@Pc(36) boolean local36 = Static436.method6281(local24, local16, arg0);
				if (local36) {
					Static197.method2978(local16, local24, arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIZII)V")
	public static void method2852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(17) long local17 = (long) (arg1 | (arg2 ? Integer.MIN_VALUE : 0));
		@Pc(23) Class6_Sub13 local23 = (Class6_Sub13) Static373.aClass212_27.method5106(local17);
		if (local23 == null) {
			local23 = new Class6_Sub13();
			Static373.aClass212_27.method5104(local17, local23);
		}
		if (arg3 >= local23.anIntArray171.length) {
			@Pc(44) int[] local44 = new int[arg3 + 1];
			@Pc(49) int[] local49 = new int[arg3 + 1];
			for (@Pc(51) int local51 = 0; local51 < local23.anIntArray171.length; local51++) {
				local44[local51] = local23.anIntArray171[local51];
				local49[local51] = local23.anIntArray172[local51];
			}
			for (@Pc(81) int local81 = local23.anIntArray171.length; local81 < arg3; local81++) {
				local44[local81] = -1;
				local49[local81] = 0;
			}
			local23.anIntArray172 = local49;
			local23.anIntArray171 = local44;
		}
		local23.anIntArray171[arg3] = arg4;
		local23.anIntArray172[arg3] = arg0;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZI)V")
	public static void method2853(@OriginalArg(1) int arg0) {
		if (!Static354.method5292(arg0)) {
			return;
		}
		@Pc(19) Class97[] local19 = Static375.aClass97ArrayArray1[arg0];
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(27) Class97 local27 = local19[local21];
			if (local27 != null) {
				local27.anInt2304 = 0;
				local27.anInt2287 = 1;
				local27.anInt2272 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZLclient!e;ILjava/awt/Canvas;)Lclient!oa;")
	public static Class121 method2855(@OriginalArg(0) boolean arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(3) Canvas arg2) {
		return arg0 ? new Class121_Sub1_Sub2(arg2, arg1) : new Class121_Sub1_Sub1(arg2, arg1);
	}
}
