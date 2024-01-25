import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static551 {

	@OriginalMember(owner = "client!tn", name = "Ab", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_149 = new Class218(67, 5);

	@OriginalMember(owner = "client!tn", name = "Cb", descriptor = "Lclient!kh;")
	public static final Class180 aClass180_8 = new Class180();

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IZ)S")
	public static short method8398(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(37) int local37 = local19 > 64 ? (127 - local19) * local15 >> 7 : local15 * local19 >> 7;
		@Pc(46) int local46 = local37 + local19;
		@Pc(55) int local55;
		if (local46 == 0) {
			local55 = local37 << 1;
		} else {
			local55 = (local37 << 8) / local46;
		}
		return (short) (local46 | local9 << 10 | local55 >> 4 << 7);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method8446(@OriginalArg(1) Class33 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static349.aBoolean590) {
			local7 = Static477.method7033();
			local9 = Static10.method114();
		}
		@Pc(25) int local25 = local7 + Static326.anInt6543;
		@Pc(29) int local29 = local9 + Static434.anInt7939;
		@Pc(31) int local31 = Static582.anInt9731;
		@Pc(35) int local35 = Static554.anInt9455 - 3;
		Static622.method7872(Static554.anInt9455, Static582.anInt9731, arg0, local7 + Static326.anInt6543, local9 + Static434.anInt7939, Static287.aClass176_24.method4986(Static380.anInt7247));
		@Pc(59) int local59 = Static501.aClass59_5.method4107() + local7;
		@Pc(65) int local65 = local9 + Static501.aClass59_5.method4106();
		@Pc(69) int local69;
		@Pc(74) Class3_Sub1_Sub4 local74;
		@Pc(90) int local90;
		@Pc(275) int local275;
		@Pc(161) Class3_Sub1_Sub10 local161;
		@Pc(263) Class3_Sub1_Sub4 local263;
		if (Static506.aBoolean755) {
			local69 = 0;
			for (local161 = (Class3_Sub1_Sub10) Static379.aClass30_9.method780(); local161 != null; local161 = (Class3_Sub1_Sub10) Static379.aClass30_9.method783()) {
				local90 = local29 + local69 * 16 + 20 + 13;
				if (local59 > Static326.anInt6543 + local7 && local7 + Static326.anInt6543 + Static582.anInt9731 > local59 && local90 - 13 < local65 && local90 + 4 > local65 && (local161.anInt5812 > 1 || ((Class3_Sub1_Sub4) local161.aClass30_7.aClass3_Sub1_7.aClass3_Sub1_66).aBoolean286)) {
					arg0.aa(local7 + Static326.anInt6543, local90 + -12, Static582.anInt9731, 16, Static568.anInt9655 | 255 - Static73.anInt1917 << 24, 1);
				}
				local69++;
			}
			if (Static198.aClass3_Sub1_Sub10_1 != null) {
				Static622.method7872(Static609.anInt10063, Static468.anInt8459, arg0, Static285.anInt5876, Static280.anInt5854, Static198.aClass3_Sub1_Sub10_1.aString59);
				local69 = 0;
				for (local263 = (Class3_Sub1_Sub4) Static198.aClass3_Sub1_Sub10_1.aClass30_7.method780(); local263 != null; local263 = (Class3_Sub1_Sub4) Static198.aClass3_Sub1_Sub10_1.aClass30_7.method783()) {
					local275 = local69 * 16 + Static280.anInt5854 + 13 + 20;
					if (local59 > Static285.anInt5876 && local59 < Static468.anInt8459 + Static285.anInt5876 && local65 > local275 - 13 && local65 < local275 + 4 && local263.aBoolean286) {
						arg0.aa(Static285.anInt5876, local275 - 12, Static468.anInt8459, 16, Static568.anInt9655 | 255 - Static73.anInt1917 << 24, 1);
					}
					local69++;
				}
				Static311.method5255(Static280.anInt5854, arg0, Static609.anInt10063, Static285.anInt5876, Static468.anInt8459);
			}
		} else {
			local69 = 0;
			for (local74 = (Class3_Sub1_Sub4) Static187.aClass276_28.method6907(); local74 != null; local74 = (Class3_Sub1_Sub4) Static187.aClass276_28.method6912()) {
				local90 = (Static443.anInt8026 - local69 - 1) * 16 + local29 + 33;
				local69++;
				if (local7 + Static326.anInt6543 < local59 && local7 + Static326.anInt6543 + Static582.anInt9731 > local59 && local90 - 13 < local65 && local65 < local90 + 4 && local74.aBoolean286) {
					arg0.aa(Static326.anInt6543 + local7, local90 + -12, Static582.anInt9731, 16, Static568.anInt9655 | 255 - Static73.anInt1917 << 24, 1);
				}
			}
		}
		Static311.method5255(local9 + Static434.anInt7939, arg0, Static554.anInt9455, local7 + Static326.anInt6543, Static582.anInt9731);
		if (Static506.aBoolean755) {
			local69 = 0;
			for (local161 = (Class3_Sub1_Sub10) Static379.aClass30_9.method780(); local161 != null; local161 = (Class3_Sub1_Sub10) Static379.aClass30_9.method783()) {
				local90 = local69 * 16 + Static434.anInt7939 + local9 + 20 + 13;
				if (local161.anInt5812 == 1) {
					Static257.method4823(local59, (Class3_Sub1_Sub4) local161.aClass30_7.aClass3_Sub1_7.aClass3_Sub1_66, Static554.anInt9455, local65, Static342.anInt6744 | 0xFF000000, local90, local7 + Static326.anInt6543, Static582.anInt9731, local9 + Static434.anInt7939, Static33.anInt613 | 0xFF000000, arg0);
				} else {
					Static414.method6482(arg0, local161, Static342.anInt6744 | 0xFF000000, local90, local7 + Static326.anInt6543, Static554.anInt9455, Static434.anInt7939 + local9, local59, Static33.anInt613 | 0xFF000000, Static582.anInt9731, local65);
				}
				local69++;
			}
			if (Static198.aClass3_Sub1_Sub10_1 != null) {
				local69 = 0;
				for (local263 = (Class3_Sub1_Sub4) Static198.aClass3_Sub1_Sub10_1.aClass30_7.method780(); local263 != null; local263 = (Class3_Sub1_Sub4) Static198.aClass3_Sub1_Sub10_1.aClass30_7.method783()) {
					local275 = local69 * 16 + Static280.anInt5854 + 20 + 13;
					local69++;
					Static257.method4823(local59, local263, Static609.anInt10063, local65, Static342.anInt6744 | 0xFF000000, local275, Static285.anInt5876, Static468.anInt8459, Static280.anInt5854, Static33.anInt613 | 0xFF000000, arg0);
				}
				Static466.method6964(Static609.anInt10063, Static285.anInt5876, Static280.anInt5854, Static468.anInt8459);
			}
		} else {
			local69 = 0;
			for (local74 = (Class3_Sub1_Sub4) Static187.aClass276_28.method6907(); local74 != null; local74 = (Class3_Sub1_Sub4) Static187.aClass276_28.method6912()) {
				local90 = local29 + (Static443.anInt8026 + -1 - local69) * 16 + 13 + 20;
				local69++;
				Static257.method4823(local59, local74, local35, local65, Static342.anInt6744 | 0xFF000000, local90, local25, local31, local29, Static33.anInt613 | 0xFF000000, arg0);
			}
		}
		Static466.method6964(Static554.anInt9455, Static326.anInt6543 + local7, Static434.anInt7939 + local9, Static582.anInt9731);
	}
}
