import java.awt.Canvas;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!rd", name = "Fc", descriptor = "I")
	public static int anInt5431;

	@OriginalMember(owner = "client!rd", name = "Wc", descriptor = "[Lclient!ti;")
	public static Class4_Sub5[] aClass4_Sub5Array2;

	@OriginalMember(owner = "client!rd", name = "Yc", descriptor = "[S")
	public static short[] aShortArray92;

	@OriginalMember(owner = "client!rd", name = "Kc", descriptor = "I")
	public static int anInt5436 = 0;

	@OriginalMember(owner = "client!rd", name = "Vc", descriptor = "I")
	public static int anInt5446 = 999999;

	@OriginalMember(owner = "client!rd", name = "ad", descriptor = "[I")
	public static final int[] anIntArray524 = new int[5];

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!ij;I)V")
	public static void method4819(@OriginalArg(0) Class93 arg0) {
		Static87.anInt1616 = 0;
		Static203.anInt5015 = 0;
		Static233.aClass39_5 = new Class39();
		Static331.aClass32_Sub3_Sub1_Sub1Array2 = new Class32_Sub3_Sub1_Sub1[1024];
		Static335.method5824(arg0);
		Static348.method5941(arg0);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!ne;ILclient!gf;Ljava/awt/Canvas;IB)Lclient!ea;")
	public static Class55 method4820(@OriginalArg(0) Class139 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface3 arg2, @OriginalArg(3) Canvas arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(11) Class local11 = Class.forName("Class55_Sub1");
			@Pc(57) Constructor local57 = local11.getConstructor(Canvas.class, gf.class, Integer.TYPE, Integer.TYPE, ne.class);
			return (Class55) local57.newInstance(arg3, arg2, Integer.valueOf(arg1), new Integer(arg4), arg0);
		} catch (@Pc(90) Exception local90) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4822(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static44.anInt750 >= 100 && !Static338.aBoolean591 || Static44.anInt750 >= 200) {
			Static45.method713(Static271.aClass85_119.method2020(Static41.anInt726));
			return;
		}
		@Pc(31) String local31 = Static289.method5015(arg0);
		if (local31 == null) {
			return;
		}
		@Pc(73) String local73;
		for (@Pc(36) int local36 = 0; local36 < Static44.anInt750; local36++) {
			@Pc(43) String local43 = Static289.method5015(Static85.aStringArray14[local36]);
			if (local43 != null && local43.equals(local31)) {
				Static45.method713(arg0 + Static159.aClass85_73.method2020(Static41.anInt726));
				return;
			}
			if (Static20.aStringArray5[local36] != null) {
				local73 = Static289.method5015(Static20.aStringArray5[local36]);
				if (local73 != null && local73.equals(local31)) {
					Static45.method713(arg0 + Static159.aClass85_73.method2020(Static41.anInt726));
					return;
				}
			}
		}
		for (@Pc(99) int local99 = 0; local99 < Static346.anInt6667; local99++) {
			local73 = Static289.method5015(Static25.aStringArray52[local99]);
			if (local73 != null && local73.equals(local31)) {
				Static45.method713(Static315.aClass85_131.method2020(Static41.anInt726) + arg0 + Static60.aClass85_48.method2020(Static41.anInt726));
				return;
			}
			if (Static222.aStringArray48[local99] != null) {
				@Pc(143) String local143 = Static289.method5015(Static222.aStringArray48[local99]);
				if (local143 != null && local143.equals(local31)) {
					Static45.method713(Static315.aClass85_131.method2020(Static41.anInt726) + arg0 + Static60.aClass85_48.method2020(Static41.anInt726));
					return;
				}
			}
		}
		if (Static289.method5015(Static192.aClass4_Sub5_Sub2_Sub1_2.aString40).equals(local31)) {
			Static45.method713(Static205.aClass85_94.method2020(Static41.anInt726));
		} else {
			Static125.aClass5_Sub12_Sub2_3.method5125(25);
			Static125.aClass5_Sub12_Sub2_3.method5089(Static56.method878(arg0));
			Static125.aClass5_Sub12_Sub2_3.method5094(arg0);
		}
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(IZ)V")
	public static void method4824(@OriginalArg(1) boolean arg0) {
		Static315.method5535();
		if (Static278.anInt5495 != 30 && Static278.anInt5495 != 25) {
			return;
		}
		Static36.anInt657++;
		if (Static36.anInt657 < 50 && !arg0) {
			return;
		}
		Static36.anInt657 = 0;
		if (!Static76.aBoolean101 && Static155.aClass41_18 != null) {
			Static125.aClass5_Sub12_Sub2_3.method5125(57);
			try {
				Static155.aClass41_18.method829(Static125.aClass5_Sub12_Sub2_3.aByteArray90, Static125.aClass5_Sub12_Sub2_3.anInt5731);
				Static125.aClass5_Sub12_Sub2_3.anInt5731 = 0;
			} catch (@Pc(53) IOException local53) {
				Static76.aBoolean101 = true;
			}
		}
		Static315.method5535();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)V")
	public static void method4828() {
		Static322.aClass109_8.method2859(5);
	}
}
