import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!ci", name = "z", descriptor = "I")
	public static int anInt1132;

	@OriginalMember(owner = "client!ci", name = "v", descriptor = "Lclient!ut;")
	public static final Class335 aClass335_5 = new Class335();

	@OriginalMember(owner = "client!ci", name = "y", descriptor = "Lclient!eca;")
	public static final Class82 aClass82_2 = new Class82();

	@OriginalMember(owner = "client!ci", name = "A", descriptor = "S")
	public static short aShort14 = 32767;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZLjava/lang/String;ZJ)V")
	public static void method1046(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) long arg2) {
		if (arg1) {
			Static220.method3412();
			if (Static245.aString41.equals("")) {
				Static218.anInt4197 = 39;
				return;
			}
		}
		@Pc(19) Class1_Sub35 local19 = new Class1_Sub35(576);
		local19.method5777(10);
		local19.method5776((int) (Math.random() * 65535.0D));
		local19.method5748(arg2);
		local19.method5776(arg1 ? Static163.anInt2948 : Static47.anInt802);
		local19.method5761(arg0);
		local19.method5748(arg1 ? Static113.aLong72 : Static480.aLong248);
		if (arg1) {
			local19.method5748(Static566.method7647(Static245.aString41));
			try {
				local19.method5748(Long.parseLong(Static368.aString61));
			} catch (@Pc(69) Exception local69) {
				Static218.anInt4197 = 39;
				return;
			}
		} else {
			local19.method5792((int) (Math.random() * 9.9999999E7D));
			local19.method5792((int) (Math.random() * 9.9999999E7D));
			local19.method5792((int) (Math.random() * 9.9999999E7D));
			local19.method5792((int) (Math.random() * 9.9999999E7D));
		}
		local19.method5792((int) (Math.random() * 9.9999999E7D));
		local19.method5747(Static264.aBigInteger3, Static98.aBigInteger5);
		@Pc(115) Class1_Sub11 local115 = Static165.method2386();
		local115.aClass1_Sub35_Sub2_1.method5777(arg1 ? Static420.aClass128_12.anInt3034 : Static420.aClass128_9.anInt3034);
		@Pc(128) int local128 = 1;
		if (Static508.aString87 != null) {
			local128 = Static508.aString87.length() + 1 + 1;
		}
		local115.aClass1_Sub35_Sub2_1.method5776(local128 + local19.anInt7214 + 28);
		local115.aClass1_Sub35_Sub2_1.method5776(618);
		local115.aClass1_Sub35_Sub2_1.method5777(Static307.anInt5279);
		local115.aClass1_Sub35_Sub2_1.method5777(Static246.aClass195_2.anInt4912);
		Static356.method4862(local115.aClass1_Sub35_Sub2_1);
		@Pc(173) String local173 = arg1 ? Static464.aString77 : Static508.aString87;
		local115.aClass1_Sub35_Sub2_1.method5777(local173 == null ? 0 : 1);
		if (local173 != null) {
			local115.aClass1_Sub35_Sub2_1.method5761(local173);
		}
		local115.aClass1_Sub35_Sub2_1.method5781(local19.anInt7214, local19.aByteArray85);
		Static48.method743(local115);
		Static61.anInt1176 = 1;
		Static218.anInt4197 = -3;
		Static112.anInt2212 = 0;
		Static156.anInt2835 = 0;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(JI)V")
	public static void method1047(@OriginalArg(0) long arg0) {
		@Pc(10) int local10 = Static427.anInt7451 + Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9365;
		@Pc(15) int local15 = Static451.anInt7767 + Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9370;
		if (Static417.anInt7669 - local10 < -2000 || Static417.anInt7669 - local10 > 2000 || Static301.anInt5198 - local15 < -2000 || Static301.anInt5198 - local15 > 2000) {
			Static417.anInt7669 = local10;
			Static301.anInt5198 = local15;
		}
		@Pc(55) int local55;
		@Pc(63) int local63;
		if (local10 != Static417.anInt7669) {
			local55 = local10 - Static417.anInt7669;
			local63 = (int) ((long) local55 * arg0 / 320L);
			if (local55 <= 0) {
				if (local63 == 0) {
					local63 = -1;
				} else if (local55 > local63) {
					local63 = local55;
				}
			} else if (local63 == 0) {
				local63 = 1;
			} else if (local55 < local63) {
				local63 = local55;
			}
			Static417.anInt7669 += local63;
		}
		if (!Static348.aClass1_Sub30_Sub1_1.aBoolean383) {
			Static287.aFloat117 += (float) arg0 * Static85.aFloat17 / 6.0F;
			Static167.aFloat59 += (float) arg0 * Static333.aFloat127 / 6.0F;
		}
		if (local15 != Static301.anInt5198) {
			local55 = local15 - Static301.anInt5198;
			local63 = (int) ((long) local55 * arg0 / 320L);
			if (local55 > 0) {
				if (local63 == 0) {
					local63 = 1;
				} else if (local63 > local55) {
					local63 = local55;
				}
			} else if (local63 == 0) {
				local63 = -1;
			} else if (local63 < local55) {
				local63 = local55;
			}
			Static301.anInt5198 += local63;
		}
		Static25.method281();
	}
}
