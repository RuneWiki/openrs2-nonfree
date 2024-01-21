import java.awt.Canvas;
import java.awt.Font;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "[I")
	public static int[] anIntArray383;

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "Lclient!dd;")
	public static Class14 aClass14_28;

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1301 = Static56.method816("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "[I")
	public static int[] anIntArray382 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1302 = Static56.method816("au");

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!q;IBI[Lclient!kd;[B)V")
	public static void method1769(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class42[] arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(10) Class8_Sub20 local10 = new Class8_Sub20(arg4);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(18) int local18 = local10.method1849();
			if (local18 == 0) {
				return;
			}
			local12 += local18;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local10.method1849();
				if (local33 == 0) {
					break;
				}
				@Pc(39) int local39 = local10.method1872();
				@Pc(43) int local43 = local39 >> 2;
				@Pc(47) int local47 = local39 & 0x3;
				local29 += local33 - 1;
				@Pc(59) int local59 = local29 >> 6 & 0x3F;
				@Pc(63) int local63 = local29 & 0x3F;
				@Pc(68) int local68 = local63 + arg2;
				@Pc(72) int local72 = local29 >> 12;
				@Pc(76) int local76 = arg1 + local59;
				if (local76 > 0 && local68 > 0 && local76 < 103 && local68 < 103) {
					@Pc(93) int local93 = local72;
					if ((Static105.aByteArrayArrayArray5[1][local76][local68] & 0x2) == 2) {
						local93 = local72 - 1;
					}
					@Pc(109) Class42 local109 = null;
					if (local93 >= 0) {
						local109 = arg3[local93];
					}
					Static18.method309(local47, local12, local72, local43, arg0, local68, local109, local76);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZB)V")
	public static void method1770(@OriginalArg(0) boolean arg0) {
		Static33.method548();
		Static31.anInt862++;
		if (Static31.anInt862 < 50 && !arg0) {
			return;
		}
		Static31.anInt862 = 0;
		if (Static107.aBoolean97 || Static93.aClass25_4 == null) {
			return;
		}
		Static106.aClass8_Sub20_Sub1_3.method1907(85);
		try {
			Static93.aClass25_4.method586(Static106.aClass8_Sub20_Sub1_3.anInt2853, Static106.aClass8_Sub20_Sub1_3.aByteArray44);
			Static106.aClass8_Sub20_Sub1_3.anInt2853 = 0;
		} catch (@Pc(50) IOException local50) {
			Static107.aBoolean97 = true;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
	public static void method1771() {
		aClass14_28 = null;
		anIntArray383 = null;
		aClass34_1301 = null;
		aFont1 = null;
		aCanvas1 = null;
		anIntArray382 = null;
		aClass34_1302 = null;
	}
}
