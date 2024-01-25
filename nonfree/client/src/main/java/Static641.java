import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static641 {

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "I")
	public static int anInt9851;

	@OriginalMember(owner = "client!uea", name = "p", descriptor = "Lclient!nca;")
	public static Class254 aClass254_158;

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(I)I")
	public static int method8679() {
		if (Static187.anInt3066 == 0) {
			Static14.aClass10_2.method218(new Class103("jaclib"));
			if (Static14.aClass10_2.method217().method8706() != 100) {
				return 1;
			}
			if (!((Class103) Static14.aClass10_2.method217()).method2169()) {
				Static255.aClient1.method1383();
			}
			Static187.anInt3066 = 1;
		}
		@Pc(258) int local258;
		@Pc(284) int local284;
		@Pc(300) int local300;
		@Pc(306) int local306;
		if (Static187.anInt3066 == 1) {
			Static334.aClass10Array1 = Static14.method220();
			Static14.aClass10_1.method218(new Class299(Static50.aClass254_29));
			Static14.aClass10_3.method218(new Class103("jaggl"));
			Static14.aClass10_4.method218(new Class103("jagdx"));
			Static14.aClass10_5.method218(new Class103("jagmisc"));
			Static14.aClass10_6.method218(new Class103("sw3d"));
			Static14.aClass10_7.method218(new Class103("hw3d"));
			Static14.aClass10_8.method218(new Class103("jagtheora"));
			Static14.aClass10_9.method218(new Class299(Static554.aClass254_136));
			Static14.aClass10_10.method218(new Class299(Static55.aClass254_32));
			Static14.aClass10_11.method218(new Class299(Static1.aClass254_144));
			Static14.aClass10_12.method218(new Class299(Static529.aClass254_132));
			Static14.aClass10_13.method218(new Class299(Static566.aClass254_142));
			Static14.aClass10_14.method218(new Class299(Static307.aClass254_95));
			Static14.aClass10_15.method218(new Class299(Static625.aClass254_156));
			Static14.aClass10_16.method218(new Class299(Static565.aClass254_141));
			Static14.aClass10_17.method218(new Class299(Static191.aClass254_69));
			Static14.aClass10_18.method218(new Class299(Static18.aClass254_14));
			Static14.aClass10_19.method218(new Class299(Static263.aClass254_87));
			Static14.aClass10_20.method218(new Class299(Static327.aClass254_161));
			Static14.aClass10_21.method218(new Class299(Static35.aClass254_20));
			Static14.aClass10_22.method218(new Class299(Static228.aClass254_120));
			Static14.aClass10_23.method218(new Class78(Static455.aClass254_122, "huffman"));
			Static14.aClass10_24.method218(new Class299(Static282.aClass254_91));
			Static14.aClass10_25.method218(new Class299(Static680.aClass254_169));
			Static14.aClass10_26.method218(new Class299(Static335.aClass254_99));
			Static14.aClass10_27.method218(new Class368(Static394.aClass254_113, "details"));
			for (local258 = 0; local258 < Static334.aClass10Array1.length; local258++) {
				if (Static334.aClass10Array1[local258].method217() == null) {
					throw new RuntimeException();
				}
			}
			local284 = 0;
			@Pc(286) Class10[] local286 = Static334.aClass10Array1;
			for (@Pc(288) int local288 = 0; local288 < local286.length; local288++) {
				@Pc(296) Class10 local296 = local286[local288];
				local300 = local296.method219();
				local306 = local296.method217().method8706();
				local284 += local306 * local300 / 100;
			}
			Static187.anInt3066 = 2;
			Static440.anInt7152 = local284;
		}
		if (Static334.aClass10Array1 == null) {
			return 100;
		}
		local258 = 0;
		local284 = 0;
		@Pc(346) boolean local346 = true;
		@Pc(348) Class10[] local348 = Static334.aClass10Array1;
		for (@Pc(350) int local350 = 0; local350 < local348.length; local350++) {
			@Pc(356) Class10 local356 = local348[local350];
			local306 = local356.method219();
			@Pc(366) int local366 = local356.method217().method8706();
			local258 += local306;
			if (local366 < 100) {
				local346 = false;
			}
			local284 += local306 * local366 / 100;
		}
		if (local346) {
			if (!((Class103) Static14.aClass10_5.method217()).method2169()) {
				Static255.aClient1.method1395();
			}
			if (!((Class103) Static14.aClass10_8.method217()).method2169()) {
				Static527.aBoolean722 = Static255.aClient1.method1389();
			}
			Static334.aClass10Array1 = null;
		}
		local258 -= Static440.anInt7152;
		local284 -= Static440.anInt7152;
		local300 = local258 > 0 ? local284 * 100 / local258 : 100;
		if (!local346 && local300 > 99) {
			local300 = 99;
		}
		return local300;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(ZILclient!rha;)V")
	public static void method8681(@OriginalArg(2) Class2_Sub23_Sub5 arg0) {
		Static479.aClass70_2.method9365(arg0);
		Static634.method8626(Static157.aClass254_60, arg0, Static479.aClass70_2, Static514.aClass254_129, Static614.aClass254_153);
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(III)I")
	public static int method8684(@OriginalArg(1) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(42) int local42 = (arg0 & 0x7F) * 96 >> 7;
			if (local42 < 2) {
				local42 = 2;
			} else if (local42 > 126) {
				local42 = 126;
			}
			return local42 + (arg0 & 0xFF80);
		}
	}
}
