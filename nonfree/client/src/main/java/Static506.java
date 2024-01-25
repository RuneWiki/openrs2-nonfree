import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!sba", name = "p", descriptor = "I")
	public static int anInt9325;

	@OriginalMember(owner = "client!sba", name = "t", descriptor = "I")
	public static int anInt9329 = 1;

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method7807(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(29) long local29 = arg0; local29 != 0L; local29 /= 37L) {
				local27++;
			}
			@Pc(53) StringBuffer local53 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(57) long local57 = arg0;
				arg0 /= 37L;
				@Pc(71) char local71 = Static248.aCharArray2[(int) (local57 - arg0 * 37L)];
				if (local71 == '_') {
					@Pc(81) int local81 = local53.length() - 1;
					local53.setCharAt(local81, Character.toUpperCase(local53.charAt(local81)));
					local71 = ' ';
				}
				local53.append(local71);
			}
			local53.reverse();
			local53.setCharAt(0, Character.toUpperCase(local53.charAt(0)));
			return local53.toString();
		}
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(I[IILclient!ke;)V")
	public static void method7810(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub1_Sub3_Sub3_Sub2 arg2) {
		@Pc(10) boolean local10;
		@Pc(12) int local12;
		if (arg2.anIntArray349 != null) {
			local10 = true;
			for (local12 = 0; local12 < arg2.anIntArray349.length; local12++) {
				if (arg0[local12] != arg2.anIntArray349[local12]) {
					local10 = false;
					break;
				}
			}
			if (local10 && arg2.anInt6079 != -1) {
				@Pc(49) Class130 local49 = Static195.aClass193_1.method5573(arg2.anInt6079);
				@Pc(52) int local52 = local49.anInt4705;
				if (local52 == 1) {
					arg2.anInt6037 = 0;
					arg2.anInt6063 = 0;
					arg2.anInt6086 = 0;
					arg2.anInt6029 = arg1;
					arg2.anInt6046 = 1;
					if (!arg2.aBoolean454) {
						Static609.method8918(arg2, arg2.anInt6063, local49);
					}
				}
				if (local52 == 2) {
					arg2.anInt6086 = 0;
				}
			}
		}
		local10 = true;
		for (local12 = 0; local12 < arg0.length; local12++) {
			if (arg0[local12] != -1) {
				local10 = false;
			}
			if (arg2.anIntArray349 == null || arg2.anIntArray349[local12] == -1 || Static195.aClass193_1.method5573(arg0[local12]).anInt4699 >= Static195.aClass193_1.method5573(arg2.anIntArray349[local12]).anInt4699) {
				arg2.anInt6029 = arg1;
				arg2.anIntArray349 = arg0;
				break;
			}
		}
		if (local10) {
			arg2.anIntArray349 = arg0;
			arg2.anInt6029 = arg1;
		}
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(IIIIBI)V")
	public static void method7811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static317.method5515(Static237.anInt5159, arg0, Static380.anInt7421);
		@Pc(17) int local17 = Static317.method5515(Static237.anInt5159, arg2, Static380.anInt7421);
		@Pc(23) int local23 = Static317.method5515(Static38.anInt823, arg1, Static161.anInt7734);
		@Pc(29) int local29 = Static317.method5515(Static38.anInt823, arg3, Static161.anInt7734);
		for (@Pc(39) int local39 = local11; local39 <= local17; local39++) {
			Static280.method5108(local29, Static208.anIntArrayArray20[local39], local23, arg4);
		}
	}
}
