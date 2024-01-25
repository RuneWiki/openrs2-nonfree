import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static539 {

	@OriginalMember(owner = "client!tb", name = "A", descriptor = "F")
	public static float aFloat191;

	@OriginalMember(owner = "client!tb", name = "y", descriptor = "Z")
	public static boolean aBoolean735 = false;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)I")
	public static int method7689(@OriginalArg(1) int arg0) {
		@Pc(10) byte local10;
		if (arg0 > 12000) {
			local10 = 4;
			Static535.method7633();
		} else if (arg0 > 5000) {
			Static327.method5102();
			local10 = 3;
		} else if (arg0 > 2000) {
			local10 = 2;
			Static249.method3868();
		} else {
			Static421.method8914();
			local10 = 1;
		}
		if (Static627.aClass5_Sub46_31.aClass11_Sub15_2.method4289() != 2) {
			Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub15_1, 2);
			Static590.method8288(false, 2);
		}
		Static499.method7307();
		return local10;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)I")
	public static int method7690() {
		if (Static122.anInt1982 == 0) {
			Static20.aClass18_2.method456(new Class82("jaclib"));
			if (Static20.aClass18_2.method463().method3686() != 100) {
				return 1;
			}
			if (!((Class82) Static20.aClass18_2.method463()).method1617()) {
				Static108.aClient1.method1210();
			}
			Static122.anInt1982 = 1;
		}
		@Pc(234) int local234;
		@Pc(253) int local253;
		@Pc(267) int local267;
		@Pc(275) int local275;
		if (Static122.anInt1982 == 1) {
			Static356.aClass18Array1 = Static20.method454();
			Static20.aClass18_1.method456(new Class87(Static308.aClass384_78));
			Static20.aClass18_3.method456(new Class82("jaggl"));
			Static20.aClass18_4.method456(new Class82("jagdx"));
			Static20.aClass18_5.method456(new Class82("jagmisc"));
			Static20.aClass18_6.method456(new Class82("sw3d"));
			Static20.aClass18_7.method456(new Class82("hw3d"));
			Static20.aClass18_8.method456(new Class82("jagtheora"));
			Static20.aClass18_9.method456(new Class87(Static40.aClass384_20));
			Static20.aClass18_10.method456(new Class87(Static179.aClass384_45));
			Static20.aClass18_11.method456(new Class87(Static400.aClass384_100));
			Static20.aClass18_12.method456(new Class87(Static159.aClass384_40));
			Static20.aClass18_13.method456(new Class87(Static511.aClass384_113));
			Static20.aClass18_14.method456(new Class87(Static148.aClass384_59));
			Static20.aClass18_15.method456(new Class87(Static8.aClass384_5));
			Static20.aClass18_16.method456(new Class87(Static152.aClass384_39));
			Static20.aClass18_17.method456(new Class87(Static348.aClass384_89));
			Static20.aClass18_18.method456(new Class87(Static462.aClass384_98));
			Static20.aClass18_19.method456(new Class87(Static330.aClass384_83));
			Static20.aClass18_20.method456(new Class87(Static602.aClass384_131));
			Static20.aClass18_21.method456(new Class87(Static557.aClass384_123));
			Static20.aClass18_22.method456(new Class87(Static347.aClass384_128));
			Static20.aClass18_23.method456(new Class153(Static635.aClass384_137, "huffman"));
			Static20.aClass18_24.method456(new Class87(Static240.aClass384_57));
			Static20.aClass18_25.method456(new Class87(Static416.aClass384_104));
			Static20.aClass18_26.method456(new Class87(Static288.aClass384_72));
			Static20.aClass18_27.method456(new Class160(Static280.aClass384_71, "details"));
			for (local234 = 0; local234 < Static356.aClass18Array1.length; local234++) {
				if (Static356.aClass18Array1[local234].method463() == null) {
					throw new RuntimeException();
				}
			}
			local253 = 0;
			@Pc(255) Class18[] local255 = Static356.aClass18Array1;
			for (@Pc(257) int local257 = 0; local257 < local255.length; local257++) {
				@Pc(263) Class18 local263 = local255[local257];
				local267 = local263.method460();
				local275 = local263.method463().method3686();
				local253 += local275 * local267 / 100;
			}
			Static122.anInt1982 = 2;
			Static169.anInt3089 = local253;
		}
		if (Static356.aClass18Array1 == null) {
			return 100;
		}
		local234 = 0;
		local253 = 0;
		@Pc(302) boolean local302 = true;
		@Pc(304) Class18[] local304 = Static356.aClass18Array1;
		for (@Pc(306) int local306 = 0; local306 < local304.length; local306++) {
			@Pc(312) Class18 local312 = local304[local306];
			local275 = local312.method460();
			@Pc(326) int local326 = local312.method463().method3686();
			local234 += local275;
			local253 += local326 * local275 / 100;
			if (local326 < 100) {
				local302 = false;
			}
		}
		if (local302) {
			if (!((Class82) Static20.aClass18_5.method463()).method1617()) {
				Static108.aClient1.method1209();
			}
			if (!((Class82) Static20.aClass18_8.method463()).method1617()) {
				Static489.aBoolean697 = Static108.aClient1.method1201();
			}
			Static356.aClass18Array1 = null;
		}
		local234 -= Static169.anInt3089;
		local253 -= Static169.anInt3089;
		local267 = local234 > 0 ? local253 * 100 / local234 : 100;
		if (!local302 && local267 > 99) {
			local267 = 99;
		}
		return local267;
	}
}
