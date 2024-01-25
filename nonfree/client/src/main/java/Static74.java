import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "F")
	public static float aFloat24;

	@OriginalMember(owner = "client!cja", name = "b", descriptor = "I")
	public static int anInt1446;

	@OriginalMember(owner = "client!cja", name = "i", descriptor = "Lclient!fd;")
	public static Class103 aClass103_5;

	@OriginalMember(owner = "client!cja", name = "c", descriptor = "[S")
	private static final short[] aShortArray7 = new short[] { 962, 20423, -21582, 11214, -10295 };

	@OriginalMember(owner = "client!cja", name = "d", descriptor = "[S")
	private static final short[] aShortArray8 = new short[] { 957, 20418, -21587, 11209, -10300 };

	@OriginalMember(owner = "client!cja", name = "g", descriptor = "[S")
	private static final short[] aShortArray9 = new short[] { 967, 20428, -21577, 11219, -10290 };

	@OriginalMember(owner = "client!cja", name = "h", descriptor = "[S")
	private static final short[] aShortArray10 = new short[] { 952, 20413, -21592, 11204, -10305 };

	@OriginalMember(owner = "client!cja", name = "f", descriptor = "[[S")
	public static final short[][] aShortArrayArray2 = new short[][] { aShortArray9, aShortArray7, aShortArray8, aShortArray10 };

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(ZIFIZIIII)[[I")
	public static int[][] method1259(@OriginalArg(2) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class3_Sub2_Sub25 local13 = new Class3_Sub2_Sub25();
		local13.anInt6678 = (int) (arg0 * 4096.0F);
		local13.anInt6677 = 3;
		local13.anInt6676 = 4;
		local13.aBoolean483 = false;
		local13.anInt6682 = 4;
		local13.method8673();
		Static432.method6572(64, 256);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local13.method5810(local9[local45], local45);
		}
		return local9;
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(I[BILjava/lang/String;)I")
	public static int method1261(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(10) int local10 = arg2.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12 += 4) {
			@Pc(22) int local22 = Static616.method8416(arg2.charAt(local12));
			@Pc(37) int local37 = local12 + 1 < local10 ? Static616.method8416(arg2.charAt(local12 + 1)) : -1;
			@Pc(52) int local52 = local12 + 2 < local10 ? Static616.method8416(arg2.charAt(local12 + 2)) : -1;
			@Pc(69) int local69 = local12 + 3 >= local10 ? -1 : Static616.method8416(arg2.charAt(local12 + 3));
			arg0[arg1++] = (byte) (local37 >>> 4 | local22 << 2);
			if (local52 == -1) {
				break;
			}
			arg0[arg1++] = (byte) ((local37 & 0xF) << 4 | local52 >>> 2);
			if (local69 == -1) {
				break;
			}
			arg0[arg1++] = (byte) ((local52 & 0x3) << 6 | local69);
		}
		return arg1;
	}
}
