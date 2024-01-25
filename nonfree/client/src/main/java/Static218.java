import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!hda", name = "w", descriptor = "I")
	public static int anInt4139;

	@OriginalMember(owner = "client!hda", name = "F", descriptor = "Lclient!aj;")
	public static Class15 aClass15_62;

	@OriginalMember(owner = "client!hda", name = "t", descriptor = "I")
	public static final int anInt4138 = 50;

	@OriginalMember(owner = "client!hda", name = "n", descriptor = "[I")
	public static final int[] anIntArray367 = new int[anInt4138];

	@OriginalMember(owner = "client!hda", name = "q", descriptor = "[I")
	public static final int[] anIntArray368 = new int[anInt4138];

	@OriginalMember(owner = "client!hda", name = "v", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray12 = new String[anInt4138];

	@OriginalMember(owner = "client!hda", name = "x", descriptor = "[Lclient!bs;")
	public static final Class3_Sub11_Sub1[] aClass3_Sub11_Sub1Array2 = new Class3_Sub11_Sub1[14];

	@OriginalMember(owner = "client!hda", name = "z", descriptor = "[I")
	public static final int[] anIntArray369 = new int[anInt4138];

	@OriginalMember(owner = "client!hda", name = "A", descriptor = "[I")
	public static final int[] anIntArray370 = new int[anInt4138];

	@OriginalMember(owner = "client!hda", name = "D", descriptor = "Z")
	public static boolean aBoolean311 = false;

	@OriginalMember(owner = "client!hda", name = "H", descriptor = "[I")
	public static final int[] anIntArray372 = new int[anInt4138];

	@OriginalMember(owner = "client!hda", name = "L", descriptor = "[I")
	public static final int[] anIntArray373 = new int[anInt4138];

	@OriginalMember(owner = "client!hda", name = "P", descriptor = "Lclient!or;")
	public static Class260 aClass260_10 = null;

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(B)Z")
	public static boolean method3770() {
		return Static406.anInt6454 >= 1;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)V")
	public static void method3776() {
		for (@Pc(10) Class3_Sub11_Sub20 local10 = (Class3_Sub11_Sub20) Static171.aClass338_90.method8177(); local10 != null; local10 = (Class3_Sub11_Sub20) Static171.aClass338_90.method8168()) {
			@Pc(16) Class28_Sub1_Sub1_Sub3 local16 = local10.aClass28_Sub1_Sub1_Sub3_1;
			if (Static588.anInt9467 > local16.anInt6685) {
				local10.method9380();
				local16.method5963();
			} else if (Static588.anInt9467 >= local16.anInt6694) {
				local16.method5959();
				if (local16.anInt6692 > 0) {
					@Pc(49) Class3_Sub3 local49 = (Class3_Sub3) Static522.aClass83_34.method2368((long) (local16.anInt6692 - 1));
					if (local49 != null) {
						@Pc(54) Class28_Sub1_Sub1_Sub1_Sub2 local54 = local49.aClass28_Sub1_Sub1_Sub1_Sub2_1;
						if (local54.anInt10729 >= 0 && Static158.anInt927 * 512 > local54.anInt10729 && local54.anInt10731 >= 0 && Static515.anInt8292 * 512 > local54.anInt10731) {
							local16.method5958(Static588.anInt9467, local54.anInt10729, Static168.method3058(local16.aByte174, local54.anInt10729, local54.anInt10731) - local16.anInt6696, local54.anInt10731);
						}
					}
				}
				if (local16.anInt6692 < 0) {
					@Pc(108) int local108 = -local16.anInt6692 - 1;
					@Pc(115) Class28_Sub1_Sub1_Sub1_Sub1 local115;
					if (local108 == Static106.anInt2205) {
						local115 = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2;
					} else {
						local115 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local108];
					}
					if (local115 != null && local115.anInt10729 >= 0 && Static158.anInt927 * 512 > local115.anInt10729 && local115.anInt10731 >= 0 && Static515.anInt8292 * 512 > local115.anInt10731) {
						local16.method5958(Static588.anInt9467, local115.anInt10729, Static168.method3058(local16.aByte174, local115.anInt10729, local115.anInt10731) - local16.anInt6696, local115.anInt10731);
					}
				}
				local16.method5960(Static619.anInt10674);
				Static436.method6231(local16, true);
			}
		}
	}
}
