import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "[Lclient!o;")
	public static Class80[] aClass80Array7;

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "[I")
	public static int[] anIntArray298;

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "S")
	public static short aShort42 = 1;

	@OriginalMember(owner = "client!hh", name = "k", descriptor = "Lclient!os;")
	public static final Class182 aClass182_110 = new Class182("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)[Lclient!je;")
	public static Class127[] method2606() {
		return new Class127[] { Static393.aClass127_18, Static97.aClass127_4, Static7.aClass127_1, Static295.aClass127_13, Static223.aClass127_12, Static259.aClass127_16, Static277.aClass127_14, Static72.aClass127_5, Static40.aClass127_2, Static426.aClass127_19, Static178.aClass127_9, Static114.aClass127_6, Static383.aClass127_17, Static348.aClass127_15 };
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZBLclient!ik;Z)V")
	public static void method2607(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class10_Sub21 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(16) int local16 = arg1.anInt3646;
		@Pc(20) int local20 = (int) arg1.aLong264;
		arg1.method6033();
		if (arg2) {
			Static176.method2939(local16);
		}
		Static149.method2573(local16);
		@Pc(35) Class89 local35 = Static40.method557(local20);
		if (local35 != null) {
			Static135.method5400(local35);
		}
		method2610();
		if (!arg0 && Static189.anInt3826 != -1) {
			Static209.method3246(Static189.anInt3826, 1);
		}
		@Pc(56) Class16 local56 = new Class16(Static114.aClass167_12);
		for (@Pc(61) Class10_Sub21 local61 = (Class10_Sub21) local56.method255(); local61 != null; local61 = (Class10_Sub21) local56.method256()) {
			if (!local61.method6034()) {
				local61 = (Class10_Sub21) local56.method255();
				if (local61 == null) {
					return;
				}
			}
			if (local61.anInt3643 == 3) {
				@Pc(85) int local85 = (int) local61.aLong264;
				if (local85 >>> 16 == local16) {
					method2607(arg0, local61, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIZ)Lclient!sd;")
	public static Class220 method2609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class220 local7 = new Class220();
		local7.anInt6189 = -1;
		local7.anInt6196 = -1;
		local7.anInt6177 = arg0 + 5 + 1;
		local7.anInt6190 = arg1 + 6;
		local7.anIntArrayArray56 = new int[local7.anInt6190][local7.anInt6177];
		local7.method4879();
		return local7;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
	public static void method2610() {
		for (@Pc(10) Class10_Sub45 local10 = (Class10_Sub45) Static70.aClass163_13.method3620(); local10 != null; local10 = (Class10_Sub45) Static70.aClass163_13.method3621()) {
			if (Static301.method4177(local10.anInt7505)) {
				Static31.method446(local10);
			}
		}
		if (Static207.anInt4055 == 1) {
			Static405.method5343();
			return;
		}
		Static457.method6059(Static226.anInt4217, Static279.anInt4882, Static361.anInt6151, Static270.anInt4755);
		@Pc(57) int local57 = Static450.aClass79_10.method1977(Static23.aClass182_247.method4155(Static191.anInt3842));
		for (@Pc(62) Class10_Sub45 local62 = (Class10_Sub45) Static70.aClass163_13.method3620(); local62 != null; local62 = (Class10_Sub45) Static70.aClass163_13.method3621()) {
			@Pc(68) int local68 = Static289.method4076(local62);
			if (local68 > local57) {
				local57 = local68;
			}
		}
		Static226.anInt4217 = local57 + 8;
		Static361.anInt6151 = (Static39.aBoolean44 ? 26 : 22) + Static207.anInt4055 * 16;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
	public static void method2611() {
		Static166.aClass89ArrayArray2 = new Class89[Static348.aClass187_107.method4302()][];
		Static61.aClass89ArrayArray1 = new Class89[Static348.aClass187_107.method4302()][];
		Static416.aBooleanArray22 = new boolean[Static348.aClass187_107.method4302()];
	}
}
