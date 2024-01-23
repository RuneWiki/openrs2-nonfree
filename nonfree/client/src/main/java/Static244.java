import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "Lclient!gf;")
	public static Class1_Sub2_Sub7 aClass1_Sub2_Sub7_3;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
	public static int anInt5254 = 0;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)I")
	public static int method3991(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(4) int local4 = arg2.length();
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = 0;
		@Pc(15) int local15 = arg0.length();
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local4 > local10 - local17 || local15 > local12 - local19) {
			if (local10 - local17 >= local4) {
				return -1;
			}
			if (local12 - local19 >= local15) {
				return 1;
			}
			@Pc(61) char local61;
			if (local17 == '\u0000') {
				local61 = arg2.charAt(local10++);
			} else {
				local61 = local17;
			}
			@Pc(74) char local74;
			if (local19 == '\u0000') {
				local74 = arg0.charAt(local12++);
			} else {
				local74 = local19;
			}
			local17 = Static201.method3340(local61);
			local19 = Static201.method3340(local74);
			local61 = Static240.method3944(arg1, local61);
			local74 = Static240.method3944(arg1, local74);
			if (local61 != local74 && Character.toUpperCase(local61) != Character.toUpperCase(local74)) {
				local61 = Character.toLowerCase(local61);
				local74 = Character.toLowerCase(local74);
				if (local74 != local61) {
					return Static14.method236(local61, arg1) - Static14.method236(local74, arg1);
				}
			}
		}
		@Pc(141) int local141 = Math.min(local4, local15);
		for (@Pc(143) int local143 = 0; local143 < local141; local143++) {
			if (arg1 == 2) {
				local10 = local4 - local143 - 1;
				local12 = local15 - local143 - 1;
			} else {
				local12 = local143;
				local10 = local143;
			}
			@Pc(171) char local171 = arg2.charAt(local10);
			@Pc(175) char local175 = arg0.charAt(local12);
			if (local171 != local175 && Character.toUpperCase(local171) != Character.toUpperCase(local175)) {
				local171 = Character.toLowerCase(local171);
				local175 = Character.toLowerCase(local175);
				if (local171 != local175) {
					return Static14.method236(local171, arg1) - Static14.method236(local175, arg1);
				}
			}
		}
		@Pc(215) int local215 = local4 - local15;
		if (local215 != 0) {
			return local215;
		}
		for (@Pc(221) int local221 = 0; local221 < local141; local221++) {
			@Pc(227) char local227 = arg2.charAt(local221);
			@Pc(231) char local231 = arg0.charAt(local221);
			if (local231 != local227) {
				return Static14.method236(local227, arg1) - Static14.method236(local231, arg1);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V")
	public static void method3993() {
		for (@Pc(19) Class1_Sub21 local19 = (Class1_Sub21) Static174.aClass3_17.method30(); local19 != null; local19 = (Class1_Sub21) Static174.aClass3_17.method33()) {
			if (local19.anInt4021 == -1) {
				local19.anInt4026 = 0;
				Static97.method2671(local19);
			} else {
				local19.method4186();
			}
		}
	}
}
