import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!iea", name = "e", descriptor = "[F")
	public static final float[] aFloatArray13 = new float[4];

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(IILclient!sha;Lclient!da;Lclient!hw;IIILjava/lang/String;Lclient!aa;BI)V")
	public static void method3599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class321 arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) Class151 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) String arg8, @OriginalArg(9) Class1 arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		if (Static407.anInt6820 == 4) {
			local11 = (int) Static228.aFloat26 & 0x3FFF;
		} else {
			local11 = Static553.anInt9285 + (int) Static228.aFloat26 & 0x3FFF;
		}
		@Pc(32) int local32 = Math.max(arg2.anInt9103 / 2, arg2.anInt9077 / 2) + 10;
		@Pc(40) int local40 = arg7 * arg7 + arg5 * arg5;
		if (local40 > local32 * local32) {
			return;
		}
		@Pc(54) int local54 = Class6_Sub1_Sub3.anIntArray56[local11];
		@Pc(58) int local58 = Class6_Sub1_Sub3.anIntArray58[local11];
		if (Static407.anInt6820 != 4) {
			local54 = local54 * 256 / (Static605.anInt9842 + 256);
			local58 = local58 * 256 / (Static605.anInt9842 + 256);
		}
		@Pc(92) int local92 = arg5 * local58 + arg7 * local54 >> 14;
		@Pc(103) int local103 = arg7 * local58 - arg5 * local54 >> 14;
		@Pc(110) int local110 = arg4.method3327(100, (Class9[]) null, arg8);
		@Pc(116) int local116 = local92 - local110 / 2;
		@Pc(124) int local124 = arg4.method3324(arg8, 100, 0, (Class9[]) null);
		if (local116 >= -arg2.anInt9103 && local116 <= arg2.anInt9103 && local103 >= -arg2.anInt9077 && arg2.anInt9077 >= local103) {
			arg3.method6326(arg0 + arg2.anInt9077 / 2 - local124 - arg10 - local103, arg0, 0, arg2.anInt9103 / 2 + local116 + arg1, 1, local110, 50, (Class9[]) null, arg8, arg6, arg9, 0, 0, arg1, (int[]) null);
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(Z)V")
	public static void method3600() {
		if (Static289.aFrame1 != null) {
			return;
		}
		@Pc(15) int local15 = Static314.anInt5339;
		@Pc(17) int local17 = Static114.anInt2051;
		@Pc(24) int local24 = Static338.anInt5825 - Static449.anInt7506 - local15;
		@Pc(32) int local32 = Static13.anInt10825 - local17 - Static348.anInt5935;
		if (local15 <= 0 && local24 <= 0 && local17 <= 0 && local32 <= 0) {
			return;
		}
		try {
			@Pc(50) Container local50;
			if (Static293.aFrame3 != null) {
				local50 = Static293.aFrame3;
			} else if (Static180.anApplet6 == null) {
				local50 = Static131.anApplet_Sub1_1;
			} else {
				local50 = Static180.anApplet6;
			}
			@Pc(62) int local62 = 0;
			@Pc(64) int local64 = 0;
			if (Static293.aFrame3 == local50) {
				@Pc(70) Insets local70 = Static293.aFrame3.getInsets();
				local64 = local70.top;
				local62 = local70.left;
			}
			@Pc(79) Graphics local79 = local50.getGraphics();
			local79.setColor(Color.black);
			if (local15 > 0) {
				local79.fillRect(local62, local64, local15, Static13.anInt10825);
			}
			if (local17 > 0) {
				local79.fillRect(local62, local64, Static338.anInt5825, local17);
			}
			if (local24 > 0) {
				local79.fillRect(Static338.anInt5825 + local62 - local24, local64, local24, Static13.anInt10825);
			}
			if (local32 > 0) {
				local79.fillRect(local62, local64 + Static13.anInt10825 - local32, Static338.anInt5825, local32);
				return;
			}
		} catch (@Pc(129) Exception local129) {
			return;
		}
	}
}
