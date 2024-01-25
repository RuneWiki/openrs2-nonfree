import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static584 {

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "I")
	public static int anInt9762;

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "Lclient!da;")
	public static Class25 aClass25_11;

	@OriginalMember(owner = "client!ut", name = "g", descriptor = "[J")
	public static long[] aLongArray15;

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "[B")
	public static final byte[] aByteArray98 = new byte[2048];

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)I")
	public static int method8055() {
		if (Static610.anInt10092 == 0) {
			Static28.aClass24_2.method494(new Class313("jaclib"));
			if (Static28.aClass24_2.method495().method8554() != 100) {
				return 1;
			}
			if (!((Class313) Static28.aClass24_2.method495()).method7476()) {
				Static321.aClient2.method1805();
			}
			Static610.anInt10092 = 1;
		}
		@Pc(230) int local230;
		@Pc(267) int local267;
		@Pc(273) int local273;
		if (Static610.anInt10092 == 1) {
			Static436.aClass24Array4 = Static28.method490();
			Static28.aClass24_1.method494(new Class372(Static496.aClass181_101));
			Static28.aClass24_3.method494(new Class313("jaggl"));
			Static28.aClass24_4.method494(new Class313("jagdx"));
			Static28.aClass24_5.method494(new Class313("jagmisc"));
			Static28.aClass24_6.method494(new Class313("sw3d"));
			Static28.aClass24_7.method494(new Class313("hw3d"));
			Static28.aClass24_8.method494(new Class313("jagtheora"));
			Static28.aClass24_9.method494(new Class372(Static393.aClass181_30));
			Static28.aClass24_10.method494(new Class372(Static226.aClass181_47));
			Static28.aClass24_11.method494(new Class372(Static187.aClass181_36));
			Static28.aClass24_12.method494(new Class372(Static493.aClass181_100));
			Static28.aClass24_13.method494(new Class372(Static34.aClass181_2));
			Static28.aClass24_14.method494(new Class372(Static293.aClass181_57));
			Static28.aClass24_15.method494(new Class372(Static387.aClass181_73));
			Static28.aClass24_16.method494(new Class372(Static574.aClass181_117));
			Static28.aClass24_17.method494(new Class372(Static37.aClass181_5));
			Static28.aClass24_18.method494(new Class372(Static113.aClass181_128));
			Static28.aClass24_19.method494(new Class372(Static568.aClass181_115));
			Static28.aClass24_20.method494(new Class372(Static465.aClass181_93));
			Static28.aClass24_21.method494(new Class372(Static433.aClass181_81));
			Static28.aClass24_22.method494(new Class372(Static58.aClass181_9));
			Static28.aClass24_23.method494(new Class353(Static639.aClass181_133, "huffman"));
			Static28.aClass24_24.method494(new Class372(Static243.aClass181_54));
			Static28.aClass24_25.method494(new Class372(Static347.aClass181_63));
			Static28.aClass24_26.method494(new Class372(Static340.aClass181_62));
			Static28.aClass24_27.method494(new Class321(Static35.aClass181_4, "details"));
			for (local230 = 0; local230 < Static436.aClass24Array4.length; local230++) {
				if (Static436.aClass24Array4[local230].method495() == null) {
					throw new RuntimeException();
				}
			}
			@Pc(253) int local253 = 0;
			@Pc(255) Class24[] local255 = Static436.aClass24Array4;
			for (@Pc(257) int local257 = 0; local257 < local255.length; local257++) {
				@Pc(263) Class24 local263 = local255[local257];
				local267 = local263.method492();
				local273 = local263.method495().method8554();
				local253 += local273 * local267 / 100;
			}
			Static610.anInt10092 = 2;
			Static637.anInt10214 = local253;
		}
		if (Static436.aClass24Array4 == null) {
			return 100;
		}
		local230 = 0;
		@Pc(310) int local310 = 0;
		@Pc(312) boolean local312 = true;
		@Pc(314) Class24[] local314 = Static436.aClass24Array4;
		for (local267 = 0; local267 < local314.length; local267++) {
			@Pc(322) Class24 local322 = local314[local267];
			@Pc(326) int local326 = local322.method492();
			@Pc(332) int local332 = local322.method495().method8554();
			local230 += local326;
			local310 += local326 * local332 / 100;
			if (local332 < 100) {
				local312 = false;
			}
		}
		if (local312) {
			if (!((Class313) Static28.aClass24_5.method495()).method7476()) {
				Static321.aClient2.method1811();
			}
			if (!((Class313) Static28.aClass24_8.method495()).method7476()) {
				Static116.aBoolean240 = Static321.aClient2.method1806();
			}
			Static436.aClass24Array4 = null;
		}
		local310 -= Static637.anInt10214;
		local230 -= Static637.anInt10214;
		local273 = local230 > 0 ? local310 * 100 / local230 : 100;
		if (!local312 && local273 > 99) {
			local273 = 99;
		}
		return local273;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(BI)V")
	public static void method8057(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub1_Sub21 local8 = Static57.method8561(arg0, 9);
		local8.method8628();
	}
}
