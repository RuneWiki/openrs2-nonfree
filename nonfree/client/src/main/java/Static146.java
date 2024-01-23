import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "[S")
	public static short[] aShortArray48 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
	public static int anInt3258 = 0;

	@OriginalMember(owner = "client!pa", name = "o", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1130 = Static200.method3116("(Udns");

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IJ)V")
	public static void method2494(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static143.method2459(arg0 - 1L);
			Static143.method2459(1L);
		} else {
			Static143.method2459(arg0);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!nc;)Lclient!qa;")
	public static Class45_Sub4 method2498(@OriginalArg(1) Class1_Sub9 arg0) {
		return new Class45_Sub4(arg0.method932(), arg0.method932(), arg0.method932(), arg0.method932(), arg0.method920(), arg0.method920(), arg0.method895());
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg0 == arg4 && arg8 == arg7 && arg6 == arg1 && arg3 == arg2) {
			Static152.method2601(arg0, arg8, arg2, arg6, arg5);
			return;
		}
		@Pc(27) int local27 = arg8;
		@Pc(31) int local31 = arg0 * 3;
		@Pc(35) int local35 = arg8 * 3;
		@Pc(37) int local37 = arg0;
		@Pc(41) int local41 = arg4 * 3;
		@Pc(45) int local45 = arg3 * 3;
		@Pc(49) int local49 = arg1 * 3;
		@Pc(59) int local59 = local31 + local49 - local41 - local41;
		@Pc(69) int local69 = local41 + arg6 - local49 - arg0;
		@Pc(74) int local74 = local41 - local31;
		@Pc(78) int local78 = arg7 * 3;
		@Pc(88) int local88 = local78 + arg2 - local45 - arg8;
		@Pc(97) int local97 = local35 + local45 - local78 - local78;
		@Pc(102) int local102 = local78 - local35;
		for (@Pc(104) int local104 = 128; local104 <= 4096; local104 += 128) {
			@Pc(112) int local112 = local104 * local104 >> 12;
			@Pc(118) int local118 = local104 * local112 >> 12;
			@Pc(122) int local122 = local69 * local118;
			@Pc(126) int local126 = local88 * local118;
			@Pc(130) int local130 = local112 * local97;
			@Pc(134) int local134 = local112 * local59;
			@Pc(138) int local138 = local104 * local74;
			@Pc(148) int local148 = (local138 + local134 + local122 >> 12) + arg0;
			@Pc(152) int local152 = local104 * local102;
			@Pc(162) int local162 = (local152 + local126 + local130 >> 12) + arg8;
			Static152.method2601(local37, local27, local162, local148, arg5);
			local37 = local148;
			local27 = local162;
		}
	}
}
