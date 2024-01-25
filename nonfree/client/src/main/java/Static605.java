import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static605 {

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "Z")
	public static boolean aBoolean846;

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "[I")
	public static final int[] anIntArray608 = new int[5];

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!dfa;I)V")
	public static void method8258(@OriginalArg(0) Class3_Sub15_Sub1 arg0) {
		arg0.method8419(Static108.aClass181_21.method5046());
		arg0.method8419(Static378.aClass181_69.method5046());
		arg0.method8419(Static187.aClass181_36.method5046());
		arg0.method8419(Static243.aClass181_54.method5046());
		arg0.method8419(Static462.aClass181_92.method5046());
		arg0.method8419(Static123.aClass181_28.method5046());
		arg0.method8419(Static399.aClass181_75.method5046());
		arg0.method8419(Static412.aClass181_78.method5046());
		arg0.method8419(Static150.aClass181_34.method5046());
		arg0.method8419(Static511.aClass181_104.method5046());
		arg0.method8419(Static639.aClass181_133.method5046());
		arg0.method8419(Static474.aClass181_98.method5046());
		arg0.method8419(Static347.aClass181_63.method5046());
		arg0.method8419(Static340.aClass181_62.method5046());
		arg0.method8419(Static349.aClass181_64.method5046());
		arg0.method8419(Static35.aClass181_3.method5046());
		arg0.method8419(Static493.aClass181_100.method5046());
		arg0.method8419(Static34.aClass181_2.method5046());
		arg0.method8419(Static293.aClass181_57.method5046());
		arg0.method8419(Static387.aClass181_73.method5046());
		arg0.method8419(Static574.aClass181_117.method5046());
		arg0.method8419(Static37.aClass181_5.method5046());
		arg0.method8419(Static113.aClass181_128.method5046());
		arg0.method8419(Static35.aClass181_4.method5046());
		arg0.method8419(Static568.aClass181_115.method5046());
		arg0.method8419(Static465.aClass181_93.method5046());
		arg0.method8419(Static226.aClass181_47.method5046());
		arg0.method8419(Static433.aClass181_81.method5046());
		arg0.method8419(Static496.aClass181_101.method5046());
		arg0.method8419(Static58.aClass181_9.method5046());
		arg0.method8419(Static139.aClass181_31.method5046());
		arg0.method8419(Static393.aClass181_30.method5046());
		arg0.method8419(Static212.method7706());
		arg0.method8419(Static109.method2701());
		arg0.method8419(Static515.aClass181_107.method5046());
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)V")
	public static void method8259(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub1_Sub21 local8 = Static57.method8561(arg0, 12);
		local8.method8631();
		local8.anInt10489 = arg1;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IILjava/lang/String;I[BI)I")
	public static int method8261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(10) int local10 = arg0;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			@Pc(20) char local20 = arg2.charAt(local12);
			if (local20 > '\u0000' && local20 < '\u0080' || !(local20 < ' ' || local20 > 'ÿ')) {
				arg3[local12 + arg1] = (byte) local20;
			} else if (local20 == '€') {
				arg3[arg1 + local12] = -128;
			} else if (local20 == '‚') {
				arg3[arg1 + local12] = -126;
			} else if (local20 == 'ƒ') {
				arg3[arg1 + local12] = -125;
			} else if (local20 == '„') {
				arg3[local12 + arg1] = -124;
			} else if (local20 == '…') {
				arg3[arg1 + local12] = -123;
			} else if (local20 == '†') {
				arg3[local12 + arg1] = -122;
			} else if (local20 == '‡') {
				arg3[local12 + arg1] = -121;
			} else if (local20 == 'ˆ') {
				arg3[local12 + arg1] = -120;
			} else if (local20 == '‰') {
				arg3[arg1 + local12] = -119;
			} else if (local20 == 'Š') {
				arg3[local12 + arg1] = -118;
			} else if (local20 == '‹') {
				arg3[local12 + arg1] = -117;
			} else if (local20 == 'Œ') {
				arg3[arg1 + local12] = -116;
			} else if (local20 == 'Ž') {
				arg3[local12 + arg1] = -114;
			} else if (local20 == '‘') {
				arg3[arg1 + local12] = -111;
			} else if (local20 == '’') {
				arg3[local12 + arg1] = -110;
			} else if (local20 == '“') {
				arg3[local12 + arg1] = -109;
			} else if (local20 == '”') {
				arg3[arg1 + local12] = -108;
			} else if (local20 == '•') {
				arg3[local12 + arg1] = -107;
			} else if (local20 == '–') {
				arg3[arg1 + local12] = -106;
			} else if (local20 == '—') {
				arg3[local12 + arg1] = -105;
			} else if (local20 == '˜') {
				arg3[arg1 + local12] = -104;
			} else if (local20 == '™') {
				arg3[arg1 + local12] = -103;
			} else if (local20 == 'š') {
				arg3[local12 + arg1] = -102;
			} else if (local20 == '›') {
				arg3[local12 + arg1] = -101;
			} else if (local20 == 'œ') {
				arg3[arg1 + local12] = -100;
			} else if (local20 == 'ž') {
				arg3[local12 + arg1] = -98;
			} else if (local20 == 'Ÿ') {
				arg3[arg1 + local12] = -97;
			} else {
				arg3[arg1 + local12] = 63;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
	public static void method8262() {
		if (Static47.aClass33_3.method6205()) {
			Static47.aClass33_3.method6187(Static177.aCanvas10);
			Static220.method4268();
			if (Static349.aBoolean590) {
				Static591.method8098(Static177.aCanvas10);
			} else {
				@Pc(19) Dimension local19 = Static177.aCanvas10.getSize();
				Static47.aClass33_3.method6227(Static177.aCanvas10, local19.width, local19.height);
			}
			Static47.aClass33_3.method6159(Static177.aCanvas10);
		} else {
			Static559.method7893(false, Static552.aClass3_Sub48_30.aClass23_Sub18_2.method5152());
		}
		Static594.method8139();
		Static160.aBoolean330 = true;
	}
}
