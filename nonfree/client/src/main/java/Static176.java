import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!im", name = "o", descriptor = "I")
	public static int anInt3298;

	@OriginalMember(owner = "client!im", name = "n", descriptor = "Lclient!ik;")
	public static final Class3_Sub25_Sub1 aClass3_Sub25_Sub1_1 = new Class3_Sub25_Sub1(5000);

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)I")
	public static int method2834(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local8 > local13 - local17 || local11 > local15 - local19) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local11 <= local15 - local19) {
				return 1;
			}
			@Pc(62) char local62;
			if (local17 == '\u0000') {
				local62 = arg0.charAt(local13++);
			} else {
				local62 = local17;
			}
			@Pc(78) char local78;
			if (local19 == '\u0000') {
				local78 = arg1.charAt(local15++);
			} else {
				local78 = local19;
			}
			local17 = Static84.method5001(local62);
			local19 = Static84.method5001(local78);
			local62 = Static308.method4353(local62, arg2);
			local78 = Static308.method4353(local78, arg2);
			if (local62 != local78 && Character.toUpperCase(local62) != Character.toUpperCase(local78)) {
				local62 = Character.toLowerCase(local62);
				local78 = Character.toLowerCase(local78);
				if (local62 != local78) {
					return Static348.method4870(local62, arg2) - Static348.method4870(local78, arg2);
				}
			}
		}
		@Pc(138) int local138 = Math.min(local8, local11);
		for (@Pc(140) int local140 = 0; local140 < local138; local140++) {
			if (arg2 == 2) {
				local15 = local11 - local140 - 1;
				local13 = local8 - local140 - 1;
			} else {
				local15 = local140;
				local13 = local140;
			}
			@Pc(171) char local171 = arg0.charAt(local13);
			@Pc(175) char local175 = arg1.charAt(local15);
			if (local171 != local175 && Character.toUpperCase(local171) != Character.toUpperCase(local175)) {
				local171 = Character.toLowerCase(local171);
				local175 = Character.toLowerCase(local175);
				if (local175 != local171) {
					return Static348.method4870(local171, arg2) - Static348.method4870(local175, arg2);
				}
			}
		}
		@Pc(216) int local216 = local8 - local11;
		if (local216 != 0) {
			return local216;
		}
		for (@Pc(225) int local225 = 0; local225 < local138; local225++) {
			@Pc(231) char local231 = arg0.charAt(local225);
			@Pc(235) char local235 = arg1.charAt(local225);
			if (local235 != local231) {
				return Static348.method4870(local231, arg2) - Static348.method4870(local235, arg2);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IZZ)V")
	public static void method2835(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static129.anInt2347++;
			Static378.method5251();
		}
		if (arg1) {
			Static203.anInt3630++;
			Static330.method4574();
		}
	}
}
