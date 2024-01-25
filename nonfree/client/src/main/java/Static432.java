import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!vu", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray43 = new String[100];

	@OriginalMember(owner = "client!vu", name = "f", descriptor = "[I")
	public static final int[] anIntArray503 = new int[5];

	@OriginalMember(owner = "client!vu", name = "j", descriptor = "I")
	public static int anInt7520 = 0;

	@OriginalMember(owner = "client!vu", name = "q", descriptor = "I")
	public static int anInt7524 = 0;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(III)I")
	public static int method5827(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			local7 = arg1 & 0x1 | local7 << 1;
			arg0--;
			arg1 >>>= 0x1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ZIZ)Lclient!vo;")
	public static Class2_Sub44 method5828(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(17) long local17 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg1);
		return (Class2_Sub44) Static35.aClass240_39.method5439(local17);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method5830(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static304.anInt5397 >= 100 && !Static168.aBoolean279 || Static304.anInt5397 >= 200) {
			Static165.method4929(Static320.aClass256_166.method5720(Static272.anInt7537));
			return;
		}
		@Pc(29) String local29 = Static384.method5331(arg0);
		if (local29 == null) {
			return;
		}
		@Pc(72) String local72;
		for (@Pc(34) int local34 = 0; local34 < Static304.anInt5397; local34++) {
			@Pc(42) String local42 = Static384.method5331(Static371.aStringArray36[local34]);
			if (local42 != null && local42.equals(local29)) {
				Static165.method4929(arg0 + Static412.aClass256_147.method5720(Static272.anInt7537));
				return;
			}
			if (Static351.aStringArray32[local34] != null) {
				local72 = Static384.method5331(Static351.aStringArray32[local34]);
				if (local72 != null && local72.equals(local29)) {
					Static165.method4929(arg0 + Static412.aClass256_147.method5720(Static272.anInt7537));
					return;
				}
			}
		}
		for (@Pc(98) int local98 = 0; local98 < Static220.anInt4206; local98++) {
			local72 = Static384.method5331(Static74.aStringArray8[local98]);
			if (local72 != null && local72.equals(local29)) {
				Static165.method4929(Static237.aClass256_88.method5720(Static272.anInt7537) + arg0 + Static137.aClass256_51.method5720(Static272.anInt7537));
				return;
			}
			if (Static203.aStringArray17[local98] != null) {
				@Pc(141) String local141 = Static384.method5331(Static203.aStringArray17[local98]);
				if (local141 != null && local141.equals(local29)) {
					Static165.method4929(Static237.aClass256_88.method5720(Static272.anInt7537) + arg0 + Static137.aClass256_51.method5720(Static272.anInt7537));
					return;
				}
			}
		}
		if (Static384.method5331(Static231.aClass4_Sub2_Sub2_Sub1_2.aString48).equals(local29)) {
			Static165.method4929(Static35.aClass256_165.method5720(Static272.anInt7537));
		} else {
			Static448.method6059(Static149.aClass44_38);
			Static98.aClass2_Sub20_Sub1_1.method3699(Static209.method3225(arg0));
			Static98.aClass2_Sub20_Sub1_1.method3715(arg0);
		}
	}
}
