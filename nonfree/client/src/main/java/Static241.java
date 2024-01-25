import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "[Lclient!iea;")
	public static Class31[] aClass31Array7;

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
	public static int anInt4678 = 0;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)Z")
	public static boolean method4097(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)I")
	public static int method4099(@OriginalArg(1) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "([Lclient!rba;II)V")
	public static void method4101(@OriginalArg(0) Class16_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class16_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt8035;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt8035 < local27 + (local29 & 0x1)) {
				@Pc(44) Class16_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method4101(arg0, arg1, local10 - 1);
		method4101(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)I")
	public static int method4102() {
		@Pc(5) int local5 = 0;
		@Pc(20) Field[] local20 = wo.class.getDeclaredFields();
		for (@Pc(24) int local24 = 0; local24 < local20.length; local24++) {
			@Pc(29) Field local29 = local20[local24];
			if (rq.class.isAssignableFrom(local29.getType())) {
				local5++;
			}
		}
		return local5 + 1;
	}
}
