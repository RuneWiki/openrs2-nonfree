import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_163 = new Class215(69, 12);

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_164 = new Class215(64, 2);

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
	public static final int anInt7872 = 1339;

	@OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
	public static int anInt7880 = 0;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(ZI)V")
	public static void method6725(@OriginalArg(1) int arg0) {
		Static229.method4400();
		@Pc(11) int local11 = Static581.aClass305_1.method7737(arg0).anInt7766;
		if (local11 == 0) {
			return;
		}
		@Pc(27) int local27 = Static286.aClass263_3.anIntArray530[arg0];
		if (local11 == 5) {
			Static578.anInt8192 = local27;
		}
		if (local11 == 6) {
			Static607.anInt10666 = local27;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)I")
	public static int method6728() {
		if (Static299.anInt6284 == 0) {
			Static580.aClass346_2.method8634(new Class54("jaclib"));
			if (Static580.aClass346_2.method8636().method8981() != 100) {
				return 1;
			}
			if (!((Class54) Static580.aClass346_2.method8636()).method2081()) {
				Static30.aClient1.method2227();
			}
			Static299.anInt6284 = 1;
		}
		@Pc(234) int local234;
		@Pc(253) int local253;
		@Pc(267) int local267;
		@Pc(273) int local273;
		if (Static299.anInt6284 == 1) {
			Static373.aClass346Array1 = Static580.method8638();
			Static580.aClass346_1.method8634(new Class365(Static299.aClass157_148));
			Static580.aClass346_3.method8634(new Class54("jaggl"));
			Static580.aClass346_4.method8634(new Class54("jagdx"));
			Static580.aClass346_5.method8634(new Class54("jagmisc"));
			Static580.aClass346_6.method8634(new Class54("sw3d"));
			Static580.aClass346_7.method8634(new Class54("hw3d"));
			Static580.aClass346_8.method8634(new Class54("jagtheora"));
			Static580.aClass346_9.method8634(new Class365(Static384.aClass157_195));
			Static580.aClass346_10.method8634(new Class365(Static233.aClass157_116));
			Static580.aClass346_11.method8634(new Class365(Static337.aClass157_172));
			Static580.aClass346_12.method8634(new Class365(Static335.aClass157_169));
			Static580.aClass346_13.method8634(new Class365(Static539.aClass157_263));
			Static580.aClass346_14.method8634(new Class365(Static499.aClass157_245));
			Static580.aClass346_15.method8634(new Class365(Static435.aClass157_222));
			Static580.aClass346_16.method8634(new Class365(Static563.aClass157_278));
			Static580.aClass346_17.method8634(new Class365(Static309.aClass157_152));
			Static580.aClass346_18.method8634(new Class365(Static336.aClass157_171));
			Static580.aClass346_19.method8634(new Class365(Static378.aClass157_70));
			Static580.aClass346_20.method8634(new Class365(Static313.aClass157_155));
			Static580.aClass346_21.method8634(new Class365(Static527.aClass157_304));
			Static580.aClass346_22.method8634(new Class365(Static571.aClass157_284));
			Static580.aClass346_23.method8634(new Class180(Static207.aClass157_104, "huffman"));
			Static580.aClass346_24.method8634(new Class365(Static489.aClass157_241));
			Static580.aClass346_25.method8634(new Class365(Static38.aClass157_28));
			Static580.aClass346_26.method8634(new Class365(Static348.aClass157_177));
			Static580.aClass346_27.method8634(new Class232(Static474.aClass157_237, "details"));
			for (local234 = 0; local234 < Static373.aClass346Array1.length; local234++) {
				if (Static373.aClass346Array1[local234].method8636() == null) {
					throw new RuntimeException();
				}
			}
			local253 = 0;
			@Pc(255) Class346[] local255 = Static373.aClass346Array1;
			for (@Pc(257) int local257 = 0; local257 < local255.length; local257++) {
				@Pc(263) Class346 local263 = local255[local257];
				local267 = local263.method8633();
				local273 = local263.method8636().method8981();
				local253 += local273 * local267 / 100;
			}
			Static526.anInt9574 = local253;
			Static299.anInt6284 = 2;
		}
		if (Static373.aClass346Array1 == null) {
			return 100;
		}
		local234 = 0;
		local253 = 0;
		@Pc(300) boolean local300 = true;
		@Pc(307) Class346[] local307 = Static373.aClass346Array1;
		for (@Pc(309) int local309 = 0; local309 < local307.length; local309++) {
			@Pc(315) Class346 local315 = local307[local309];
			local273 = local315.method8633();
			@Pc(327) int local327 = local315.method8636().method8981();
			local234 += local273;
			local253 += local327 * local273 / 100;
			if (local327 < 100) {
				local300 = false;
			}
		}
		if (local300) {
			if (!((Class54) Static580.aClass346_5.method8636()).method2081()) {
				Static30.aClient1.method2213();
			}
			if (!((Class54) Static580.aClass346_8.method8636()).method2081()) {
				Static237.aBoolean378 = Static30.aClient1.method2230();
			}
			Static373.aClass346Array1 = null;
		}
		local234 -= Static526.anInt9574;
		local253 -= Static526.anInt9574;
		local267 = local234 <= 0 ? 100 : local253 * 100 / local234;
		if (!local300 && local267 > 99) {
			local267 = 99;
		}
		return local267;
	}
}
