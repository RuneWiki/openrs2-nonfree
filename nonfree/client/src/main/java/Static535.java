import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "Lclient!hca;")
	public static Class127 aClass127_1;

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
	public static int anInt8885 = 0;

	@OriginalMember(owner = "client!ui", name = "p", descriptor = "Lclient!ws;")
	public static final Class361 aClass361_64 = new Class361();

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!bt;III)V")
	public static void method7306(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub10 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg0 << 28 | arg2 << 14 | arg3);
		@Pc(22) Class6_Sub51 local22 = (Class6_Sub51) Static478.aClass128_40.method3263(local16);
		if (local22 == null) {
			local22 = new Class6_Sub51();
			Static478.aClass128_40.method3267(local22, local16);
			local22.aClass361_68.method7833(arg1);
			return;
		}
		@Pc(56) Class237 local56 = Static444.aClass322_2.method7141(arg1.anInt1069);
		@Pc(59) int local59 = local56.anInt6541;
		if (local56.anInt6524 == 1) {
			local59 *= arg1.anInt1068 + 1;
		}
		for (@Pc(78) Class6_Sub10 local78 = (Class6_Sub10) local22.aClass361_68.method7838(); local78 != null; local78 = (Class6_Sub10) local22.aClass361_68.method7845()) {
			local56 = Static444.aClass322_2.method7141(local78.anInt1069);
			@Pc(89) int local89 = local56.anInt6541;
			if (local56.anInt6524 == 1) {
				local89 *= local78.anInt1068 + 1;
			}
			if (local89 < local59) {
				Static560.method7565(arg1, local78);
				return;
			}
		}
		local22.aClass361_68.method7833(arg1);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I[II[JI)V")
	public static void method7307(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= arg3) {
			return;
		}
		@Pc(11) int local11 = (arg1 + arg3) / 2;
		@Pc(13) int local13 = arg1;
		@Pc(17) long local17 = arg2[local11];
		arg2[local11] = arg2[arg3];
		arg2[arg3] = local17;
		@Pc(31) int local31 = arg0[local11];
		arg0[local11] = arg0[arg3];
		arg0[arg3] = local31;
		@Pc(49) int local49 = local17 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(51) int local51 = arg1; local51 < arg3; local51++) {
			if (arg2[local51] < (long) (local51 & local49) + local17) {
				@Pc(72) long local72 = arg2[local51];
				arg2[local51] = arg2[local13];
				arg2[local13] = local72;
				@Pc(86) int local86 = arg0[local51];
				arg0[local51] = arg0[local13];
				arg0[local13++] = local86;
			}
		}
		arg2[arg3] = arg2[local13];
		arg2[local13] = local17;
		arg0[arg3] = arg0[local13];
		arg0[local13] = local31;
		method7307(arg0, arg1, arg2, local13 - 1);
		method7307(arg0, local13 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
	public static void method7308() {
		if (Static15.aFrame1 != null) {
			return;
		}
		@Pc(10) int local10 = Static543.anInt8951;
		@Pc(12) int local12 = Static309.anInt5674;
		@Pc(24) int local24 = Static1.anInt9404 - local10 - Static240.anInt4852;
		@Pc(32) int local32 = Static120.anInt2852 - local12 - Static196.anInt4059;
		if (local10 <= 0 && local24 <= 0 && local12 <= 0 && local32 <= 0) {
			return;
		}
		try {
			@Pc(55) Container local55;
			if (Static547.aFrame2 != null) {
				local55 = Static547.aFrame2;
			} else if (Static249.anApplet1 == null) {
				local55 = Static340.anApplet_Sub1_1;
			} else {
				local55 = Static249.anApplet1;
			}
			@Pc(65) int local65 = 0;
			@Pc(67) int local67 = 0;
			if (Static547.aFrame2 == local55) {
				@Pc(73) Insets local73 = Static547.aFrame2.getInsets();
				local67 = local73.top;
				local65 = local73.left;
			}
			@Pc(82) Graphics local82 = local55.getGraphics();
			local82.setColor(Color.black);
			if (local10 > 0) {
				local82.fillRect(local65, local67, local10, Static120.anInt2852);
			}
			if (local12 > 0) {
				local82.fillRect(local65, local67, Static1.anInt9404, local12);
			}
			if (local24 > 0) {
				local82.fillRect(Static1.anInt9404 + local65 - local24, local67, local24, Static120.anInt2852);
			}
			if (local32 > 0) {
				local82.fillRect(local65, local67 + Static120.anInt2852 - local32, Static1.anInt9404, local32);
				return;
			}
		} catch (@Pc(129) Exception local129) {
			return;
		}
	}
}
