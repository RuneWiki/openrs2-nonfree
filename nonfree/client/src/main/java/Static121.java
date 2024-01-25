import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
	public static int anInt7687;

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_175 = new Class263(70, -1);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZIB)V")
	public static void method5867(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub46 local8 = Static114.method1848(arg0, arg1);
		if (local8 != null) {
			local8.method6178();
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IILclient!ap;)Z")
	public static boolean method5870(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3_Sub1 arg1) {
		@Pc(10) int local10 = arg1.method321(2);
		@Pc(30) int local30;
		@Pc(35) int local35;
		@Pc(106) int local106;
		@Pc(110) int local110;
		@Pc(116) int local116;
		if (local10 == 0) {
			if (arg1.method321(1) != 0) {
				method5870(arg0, arg1);
			}
			local30 = arg1.method321(6);
			local35 = arg1.method321(6);
			@Pc(49) boolean local49 = arg1.method321(1) == 1;
			if (local49) {
				Static17.anIntArray24[Static450.anInt7890++] = arg0;
			}
			if (Static135.aClass30_Sub1_Sub1_Sub2Array1[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(72) Class155 local72 = Static413.aClass155Array1[arg0];
			@Pc(80) Class30_Sub1_Sub1_Sub2 local80 = Static135.aClass30_Sub1_Sub1_Sub2Array1[arg0] = new Class30_Sub1_Sub1_Sub2();
			local80.anInt1299 = arg0;
			if (Static43.aClass1_Sub3Array1[arg0] != null) {
				local80.method964(Static43.aClass1_Sub3Array1[arg0]);
			}
			local80.method943(true, local72.anInt4563);
			local80.anInt1243 = local72.anInt4561;
			local106 = local72.anInt4560;
			local110 = local106 >> 28;
			local116 = local106 >> 14 & 0xFF;
			local80.aBoolean85 = local72.aBoolean291;
			@Pc(124) int local124 = local106 & 0xFF;
			local80.aByteArray13[0] = Static5.aByteArray1[arg0];
			local80.aByte102 = (byte) local110;
			local80.method958(local35 + (local124 << 6) - Static380.anInt6896, -Static278.anInt5374 + (local116 << 6) - -local30);
			local80.aBoolean83 = false;
			Static413.aClass155Array1[arg0] = null;
			return true;
		} else if (local10 == 1) {
			local30 = arg1.method321(2);
			local35 = Static413.aClass155Array1[arg0].anInt4560;
			Static413.aClass155Array1[arg0].anInt4560 = (((local35 >> 28) + local30 & 0x3) << 28) + (local35 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(222) int local222;
			@Pc(227) int local227;
			@Pc(235) int local235;
			if (local10 != 2) {
				local30 = arg1.method321(18);
				local35 = local30 >> 16;
				local222 = local30 >> 8 & 0xFF;
				local227 = local30 & 0xFF;
				local235 = Static413.aClass155Array1[arg0].anInt4560;
				local106 = local35 + (local235 >> 28) & 0x3;
				local110 = (local235 >> 14) + local222 & 0xFF;
				local116 = local235 + local227 & 0xFF;
				Static413.aClass155Array1[arg0].anInt4560 = (local106 << 28) + ((local110 << 14) + local116);
				return false;
			}
			local30 = arg1.method321(5);
			local35 = local30 >> 3;
			local222 = local30 & 0x7;
			local227 = Static413.aClass155Array1[arg0].anInt4560;
			local235 = local35 + (local227 >> 28) & 0x3;
			local106 = local227 >> 14 & 0xFF;
			local110 = local227 & 0xFF;
			if (local222 == 0) {
				local106--;
				local110--;
			}
			if (local222 == 1) {
				local110--;
			}
			if (local222 == 2) {
				local110--;
				local106++;
			}
			if (local222 == 3) {
				local106--;
			}
			if (local222 == 4) {
				local106++;
			}
			if (local222 == 5) {
				local106--;
				local110++;
			}
			if (local222 == 6) {
				local110++;
			}
			if (local222 == 7) {
				local106++;
				local110++;
			}
			Static413.aClass155Array1[arg0].anInt4560 = local110 + (local106 << 14) + (local235 << 28);
			return false;
		}
	}
}
