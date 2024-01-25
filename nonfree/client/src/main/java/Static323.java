import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!mfa", name = "s", descriptor = "Ljava/lang/Object;")
	public static Object anObject60;

	@OriginalMember(owner = "client!mfa", name = "j", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_179 = new Class298(36, 7);

	@OriginalMember(owner = "client!mfa", name = "l", descriptor = "[S")
	private static final short[] aShortArray296 = new short[] { 962, 20423, -21582, 11214, -10295 };

	@OriginalMember(owner = "client!mfa", name = "m", descriptor = "[S")
	private static final short[] aShortArray297 = new short[] { 957, 20418, -21587, 11209, -10300 };

	@OriginalMember(owner = "client!mfa", name = "o", descriptor = "[S")
	private static final short[] aShortArray298 = new short[] { 967, 20428, -21577, 11219, -10290 };

	@OriginalMember(owner = "client!mfa", name = "y", descriptor = "[S")
	private static final short[] aShortArray299 = new short[] { 952, 20413, -21592, 11204, -10305 };

	@OriginalMember(owner = "client!mfa", name = "C", descriptor = "[[S")
	public static final short[][] aShortArrayArray85 = new short[][] { aShortArray298, aShortArray296, aShortArray297, aShortArray299 };

	@OriginalMember(owner = "client!mfa", name = "H", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_271 = new Class272(71, 1);

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "(II)I")
	public static int method7768(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local12 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local12 == 19 || local12 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!mfa", name = "g", descriptor = "(I)V")
	public static void method7772() {
		@Pc(7) Class235 local7 = null;
		try {
			@Pc(13) Class192 local13 = Static409.aClass221_6.method5200("2", true);
			while (local13.anInt5186 == 0) {
				Static374.method5521(1L);
			}
			if (local13.anInt5186 == 1) {
				local7 = (Class235) local13.anObject30;
				@Pc(37) byte[] local37 = new byte[(int) local7.method5483()];
				@Pc(52) int local52;
				for (@Pc(39) int local39 = 0; local39 < local37.length; local39 += local52) {
					local52 = local7.method5490(local37, local39, local37.length - local39);
					if (local52 == -1) {
						throw new IOException("EOF");
					}
				}
				Static267.method4356(new Class3_Sub11(local37));
			}
		} catch (@Pc(79) Exception local79) {
		}
		try {
			if (local7 != null) {
				local7.method5488();
			}
		} catch (@Pc(86) Exception local86) {
		}
	}
}
