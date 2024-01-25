import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "Z")
	public static boolean aBoolean260;

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "F")
	public static float aFloat50;

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "Lclient!vh;")
	public static Class7 aClass7_2;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "Lclient!ms;")
	public static final Class162 aClass162_1 = new Class162();

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "[I")
	public static int[] anIntArray257 = new int[2];

	@OriginalMember(owner = "client!hn", name = "h", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray10 = new int[2][][];

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIILjava/lang/Object;)[B")
	public static byte[] method2736(@OriginalArg(2) int arg0, @OriginalArg(3) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return Static402.method5437(local13, arg0);
		} else if (arg1 instanceof Class43) {
			@Pc(30) Class43 local30 = (Class43) arg1;
			return local30.method5204(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V")
	public static void method2737() {
		@Pc(14) int local14 = (int) ((double) Static399.anInt6923 * 34.46D);
		local14 <<= 0x0;
		if (Static266.aClass75_7.method2589()) {
			local14 += 128;
		}
		Static266.aClass75_7.JA(50, local14);
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(Z)Z")
	public static boolean method2738(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static205.anInt4114; local1 < Static281.anInt5169; local1++) {
			@Pc(6) Class217[][] local6 = Static151.aClass217ArrayArrayArray3[local1];
			for (@Pc(9) int local9 = -Static251.anInt4730; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static444.anInt7531 + local9;
				@Pc(18) int local18 = Static444.anInt7531 - local9;
				if (local14 >= Static16.anInt537 || local18 < Static454.anInt7692) {
					for (@Pc(27) int local27 = -Static251.anInt4730; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static340.anInt6288 + local27;
						@Pc(36) int local36 = Static340.anInt6288 - local27;
						@Pc(48) Class217 local48;
						if (local14 >= Static16.anInt537) {
							if (local32 >= Static341.anInt6226) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean466) {
									Static320.aBoolean413 = arg0;
									Static137.aClass6_1.method4737(local48);
									Static137.aClass6_1.method4729();
								}
							}
							if (local36 < Static169.anInt3554) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean466) {
									Static320.aBoolean413 = arg0;
									Static137.aClass6_1.method4737(local48);
									Static137.aClass6_1.method4729();
								}
							}
						}
						if (local18 < Static454.anInt7692) {
							if (local32 >= Static341.anInt6226) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean466) {
									Static320.aBoolean413 = arg0;
									Static137.aClass6_1.method4737(local48);
									Static137.aClass6_1.method4729();
								}
							}
							if (local36 < Static169.anInt3554) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean466) {
									Static320.aBoolean413 = arg0;
									Static137.aClass6_1.method4737(local48);
									Static137.aClass6_1.method4729();
								}
							}
						}
						if (Static291.anInt5336 == 0) {
							if (Static283.aBoolean384) {
								Static137.aClass6_1.method4736(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}
