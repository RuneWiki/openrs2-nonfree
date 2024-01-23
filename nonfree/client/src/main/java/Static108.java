import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!l", name = "V", descriptor = "I")
	public static int anInt2506;

	@OriginalMember(owner = "client!l", name = "W", descriptor = "[Lclient!r;")
	public static Class73[] aClass73Array4;

	@OriginalMember(owner = "client!l", name = "X", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!l", name = "T", descriptor = "Lclient!kh;")
	public static Class60 aClass60_809 = null;

	@OriginalMember(owner = "client!l", name = "Y", descriptor = "Lclient!kh;")
	public static Class60 aClass60_810 = Static200.method3116("<col=ffffff>");

	@OriginalMember(owner = "client!l", name = "bb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_811 = Static200.method3116("<col=ff3000>");

	@OriginalMember(owner = "client!l", name = "db", descriptor = "Lclient!kh;")
	public static Class60 aClass60_812 = Static200.method3116("");

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIBII)V")
	public static void method1886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 0 || arg6 < 0 || arg1 >= 103 || arg6 >= 103) {
			return;
		}
		@Pc(41) int local41;
		if (arg5 == 0) {
			@Pc(31) Class47 local31 = Static32.method597(arg2, arg1, arg6);
			if (local31 != null) {
				local41 = Integer.MAX_VALUE & (int) (local31.aLong58 >>> 32);
				if (arg3 == 2) {
					local31.aClass9_4 = new Class9_Sub3(local41, 2, arg4 + 4, arg2, arg1, arg6, arg0, false, local31.aClass9_4);
					local31.aClass9_5 = new Class9_Sub3(local41, 2, arg4 + 1 & 0x3, arg2, arg1, arg6, arg0, false, local31.aClass9_5);
				} else {
					local31.aClass9_4 = new Class9_Sub3(local41, arg3, arg4, arg2, arg1, arg6, arg0, false, local31.aClass9_4);
				}
			}
		}
		if (arg5 == 1) {
			@Pc(108) Class106 local108 = Static4.method79(arg2, arg1, arg6);
			if (local108 != null) {
				local41 = Integer.MAX_VALUE & (int) (local108.aLong141 >>> 32);
				if (arg3 == 4 || arg3 == 5) {
					local108.aClass9_10 = new Class9_Sub3(local41, 4, arg4, arg2, arg1, arg6, arg0, false, local108.aClass9_10);
				} else if (arg3 == 6) {
					local108.aClass9_10 = new Class9_Sub3(local41, 4, arg4 + 4, arg2, arg1, arg6, arg0, false, local108.aClass9_10);
				} else if (arg3 == 7) {
					local108.aClass9_10 = new Class9_Sub3(local41, 4, (arg4 + 2 & 0x3) + 4, arg2, arg1, arg6, arg0, false, local108.aClass9_10);
				} else if (arg3 == 8) {
					local108.aClass9_10 = new Class9_Sub3(local41, 4, arg4 + 4, arg2, arg1, arg6, arg0, false, local108.aClass9_10);
					local108.aClass9_11 = new Class9_Sub3(local41, 4, (arg4 + 2 & 0x3) + 4, arg2, arg1, arg6, arg0, false, local108.aClass9_11);
				}
			}
		}
		if (arg5 == 2) {
			if (arg3 == 11) {
				arg3 = 10;
			}
			@Pc(245) Class29 local245 = Static172.method2789(arg2, arg1, arg6);
			if (local245 != null) {
				local245.aClass9_3 = new Class9_Sub3(Integer.MAX_VALUE & (int) (local245.aLong43 >>> 32), arg3, arg4, arg2, arg1, arg6, arg0, false, local245.aClass9_3);
			}
		}
		if (arg5 == 3) {
			@Pc(276) Class16 local276 = Static66.method1180(arg2, arg1, arg6);
			if (local276 != null) {
				local276.aClass9_2 = new Class9_Sub3(Integer.MAX_VALUE & (int) (local276.aLong22 >>> 32), 22, arg4, arg2, arg1, arg6, arg0, false, local276.aClass9_2);
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!ve;IIIII)V")
	public static void method1887(@OriginalArg(1) Class9_Sub4 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static82.method1451(arg0.anInt3925, arg2, arg0.anInt3903, arg3, arg1);
	}
}
