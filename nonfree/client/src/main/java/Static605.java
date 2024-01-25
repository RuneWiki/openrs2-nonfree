import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static605 {

	@OriginalMember(owner = "client!tca", name = "e", descriptor = "Lclient!fs;")
	public static Class122 aClass122_1;

	@OriginalMember(owner = "client!tca", name = "f", descriptor = "Lclient!bka;")
	public static Class9 aClass9_32;

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "Lclient!kia;")
	public static final Class206 aClass206_16 = new Class206(4, 3);

	@OriginalMember(owner = "client!tca", name = "i", descriptor = "I")
	public static int anInt9840 = -2;

	@OriginalMember(owner = "client!tca", name = "m", descriptor = "Lclient!pm;")
	public static final Class291 aClass291_2 = new Class291(0);

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_174 = new Class186(76, 4);

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(ZLclient!wka;)V")
	public static void method8304(@OriginalArg(1) Class19_Sub1_Sub3_Sub2 arg0) {
		if (arg0.anIntArray428 == null && arg0.anIntArray429 == null) {
			return;
		}
		@Pc(17) boolean local17 = true;
		for (@Pc(19) int local19 = 0; local19 < arg0.anIntArray428.length; local19++) {
			@Pc(25) int local25 = -1;
			if (arg0.anIntArray428 != null) {
				local25 = arg0.anIntArray428[local19];
			}
			if (local25 != -1) {
				local17 = false;
				@Pc(102) int local102;
				@Pc(95) int local95;
				@Pc(72) int local72;
				if ((local25 & 0xC0000000) == -1073741824) {
					local72 = local25 & 0xFFFFFFF;
					@Pc(149) int local149 = local72 >> 14;
					@Pc(153) int local153 = local72 & 0x3FFF;
					local102 = arg0.anInt11204 - (local149 - Static714.anInt11156) * 512 - 256;
					local95 = arg0.anInt11211 - (local153 - Static339.anInt5859) * 512 - 256;
				} else if ((local25 & 0x8000) == 0) {
					@Pc(111) Class3_Sub13 local111 = (Class3_Sub13) Static612.aClass136_44.method3503((long) local25);
					if (local111 == null) {
						arg0.method6596(local19, -1);
						continue;
					}
					@Pc(126) Class19_Sub1_Sub3_Sub2_Sub1 local126 = local111.aClass19_Sub1_Sub3_Sub2_Sub1_2;
					local102 = arg0.anInt11204 - local126.anInt11204;
					local95 = arg0.anInt11211 - local126.anInt11211;
				} else {
					local72 = local25 & 0x7FFF;
					@Pc(76) Class19_Sub1_Sub3_Sub2_Sub2 local76 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local72];
					if (local76 == null) {
						arg0.method6596(local19, -1);
						continue;
					}
					local95 = arg0.anInt11211 - local76.anInt11211;
					local102 = arg0.anInt11204 - local76.anInt11204;
				}
				if (local102 != 0 || local95 != 0) {
					arg0.method6596(local19, (int) (Math.atan2((double) local102, (double) local95) * 2607.5945876176133D) & 0x3FFF);
				}
			} else if (!arg0.method6596(local19, -1)) {
				local17 = false;
			}
		}
		if (local17) {
			arg0.anIntArray428 = null;
			arg0.anIntArray429 = null;
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method8305(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}
}
