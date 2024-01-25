import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!pr", name = "v", descriptor = "Lclient!o;")
	public static Class259 aClass259_8;

	@OriginalMember(owner = "client!pr", name = "w", descriptor = "[I")
	public static int[] anIntArray505;

	@OriginalMember(owner = "client!pr", name = "q", descriptor = "Lclient!nn;")
	public static Class255 aClass255_5;

	@OriginalMember(owner = "client!pr", name = "p", descriptor = "Lclient!tf;")
	public static final Class340 aClass340_61 = new Class340();

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(JI)V")
	public static void method7098(@OriginalArg(0) long arg0) {
		@Pc(7) int local7 = Static492.anInt3485;
		@Pc(19) int local19;
		@Pc(27) int local27;
		if (Static170.anInt3533 != local7) {
			local19 = local7 - Static170.anInt3533;
			local27 = (int) ((long) local19 * arg0 / 320L);
			if (local19 <= 0) {
				if (local27 == 0) {
					local27 = -1;
				} else if (local27 < local19) {
					local27 = local19;
				}
			} else if (local27 == 0) {
				local27 = 1;
			} else if (local19 < local27) {
				local27 = local19;
			}
			Static170.anInt3533 += local27;
		}
		@Pc(81) int local81 = Static553.anInt8968;
		Static409.aFloat135 += Static620.aFloat195 * (float) arg0 / 40.0F * 8.0F;
		if (Static331.anInt8309 != local81) {
			local19 = local81 - Static331.anInt8309;
			local27 = (int) ((long) local19 * arg0 / 320L);
			if (local19 <= 0) {
				if (local27 == 0) {
					local27 = -1;
				} else if (local19 > local27) {
					local27 = local19;
				}
			} else if (local27 == 0) {
				local27 = 1;
			} else if (local19 < local27) {
				local27 = local19;
			}
			Static331.anInt8309 += local27;
		}
		Static135.aFloat51 += Static145.aFloat52 * (float) arg0 / 40.0F * 8.0F;
		Static23.method264();
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!iga;Lclient!uja;Lclient!ha;IILclient!o;III)V")
	public static void method7099(@OriginalArg(0) Class6_Sub24 arg0, @OriginalArg(1) Class361 arg1, @OriginalArg(2) Class75 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class259 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(21) int local21 = arg6 - arg3 / 2 - 5;
		@Pc(25) int local25 = arg7 + 2;
		if (arg1.anInt9808 != 0) {
			arg2.method6631(arg3 + 10, local21, arg7 + arg4.method6290() * arg5 + 1 - local25, arg1.anInt9808, local25);
		}
		if (arg1.anInt9817 != 0) {
			arg2.method6718(arg4.method6290() * arg5 + arg7 + 1 - local25, local25, arg1.anInt9817, arg3 + 10, local21);
		}
		@Pc(79) int local79 = arg1.anInt9803;
		if (arg0.aBoolean365 && arg1.anInt9804 != -1) {
			local79 = arg1.anInt9804;
		}
		for (@Pc(93) int local93 = 0; local93 < arg5; local93++) {
			@Pc(99) String local99 = Static12.aStringArray4[local93];
			if (local93 < arg5 - 1) {
				local99 = local99.substring(0, local99.length() - 4);
			}
			arg4.method6293(arg2, local99, arg6, arg7, local79);
			arg7 += arg4.method6290();
		}
	}
}
