import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!cf", name = "x", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "Lclient!lf;")
	public static Class49 aClass49_312 = Static32.method683("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!cf", name = "y", descriptor = "Lclient!lf;")
	public static Class49 aClass49_313 = Static32.method683("<col=ff3000>");

	@OriginalMember(owner = "client!cf", name = "B", descriptor = "[I")
	public static int[] anIntArray48 = new int[100];

	@OriginalMember(owner = "client!cf", name = "Q", descriptor = "Lclient!lf;")
	private static Class49 aClass49_315 = Static32.method683("Walk here");

	@OriginalMember(owner = "client!cf", name = "K", descriptor = "Lclient!lf;")
	public static Class49 aClass49_314 = aClass49_315;

	@OriginalMember(owner = "client!cf", name = "L", descriptor = "Z")
	public static boolean aBoolean20 = false;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V")
	public static void method459() {
		anIntArray48 = null;
		aFontMetrics1 = null;
		aClass49_312 = null;
		aClass49_313 = null;
		aClass49_314 = null;
		aClass49_315 = null;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBI)I")
	public static int method460(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = (arg0 & 0x7F) * arg1 >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 0xFF80) + arg1;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZI)Z")
	public static boolean method461(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		@Pc(22) Class2_Sub2_Sub9 local22 = Static124.method2146(arg1);
		return local22.method1198(arg0);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZLjava/lang/Object;B)[B")
	public static byte[] method462(@OriginalArg(0) boolean arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static75.method1222(local13) : local13;
		} else if (arg1 instanceof Class68) {
			@Pc(27) Class68 local27 = (Class68) arg1;
			return local27.method2880();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!ke;Lclient!ja;II)V")
	public static void method463(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class2_Sub13 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class2_Sub24 local9 = new Class2_Sub24();
		local9.anInt3678 = arg1.method2962();
		local9.anInt3677 = arg1.method2946();
		local9.aClass16Array2 = new Class16[local9.anInt3678];
		local9.aByteArrayArrayArray8 = new byte[local9.anInt3678][][];
		local9.anIntArray326 = new int[local9.anInt3678];
		local9.anIntArray324 = new int[local9.anInt3678];
		local9.aClass16Array1 = new Class16[local9.anInt3678];
		local9.anIntArray325 = new int[local9.anInt3678];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt3678; local51++) {
			try {
				@Pc(57) int local57 = arg1.method2962();
				@Pc(84) String local84;
				@Pc(93) String local93;
				@Pc(97) int local97;
				if (local57 == 0 || local57 == 1 || local57 == 2) {
					local84 = new String(arg1.method2926().method1674());
					local93 = new String(arg1.method2926().method1674());
					local97 = 0;
					if (local57 == 1) {
						local97 = arg1.method2946();
					}
					local9.anIntArray325[local51] = local57;
					local9.anIntArray326[local51] = local97;
					local9.aClass16Array1[local51] = arg0.method1482(Static29.method551(local84), local93);
				} else if (local57 == 3 || local57 == 4) {
					local84 = new String(arg1.method2926().method1674());
					local93 = new String(arg1.method2926().method1674());
					local97 = arg1.method2962();
					@Pc(100) String[] local100 = new String[local97];
					for (@Pc(102) int local102 = 0; local102 < local97; local102++) {
						local100[local102] = new String(arg1.method2926().method1674());
					}
					@Pc(122) byte[][] local122 = new byte[local97][];
					@Pc(133) int local133;
					if (local57 == 3) {
						for (@Pc(127) int local127 = 0; local127 < local97; local127++) {
							local133 = arg1.method2946();
							local122[local127] = new byte[local133];
							arg1.method2947(local122[local127], local133);
						}
					}
					@Pc(157) Class[] local157 = new Class[local97];
					local9.anIntArray325[local51] = local57;
					for (local133 = 0; local133 < local97; local133++) {
						local157[local133] = Static29.method551(local100[local133]);
					}
					local9.aClass16Array2[local51] = arg0.method1487(local93, local157, Static29.method551(local84));
					local9.aByteArrayArrayArray8[local51] = local122;
				}
			} catch (@Pc(247) ClassNotFoundException local247) {
				local9.anIntArray324[local51] = -1;
			} catch (@Pc(254) SecurityException local254) {
				local9.anIntArray324[local51] = -2;
			} catch (@Pc(261) NullPointerException local261) {
				local9.anIntArray324[local51] = -3;
			} catch (@Pc(268) Exception local268) {
				local9.anIntArray324[local51] = -4;
			} catch (@Pc(275) Throwable local275) {
				local9.anIntArray324[local51] = -5;
			}
		}
		Static182.aClass81_15.method2683(local9);
	}
}
