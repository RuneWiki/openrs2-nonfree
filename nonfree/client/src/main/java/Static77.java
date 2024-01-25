import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(Z)V")
	public static void method1557() {
		Static278.method4791(Static446.aClass158_108);
		Static515.aClass3_Sub27_Sub1_2.method7576(0);
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
	public static String method1559(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg2];
		@Pc(10) int local10 = 0;
		for (@Pc(19) int local19 = 0; local19 < arg2; local19++) {
			@Pc(29) int local29 = arg1[arg0 + local19] & 0xFF;
			if (local29 != 0) {
				if (local29 >= 128 && local29 < 160) {
					@Pc(47) char local47 = Static81.aCharArray4[local29 - 128];
					if (local47 == '\u0000') {
						local47 = '?';
					}
					local29 = local47;
				}
				local8[local10++] = (char) local29;
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(Lclient!rt;Z)Lclient!nd;")
	public static Class201 method1563(@OriginalArg(0) Class3_Sub27 arg0) {
		@Pc(7) Class201 local7 = new Class201();
		local7.anInt6162 = arg0.method7591();
		local7.aClass3_Sub10_Sub3_1 = Static494.aClass227_2.method5726(local7.anInt6162);
		return local7;
	}
}
