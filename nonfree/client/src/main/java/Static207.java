import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString29;

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_53 = new Class267("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
	public static int anInt3852 = 0;

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
	public static int anInt3860 = 20;

	@OriginalMember(owner = "client!ke", name = "q", descriptor = "[I")
	public static int[] anIntArray278 = new int[1];

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method3180(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(8) Class6_Sub2_Sub7 local8 = Static212.method3218(arg0, 3);
		local8.method3088();
		local8.aString28 = arg1;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZI)V")
	public static void method3181(@OriginalArg(1) int arg0) {
		@Pc(8) Class6_Sub2_Sub7 local8 = Static212.method3218(arg0, 12);
		local8.method3084();
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method3183(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BIIIII)V")
	public static void method3184(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static324.anInt5590 < arg4 || arg0 < Static172.anInt3442) {
			return;
		}
		@Pc(35) boolean local35;
		if (arg3 < Static165.anInt3313) {
			arg3 = Static165.anInt3313;
			local35 = false;
		} else if (arg3 > Static152.anInt3132) {
			local35 = false;
			arg3 = Static152.anInt3132;
		} else {
			local35 = true;
		}
		@Pc(56) boolean local56;
		if (Static165.anInt3313 > arg2) {
			local56 = false;
			arg2 = Static165.anInt3313;
		} else if (Static152.anInt3132 < arg2) {
			local56 = false;
			arg2 = Static152.anInt3132;
		} else {
			local56 = true;
		}
		if (Static172.anInt3442 <= arg4) {
			Static298.method4405(Static62.anIntArrayArray7[arg4++], arg1, arg2, arg3);
		} else {
			arg4 = Static172.anInt3442;
		}
		if (Static324.anInt5590 < arg0) {
			arg0 = Static324.anInt5590;
		} else {
			Static298.method4405(Static62.anIntArrayArray7[arg0--], arg1, arg2, arg3);
		}
		@Pc(115) int local115;
		if (local35 && local56) {
			for (local115 = arg4; local115 <= arg0; local115++) {
				@Pc(121) int[] local121 = Static62.anIntArrayArray7[local115];
				local121[arg3] = local121[arg2] = arg1;
			}
		} else if (local35) {
			for (local115 = arg4; local115 <= arg0; local115++) {
				Static62.anIntArrayArray7[local115][arg3] = arg1;
			}
		} else if (local56) {
			for (local115 = arg4; local115 <= arg0; local115++) {
				Static62.anIntArrayArray7[local115][arg2] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILclient!ts;IJIILclient!fs;I)V")
	public static void method3185(@OriginalArg(1) int arg0, @OriginalArg(2) Class239 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class22 arg6, @OriginalArg(8) int arg7) {
		@Pc(17) int local17 = arg2 * arg2 + arg4 * arg4;
		if (arg3 < (long) local17) {
			return;
		}
		@Pc(37) int local37 = Math.min(arg1.anInt6898 / 2, arg1.anInt6899 / 2);
		if (local37 * local37 >= local17) {
			Static231.method6536(arg0, arg2, arg6, arg4, Static340.aClass87Array16[arg7], arg5, arg1);
			return;
		}
		local37 -= 10;
		@Pc(58) int local58;
		if (Static429.anInt7656 == 4) {
			local58 = (int) Static265.aFloat51 & 0x3FFF;
		} else {
			local58 = (int) Static265.aFloat51 + Static439.anInt418 & 0x3FFF;
		}
		@Pc(69) int local69 = Class145.anIntArray279[local58];
		@Pc(73) int local73 = Class145.anIntArray280[local58];
		if (Static429.anInt7656 != 4) {
			local69 = local69 * 256 / (Static280.anInt5012 + 256);
			local73 = local73 * 256 / (Static280.anInt5012 + 256);
		}
		@Pc(104) int local104 = arg4 * local69 + arg2 * local73 >> 15;
		@Pc(115) int local115 = local73 * arg4 - local69 * arg2 >> 15;
		@Pc(121) double local121 = Math.atan2((double) local104, (double) local115);
		@Pc(128) int local128 = (int) ((double) local37 * Math.sin(local121));
		@Pc(135) int local135 = (int) (Math.cos(local121) * (double) local37);
		Static95.aClass87Array6[arg7].method6568((float) local128 + (float) arg1.anInt6898 / 2.0F + (float) arg5, (float) -local135 + (float) arg1.anInt6899 / 2.0F + (float) arg0, 4096, (int) (-local121 / 6.283185307179586D * 65535.0D));
	}
}
