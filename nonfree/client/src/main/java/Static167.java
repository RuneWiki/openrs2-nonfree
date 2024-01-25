import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "Lclient!re;")
	public static Class250 aClass250_4;

	@OriginalMember(owner = "client!gq", name = "f", descriptor = "J")
	public static long aLong94;

	@OriginalMember(owner = "client!gq", name = "g", descriptor = "I")
	public static int anInt3663;

	@OriginalMember(owner = "client!gq", name = "h", descriptor = "I")
	public static int anInt3664;

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "Lclient!h;")
	public static final Class114 aClass114_76 = new Class114("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!vp;ILclient!pa;ILclient!ha;III)V")
	public static void method3274(@OriginalArg(0) Class309 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class23 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(22) int local22;
		if (Static464.anInt8003 == 4) {
			local22 = (int) Static443.aFloat151 & 0x3FFF;
		} else {
			local22 = Static96.anInt2375 + (int) Static443.aFloat151 & 0x3FFF;
		}
		@Pc(40) int local40 = Math.max(arg0.anInt8790 / 2, arg0.anInt8752 / 2) + 10;
		@Pc(49) int local49 = arg1 * arg1 + arg5 * arg5;
		if (local40 * local40 < local49) {
			return;
		}
		@Pc(59) int local59 = Class307.anIntArray744[local22];
		@Pc(63) int local63 = Class307.anIntArray743[local22];
		if (Static464.anInt8003 != 4) {
			local63 = local63 * 256 / (Static189.anInt4000 + 256);
			local59 = local59 * 256 / (Static189.anInt4000 + 256);
		}
		@Pc(93) int local93 = arg5 * local59 + arg1 * local63 >> 15;
		@Pc(104) int local104 = arg5 * local63 - local59 * arg1 >> 15;
		arg4.method7194(arg6 + arg0.anInt8790 / 2 + local93 - arg4.EA() / 2, -local104 + arg0.anInt8752 / 2 + arg3 + -(arg4.ma() / 2), arg2, arg6, arg3);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)[Lclient!j;")
	public static Class143[] method3275() {
		return new Class143[] { Static203.aClass143_1, Static203.aClass143_2, Static203.aClass143_3, Static203.aClass143_4, Static203.aClass143_5, Static203.aClass143_6, Static203.aClass143_7, Static203.aClass143_8, Static203.aClass143_9, Static203.aClass143_10, Static203.aClass143_11, Static203.aClass143_12, Static203.aClass143_13, Static203.aClass143_14 };
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)Lclient!sm;")
	public static Class47_Sub3 method3276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class206 local7 = Static313.aClass206ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass47_Sub3_1 == null ? null : local7.aClass47_Sub3_1;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lclient!ie;")
	public static Class1_Sub22 method3277(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(11) Class local11 = Class.forName("Class1_Sub22_Sub1");
			@Pc(15) Class1_Sub22 local15 = (Class1_Sub22) local11.getDeclaredConstructor().newInstance();
			local15.method5315(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class1_Sub22_Sub2 local26 = new Class1_Sub22_Sub2();
			local26.method5315(arg0);
			return local26;
		}
	}
}
