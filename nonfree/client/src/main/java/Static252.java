import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
	public static int anInt4940;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString164 = "shake:";

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
	public static int anInt4937 = -1;

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
	public static int anInt4942 = 0;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)V")
	public static void method3845() {
		Static223.aClass169_123.method4020(5);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3846(@OriginalArg(0) String arg0) {
		@Pc(12) int local12 = 0;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			local12 = (local12 << 5) - (local12 - Static206.method3272(arg0.charAt(local17)));
		}
		return local12;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)I")
	public static int method3848(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return 0;
		}
		@Pc(20) Class1_Sub8 local20 = (Class1_Sub8) Static247.aClass156_23.method3821((long) arg0);
		if (local20 == null) {
			return Static314.method4650(arg0).anInt790;
		}
		@Pc(32) int local32 = 0;
		for (@Pc(34) int local34 = 0; local34 < local20.anIntArray57.length; local34++) {
			if (local20.anIntArray57[local34] == -1) {
				local32++;
			}
		}
		return local32 + Static314.method4650(arg0).anInt790 - local20.anIntArray57.length;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BII)V")
	public static void method3849(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static8.anInt141 > 0) {
			Static77.method4237(Static8.anInt141);
			Static8.anInt141 = 0;
		}
		@Pc(25) int local25 = Static41.anInt829 * arg1;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 1; local31 < 255; local31++) {
			@Pc(51) int local51 = Static36.anIntArray53[local31] * (256 - local31) / 256;
			if (local51 < 0) {
				local51 = 0;
			}
			local27 += local51;
			@Pc(64) int local64;
			for (local64 = local51; local64 < 128; local64++) {
				@Pc(74) int local74 = Static41.anIntArray62[local25++ + arg0];
				@Pc(79) int local79 = Static311.anIntArray531[local27++];
				if (local79 == 0) {
					Static287.aClass1_Sub1_Sub3_Sub2_4.anIntArray344[local29++] = local74;
				} else {
					@Pc(85) int local85 = local79 + 18;
					@Pc(91) int local91 = 256 - local79 - 18;
					local79 = Static50.anIntArray81[local79];
					if (local91 > 255) {
						local91 = 255;
					}
					if (local85 > 255) {
						local85 = 255;
					}
					Static287.aClass1_Sub1_Sub3_Sub2_4.anIntArray344[local29++] = (local85 * (local79 & 0xFF00FF) + local91 * (local74 & 0xFF00FF) & 0xFF00FF00) + (local91 * (local74 & 0xFF00) + local85 * (local79 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			for (local64 = 0; local64 < local51; local64++) {
				Static287.aClass1_Sub1_Sub3_Sub2_4.anIntArray344[local29++] = Static41.anIntArray62[local25++ + arg0];
			}
			local25 += Static41.anInt829 - 128;
		}
		if (Static291.aBoolean404) {
			Static133.method2174(Static287.aClass1_Sub1_Sub3_Sub2_4.anIntArray344, arg0, arg1, Static287.aClass1_Sub1_Sub3_Sub2_4.anInt5875, Static287.aClass1_Sub1_Sub3_Sub2_4.anInt5887);
		} else {
			Static287.aClass1_Sub1_Sub3_Sub2_4.method4632(arg0, arg1);
		}
	}
}
