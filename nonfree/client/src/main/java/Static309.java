import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!tg", name = "q", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!tg", name = "t", descriptor = "Z")
	public static boolean aBoolean544;

	@OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
	public static int anInt6122;

	@OriginalMember(owner = "client!tg", name = "B", descriptor = "Lclient!iq;")
	public static Class104 aClass104_162;

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "Lclient!sf;")
	public static final Class180 aClass180_41 = new Class180();

	@OriginalMember(owner = "client!tg", name = "o", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray41 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!tg", name = "u", descriptor = "[B")
	public static final byte[] aByteArray86 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!tg", name = "y", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_195 = new Class221(54, -2);

	@OriginalMember(owner = "client!tg", name = "C", descriptor = "[I")
	public static final int[] anIntArray471 = new int[4096];

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IB)Lclient!tb;")
	public static Class189 method5154(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static202.aFloat50 == 3.0D) {
				return Static54.aClass189_1;
			}
			if ((double) Static202.aFloat50 == 4.0D) {
				return Static59.aClass189_2;
			}
			if ((double) Static202.aFloat50 == 6.0D) {
				return Static173.aClass189_5;
			}
			if ((double) Static202.aFloat50 >= 8.0D) {
				return Static86.aClass189_4;
			}
		} else if (arg0 == 1) {
			if ((double) Static202.aFloat50 == 3.0D) {
				return Static173.aClass189_5;
			}
			if ((double) Static202.aFloat50 == 4.0D) {
				return Static86.aClass189_4;
			}
			if ((double) Static202.aFloat50 == 6.0D) {
				return Static300.aClass189_8;
			}
			if ((double) Static202.aFloat50 >= 8.0D) {
				return Static214.aClass189_6;
			}
		} else if (arg0 == 2) {
			if ((double) Static202.aFloat50 == 3.0D) {
				return Static300.aClass189_8;
			}
			if ((double) Static202.aFloat50 == 4.0D) {
				return Static214.aClass189_6;
			}
			if ((double) Static202.aFloat50 == 6.0D) {
				return Static256.aClass189_7;
			}
			if ((double) Static202.aFloat50 >= 8.0D) {
				return Static72.aClass189_3;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IILclient!iq;I)Lclient!jp;")
	public static Class111 method5155(@OriginalArg(1) int arg0, @OriginalArg(2) Class104 arg1) {
		@Pc(16) byte[] local16 = arg1.method2756(arg0, 0);
		return local16 == null ? null : new Class111(local16);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(CI)C")
	public static char method5158(@OriginalArg(0) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
	public static void method5159() {
		Static186.aClass107_20.method3012();
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!ps;)I")
	public static int method5160(@OriginalArg(1) Class2_Sub31 arg0) {
		@Pc(14) String local14 = Static159.method2497(arg0);
		@Pc(16) int[] local16 = null;
		if (Static2.method59(arg0.anInt5368)) {
			local16 = Static310.aClass184_2.method5040((int) arg0.aLong163).anIntArray296;
		} else if (Static223.method4181(arg0.anInt5368)) {
			@Pc(75) Class1_Sub2_Sub3_Sub2 local75 = Static95.aClass1_Sub2_Sub3_Sub2Array1[(int) arg0.aLong163];
			if (local75 != null) {
				@Pc(80) Class139 local80 = local75.aClass139_1;
				if (local80.anIntArray350 != null) {
					local80 = local80.method4120();
				}
				if (local80 != null) {
					local16 = local80.anIntArray351;
				}
			}
		} else if (Static237.method4310(arg0.anInt5368)) {
			@Pc(49) Class74 local49;
			if (arg0.anInt5368 == 1002) {
				local49 = Static228.method4210((int) arg0.aLong163);
			} else {
				local49 = Static228.method4210((int) (arg0.aLong163 >>> 32 & 0x7FFFFFFFL));
			}
			if (local49.anIntArray161 != null) {
				local49 = local49.method1997();
			}
			if (local49 != null) {
				local16 = local49.anIntArray164;
			}
		}
		if (local16 != null) {
			local14 = local14 + Static106.method2086(local16);
		}
		@Pc(122) int local122 = Static99.aClass82_3.method2229(local14, Static65.aClass46Array24);
		if (arg0.aBoolean469) {
			local122 += Static242.aClass46_18.method5019() + 4;
		}
		return local122;
	}
}
