import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
	public static int anInt2300;

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_64 = new Class119(50);

	@OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
	public static int anInt2295 = -1;

	@OriginalMember(owner = "client!ge", name = "R", descriptor = "J")
	public static long aLong67 = 0L;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([ILclient!qm;B[I[I)V")
	public static void method2253(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class62_Sub1_Sub2_Sub1 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(12) int local12 = 0; local12 < arg2.length; local12++) {
			@Pc(18) int local18 = arg2[local12];
			@Pc(22) int local22 = arg0[local12];
			@Pc(26) int local26 = arg3[local12];
			for (@Pc(28) int local28 = 0; local22 != 0 && arg1.aClass103Array3.length > local28; local28++) {
				if ((local22 & 0x1) != 0) {
					if (local18 == -1) {
						arg1.aClass103Array3[local28] = null;
					} else {
						@Pc(49) Class107 local49 = Static212.method3773(local18);
						@Pc(52) int local52 = local49.anInt3273;
						@Pc(57) Class103 local57 = arg1.aClass103Array3[local28];
						if (local57 != null) {
							if (local57.anInt3236 == local18) {
								if (local52 == 0) {
									local57 = arg1.aClass103Array3[local28] = null;
								} else if (local52 == 1) {
									local57.anInt3239 = 1;
									local57.anInt3237 = 0;
									local57.anInt3241 = 0;
									local57.anInt3240 = 0;
									local57.anInt3242 = local26;
									Static343.method5928(false, local49, arg1.anInt5289, 0, arg1.anInt5280);
								} else if (local52 == 2) {
									local57.anInt3241 = 0;
								}
							} else if (local49.anInt3287 >= Static212.method3773(local57.anInt3236).anInt3287) {
								local57 = arg1.aClass103Array3[local28] = null;
							}
						}
						if (local57 == null) {
							local57 = arg1.aClass103Array3[local28] = new Class103();
							local57.anInt3239 = 1;
							local57.anInt3241 = 0;
							local57.anInt3236 = local18;
							local57.anInt3237 = 0;
							local57.anInt3242 = local26;
							local57.anInt3240 = 0;
							Static343.method5928(false, local49, arg1.anInt5289, 0, arg1.anInt5280);
						}
					}
				}
				local22 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
	public static String method2255(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(25) int local25 = 0;
			for (@Pc(27) long local27 = arg0; local27 != 0L; local27 /= 37L) {
				local25++;
			}
			@Pc(48) StringBuffer local48 = new StringBuffer(local25);
			while (arg0 != 0L) {
				@Pc(52) long local52 = arg0;
				arg0 /= 37L;
				@Pc(66) char local66 = Static337.aCharArray15[(int) (local52 - arg0 * 37L)];
				if (local66 == '_') {
					@Pc(76) int local76 = local48.length() - 1;
					local66 = ' ';
					local48.setCharAt(local76, Character.toUpperCase(local48.charAt(local76)));
				}
				local48.append(local66);
			}
			local48.reverse();
			local48.setCharAt(0, Character.toUpperCase(local48.charAt(0)));
			return local48.toString();
		}
	}
}
