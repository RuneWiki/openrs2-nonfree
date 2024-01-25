import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!nv", name = "y", descriptor = "Lclient!f;")
	public static Class76 aClass76_12;

	@OriginalMember(owner = "client!nv", name = "L", descriptor = "I")
	public static int anInt4999;

	@OriginalMember(owner = "client!nv", name = "F", descriptor = "I")
	public static int anInt4993 = 0;

	@OriginalMember(owner = "client!nv", name = "J", descriptor = "I")
	public static int anInt4997 = 0;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method4041(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static384.method5331(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < Static220.anInt4206; local31++) {
			@Pc(37) String local37 = Static74.aStringArray8[local31];
			if (local37.startsWith("*")) {
				local37 = local37.substring(1);
			}
			local37 = Static384.method5331(local37);
			if (local37 != null && local37.equals(local20)) {
				Static220.anInt4206--;
				for (@Pc(61) int local61 = local31; local61 < Static220.anInt4206; local61++) {
					Static74.aStringArray8[local61] = Static74.aStringArray8[local61 + 1];
					Static432.aStringArray43[local61] = Static432.aStringArray43[local61 + 1];
					Static203.aStringArray17[local61] = Static203.aStringArray17[local61 + 1];
					Static306.aStringArray29[local61] = Static306.aStringArray29[local61 + 1];
					Static100.aBooleanArray53[local61] = Static100.aBooleanArray53[local61 + 1];
				}
				Static337.anInt5964 = Static331.anInt5891;
				Static448.method6059(Static439.aClass44_97);
				Static98.aClass2_Sub20_Sub1_1.method3699(Static209.method3225(arg0));
				Static98.aClass2_Sub20_Sub1_1.method3715(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(III)V")
	public static void method4043(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static168.anInt3256 = arg1 - Static169.anInt3159;
		Static452.anInt7845 = arg0 - Static169.anInt3161;
	}
}
