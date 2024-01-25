import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!ns", name = "k", descriptor = "F")
	public static float aFloat119;

	@OriginalMember(owner = "client!ns", name = "o", descriptor = "[I")
	public static final int[] anIntArray400 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IJB)Ljava/lang/String;")
	public static String method5922(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		Static589.method8459(arg1);
		@Pc(16) int local16 = Static242.aCalendar2.get(5);
		@Pc(20) int local20 = Static242.aCalendar2.get(2);
		@Pc(24) int local24 = Static242.aCalendar2.get(1);
		return arg0 == 3 ? Static501.method7169(arg0, arg1) : Integer.toString(local16 / 10) + local16 % 10 + "-" + Static298.aStringArrayArray3[arg0][local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(B)V")
	public static void method5923() {
		if (Static517.aFrame1 != null) {
			return;
		}
		@Pc(11) int local11 = Static211.anInt3445;
		@Pc(13) int local13 = Static228.anInt3709;
		@Pc(20) int local20 = Static340.anInt6053 - Static70.anInt1125 - local11;
		@Pc(32) int local32 = Static584.anInt9793 - Static631.anInt10283 - local13;
		if (local11 <= 0 && local20 <= 0 && local13 <= 0 && local32 <= 0) {
			return;
		}
		try {
			@Pc(60) Container local60;
			if (Static675.aFrame3 != null) {
				local60 = Static675.aFrame3;
			} else if (Static492.anApplet2 == null) {
				local60 = Static361.anApplet_Sub1_1;
			} else {
				local60 = Static492.anApplet2;
			}
			@Pc(70) int local70 = 0;
			@Pc(72) int local72 = 0;
			if (Static675.aFrame3 == local60) {
				@Pc(78) Insets local78 = Static675.aFrame3.getInsets();
				local70 = local78.left;
				local72 = local78.top;
			}
			@Pc(87) Graphics local87 = local60.getGraphics();
			local87.setColor(Color.black);
			if (local11 > 0) {
				local87.fillRect(local70, local72, local11, Static584.anInt9793);
			}
			if (local13 > 0) {
				local87.fillRect(local70, local72, Static340.anInt6053, local13);
			}
			if (local20 > 0) {
				local87.fillRect(local70 + Static340.anInt6053 - local20, local72, local20, Static584.anInt9793);
			}
			if (local32 > 0) {
				local87.fillRect(local70, Static584.anInt9793 + local72 - local32, Static340.anInt6053, local32);
				return;
			}
		} catch (@Pc(149) Exception local149) {
			return;
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IBLclient!ub;)Z")
	public static boolean method5924(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub23_Sub2 arg1) {
		@Pc(8) int local8 = arg1.method8550(2);
		@Pc(32) int local32;
		@Pc(37) int local37;
		@Pc(114) int local114;
		@Pc(118) int local118;
		@Pc(124) int local124;
		if (local8 == 0) {
			if (arg1.method8550(1) != 0) {
				method5924(arg0, arg1);
			}
			local32 = arg1.method8550(6);
			local37 = arg1.method8550(6);
			@Pc(50) boolean local50 = arg1.method8550(1) == 1;
			if (local50) {
				Static129.anIntArray122[Static226.anInt3673++] = arg0;
			}
			if (Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(78) Class136 local78 = Static601.aClass136Array1[arg0];
			@Pc(86) Class8_Sub1_Sub3_Sub2_Sub1 local86 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[arg0] = new Class8_Sub1_Sub3_Sub2_Sub1();
			local86.anInt6994 = arg0;
			if (Static526.aClass5_Sub23Array1[arg0] != null) {
				local86.method3604(Static526.aClass5_Sub23Array1[arg0]);
			}
			local86.method5995(local78.anInt2997, true);
			local86.anInt7041 = local78.anInt2998;
			local114 = local78.anInt2999;
			local118 = local114 >> 28;
			local124 = local114 >> 14 & 0xFF;
			@Pc(128) int local128 = local114 & 0xFF;
			@Pc(138) int local138 = (local124 << 6) - (Static622.anInt10188 - local32);
			@Pc(147) int local147 = local37 + (local128 << 6) - Static668.anInt10683;
			local86.aBoolean328 = local78.aBoolean252;
			local86.aBoolean325 = local78.aBoolean251;
			local86.aByteArray64[0] = Static10.aByteArray1[arg0];
			local86.aByte145 = local86.aByte146 = (byte) local118;
			if (Static90.method1353(1, local147, local138)) {
				local86.aByte146++;
			}
			local86.method3606(local138, local147);
			local86.aBoolean329 = false;
			Static601.aClass136Array1[arg0] = null;
			return true;
		} else if (local8 == 1) {
			local32 = arg1.method8550(2);
			local37 = Static601.aClass136Array1[arg0].anInt2999;
			Static601.aClass136Array1[arg0].anInt2999 = ((local32 + (local37 >> 28) & 0x3) << 28) + (local37 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(245) int local245;
			@Pc(250) int local250;
			@Pc(259) int local259;
			if (local8 != 2) {
				local32 = arg1.method8550(18);
				local37 = local32 >> 16;
				local245 = local32 >> 8 & 0xFF;
				local250 = local32 & 0xFF;
				local259 = Static601.aClass136Array1[arg0].anInt2999;
				local114 = local37 + (local259 >> 28) & 0x3;
				local118 = local245 + (local259 >> 14) & 0xFF;
				local124 = local259 + local250 & 0xFF;
				Static601.aClass136Array1[arg0].anInt2999 = (local114 << 28) + (local118 << 14) + local124;
				return false;
			}
			local32 = arg1.method8550(5);
			local37 = local32 >> 3;
			local245 = local32 & 0x7;
			local250 = Static601.aClass136Array1[arg0].anInt2999;
			local259 = (local250 >> 28) + local37 & 0x3;
			local114 = local250 >> 14 & 0xFF;
			local118 = local250 & 0xFF;
			if (local245 == 0) {
				local114--;
				local118--;
			}
			if (local245 == 1) {
				local118--;
			}
			if (local245 == 2) {
				local114++;
				local118--;
			}
			if (local245 == 3) {
				local114--;
			}
			if (local245 == 4) {
				local114++;
			}
			if (local245 == 5) {
				local114--;
				local118++;
			}
			if (local245 == 6) {
				local118++;
			}
			if (local245 == 7) {
				local118++;
				local114++;
			}
			Static601.aClass136Array1[arg0].anInt2999 = local118 + (local259 << 28) + (local114 << 14);
			return false;
		}
	}
}
