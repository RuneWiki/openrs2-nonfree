import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!tk", name = "Ob", descriptor = "I")
	public static int anInt5343;

	@OriginalMember(owner = "client!tk", name = "ac", descriptor = "I")
	public static int anInt5354;

	@OriginalMember(owner = "client!tk", name = "dc", descriptor = "I")
	public static int anInt5357;

	@OriginalMember(owner = "client!tk", name = "Rb", descriptor = "I")
	public static int anInt5346 = 0;

	@OriginalMember(owner = "client!tk", name = "Sb", descriptor = "Lclient!ff;")
	public static Class2_Sub11 aClass2_Sub11_2 = new Class2_Sub11(0, -1);

	@OriginalMember(owner = "client!tk", name = "ec", descriptor = "I")
	public static int anInt5358 = 0;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method4284(@OriginalArg(1) String arg0) {
		if (Static137.aClass2_Sub30Array1 == null) {
			return;
		}
		@Pc(21) long local21 = Static61.method2447(arg0);
		@Pc(23) int local23 = 0;
		if (local21 == 0L) {
			return;
		}
		while (local23 < Static137.aClass2_Sub30Array1.length && local21 != Static137.aClass2_Sub30Array1[local23].aLong315) {
			local23++;
		}
		if (Static137.aClass2_Sub30Array1.length > local23 && Static137.aClass2_Sub30Array1[local23] != null) {
			Static95.aClass2_Sub26_Sub1_1.method4287(122);
			Static95.aClass2_Sub26_Sub1_1.method4225(Static137.aClass2_Sub30Array1[local23].aLong315);
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IBLclient!jd;)Lclient!af;")
	public static Class2_Sub3_Sub1_Sub1 method4286(@OriginalArg(0) int arg0, @OriginalArg(2) Class84 arg1) {
		return Static61.method2444(arg1, arg0) ? Static229.method4366() : null;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BILjava/lang/String;Z)I")
	public static int method4289(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(36) boolean local36 = false;
		@Pc(38) boolean local38 = false;
		@Pc(40) int local40 = 0;
		@Pc(43) int local43 = arg1.length();
		for (@Pc(45) int local45 = 0; local45 < local43; local45++) {
			@Pc(52) char local52 = arg1.charAt(local45);
			if (local45 == 0) {
				if (local52 == '-') {
					local38 = true;
					continue;
				}
				if (local52 == '+') {
					continue;
				}
			}
			@Pc(107) int local107;
			if (local52 >= '0' && local52 <= '9') {
				local107 = local52 - '0';
			} else if (local52 >= 'A' && local52 <= 'Z') {
				local107 = local52 - '7';
			} else if (local52 >= 'a' && local52 <= 'z') {
				local107 = local52 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local107 >= arg0) {
				throw new NumberFormatException();
			}
			if (local38) {
				local107 = -local107;
			}
			@Pc(135) int local135 = local107 + arg0 * local40;
			if (local40 != local135 / arg0) {
				throw new NumberFormatException();
			}
			local36 = true;
			local40 = local135;
		}
		if (!local36) {
			throw new NumberFormatException();
		}
		return local40;
	}
}
