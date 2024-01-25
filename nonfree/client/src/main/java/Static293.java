import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!oo", name = "I", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_136 = new Class12(79, 12);

	@OriginalMember(owner = "client!oo", name = "J", descriptor = "I")
	public static int anInt5132 = 0;

	@OriginalMember(owner = "client!oo", name = "K", descriptor = "J")
	public static volatile long aLong154 = 0L;

	@OriginalMember(owner = "client!oo", name = "L", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_186 = new Class103(24, -1);

	@OriginalMember(owner = "client!oo", name = "M", descriptor = "Lclient!wq;")
	public static final Class269 aClass269_37 = new Class269(11, 16);

	@OriginalMember(owner = "client!oo", name = "N", descriptor = "[I")
	public static final int[] anIntArray334 = new int[14];

	@OriginalMember(owner = "client!oo", name = "O", descriptor = "[Lclient!cc;")
	public static final Class1_Sub5_Sub2[] aClass1_Sub5_Sub2Array2 = new Class1_Sub5_Sub2[14];

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;I)I")
	public static int method4020(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(26) char local26 = 0;
		@Pc(28) char local28 = 0;
		while (local8 > local13 - local26 || local11 > local15 - local28) {
			if (local8 <= local13 - local26) {
				return -1;
			}
			if (local11 <= local15 - local28) {
				return 1;
			}
			@Pc(77) char local77;
			if (local26 == '\u0000') {
				local77 = arg0.charAt(local13++);
			} else {
				local77 = local26;
			}
			@Pc(90) char local90;
			if (local28 == '\u0000') {
				local90 = arg1.charAt(local15++);
			} else {
				local90 = local28;
			}
			local26 = Static317.method4273(local77);
			local28 = Static317.method4273(local90);
			local77 = Static187.method2684(local77, arg2);
			local90 = Static187.method2684(local90, arg2);
			if (local90 != local77 && Character.toUpperCase(local77) != Character.toUpperCase(local90)) {
				local77 = Character.toLowerCase(local77);
				local90 = Character.toLowerCase(local90);
				if (local77 != local90) {
					return Static122.method1922(local77, arg2) - Static122.method1922(local90, arg2);
				}
			}
		}
		@Pc(155) int local155 = Math.min(local8, local11);
		for (@Pc(157) int local157 = 0; local157 < local155; local157++) {
			if (arg2 == 2) {
				local13 = local8 - local157 - 1;
				local15 = local11 - local157 - 1;
			} else {
				local15 = local157;
				local13 = local157;
			}
			@Pc(185) char local185 = arg0.charAt(local13);
			@Pc(189) char local189 = arg1.charAt(local15);
			if (local189 != local185 && Character.toUpperCase(local185) != Character.toUpperCase(local189)) {
				local185 = Character.toLowerCase(local185);
				local189 = Character.toLowerCase(local189);
				if (local189 != local185) {
					return Static122.method1922(local185, arg2) - Static122.method1922(local189, arg2);
				}
			}
		}
		@Pc(241) int local241 = local8 - local11;
		if (local241 != 0) {
			return local241;
		}
		for (@Pc(250) int local250 = 0; local250 < local155; local250++) {
			@Pc(256) char local256 = arg0.charAt(local250);
			@Pc(260) char local260 = arg1.charAt(local250);
			if (local256 != local260) {
				return Static122.method1922(local256, arg2) - Static122.method1922(local260, arg2);
			}
		}
		return 0;
	}
}
