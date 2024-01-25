import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static551 {

	@OriginalMember(owner = "client!vca", name = "p", descriptor = "Z")
	public static boolean aBoolean688;

	@OriginalMember(owner = "client!vca", name = "l", descriptor = "Z")
	public static boolean aBoolean687 = false;

	@OriginalMember(owner = "client!vca", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString95 = null;

	@OriginalMember(owner = "client!vca", name = "n", descriptor = "I")
	public static final int anInt9778 = 52;

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)I")
	public static int method7983() {
		if (Static187.anInt3685 == 0) {
			Static312.aClass212_2.method5276(new Class312("jaclib"));
			if (Static312.aClass212_2.method5275().method7372() != 100) {
				return 1;
			}
			if (!((Class312) Static312.aClass212_2.method5275()).method7376()) {
				Static430.aClient1.method1163();
			}
			Static187.anInt3685 = 1;
		}
		@Pc(226) int local226;
		@Pc(245) int local245;
		@Pc(265) int local265;
		if (Static187.anInt3685 == 1) {
			Static192.aClass212Array1 = Static312.method5274();
			Static312.aClass212_1.method5276(new Class66(Static362.aClass176_94));
			Static312.aClass212_3.method5276(new Class312("jaggl"));
			Static312.aClass212_4.method5276(new Class312("jagdx"));
			Static312.aClass212_5.method5276(new Class312("jagmisc"));
			Static312.aClass212_6.method5276(new Class312("sw3d"));
			Static312.aClass212_7.method5276(new Class312("hw3d"));
			Static312.aClass212_8.method5276(new Class66(Static224.aClass176_61));
			Static312.aClass212_9.method5276(new Class66(Static502.aClass176_121));
			Static312.aClass212_10.method5276(new Class66(Static93.aClass176_31));
			Static312.aClass212_11.method5276(new Class66(Static49.aClass176_18));
			Static312.aClass212_12.method5276(new Class66(Static79.aClass176_28));
			Static312.aClass212_13.method5276(new Class66(Static157.aClass176_43));
			Static312.aClass212_14.method5276(new Class66(Static467.aClass176_114));
			Static312.aClass212_15.method5276(new Class66(Static34.aClass176_11));
			Static312.aClass212_16.method5276(new Class66(Static586.aClass176_132));
			Static312.aClass212_17.method5276(new Class66(Static333.aClass176_97));
			Static312.aClass212_18.method5276(new Class66(Static256.aClass176_67));
			Static312.aClass212_19.method5276(new Class66(Static194.aClass176_55));
			Static312.aClass212_20.method5276(new Class66(Static266.aClass176_71));
			Static312.aClass212_21.method5276(new Class66(Static137.aClass176_42));
			Static312.aClass212_22.method5276(new Class95(Static212.aClass176_60, "huffman"));
			Static312.aClass212_23.method5276(new Class66(Static231.aClass176_63));
			Static312.aClass212_24.method5276(new Class66(Static536.aClass176_128));
			Static312.aClass212_25.method5276(new Class66(Static500.aClass176_119));
			Static312.aClass212_26.method5276(new Class29(Static12.aClass176_6, "details"));
			for (local226 = 0; local226 < Static192.aClass212Array1.length; local226++) {
				if (Static192.aClass212Array1[local226].method5275() == null) {
					throw new RuntimeException();
				}
			}
			local245 = 0;
			@Pc(247) Class212[] local247 = Static192.aClass212Array1;
			for (@Pc(249) int local249 = 0; local249 < local247.length; local249++) {
				@Pc(255) Class212 local255 = local247[local249];
				@Pc(259) int local259 = local255.method5271();
				local265 = local255.method5275().method7372();
				local245 += local265 * local259 / 100;
			}
			Static187.anInt3685 = 2;
			Static120.anInt2728 = local245;
		}
		if (Static192.aClass212Array1 == null) {
			return 100;
		}
		local226 = 0;
		local245 = 0;
		@Pc(296) boolean local296 = true;
		@Pc(298) Class212[] local298 = Static192.aClass212Array1;
		for (@Pc(300) int local300 = 0; local300 < local298.length; local300++) {
			@Pc(314) Class212 local314 = local298[local300];
			@Pc(318) int local318 = local314.method5271();
			@Pc(324) int local324 = local314.method5275().method7372();
			local226 += local318;
			local245 += local318 * local324 / 100;
			if (local324 < 100) {
				local296 = false;
			}
		}
		if (local296) {
			if (!((Class312) Static312.aClass212_5.method5275()).method7376()) {
				Static430.aClient1.method1153();
			}
			Static192.aClass212Array1 = null;
		}
		local226 -= Static120.anInt2728;
		local245 -= Static120.anInt2728;
		local265 = local226 > 0 ? local245 * 100 / local226 : 100;
		if (!local296 && local265 > 99) {
			local265 = 99;
		}
		return local265;
	}

	@OriginalMember(owner = "client!vca", name = "c", descriptor = "(I)V")
	public static void method7985() {
		@Pc(5) Class223 local5 = Static267.aClass223_36;
		synchronized (Static267.aClass223_36) {
			Static267.aClass223_36.method5400();
		}
		local5 = Static571.aClass223_66;
		synchronized (Static571.aClass223_66) {
			Static571.aClass223_66.method5400();
		}
	}
}
