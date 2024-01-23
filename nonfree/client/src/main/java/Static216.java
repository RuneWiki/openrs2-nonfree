import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
	public static int anInt4216;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "[I")
	public static int[] anIntArray447 = new int[100];

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString257 = "glow3:";

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "Z")
	public static boolean aBoolean298 = false;

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
	public static int anInt4214 = 1;

	@OriginalMember(owner = "client!pn", name = "f", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
	public static volatile int anInt4215 = 0;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
	public static String method3514(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(45) int local45 = 0;
			for (@Pc(47) long local47 = arg0; local47 != 0L; local47 /= 37L) {
				local45++;
			}
			@Pc(63) StringBuffer local63 = new StringBuffer(local45);
			while (arg0 != 0L) {
				@Pc(71) long local71 = arg0;
				arg0 /= 37L;
				@Pc(85) char local85 = Static157.aCharArray1[(int) (local71 - arg0 * 37L)];
				if (local85 == '_') {
					local85 = ' ';
					@Pc(95) int local95 = local63.length() - 1;
					local63.setCharAt(local95, Character.toUpperCase(local63.charAt(local95)));
				}
				local63.append(local85);
			}
			local63.reverse();
			local63.setCharAt(0, Character.toUpperCase(local63.charAt(0)));
			return local63.toString();
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIILclient!vc;JLclient!vc;Lclient!vc;)V")
	public static void method3515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class53 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class53 arg6, @OriginalArg(7) Class53 arg7) {
		@Pc(3) Class183 local3 = new Class183();
		local3.aClass53_7 = arg4;
		local3.anInt5497 = arg1 * 128 + 64;
		local3.anInt5504 = arg2 * 128 + 64;
		local3.anInt5502 = arg3;
		local3.aLong194 = arg5;
		local3.aClass53_8 = arg6;
		local3.aClass53_6 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(42) Class4_Sub19 local42 = Static6.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt3554; local46++) {
				@Pc(55) Class33 local55 = local42.aClass33Array3[local46];
				if ((local55.aLong38 & 0x400000L) == 4194304L) {
					@Pc(66) int local66 = local55.aClass53_1.method3850();
					if (local66 != -32768 && local66 < local34) {
						local34 = local66;
					}
				}
			}
		}
		local3.anInt5500 = -local34;
		if (Static6.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static6.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2] = new Class4_Sub19(arg0, arg1, arg2);
		}
		Static6.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2].aClass183_1 = local3;
	}
}
