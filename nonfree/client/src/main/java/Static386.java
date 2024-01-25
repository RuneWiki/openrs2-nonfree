import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!te", name = "h", descriptor = "I")
	public static int anInt6594;

	@OriginalMember(owner = "client!te", name = "m", descriptor = "I")
	public static int anInt6598;

	@OriginalMember(owner = "client!te", name = "n", descriptor = "[[S")
	public static short[][] aShortArrayArray8;

	@OriginalMember(owner = "client!te", name = "b", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_90 = new Class27(5, 4);

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
	public static void method5170() {
		@Pc(11) Class108 local11 = null;
		try {
			@Pc(17) Class270 local17 = Static171.aClass159_1.method3514("3", false);
			while (local17.anInt7548 == 0) {
				Static328.method5696(1L);
			}
			if (local17.anInt7548 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local11 = (Class108) local17.anObject9;
			@Pc(46) byte[] local46 = new byte[(int) local11.method2645()];
			if (local46.length == 0) {
				Static410.aString69 = "";
				Static384.aString62 = "";
			} else {
				@Pc(63) int local63;
				for (@Pc(51) int local51 = 0; local51 < local46.length; local51 += local63) {
					local63 = local11.method2646(local51, local46, local46.length - local51);
					if (local63 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(89) Class10_Sub8 local89 = new Class10_Sub8(local46);
				@Pc(93) int local93 = local89.method2502();
				if (local93 > 50) {
					throw new RuntimeException("Bad length");
				}
				local89.anInt2989 = local93 + 1;
				if (!local89.method2511()) {
					throw new RuntimeException("Invalid CRC");
				}
				local89.anInt2989 = 1;
				@Pc(122) int local122 = local89.method2502();
				if (local122 != 0) {
					throw new RuntimeException("Invalid version " + local122);
				}
				Static384.aString62 = local89.method2499();
				Static410.aString69 = local89.method2499();
			}
		} catch (@Pc(154) Exception local154) {
			Static384.aString62 = "";
			Static410.aString69 = "";
		}
		try {
			if (local11 != null) {
				local11.method2643();
			}
		} catch (@Pc(165) Exception local165) {
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!nd;I)V")
	public static void method5171(@OriginalArg(0) Class40_Sub5 arg0) {
		arg0.aClass24_1 = null;
		@Pc(12) int local12 = arg0.aClass40_Sub8Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass40_Sub8Array1[local14].aBoolean362 = false;
		}
		@Pc(28) Class240[] local28 = Class10_Sub2_Sub28.aClass240Array1;
		synchronized (Class10_Sub2_Sub28.aClass240Array1) {
			if (local12 < Class10_Sub2_Sub28.aClass240Array1.length && Static136.anIntArray279[local12] < 200) {
				Class10_Sub2_Sub28.aClass240Array1[local12].method5225(arg0);
				@Pc(49) int local49 = Static136.anIntArray279[local12]++;
			}
		}
	}
}
