import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static481 {

	@OriginalMember(owner = "client!tt", name = "F", descriptor = "[I")
	public static int[] anIntArray650;

	@OriginalMember(owner = "client!tt", name = "G", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!tt", name = "C", descriptor = "Lclient!io;")
	public static final Class148 aClass148_14 = new Class148(0, 2, 2, 1);

	@OriginalMember(owner = "client!tt", name = "E", descriptor = "Lclient!uaa;")
	public static final Class288 aClass288_65 = new Class288(200);

	@OriginalMember(owner = "client!tt", name = "I", descriptor = "I")
	public static int anInt8318 = 0;

	@OriginalMember(owner = "client!tt", name = "J", descriptor = "[I")
	public static final int[] anIntArray651 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)V")
	public static void method6698() {
		for (@Pc(11) int local11 = 0; local11 < Static144.anInt3037; local11++) {
			@Pc(17) int local17 = Static146.anIntArray243[local11];
			@Pc(25) Class15_Sub2_Sub1_Sub2 local25 = ((Class5_Sub51) Static521.aClass42_42.method1109((long) local17)).aClass15_Sub2_Sub1_Sub2_2;
			@Pc(29) int local29 = Static131.aClass5_Sub3_Sub1_1.method4220();
			if ((local29 & 0x10) != 0) {
				local29 += Static131.aClass5_Sub3_Sub1_1.method4220() << 8;
			}
			if ((local29 & 0x100) != 0) {
				local25.aByte50 = Static131.aClass5_Sub3_Sub1_1.method4215();
				local25.aByte49 = Static131.aClass5_Sub3_Sub1_1.method4196();
				local25.aByte47 = Static131.aClass5_Sub3_Sub1_1.method4196();
				local25.aByte48 = (byte) Static131.aClass5_Sub3_Sub1_1.method4183();
				local25.lb = anInt8318 + Static131.aClass5_Sub3_Sub1_1.method4205();
				local25.anInt4717 = anInt8318 + Static131.aClass5_Sub3_Sub1_1.method4202();
			}
			if ((local29 & 0x2000) != 0) {
				local25.anInt4775 = Static131.aClass5_Sub3_Sub1_1.method4205();
				local25.anInt4760 = Static131.aClass5_Sub3_Sub1_1.method4202();
			}
			if ((local29 & 0x1) != 0) {
				local25.aString47 = Static131.aClass5_Sub3_Sub1_1.method4234();
				local25.anInt4751 = 100;
			}
			if ((local29 & 0x4) != 0) {
				if (local25.aClass305_1.method7141()) {
					Static243.method4137(local25);
				}
				local25.method4045(Static204.aClass282_1.method6596(Static131.aClass5_Sub3_Sub1_1.method4232()));
				local25.method4030(local25.aClass305_1.anInt8815);
				local25.anInt4741 = local25.aClass305_1.anInt8824 << 3;
				if (local25.aClass305_1.method7141()) {
					Static160.method2898(local25.anIntArray306[0], 0, null, local25.anIntArray307[0], local25.aByte91, null, local25);
				}
			}
			@Pc(183) int local183;
			@Pc(194) int local194;
			if ((local29 & 0x2) != 0) {
				local183 = Static131.aClass5_Sub3_Sub1_1.method4205();
				if (local183 == 65535) {
					local183 = -1;
				}
				local194 = Static131.aClass5_Sub3_Sub1_1.method4226();
				Static423.method6077(local25, local194, local183);
			}
			@Pc(223) int local223;
			if ((local29 & 0x20) != 0) {
				local183 = Static131.aClass5_Sub3_Sub1_1.method4232();
				if (local183 == 65535) {
					local183 = -1;
				}
				local194 = Static131.aClass5_Sub3_Sub1_1.method4222();
				local223 = Static131.aClass5_Sub3_Sub1_1.method4171();
				local25.method4027(local194, local183, false, local223);
			}
			if ((local29 & 0x80) != 0) {
				local25.anInt4720 = Static131.aClass5_Sub3_Sub1_1.method4202();
				if (local25.anInt4720 == 65535) {
					local25.anInt4720 = -1;
				}
			}
			if ((local29 & 0x200) != 0) {
				local183 = Static131.aClass5_Sub3_Sub1_1.method4227();
				local25.anInt4679 = Static131.aClass5_Sub3_Sub1_1.method4171();
				local25.anInt4722 = Static131.aClass5_Sub3_Sub1_1.method4226();
				local25.anInt4700 = local183 & 0x7FFF;
				local25.aBoolean301 = (local183 & 0x8000) != 0;
				local25.anInt4691 = local25.anInt4679 + local25.anInt4700 + anInt8318;
			}
			if ((local29 & 0x800) != 0) {
				local183 = Static131.aClass5_Sub3_Sub1_1.method4226();
				@Pc(304) int[] local304 = new int[local183];
				@Pc(307) int[] local307 = new int[local183];
				@Pc(310) int[] local310 = new int[local183];
				for (@Pc(312) int local312 = 0; local312 < local183; local312++) {
					@Pc(318) int local318 = Static131.aClass5_Sub3_Sub1_1.method4232();
					if (local318 == 65535) {
						local318 = -1;
					}
					local304[local312] = local318;
					local307[local312] = Static131.aClass5_Sub3_Sub1_1.method4226();
					local310[local312] = Static131.aClass5_Sub3_Sub1_1.method4205();
				}
				Static350.method4115(local310, local25, local307, local304);
			}
			if ((local29 & 0x400) != 0) {
				local25.anInt4684 = Static131.aClass5_Sub3_Sub1_1.method4215();
				local25.anInt4729 = Static131.aClass5_Sub3_Sub1_1.method4188();
				local25.anInt4683 = Static131.aClass5_Sub3_Sub1_1.method4215();
				local25.anInt4698 = Static131.aClass5_Sub3_Sub1_1.method4215();
				local25.anInt4721 = Static131.aClass5_Sub3_Sub1_1.method4205() + anInt8318;
				local25.anInt4718 = Static131.aClass5_Sub3_Sub1_1.method4205() + anInt8318;
				local25.anInt4680 = Static131.aClass5_Sub3_Sub1_1.method4226();
				local25.anInt4756 = 0;
				local25.anInt4698 += local25.anIntArray307[0];
				local25.anInt4683 += local25.anIntArray306[0];
				local25.anInt4684 += local25.anIntArray306[0];
				local25.anInt4753 = 1;
				local25.anInt4729 += local25.anIntArray307[0];
			}
			if ((local29 & 0x40) != 0) {
				local183 = Static131.aClass5_Sub3_Sub1_1.method4231();
				local194 = Static131.aClass5_Sub3_Sub1_1.method4183();
				local25.method4041(local183, anInt8318, local194);
			}
			if ((local29 & 0x8) != 0) {
				local183 = Static131.aClass5_Sub3_Sub1_1.method4231();
				local194 = Static131.aClass5_Sub3_Sub1_1.method4171();
				local25.method4041(local183, anInt8318, local194);
				local25.anInt4739 = anInt8318 + 300;
				local25.anInt4740 = Static131.aClass5_Sub3_Sub1_1.method4226();
			}
			if ((local29 & 0x1000) != 0) {
				local183 = Static131.aClass5_Sub3_Sub1_1.method4232();
				if (local183 == 65535) {
					local183 = -1;
				}
				local194 = Static131.aClass5_Sub3_Sub1_1.method4230();
				local223 = Static131.aClass5_Sub3_Sub1_1.method4220();
				local25.method4027(local194, local183, true, local223);
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Z)Z")
	public static boolean method6699() {
		return Static255.aBoolean356;
	}
}
