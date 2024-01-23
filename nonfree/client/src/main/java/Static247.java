import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "Z")
	public static boolean aBoolean348;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
	public static int anInt4992 = 0;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString175 = "cyan:";

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)V")
	public static void method4162(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static161.anIntArray347[arg0] = arg1;
		@Pc(21) Class3_Sub32 local21 = (Class3_Sub32) Static187.aClass30_20.method663((long) arg0);
		if (local21 == null) {
			local21 = new Class3_Sub32(Static128.method2196() + 500L);
			Static187.aClass30_20.method668(local21, (long) arg0);
		} else {
			local21.aLong242 = Static128.method2196() + 500L;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;B)I")
	public static int method4164(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 0;
		@Pc(25) char local25 = 0;
		@Pc(27) char local27 = 0;
		while (local8 > local21 - local25 || local11 > local23 - local27) {
			if (local8 <= local21 - local25) {
				return -1;
			}
			if (local11 <= local23 - local27) {
				return 1;
			}
			@Pc(69) char local69;
			if (local25 == '\u0000') {
				local69 = arg2.charAt(local21++);
			} else {
				local69 = local25;
			}
			@Pc(85) char local85;
			if (local27 == '\u0000') {
				local85 = arg0.charAt(local23++);
			} else {
				local85 = local27;
			}
			local25 = Static149.method2523(local69);
			local27 = Static149.method2523(local85);
			local69 = Static258.method4341(local69, arg1);
			local85 = Static258.method4341(local85, arg1);
			if (local69 != local85 && Character.toUpperCase(local69) != Character.toUpperCase(local85)) {
				local69 = Character.toLowerCase(local69);
				local85 = Character.toLowerCase(local85);
				if (local69 != local85) {
					return Static270.method4467(arg1, local69) - Static270.method4467(arg1, local85);
				}
			}
		}
		@Pc(151) int local151 = Math.min(local8, local11);
		@Pc(192) char local192;
		@Pc(153) int local153;
		for (local153 = 0; local153 < local151; local153++) {
			if (arg1 == 2) {
				local23 = local11 - local153 - 1;
				local21 = local8 - local153 - 1;
			} else {
				local23 = local153;
				local21 = local153;
			}
			@Pc(188) char local188 = arg2.charAt(local21);
			local192 = arg0.charAt(local23);
			if (local188 != local192 && Character.toUpperCase(local188) != Character.toUpperCase(local192)) {
				local188 = Character.toLowerCase(local188);
				local192 = Character.toLowerCase(local192);
				if (local188 != local192) {
					return Static270.method4467(arg1, local188) - Static270.method4467(arg1, local192);
				}
			}
		}
		local153 = local8 - local11;
		if (local153 != 0) {
			return local153;
		}
		for (@Pc(242) int local242 = 0; local242 < local151; local242++) {
			local192 = arg2.charAt(local242);
			@Pc(257) char local257 = arg0.charAt(local242);
			if (local257 != local192) {
				return Static270.method4467(arg1, local192) - Static270.method4467(arg1, local257);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILclient!ud;)V")
	public static void method4165(@OriginalArg(1) Class10_Sub5 arg0) {
		@Pc(16) int local16 = arg0.anInt5094 - Static124.anInt2371;
		@Pc(27) int local27 = arg0.anInt5040 * 128 + arg0.method4186() * 64;
		@Pc(40) int local40 = arg0.anInt5012 * 128 + arg0.method4186() * 64;
		if (arg0.anInt5070 == 0) {
			arg0.anInt5018 = 1024;
		}
		arg0.anInt5073 += (local27 - arg0.anInt5073) / local16;
		arg0.anInt5016 += (local40 - arg0.anInt5016) / local16;
		arg0.anInt5059 = 0;
		if (arg0.anInt5070 == 1) {
			arg0.anInt5018 = 1536;
		}
		if (arg0.anInt5070 == 2) {
			arg0.anInt5018 = 0;
		}
		if (arg0.anInt5070 == 3) {
			arg0.anInt5018 = 512;
		}
	}
}
