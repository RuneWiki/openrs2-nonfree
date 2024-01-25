import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!ju", name = "Z", descriptor = "Lclient!o;")
	public static Class49 aClass49_15;

	@OriginalMember(owner = "client!ju", name = "vb", descriptor = "F")
	public static float aFloat85;

	@OriginalMember(owner = "client!ju", name = "I", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_55 = new Class194(68, 7);

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IJ)V")
	public static void method2777(@OriginalArg(1) long arg0) {
		@Pc(13) int local13 = Static423.anInt7090;
		@Pc(15) int local15 = Static21.anInt449;
		@Pc(23) int local23;
		@Pc(31) int local31;
		if (local13 != Static300.anInt4681) {
			local23 = local13 - Static300.anInt4681;
			local31 = (int) ((long) local23 * arg0 / 320L);
			if (local23 > 0) {
				if (local31 == 0) {
					local31 = 1;
				} else if (local23 < local31) {
					local31 = local23;
				}
			} else if (local31 == 0) {
				local31 = -1;
			} else if (local31 < local23) {
				local31 = local23;
			}
			Static300.anInt4681 += local31;
		}
		if (!Static216.aClass1_Sub1_1.aBoolean297) {
			Static10.aFloat7 += (float) arg0 * Static346.aFloat136 / 40.0F * 8.0F;
			Static99.aFloat33 += (float) arg0 * Static405.aFloat177 / 40.0F * 8.0F;
		}
		if (local15 != Static45.anInt41) {
			local23 = local15 - Static45.anInt41;
			local31 = (int) (arg0 * (long) local23 / 320L);
			if (local23 > 0) {
				if (local31 == 0) {
					local31 = 1;
				} else if (local31 > local23) {
					local31 = local23;
				}
			} else if (local31 == 0) {
				local31 = -1;
			} else if (local23 > local31) {
				local31 = local23;
			}
			Static45.anInt41 += local31;
		}
		Static135.method1952();
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIIBIZ)V")
	public static void method2784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg1 < 1) {
			arg1 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(21) int local21 = arg3 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(42) int local42 = Static48.aShort13 + (Static347.aShort81 - Static48.aShort13) * local21 / 100;
		if (Static168.aShort55 > local42) {
			local42 = Static168.aShort55;
		} else if (Static372.aShort91 < local42) {
			local42 = Static372.aShort91;
		}
		@Pc(69) int local69 = arg3 * 512 * local42 / (arg1 * 334);
		@Pc(106) int local106;
		@Pc(112) int local112;
		@Pc(81) short local81;
		if (Static224.aShort41 > local69) {
			local81 = Static224.aShort41;
			local42 = arg1 * 334 * local81 / (arg3 * 512);
			if (Static372.aShort91 < local42) {
				local42 = Static372.aShort91;
				local106 = arg3 * 512 * local42 / (local81 * 334);
				local112 = (arg1 - local106) / 2;
				if (arg4) {
					Static407.aClass200_9.va();
					Static407.aClass200_9.method5856(arg2, -16777216, local112, arg3, arg0);
					Static407.aClass200_9.method5856(arg2, -16777216, local112, arg3, arg0 + arg1 - local112);
				}
				arg1 -= local112 * 2;
				arg0 += local112;
			}
		} else if (local69 > Static426.aShort98) {
			local81 = Static426.aShort98;
			local42 = arg1 * local81 * 334 / (arg3 * 512);
			if (local42 < Static168.aShort55) {
				local42 = Static168.aShort55;
				local106 = local81 * arg1 * 334 / (local42 * 512);
				local112 = (arg3 - local106) / 2;
				if (arg4) {
					Static407.aClass200_9.va();
					Static407.aClass200_9.method5856(arg2, -16777216, arg1, local112, arg0);
					Static407.aClass200_9.method5856(arg2 + arg3 - local112, -16777216, arg1, local112, arg0);
				}
				arg3 -= local112 * 2;
				arg2 += local112;
			}
		}
		Static368.anInt5971 = arg0;
		Static356.anInt5822 = (short) arg1;
		Static192.anInt3196 = arg2;
		Static444.anInt7355 = arg3 * local42 / 334;
		Static143.anInt2594 = (short) arg3;
	}
}
