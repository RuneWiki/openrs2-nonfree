import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
	public static int anInt6759;

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
	public static int anInt6763;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!ns;B)I")
	public static int method5254(@OriginalArg(0) Class166 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method3670(Static81.anInt1878)) {
			local10++;
		}
		if (arg0.method3670(Static344.anInt6188)) {
			local10++;
		}
		if (arg0.method3670(Static220.anInt5565)) {
			local10++;
		}
		if (arg0.method3670(Static314.anInt5624)) {
			local10++;
		}
		if (arg0.method3670(Static353.anInt6358)) {
			local10++;
		}
		if (arg0.method3670(Static34.anInt802)) {
			local10++;
		}
		if (arg0.method3670(Static53.anInt1393)) {
			local10++;
		}
		if (arg0.method3670(Static270.anInt4789)) {
			local10++;
		}
		if (arg0.method3670(Static381.anInt6680)) {
			local10++;
		}
		if (arg0.method3670(Static339.anInt5970)) {
			local10++;
		}
		if (arg0.method3670(Static294.anInt5304)) {
			local10++;
		}
		if (arg0.method3670(Static160.anInt3011)) {
			local10++;
		}
		if (arg0.method3670(Static379.anInt6642)) {
			local10++;
		}
		if (arg0.method3670(Static403.anInt6876)) {
			local10++;
		}
		if (arg0.method3670(Static302.anInt5438)) {
			local10++;
		}
		if (arg0.method3670(Static278.anInt7280)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5255(@OriginalArg(1) String arg0) {
		if (!Static222.aBoolean305) {
			return;
		}
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = Static58.anInt4352;
		@Pc(21) int[] local21 = Static144.anIntArray186;
		for (@Pc(23) int local23 = 0; local23 < local19; local23++) {
			@Pc(31) Class6_Sub2_Sub1_Sub1 local31 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local21[local23]];
			if (local31 != null && local31 != Static375.aClass6_Sub2_Sub1_Sub1_3 && local31.aString11 != null && local31.aString11.equalsIgnoreCase(arg0)) {
				Static209.method2982(Static142.aClass36_60);
				Static116.aClass4_Sub30_Sub1_1.method4890(Static8.anInt336);
				Static116.aClass4_Sub30_Sub1_1.method4846(Static14.anInt5474);
				Static116.aClass4_Sub30_Sub1_1.method4828(local21[local23]);
				Static116.aClass4_Sub30_Sub1_1.method4883(Static384.anInt6284);
				Static116.aClass4_Sub30_Sub1_1.method4881(0);
				Static14.method4213(-2, 0, 0, true, local31.method4763(), local31.method4763(), local31.anIntArray537[0], local31.anIntArray536[0]);
				local17 = true;
				break;
			}
		}
		if (!local17) {
			Static196.method2835(Static217.aClass242_55.method5320(Static139.anInt2670) + arg0);
		}
		if (Static222.aBoolean305) {
			Static1.method29();
		}
	}
}
