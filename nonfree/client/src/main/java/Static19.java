import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
	public static int anInt352;

	@OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
	public static int anInt353;

	@OriginalMember(owner = "client!aj", name = "s", descriptor = "Lclient!mca;")
	public static final Class229 aClass229_3 = new Class229("runescape", 0);

	@OriginalMember(owner = "client!aj", name = "w", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray1 = new int[2][][];

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)V")
	public static void method378(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static648.aClass324_12.method8181(Static205.aClass134_24.method3906(Static204.anInt8130));
		@Pc(59) int local59;
		@Pc(26) int local26;
		if (Static672.aBoolean808) {
			for (@Pc(66) Class2_Sub1_Sub19 local66 = (Class2_Sub1_Sub19) Static112.aClass279_6.method7293(); local66 != null; local66 = (Class2_Sub1_Sub19) Static112.aClass279_6.method7298()) {
				if (local66.anInt9806 == 1) {
					local26 = Static600.method9005((Class2_Sub1_Sub13) local66.aClass279_13.aClass2_Sub1_54.aClass2_Sub1_67);
				} else {
					local26 = Static621.method9246(local66);
				}
				if (local13 < local26) {
					local13 = local26;
				}
			}
			Static304.anInt10368 = (Static300.aBoolean723 ? 26 : 22) + Static488.anInt8750 * 16;
			local13 += 8;
			local59 = Static488.anInt8750 * 16 + 21;
		} else {
			for (@Pc(20) Class2_Sub1_Sub13 local20 = (Class2_Sub1_Sub13) Static61.aClass271_6.method7177(); local20 != null; local20 = (Class2_Sub1_Sub13) Static61.aClass271_6.method7175()) {
				local26 = Static600.method9005(local20);
				if (local13 < local26) {
					local13 = local26;
				}
			}
			Static304.anInt10368 = Static276.anInt5124 * 16 + (Static300.aBoolean723 ? 26 : 22);
			local13 += 8;
			local59 = Static276.anInt5124 * 16 + 21;
		}
		@Pc(124) int local124 = arg1 - local13 / 2;
		if (local124 + local13 > Static406.anInt7570) {
			local124 = Static406.anInt7570 - local13;
		}
		if (local124 < 0) {
			local124 = 0;
		}
		local26 = arg0;
		if (anInt352 < arg0 + local59) {
			local26 = anInt352 - local59;
		}
		Static537.anInt9380 = local124;
		if (local26 < 0) {
			local26 = 0;
		}
		Static183.aBoolean305 = true;
		Static22.anInt384 = local13;
		Static297.anInt5412 = local26;
	}
}
