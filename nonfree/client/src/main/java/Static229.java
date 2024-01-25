import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!ln", name = "j", descriptor = "I")
	public static int anInt3886;

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_62 = new Class186(20, 0);

	@OriginalMember(owner = "client!ln", name = "l", descriptor = "I")
	public static int anInt3888 = 0;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZI)V")
	public static void method3472(@OriginalArg(1) int arg0) {
		@Pc(12) Class6_Sub1_Sub12 local12 = Static449.method5975(arg0, 10);
		local12.method3048();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZB)V")
	public static void method3474() {
		Static298.method4373(Static161.aClass25_45);
		for (@Pc(21) Class6_Sub16 local21 = (Class6_Sub16) Static20.aClass137_3.method3181(); local21 != null; local21 = (Class6_Sub16) Static20.aClass137_3.method3182()) {
			if (!local21.method5980()) {
				local21 = (Class6_Sub16) Static20.aClass137_3.method3181();
				if (local21 == null) {
					break;
				}
			}
			if (local21.anInt2717 == 0) {
				Static60.method1108(true, true, local21);
			}
		}
		if (Static46.aClass239_13 != null) {
			Static354.method4992(Static46.aClass239_13);
			Static46.aClass239_13 = null;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "([BB)Lclient!wt;")
	public static Class6_Sub1_Sub18 method3475(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class6_Sub1_Sub18 local9 = new Class6_Sub1_Sub18();
		@Pc(19) Class6_Sub15 local19 = new Class6_Sub15(arg0);
		local19.anInt3487 = local19.aByteArray51.length - 2;
		@Pc(30) int local30 = local19.method3108();
		@Pc(41) int local41 = local19.aByteArray51.length - local30 - 12 - 2;
		local19.anInt3487 = local41;
		@Pc(48) int local48 = local19.method3109();
		local9.anInt7272 = local19.method3108();
		local9.anInt7269 = local19.method3108();
		local9.anInt7273 = local19.method3108();
		local9.anInt7271 = local19.method3108();
		@Pc(72) int local72 = local19.method3111();
		@Pc(80) int local80;
		@Pc(86) int local86;
		if (local72 > 0) {
			local9.aClass137Array1 = new Class137[local72];
			for (local80 = 0; local80 < local72; local80++) {
				local86 = local19.method3108();
				@Pc(95) Class137 local95 = new Class137(Static420.method5696(local86));
				local9.aClass137Array1[local80] = local95;
				while (local86-- > 0) {
					@Pc(106) int local106 = local19.method3109();
					@Pc(110) int local110 = local19.method3109();
					local95.method3179((long) local106, new Class6_Sub44(local110));
				}
			}
		}
		local19.anInt3487 = 0;
		local9.aString71 = local19.method3134();
		local9.anIntArray641 = new int[local48];
		local9.aStringArray47 = new String[local48];
		local9.anIntArray644 = new int[local48];
		local80 = 0;
		while (local19.anInt3487 < local41) {
			local86 = local19.method3108();
			if (local86 == 3) {
				local9.aStringArray47[local80] = local19.method3093().intern();
			} else if (local86 >= 100 || local86 == 21 || local86 == 38 || local86 == 39) {
				local9.anIntArray641[local80] = local19.method3111();
			} else {
				local9.anIntArray641[local80] = local19.method3109();
			}
			local9.anIntArray644[local80++] = local86;
		}
		return local9;
	}
}
