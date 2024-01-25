import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "Z")
	public static boolean aBoolean54 = false;

	@OriginalMember(owner = "client!bca", name = "d", descriptor = "[F")
	public static final float[] aFloatArray2 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!bca", name = "e", descriptor = "I")
	public static int anInt623 = 0;

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(II)V")
	public static void method626(@OriginalArg(0) int arg0) {
		Static120.aLong269 = 1000000000L / (long) arg0;
	}

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "(I)I")
	public static int method627() {
		if (Static629.aClass357_15 == null) {
			if (!Static251.aBoolean343 && Static510.aClass5_Sub4_Sub14_1 != null) {
				return Static510.aClass5_Sub4_Sub14_1.anInt5601;
			}
			@Pc(26) int local26 = Static81.aClass13_1.method6355();
			@Pc(30) int local30 = Static81.aClass13_1.method6347();
			@Pc(47) int local47;
			@Pc(49) int local49;
			@Pc(61) int local61;
			@Pc(248) Class5_Sub4_Sub14 local248;
			if (Static585.aBoolean771) {
				@Pc(114) Class67 local114;
				if (local26 > Static403.anInt6941 && Static403.anInt6941 + Static42.anInt712 > local26) {
					local47 = -1;
					for (local49 = 0; local49 < Static198.anInt3547; local49++) {
						if (Static405.aBoolean578) {
							local61 = Static649.anInt10496 + local49 * 16 + 33;
							if (local61 - 13 < local30 && local30 <= local61 + 3) {
								local47 = local49;
							}
						} else {
							local61 = local49 * 16 + Static649.anInt10496 + 31;
							if (local61 - 13 < local30 && local61 + 3 >= local30) {
								local47 = local49;
							}
						}
					}
					if (local47 != -1) {
						local61 = 0;
						local114 = new Class67(Static616.aClass80_12);
						for (@Pc(119) Class5_Sub4_Sub6 local119 = (Class5_Sub4_Sub6) local114.method1348(); local119 != null; local119 = (Class5_Sub4_Sub6) local114.method1346()) {
							if (local47 == local61++) {
								return ((Class5_Sub4_Sub14) local119.aClass80_3.aClass5_Sub4_14.aClass5_Sub4_67).anInt5601;
							}
						}
					}
				} else if (Static472.aClass5_Sub4_Sub6_1 != null && Static345.anInt5965 < local26 && Static345.anInt5965 + Static501.anInt9504 > local26) {
					local47 = -1;
					for (local49 = 0; local49 < Static472.aClass5_Sub4_Sub6_1.anInt2325; local49++) {
						if (Static405.aBoolean578) {
							local61 = local49 * 16 + Static537.anInt8920 + 33;
							if (local30 > local61 - 13 && local30 <= local61 + 3) {
								local47 = local49;
							}
						} else {
							local61 = local49 * 16 + Static537.anInt8920 + 31;
							if (local61 - 13 < local30 && local30 <= local61 + 3) {
								local47 = local49;
							}
						}
					}
					if (local47 != -1) {
						local61 = 0;
						local114 = new Class67(Static472.aClass5_Sub4_Sub6_1.aClass80_3);
						for (local248 = (Class5_Sub4_Sub14) local114.method1348(); local248 != null; local248 = (Class5_Sub4_Sub14) local114.method1346()) {
							if (local47 == local61++) {
								return local248.anInt5601;
							}
						}
					}
				}
			} else if (Static403.anInt6941 < local26 && local26 < Static403.anInt6941 + Static42.anInt712) {
				local47 = -1;
				for (local49 = 0; local49 < Static642.anInt10370; local49++) {
					if (Static405.aBoolean578) {
						local61 = Static649.anInt10496 + (-local49 + -1 + Static642.anInt10370) * 16 + 33;
						if (local61 - 13 < local30 && local30 <= local61 + 3) {
							local47 = local49;
						}
					} else {
						local61 = (Static642.anInt10370 - local49 - 1) * 16 + Static649.anInt10496 + 31;
						if (local61 - 13 < local30 && local30 <= local61 + 3) {
							local47 = local49;
						}
					}
				}
				if (local47 != -1) {
					local61 = 0;
					@Pc(357) Class268 local357 = new Class268(Static607.aClass306_63);
					for (local248 = (Class5_Sub4_Sub14) local357.method6394(); local248 != null; local248 = (Class5_Sub4_Sub14) local357.method6395()) {
						if (local61++ == local47) {
							return local248.anInt5601;
						}
					}
				}
			}
		}
		return -1;
	}
}
