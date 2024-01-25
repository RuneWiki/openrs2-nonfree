import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!lp", name = "h", descriptor = "I")
	public static int anInt5454;

	@OriginalMember(owner = "client!lp", name = "i", descriptor = "I")
	public static int anInt5455;

	@OriginalMember(owner = "client!lp", name = "j", descriptor = "I")
	public static int anInt5456;

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "[Lclient!up;")
	public static final Class352[] aClass352Array1 = new Class352[4];

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "[J")
	public static final long[] aLongArray5 = new long[32];

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4877(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(24) String local24 = Static156.method2258(arg0);
		if (local24 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < Static225.anInt4205; local29++) {
			@Pc(35) String local35 = Static447.aStringArray59[local29];
			if (local35.startsWith("*")) {
				local35 = local35.substring(1);
			}
			local35 = Static156.method2258(local35);
			if (local35 != null && local35.equals(local24)) {
				Static225.anInt4205--;
				for (@Pc(59) int local59 = local29; local59 < Static225.anInt4205; local59++) {
					Static447.aStringArray59[local59] = Static447.aStringArray59[local59 + 1];
					Static518.aStringArray70[local59] = Static518.aStringArray70[local59 + 1];
					Static526.aStringArray72[local59] = Static526.aStringArray72[local59 + 1];
					Static530.aStringArray75[local59] = Static530.aStringArray75[local59 + 1];
					Static189.aBooleanArray29[local59] = Static189.aBooleanArray29[local59 + 1];
				}
				Static197.anInt10377 = Static126.anInt2290;
				@Pc(120) Class5_Sub48 local120 = Static16.method232(Static616.aClass46_107, Static276.aClass251_2);
				local120.aClass5_Sub22_Sub1_2.method5905(Static381.method5596(arg0));
				local120.aClass5_Sub22_Sub1_2.method5910(arg0);
				Static277.method4436(local120);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!ofa;I)V")
	public static void method4879(@OriginalArg(0) Class5_Sub22 arg0) {
		@Pc(13) byte[] local13 = new byte[24];
		if (Static389.aClass363_5 != null) {
			@Pc(25) int local25;
			try {
				Static389.aClass363_5.method8575(0L);
				Static389.aClass363_5.method8566(local13);
				for (local25 = 0; local25 < 24 && local13[local25] == 0; local25++) {
				}
				if (local25 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(52) Exception local52) {
				for (local25 = 0; local25 < 24; local25++) {
					local13[local25] = -1;
				}
			}
		}
		arg0.method5925(local13, 0, 24);
	}
}
