import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!aba", name = "e", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_2 = new Class208(51, 18);

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(Z)V")
	public static void method83() {
		Static415.method5900(Static488.aClass160_36);
		Static539.anInt9040++;
		if (Static263.aBoolean363 && Static241.aBoolean321) {
			@Pc(28) int local28 = Static216.aClass238_1.method5661();
			@Pc(32) int local32 = Static216.aClass238_1.method5653();
			local32 -= Static41.anInt8212;
			local28 -= Static419.anInt7395;
			if (Static114.anInt1942 > local28) {
				local28 = Static114.anInt1942;
			}
			if (Static540.anInt9051 > local32) {
				local32 = Static540.anInt9051;
			}
			if (Static6.aClass160_45.anInt4182 + Static114.anInt1942 < Static488.aClass160_36.anInt4182 + local28) {
				local28 = Static114.anInt1942 + Static6.aClass160_45.anInt4182 - Static488.aClass160_36.anInt4182;
			}
			if (Static6.aClass160_45.anInt4156 + Static540.anInt9051 < local32 - -Static488.aClass160_36.anInt4156) {
				local32 = Static6.aClass160_45.anInt4156 + Static540.anInt9051 - Static488.aClass160_36.anInt4156;
			}
			@Pc(108) int local108 = Static6.aClass160_45.anInt4211 + local28 - Static114.anInt1942;
			@Pc(116) int local116 = local32 + Static6.aClass160_45.anInt4218 - Static540.anInt9051;
			@Pc(177) Class1_Sub22 local177;
			if (Static216.aClass238_1.method5662()) {
				if (Static488.aClass160_36.anInt4162 < Static539.anInt9040) {
					@Pc(128) int local128 = local28 - Static78.anInt1530;
					@Pc(132) int local132 = local32 - Static251.anInt4599;
					if (local128 > Static488.aClass160_36.anInt4220 || -Static488.aClass160_36.anInt4220 > local128 || Static488.aClass160_36.anInt4220 < local132 || local132 < -Static488.aClass160_36.anInt4220) {
						Static78.aBoolean97 = true;
					}
				}
				if (Static488.aClass160_36.anObjectArray26 != null && Static78.aBoolean97) {
					local177 = new Class1_Sub22();
					local177.aClass160_10 = Static488.aClass160_36;
					local177.anObjectArray1 = Static488.aClass160_36.anObjectArray26;
					local177.anInt2862 = local108;
					local177.anInt2858 = local116;
					Static451.method6311(local177);
					return;
				}
			} else {
				if (Static78.aBoolean97) {
					Static193.method3074();
					if (Static488.aClass160_36.anObjectArray7 != null) {
						local177 = new Class1_Sub22();
						local177.anInt2862 = local108;
						local177.aClass160_9 = Static348.aClass160_23;
						local177.anObjectArray1 = Static488.aClass160_36.anObjectArray7;
						local177.anInt2858 = local116;
						local177.aClass160_10 = Static488.aClass160_36;
						Static451.method6311(local177);
					}
					if (Static348.aClass160_23 != null && Static67.method1097(Static488.aClass160_36) != null) {
						Static354.method5277(Static488.aClass160_36, Static348.aClass160_23);
					}
				} else if ((Static579.anInt9553 == 1 || Static205.method3166()) && Static22.anInt572 > 2) {
					Static7.method209(Static419.anInt7395 + Static78.anInt1530, Static251.anInt4599 + Static41.anInt8212);
				} else if (Static406.method5824()) {
					Static7.method209(Static419.anInt7395 + Static78.anInt1530, Static251.anInt4599 + Static41.anInt8212);
				}
				Static488.aClass160_36 = null;
			}
		} else if (Static539.anInt9040 > 1) {
			Static488.aClass160_36 = null;
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)I")
	public static int method84() {
		return 46;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(ZII)I")
	public static int method85(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) double local15 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(22) double local22 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(30) double local30 = local22 + (local15 - local22) * Math.random();
		return (int) (Math.pow(2.0D, local30) + 0.5D);
	}
}
