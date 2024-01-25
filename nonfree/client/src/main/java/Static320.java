import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "Z")
	public static boolean aBoolean413 = false;

	@OriginalMember(owner = "client!ne", name = "D", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_96 = new Class6(84, 6);

	@OriginalMember(owner = "client!ne", name = "G", descriptor = "Lclient!h;")
	public static final Class114 aClass114_113 = new Class114("Self", "Mich", "Moi", "Eu");

	@OriginalMember(owner = "client!ne", name = "H", descriptor = "[I")
	public static final int[] anIntArray442 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II[BLjava/io/File;)V")
	public static void method5229(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) File arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
		try {
			local14.readFully(arg1, 0, arg0);
		} catch (@Pc(21) EOFException local21) {
		}
		local14.close();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLclient!vp;IILclient!pa;IIIJ)V")
	public static void method5231(@OriginalArg(1) Class309 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class23 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) long arg7) {
		@Pc(16) int local16 = arg5 * arg5 + arg2 * arg2;
		if ((long) local16 > arg7) {
			return;
		}
		@Pc(36) int local36 = Math.min(arg0.anInt8790 / 2, arg0.anInt8752 / 2);
		if (local36 * local36 >= local16) {
			Static167.method3274(arg0, arg2, arg3, arg4, Static417.aClass12Array21[arg1], arg5, arg6);
			return;
		}
		local36 -= 10;
		@Pc(65) int local65;
		if (Static464.anInt8003 == 4) {
			local65 = (int) Static443.aFloat151 & 0x3FFF;
		} else {
			local65 = (int) Static443.aFloat151 + Static96.anInt2375 & 0x3FFF;
		}
		@Pc(75) int local75 = Class307.anIntArray744[local65];
		@Pc(79) int local79 = Class307.anIntArray743[local65];
		if (Static464.anInt8003 != 4) {
			local79 = local79 * 256 / (Static189.anInt4000 + 256);
			local75 = local75 * 256 / (Static189.anInt4000 + 256);
		}
		@Pc(108) int local108 = arg5 * local75 + local79 * arg2 >> 15;
		@Pc(118) int local118 = arg5 * local79 - local75 * arg2 >> 15;
		@Pc(124) double local124 = Math.atan2((double) local108, (double) local118);
		@Pc(131) int local131 = (int) ((double) local36 * Math.sin(local124));
		@Pc(138) int local138 = (int) (Math.cos(local124) * (double) local36);
		Static284.aClass12Array18[arg1].method7196((float) local131 + (float) arg0.anInt8790 / 2.0F + (float) arg6, (float) arg0.anInt8752 / 2.0F + (float) arg4 - (float) local138, 4096, (int) (-local124 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(II)[B")
	public static byte[] method5237(@OriginalArg(0) int arg0) {
		@Pc(17) Class1_Sub1_Sub15 local17 = (Class1_Sub1_Sub15) Static136.aClass290_1.method7078((long) arg0);
		if (local17 == null) {
			@Pc(22) byte[] local22 = new byte[512];
			@Pc(28) Random local28 = new Random((long) arg0);
			for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
				local22[local30] = (byte) local30;
			}
			for (@Pc(44) int local44 = 0; local44 < 255; local44++) {
				@Pc(50) int local50 = 255 - local44;
				@Pc(55) int local55 = Static499.method7152(local50, local28);
				@Pc(59) byte local59 = local22[local55];
				local22[local55] = local22[local50];
				local22[local50] = local22[511 - local44] = local59;
			}
			local17 = new Class1_Sub1_Sub15(local22);
			Static136.aClass290_1.method7077((long) arg0, local17);
		}
		return local17.aByteArray75;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIBII)I")
	public static int method5238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 65536 - Class307.anIntArray743[arg3 * 8192 / arg1] >> 1;
		return (local16 * arg2 >> 16) + (arg0 * (65536 - local16) >> 16);
	}
}
