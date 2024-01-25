import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static693 {

	@OriginalMember(owner = "client!vu", name = "u", descriptor = "I")
	public static int anInt10661;

	@OriginalMember(owner = "client!vu", name = "s", descriptor = "[I")
	public static int[] anIntArray741 = new int[2];

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(BI)V")
	public static void method9336(@OriginalArg(1) int arg0) {
		if (Static650.aClass2_Sub30_29.aClass11_Sub6_1.method2007() == 0) {
			arg0 = -1;
		}
		if (arg0 == Static632.anInt9753) {
			return;
		}
		if (arg0 != -1) {
			@Pc(27) Class19 local27 = Static506.aClass327_2.method7800(arg0);
			@Pc(31) Class355 local31 = local27.method283();
			if (local31 == null) {
				arg0 = -1;
			} else {
				Static135.aClass389_2.method9267(local31.method8358(), local31.method8365(), local31.method8364(), Static316.aCanvas1, new Point(local27.anInt280, local27.anInt277));
				Static632.anInt9753 = arg0;
			}
		}
		if (arg0 == -1 && Static632.anInt9753 != -1) {
			Static135.aClass389_2.method9267(-1, (int[]) null, -1, Static316.aCanvas1, new Point());
			Static632.anInt9753 = -1;
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIBII)I")
	public static int method9339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg2 & 0xF;
		@Pc(15) int local15 = local7 >= 8 ? arg3 : arg0;
		@Pc(38) int local38 = local7 < 4 ? arg3 : local7 == 12 || local7 == 14 ? arg0 : arg1;
		return ((local7 & 0x1) == 0 ? local15 : -local15) + ((local7 & 0x2) == 0 ? local38 : -local38);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method9343(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(13) String local13 = Static15.method237(arg0);
		if (local13 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < Static194.anInt3157; local31++) {
			@Pc(37) String local37 = Static12.aStringArray2[local31];
			@Pc(41) String local41 = Static15.method237(local37);
			if (Static319.method4445(arg0, local41, local13, local37)) {
				Static194.anInt3157--;
				for (@Pc(54) int local54 = local31; local54 < Static194.anInt3157; local54++) {
					Static12.aStringArray2[local54] = Static12.aStringArray2[local54 + 1];
					Static451.aStringArray31[local54] = Static451.aStringArray31[local54 + 1];
					Static514.aStringArray37[local54] = Static514.aStringArray37[local54 + 1];
					Static490.aStringArray35[local54] = Static490.aStringArray35[local54 + 1];
					Static616.aBooleanArray37[local54] = Static616.aBooleanArray37[local54 + 1];
				}
				Static459.anInt7473 = Static602.anInt10526;
				@Pc(115) Class221 local115 = Static87.method1292();
				@Pc(121) Class2_Sub33 local121 = Static592.method8154(Static352.aClass349_85, local115.aClass48_1);
				local121.aClass2_Sub20_Sub2_1.method8584(Static125.method1890(arg0));
				local121.aClass2_Sub20_Sub2_1.method8541(arg0);
				local115.method5173(local121);
				return;
			}
		}
	}
}
