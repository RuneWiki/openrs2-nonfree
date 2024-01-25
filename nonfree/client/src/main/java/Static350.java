import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
	public static int anInt6715;

	@OriginalMember(owner = "client!wg", name = "E", descriptor = "I")
	public static int anInt6717;

	@OriginalMember(owner = "client!wg", name = "F", descriptor = "Lclient!nf;")
	public static Class140 aClass140_4;

	@OriginalMember(owner = "client!wg", name = "w", descriptor = "[I")
	public static final int[] anIntArray635 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!wg", name = "x", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_147 = new Class85("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
	public static int anInt6713 = 0;

	@OriginalMember(owner = "client!wg", name = "G", descriptor = "[I")
	public static final int[] anIntArray636 = new int[50];

	@OriginalMember(owner = "client!wg", name = "I", descriptor = "I")
	public static int anInt6718 = 0;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!rg;B)Ljava/lang/String;")
	public static String method5958(@OriginalArg(1) Class5_Sub12 arg0) {
		try {
			@Pc(7) int local7 = arg0.method5060();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(19) byte[] local19 = new byte[local7];
			arg0.anInt5731 += Static9.aClass154_1.method4164(local7, arg0.aByteArray90, local19, 0, arg0.anInt5731);
			return Static315.method5537(local19, local7, 0);
		} catch (@Pc(48) Exception local48) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZI)V")
	public static void method5959(@OriginalArg(1) int arg0) {
		Static238.anInt4785 = arg0;
		Static239.aClass109_48.method2858();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!ea;)V")
	public static void method5960(@OriginalArg(0) Class55 arg0) {
		for (@Pc(1) int local1 = Static63.anInt5185; local1 < Static345.anInt6647; local1++) {
			for (@Pc(4) int local4 = 0; local4 < anInt6715; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static236.anInt4222; local7++) {
					@Pc(16) Class174 local16 = Static178.aClass174ArrayArrayArray3[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class4_Sub3 local21 = local16.aClass4_Sub3_2;
						@Pc(24) Class4_Sub3 local24 = local16.aClass4_Sub3_1;
						if (local21 != null && local21.method5895()) {
							Static272.method4784(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5895()) {
								Static272.method4784(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5897(0, arg0, local21, false, 0, 0);
								local24.method5896();
							}
							local21.method5896();
						}
						for (@Pc(70) Class84 local70 = local16.aClass84_3; local70 != null; local70 = local70.aClass84_2) {
							@Pc(74) Class4_Sub5 local74 = local70.aClass4_Sub5_1;
							if (local74 != null && local74.method5895()) {
								Static272.method4784(arg0, local74, local1, local4, local7, local74.aShort91 + 1 - local74.aShort92, local74.aShort90 - local74.aShort93 + 1);
								local74.method5896();
							}
						}
						@Pc(111) Class4_Sub4 local111 = local16.aClass4_Sub4_1;
						if (local111 != null && local111.method5895()) {
							Static40.method634(arg0, local111, local1, local4, local7);
							local111.method5896();
						}
					}
				}
			}
		}
	}
}
