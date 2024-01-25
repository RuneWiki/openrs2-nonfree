import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!fb", name = "Z", descriptor = "Lclient!bu;")
	public static Class32 aClass32_35;

	@OriginalMember(owner = "client!fb", name = "bb", descriptor = "I")
	public static int anInt2371;

	@OriginalMember(owner = "client!fb", name = "kb", descriptor = "Lclient!vu;")
	public static Class262 aClass262_1;

	@OriginalMember(owner = "client!fb", name = "U", descriptor = "I")
	public static int anInt2366 = 0;

	@OriginalMember(owner = "client!fb", name = "X", descriptor = "[I")
	public static final int[] anIntArray140 = new int[14];

	@OriginalMember(owner = "client!fb", name = "fb", descriptor = "F")
	public static float aFloat15 = 1.0F;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
	public static void method1808() {
		for (@Pc(1) int local1 = 0; local1 < Static77.aClass163ArrayArray1.length; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static77.aClass163ArrayArray1[local1].length; local4++) {
				Static77.aClass163ArrayArray1[local1][local4] = Static47.aClass163_1;
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)Z")
	public static boolean method1811(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIILclient!mq;)V")
	public static void method1812(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class156 arg2) {
		if (arg2 == null) {
			return;
		}
		if (arg2.anObjectArray9 != null) {
			@Pc(13) Class3_Sub31 local13 = new Class3_Sub31();
			local13.aClass156_11 = arg2;
			local13.anObjectArray36 = arg2.anObjectArray9;
			Static285.method4059(local13);
		}
		Static213.anInt4082 = arg2.anInt4868;
		Static279.anInt4322 = arg0;
		Static129.anInt2687 = arg2.anInt4850;
		Static446.aBoolean648 = true;
		Static141.anInt2928 = arg2.anInt4871;
		Static25.anInt849 = arg2.anInt4845;
		Static338.anInt5764 = arg2.anInt4826;
		Static96.anInt2198 = arg1;
		Static386.method5010(arg2);
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V")
	public static void method1813() {
		Static30.method641(Static58.aClass217_27);
		Static302.aClass3_Sub7_Sub1_2.method2628(Static391.method5269());
		Static302.aClass3_Sub7_Sub1_2.method2613(Static333.anInt5712);
		Static302.aClass3_Sub7_Sub1_2.method2613(Static123.anInt2625);
		Static302.aClass3_Sub7_Sub1_2.method2628(Static374.aClass20_Sub1_1.anInt2350);
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
	public static void method1816() {
		if (Static270.anInt5055 < 0) {
			return;
		}
		@Pc(9) long local9 = Static118.method1934();
		Static270.anInt5055 = (int) ((long) Static270.anInt5055 + Static101.aLong207 - local9);
		if (Static270.anInt5055 <= 0) {
			Static329.aFloat64 = Static212.aClass163_2.aFloat53;
			Static451.anInt7607 = Static212.aClass163_2.anInt5016;
			Static347.aClass23_6 = Static212.aClass163_2.aClass23_4;
			Static270.anInt5055 = -1;
			Static193.aFloat28 = Static212.aClass163_2.aFloat52;
			Static396.aFloat71 = Static212.aClass163_2.aFloat51;
			Static77.anInt1942 = Static212.aClass163_2.anInt5010;
			Static119.anInt2533 = Static212.aClass163_2.anInt5009;
			Static342.aFloat65 = Static212.aClass163_2.aFloat50;
			Static317.aFloat61 = Static212.aClass163_2.aFloat54;
			Static58.aFloat8 = Static212.aClass163_2.aFloat49;
		} else {
			@Pc(59) int local59 = (Static270.anInt5055 << 8) / Static445.anInt7530;
			@Pc(63) int local63 = 255 - local59;
			@Pc(68) float local68 = (float) local59 / 255.0F;
			@Pc(72) float local72 = 1.0F - local68;
			Static77.anInt1942 = ((Static161.anInt3320 & 0xFF00) * local59 + local63 * (Static212.aClass163_2.anInt5010 & 0xFF00) & 0xFF0000) + (local59 * (Static161.anInt3320 & 0xFF00FF) + (local63 * (Static212.aClass163_2.anInt5010 & 0xFF00FF)) & 0xFF00FF00) >>> 8;
			Static119.anInt2533 = local59 * Static302.anInt5404 + Static212.aClass163_2.anInt5009 * local63 >> 8;
			Static317.aFloat61 = Static320.aFloat62 + local72 * (Static212.aClass163_2.aFloat54 - Static320.aFloat62);
			Static193.aFloat28 = Static366.aFloat68 + (Static212.aClass163_2.aFloat52 - Static366.aFloat68) * local72;
			Static58.aFloat8 = Static43.aFloat5 + local72 * (Static212.aClass163_2.aFloat49 - Static43.aFloat5);
			Static329.aFloat64 = local72 * (Static212.aClass163_2.aFloat53 - Static111.aFloat17) + Static111.aFloat17;
			Static396.aFloat71 = Static110.aFloat16 + (Static212.aClass163_2.aFloat51 - Static110.aFloat16) * local72;
			Static342.aFloat65 = Static385.aFloat69 + local72 * (Static212.aClass163_2.aFloat50 - Static385.aFloat69);
			Static451.anInt7607 = (local59 * (Static44.anInt7284 & 0xFF00FF) + (Static212.aClass163_2.anInt5016 & 0xFF00FF) * local63 & 0xFF00FF00) + ((Static212.aClass163_2.anInt5016 & 0xFF00) * local63 + local59 * (Static44.anInt7284 & 0xFF00) & 0xFF0000) >>> 8;
			if (Static212.aClass163_2.aClass23_4 != Static8.aClass23_7) {
				Static347.aClass23_6 = Static166.aClass172_6.method5525(Static8.aClass23_7, Static212.aClass163_2.aClass23_4, local72, Static347.aClass23_6);
			}
		}
		Static101.aLong207 = local9;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!qa;Lclient!bu;I)V")
	public static void method1820(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class32 arg1) {
		@Pc(8) Class264[] local8 = Static464.method5837(arg1, Static60.anInt1568);
		Static99.aClass8Array65 = new Class8[local8.length];
		for (@Pc(14) int local14 = 0; local14 < local8.length; local14++) {
			Static99.aClass8Array65[local14] = arg0.method5542(local8[local14]);
		}
		local8 = Static464.method5837(arg1, Static272.anInt6025);
		Static387.aClass8Array185 = new Class8[local8.length];
		for (@Pc(40) int local40 = 0; local40 < local8.length; local40++) {
			Static387.aClass8Array185[local40] = arg0.method5542(local8[local40]);
		}
		local8 = Static464.method5837(arg1, Static56.anInt1518);
		Static331.aClass8Array209 = new Class8[local8.length];
		for (@Pc(66) int local66 = 0; local66 < local8.length; local66++) {
			Static331.aClass8Array209[local66] = arg0.method5542(local8[local66]);
		}
		local8 = Static464.method5837(arg1, Static123.anInt2626);
		Static161.aClass8Array89 = new Class8[local8.length];
		for (@Pc(92) int local92 = 0; local92 < local8.length; local92++) {
			Static161.aClass8Array89[local92] = arg0.method5542(local8[local92]);
		}
		local8 = Static464.method5837(arg1, Static31.anInt6065);
		Static165.aClass8Array91 = new Class8[local8.length];
		for (@Pc(122) int local122 = 0; local122 < local8.length; local122++) {
			Static165.aClass8Array91[local122] = arg0.method5542(local8[local122]);
		}
		local8 = Static464.method5837(arg1, Static247.anInt4704);
		Static37.aClass8Array28 = new Class8[local8.length];
		for (@Pc(152) int local152 = 0; local152 < local8.length; local152++) {
			Static37.aClass8Array28[local152] = arg0.method5542(local8[local152]);
		}
		local8 = Static464.method5837(arg1, Static90.anInt2163);
		Static4.aClass8Array3 = new Class8[local8.length];
		for (@Pc(178) int local178 = 0; local178 < local8.length; local178++) {
			Static4.aClass8Array3[local178] = arg0.method5542(local8[local178]);
		}
		local8 = Static464.method5837(arg1, Static165.anInt3381);
		Static391.aClass8Array192 = new Class8[local8.length];
		for (@Pc(208) int local208 = 0; local208 < local8.length; local208++) {
			Static391.aClass8Array192[local208] = arg0.method5542(local8[local208]);
		}
		local8 = Static464.method5837(arg1, Static399.anInt6607);
		Static163.aClass8Array176 = new Class8[local8.length];
		for (@Pc(234) int local234 = 0; local234 < local8.length; local234++) {
			Static163.aClass8Array176[local234] = arg0.method5542(local8[local234]);
		}
		local8 = Static464.method5837(arg1, Static249.anInt4739);
		Static324.aClass8Array212 = new Class8[local8.length];
		for (@Pc(264) int local264 = 0; local264 < local8.length; local264++) {
			Static324.aClass8Array212[local264] = arg0.method5542(local8[local264]);
		}
		local8 = Static464.method5837(arg1, Static19.anInt480);
		Static453.aClass8Array211 = new Class8[local8.length];
		for (@Pc(290) int local290 = 0; local290 < local8.length; local290++) {
			Static453.aClass8Array211[local290] = arg0.method5542(local8[local290]);
		}
		local8 = Static464.method5837(arg1, Static246.anInt4692);
		Static260.aClass8Array170 = new Class8[local8.length];
		for (@Pc(316) int local316 = 0; local316 < local8.length; local316++) {
			Static260.aClass8Array170[local316] = arg0.method5542(local8[local316]);
		}
		Static123.aClass8_9 = arg0.method5542(Static464.method5847(arg1, Static332.anInt5708, 0));
		Static183.aClass8_14 = arg0.method5542(Static464.method5847(arg1, Static52.anInt1375, 0));
		local8 = Static464.method5837(arg1, Static257.anInt4899);
		Static151.aClass8Array83 = new Class8[local8.length];
		for (@Pc(362) int local362 = 0; local362 < local8.length; local362++) {
			Static151.aClass8Array83[local362] = arg0.method5542(local8[local362]);
		}
	}
}
