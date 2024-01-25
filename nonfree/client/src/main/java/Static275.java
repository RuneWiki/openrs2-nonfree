import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
	public static int anInt4755;

	@OriginalMember(owner = "client!kf", name = "x", descriptor = "Lclient!pb;")
	public static final Class262 aClass262_8 = new Class262(0, 3);

	@OriginalMember(owner = "client!kf", name = "z", descriptor = "I")
	public static int anInt4756 = 0;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method3998(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = arg0.charAt(local17) + (local15 << 5) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIILclient!ua;Lclient!ps;J)V")
	public static void method3999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class84 arg5, @OriginalArg(7) Class273 arg6, @OriginalArg(8) long arg7) {
		@Pc(12) int local12 = arg2 * arg2 + arg3 * arg3;
		if (arg7 < (long) local12) {
			return;
		}
		@Pc(33) int local33 = Math.min(arg6.anInt6883 / 2, arg6.anInt6814 / 2);
		if (local33 * local33 >= local12) {
			Static460.method5970(Static493.aClass38Array25[arg1], arg2, arg3, arg0, arg6, arg5, arg4);
			return;
		}
		local33 -= 10;
		@Pc(55) int local55;
		if (Static489.anInt7763 == 4) {
			local55 = (int) Static313.aFloat157 & 0x3FFF;
		} else {
			local55 = (int) Static313.aFloat157 + Static525.anInt8446 & 0x3FFF;
		}
		@Pc(66) int local66 = Class285.anIntArray476[local55];
		@Pc(70) int local70 = Class285.anIntArray475[local55];
		if (Static489.anInt7763 != 4) {
			local70 = local70 * 256 / (Static434.anInt6973 + 256);
			local66 = local66 * 256 / (Static434.anInt6973 + 256);
		}
		@Pc(101) int local101 = local70 * arg2 + arg3 * local66 >> 14;
		@Pc(112) int local112 = arg3 * local70 - local66 * arg2 >> 14;
		@Pc(118) double local118 = Math.atan2((double) local101, (double) local112);
		@Pc(125) int local125 = (int) (Math.sin(local118) * (double) local33);
		@Pc(132) int local132 = (int) (Math.cos(local118) * (double) local33);
		Static330.aClass38Array2[arg1].method7456((float) local125 + (float) arg6.anInt6883 / 2.0F + (float) arg4, (float) arg6.anInt6814 / 2.0F + (float) arg0 - (float) local132, 4096, (int) (-local118 / 6.283185307179586D * 65535.0D));
	}
}
