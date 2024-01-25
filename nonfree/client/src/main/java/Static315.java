import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!m", name = "a", descriptor = "[Lclient!xa;")
	public static Class13[] aClass13Array20;

	@OriginalMember(owner = "client!m", name = "e", descriptor = "I")
	public static int anInt5654 = 0;

	@OriginalMember(owner = "client!m", name = "f", descriptor = "Lclient!db;")
	public static final Class64 aClass64_280 = new Class64(67, -2);

	@OriginalMember(owner = "client!m", name = "i", descriptor = "[I")
	public static final int[] anIntArray468 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
	public static void method4803() throws IOException {
		if (Static235.aClass45_1 == null || Static465.anInt7842 <= 0) {
			return;
		}
		@Pc(19) int local19 = 0;
		while (true) {
			@Pc(24) Class4_Sub41 local24 = (Class4_Sub41) Static508.aClass124_59.method3267();
			if (local24 == null) {
				Static44.anInt841 += local19;
				Static248.anInt4940 = 0;
				return;
			}
			Static235.aClass45_1.method837(local24.aClass4_Sub9_Sub1_3.aByteArray97, local24.anInt7684);
			local19 += local24.anInt7684;
			Static465.anInt7842 -= local24.anInt7684;
			local24.method8013();
			local24.aClass4_Sub9_Sub1_3.method5998();
			local24.method6353();
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I[I)Ljava/lang/String;")
	public static String method4804(@OriginalArg(1) int[] arg0) {
		@Pc(16) StringBuffer local16 = new StringBuffer();
		@Pc(18) int local18 = Static550.anInt9238;
		for (@Pc(20) int local20 = 0; local20 < arg0.length; local20++) {
			@Pc(31) Class164 local31 = Static63.aClass140_1.method3540(arg0[local20]);
			if (local31.anInt4682 != -1) {
				@Pc(44) Class13 local44 = (Class13) Static567.aClass223_68.method4943((long) local31.anInt4682);
				if (local44 == null) {
					@Pc(52) Class268 local52 = Static607.method5872(Static360.aClass31_78, local31.anInt4682, 0);
					if (local52 != null) {
						local44 = Static185.aClass66_14.method6799(local52, true);
						Static567.aClass223_68.method4938((long) local31.anInt4682, local44);
					}
				}
				if (local44 != null) {
					Static367.aClass13Array24[local18] = local44;
					local16.append(" <img=").append(local18).append(">");
					local18++;
				}
			}
		}
		return local16.toString();
	}
}
