import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "I")
	public static int anInt4262;

	@OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
	public static int anInt4264;

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "Z")
	public static boolean aBoolean332 = false;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZII)V")
	public static void method3471(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class127 local8 = new Class127(16);
		for (@Pc(13) Class3_Sub44 local13 = (Class3_Sub44) Static157.aClass127_15.method3248(); local13 != null; local13 = (Class3_Sub44) Static157.aClass127_15.method3252()) {
			local13.method5987();
			@Pc(23) int local23 = (int) (local13.aLong227 >> 28);
			@Pc(33) int local33 = (int) (local13.aLong227 >> 14 & 0x3FFFL) - arg1;
			@Pc(42) int local42 = (int) (local13.aLong227 & 0x3FFFL) - arg0;
			if (local42 >= 0 && local33 >= 0 && Static399.anInt6923 > local42 && Static127.anInt2696 > local33) {
				local8.method3257((long) (local33 << 14 | local23 << 28 | local42), local13);
			}
		}
		Static157.aClass127_15 = local8;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ID)V")
	public static void method3472(@OriginalArg(1) double arg0) {
		if (arg0 == Static401.aDouble9) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < 256; local5++) {
			@Pc(16) int local16 = (int) (Math.pow((double) local5 / 255.0D, arg0) * 255.0D);
			Static450.anIntArray577[local5] = local16 > 255 ? 255 : local16;
		}
		Static401.aDouble9 = arg0;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIIB)V")
	public static void method3473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub3_Sub7 local8 = Static139.method2522(10, arg2);
		local8.method1570();
		local8.anInt1930 = arg3;
		local8.anInt1932 = arg1;
		local8.anInt1933 = arg0;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)J")
	public static long method3474() {
		return Static62.aClass159_1.method5791();
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method3475(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) int local8 = 0;
		for (@Pc(16) int local16 = 0; local16 < local6; local16++) {
			local8 = Static278.method5344(arg0.charAt(local16)) + (local8 << 5) - local8;
		}
		return local8;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IZIIFIIII)[[I")
	public static int[][] method3476(@OriginalArg(4) float arg0) {
		@Pc(7) int[][] local7 = new int[256][64];
		@Pc(11) Class3_Sub4_Sub26 local11 = new Class3_Sub4_Sub26();
		local11.anInt5536 = 3;
		local11.anInt5548 = (int) (arg0 * 4096.0F);
		local11.anInt5540 = 8;
		local11.anInt5535 = 4;
		local11.aBoolean405 = false;
		local11.method5963();
		Static287.method4200(256, 64);
		for (@Pc(44) int local44 = 0; local44 < 256; local44++) {
			local11.method4476(local44, local7[local44]);
		}
		return local7;
	}
}
