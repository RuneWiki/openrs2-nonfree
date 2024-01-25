import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!kq", name = "j", descriptor = "Lclient!kj;")
	public static Class202 aClass202_4;

	@OriginalMember(owner = "client!kq", name = "l", descriptor = "Z")
	public static boolean aBoolean397;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "Lclient!dk;")
	public static final Class5_Sub18 aClass5_Sub18_1 = new Class5_Sub18(0, 0);

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "S")
	public static short aShort76 = 32767;

	@OriginalMember(owner = "client!kq", name = "i", descriptor = "Lclient!ks;")
	public static final Class209 aClass209_5 = new Class209("", 15);

	@OriginalMember(owner = "client!kq", name = "k", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_175 = new Class196(115, 8);

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IBILclient!ts;B)V")
	public static void method4823(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class41_Sub1_Sub1_Sub3_Sub2 arg2) {
		@Pc(12) int local12 = arg2.anIntArray528[0];
		@Pc(17) int local17 = arg2.anIntArray527[0];
		if (local12 < 0 || local12 >= Static124.anInt2150 || local17 < 0 || local17 >= Static64.anInt1015 || (arg1 < 0 || arg1 >= Static124.anInt2150 || arg0 < 0 || arg0 >= Static64.anInt1015)) {
			return;
		}
		@Pc(73) int local73 = Static170.method2525(arg1, 0, 0, local12, -4, Static137.aClass234Array1[arg2.aByte149], Static273.anIntArray256, 0, 0, true, Static502.anIntArray465, local17, arg2.method7917(), arg0);
		if (local73 >= 1 && local73 <= 3) {
			for (@Pc(85) int local85 = 0; local85 < local73 - 1; local85++) {
				arg2.method7938(Static502.anIntArray465[local85], (byte) 2, Static273.anIntArray256[local85]);
			}
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method4824() {
		@Pc(5) String local5 = "www";
		if (Static99.aClass267_3 == Static206.aClass267_4) {
			local5 = "www-wtrc";
		} else if (Static67.aClass267_1 == Static99.aClass267_3) {
			local5 = "www-wtqa";
		} else if (Static99.aClass267_3 == Static619.aClass267_7) {
			local5 = "www-wtwip";
		}
		@Pc(32) String local32 = "";
		if (Static471.aString82 != null) {
			local32 = "/p=" + Static471.aString82;
		}
		return "http://" + local5 + "." + Static591.aClass174_7.aString37 + ".com/l=" + Static259.anInt4113 + "/a=" + Static312.anInt5547 + local32 + "/";
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method4825(@OriginalArg(0) Class143 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static305.aBoolean315) {
			local7 = Static304.method4150();
			local9 = Static563.method7702();
		}
		Static262.method3624(local9 + Static676.anInt9309, arg0, Static575.anInt9376, Static342.anInt6177, Static73.anInt1175 + local7);
		Static32.aClass72_2.method6925(local9 + Static676.anInt9309 + 14, Static49.aClass42_24.method730(Static259.anInt4113), Static73.anInt1175 + local7 + 3, -1, -10660793);
		@Pc(62) int local62 = Static178.aClass111_1.method8703() + local7;
		@Pc(73) int local73 = local9 + Static178.aClass111_1.method8696();
		@Pc(77) int local77;
		@Pc(99) int local99;
		if (Static530.aBoolean634) {
			local77 = 0;
			for (@Pc(134) Class5_Sub2_Sub5 local134 = (Class5_Sub2_Sub5) Static600.aClass150_16.method3100(); local134 != null; local134 = (Class5_Sub2_Sub5) Static600.aClass150_16.method3096()) {
				local99 = local77 * 16 + local9 + Static676.anInt9309 + 31;
				local77++;
				if (local134.anInt2821 == 1) {
					Static605.method8127(arg0, (Class5_Sub2_Sub13) local134.aClass150_3.aClass5_Sub2_24.aClass5_Sub2_67, Static73.anInt1175 + local7, local73, Static575.anInt9376, local99, -1, Static342.anInt6177, Static676.anInt9309 + local9, -256, local62);
				} else {
					Static105.method1744(local9 + Static676.anInt9309, local62, Static575.anInt9376, Static342.anInt6177, local99, local73, arg0, local7 + Static73.anInt1175, -256, local134, -1);
				}
			}
			if (Static303.aClass5_Sub2_Sub5_1 != null) {
				Static262.method3624(Static212.anInt3404, arg0, Static360.anInt6296, Static469.anInt8171, Static501.anInt8524);
				Static32.aClass72_2.method6925(Static212.anInt3404 + 14, Static303.aClass5_Sub2_Sub5_1.aString27, Static501.anInt8524 + 3, -1, -10660793);
				local77 = 0;
				for (@Pc(234) Class5_Sub2_Sub13 local234 = (Class5_Sub2_Sub13) Static303.aClass5_Sub2_Sub5_1.aClass150_3.method3100(); local234 != null; local234 = (Class5_Sub2_Sub13) Static303.aClass5_Sub2_Sub5_1.aClass150_3.method3096()) {
					@Pc(244) int local244 = local77 * 16 + Static212.anInt3404 + 31;
					Static605.method8127(arg0, local234, Static501.anInt8524, local73, Static360.anInt6296, local244, -1, Static469.anInt8171, Static212.anInt3404, -256, local62);
					local77++;
				}
				Static391.method5695(Static360.anInt6296, Static501.anInt8524, Static212.anInt3404, Static469.anInt8171);
			}
		} else {
			local77 = 0;
			for (@Pc(82) Class5_Sub2_Sub13 local82 = (Class5_Sub2_Sub13) Static153.aClass124_24.method2572(); local82 != null; local82 = (Class5_Sub2_Sub13) Static153.aClass124_24.method2569()) {
				local99 = (Static223.anInt3566 - local77 - 1) * 16 + local9 + Static676.anInt9309 + 31;
				local77++;
				Static605.method8127(arg0, local82, Static73.anInt1175 + local7, local73, Static575.anInt9376, local99, -1, Static342.anInt6177, local9 + Static676.anInt9309, -256, local62);
			}
		}
		Static391.method5695(Static575.anInt9376, local7 + Static73.anInt1175, local9 + Static676.anInt9309, Static342.anInt6177);
	}
}
