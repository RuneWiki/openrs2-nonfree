import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
	public static int anInt3250;

	@OriginalMember(owner = "client!jl", name = "g", descriptor = "Lclient!wa;")
	public static final Class257 aClass257_3 = new Class257("WIP", 2);

	@OriginalMember(owner = "client!jl", name = "i", descriptor = "[Z")
	public static final boolean[] aBooleanArray16 = new boolean[5];

	@OriginalMember(owner = "client!jl", name = "k", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method2907(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 < arg0 + arg4 && arg1 + arg6 > arg4) {
			return arg5 + arg3 > arg2 && arg2 + arg7 > arg5;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method2909(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static165.anInt2940 >= 100 && !Static181.aBoolean223 || Static165.anInt2940 >= 200) {
			Static109.method1805(Static177.aClass231_47.method5138(Static382.anInt6289));
			return;
		}
		@Pc(37) String local37 = Static214.method3328(arg0);
		if (local37 == null) {
			return;
		}
		@Pc(80) String local80;
		for (@Pc(42) int local42 = 0; local42 < Static165.anInt2940; local42++) {
			@Pc(50) String local50 = Static214.method3328(Static208.aStringArray24[local42]);
			if (local50 != null && local50.equals(local37)) {
				Static109.method1805(arg0 + Static216.aClass231_68.method5138(Static382.anInt6289));
				return;
			}
			if (Static76.aStringArray8[local42] != null) {
				local80 = Static214.method3328(Static76.aStringArray8[local42]);
				if (local80 != null && local80.equals(local37)) {
					Static109.method1805(arg0 + Static216.aClass231_68.method5138(Static382.anInt6289));
					return;
				}
			}
		}
		for (@Pc(110) int local110 = 0; local110 < Static203.anInt3584; local110++) {
			local80 = Static214.method3328(Static411.aStringArray46[local110]);
			if (local80 != null && local80.equals(local37)) {
				Static109.method1805(Static425.aClass231_111.method5138(Static382.anInt6289) + arg0 + Static415.aClass231_107.method5138(Static382.anInt6289));
				return;
			}
			if (Static371.aStringArray43[local110] != null) {
				@Pc(153) String local153 = Static214.method3328(Static371.aStringArray43[local110]);
				if (local153 != null && local153.equals(local37)) {
					Static109.method1805(Static425.aClass231_111.method5138(Static382.anInt6289) + arg0 + Static415.aClass231_107.method5138(Static382.anInt6289));
					return;
				}
			}
		}
		if (Static214.method3328(Static134.aClass3_Sub3_Sub6_Sub1_1.aString48).equals(local37)) {
			Static109.method1805(Static422.aClass231_108.method5138(Static382.anInt6289));
		} else {
			Static298.method4373(Static437.aClass25_114);
			Static449.aClass6_Sub15_Sub1_2.method3075(Static384.method5308(arg0));
			Static449.aClass6_Sub15_Sub1_2.method3094(arg0);
		}
	}
}
