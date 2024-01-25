import java.awt.Color;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!kk", name = "m", descriptor = "Lclient!un;")
	public static Class189 aClass189_1;

	@OriginalMember(owner = "client!kk", name = "n", descriptor = "Lclient!pj;")
	public static Class248 aClass248_39;

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "J")
	public static long aLong100 = 20000000L;

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!kk", name = "i", descriptor = "[I")
	public static final int[] anIntArray393 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIZ)I")
	public static int method4039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(20) int local20 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local20;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
	public static void method4040() {
		@Pc(7) Class108 local7 = null;
		try {
			@Pc(22) Class224 local22 = Static174.aClass313_24.method6994("2", true);
			while (local22.anInt6632 == 0) {
				Static183.method3079(1L);
			}
			if (local22.anInt6632 == 1) {
				local7 = (Class108) local22.anObject14;
				@Pc(49) byte[] local49 = new byte[(int) local7.method2449()];
				@Pc(64) int local64;
				for (@Pc(51) int local51 = 0; local51 < local49.length; local51 += local64) {
					local64 = local7.method2451(local51, local49.length - local51, local49);
					if (local64 == -1) {
						throw new IOException("EOF");
					}
				}
				Static323.method4984(new Class6_Sub12(local49));
			}
		} catch (@Pc(93) Exception local93) {
		}
		try {
			if (local7 != null) {
				local7.method2453();
			}
		} catch (@Pc(100) Exception local100) {
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I[BLjava/lang/String;I)I")
	public static int method4044(@OriginalArg(1) byte[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg1.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12 += 4) {
			@Pc(20) int local20 = Static506.method5545(arg1.charAt(local12));
			@Pc(35) int local35 = local12 + 1 < local10 ? Static506.method5545(arg1.charAt(local12 + 1)) : -1;
			@Pc(50) int local50 = local10 <= local12 + 2 ? -1 : Static506.method5545(arg1.charAt(local12 + 2));
			@Pc(65) int local65 = local10 > local12 + 3 ? Static506.method5545(arg1.charAt(local12 + 3)) : -1;
			arg0[arg2++] = (byte) (local35 >>> 4 | local20 << 2);
			if (local50 == -1) {
				break;
			}
			arg0[arg2++] = (byte) (local50 >>> 2 | (local35 & 0xF) << 4);
			if (local65 == -1) {
				break;
			}
			arg0[arg2++] = (byte) ((local50 & 0x3) << 6 | local65);
		}
		return arg2;
	}
}
