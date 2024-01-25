import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!we", name = "o", descriptor = "Lclient!sv;")
	public static Class276 aClass276_1;

	@OriginalMember(owner = "client!we", name = "h", descriptor = "S")
	public static short aShort134 = 256;

	@OriginalMember(owner = "client!we", name = "j", descriptor = "[I")
	public static final int[] anIntArray830 = new int[25];

	@OriginalMember(owner = "client!we", name = "r", descriptor = "Lclient!im;")
	public static final Class140 aClass140_146 = new Class140(38, 9);

	@OriginalMember(owner = "client!we", name = "s", descriptor = "Z")
	public static boolean aBoolean629 = false;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "([FBI)[F")
	public static float[] method7373(@OriginalArg(0) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) float[] local11 = new float[arg1];
		Static551.method3491(arg0, 0, local11, 0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)Lclient!go;")
	public static Class111 method7374() {
		try {
			return (Class111) Class.forName("Class111_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
	public static void method7376() {
		Static527.aClass35Array1 = new Class35[50];
		Static482.anInt7992 = 0;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIILclient!ck;Lclient!ck;)V")
	public static void method7380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class49_Sub1 arg3, @OriginalArg(4) Class49_Sub1 arg4) {
		@Pc(4) Class255 local4 = Static188.method2930(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass49_Sub1_3 = arg3;
			local4.aClass49_Sub1_2 = arg4;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZI)V")
	public static void method7382(@OriginalArg(0) boolean arg0) {
		Static493.anInt8167 = 0;
		Static545.anInt9167 = 0;
		Static233.method4043();
		Static20.method504(arg0);
		Static276.method7423();
		@Pc(18) boolean local18 = false;
		@Pc(26) int local26;
		for (@Pc(20) int local20 = 0; local20 < Static493.anInt8167; local20++) {
			local26 = Static305.anIntArray559[local20];
			@Pc(33) Class1_Sub17 local33 = (Class1_Sub17) Static380.aClass17_29.method738((long) local26);
			@Pc(36) Class49_Sub2_Sub2_Sub2 local36 = local33.aClass49_Sub2_Sub2_Sub2_2;
			if (Static15.aBoolean16 && Static196.method3413(local26)) {
				Static543.method7538();
			}
			if (Static436.anInt6850 != local36.anInt4300) {
				if (local36.aClass196_1.method4863()) {
					Static523.method7179(local36);
				}
				local36.method3802(null);
				local33.method7525();
				local18 = true;
			}
		}
		if (local18) {
			Static350.anInt6254 = Static380.aClass17_29.method742();
			Static380.aClass17_29.method739(Static177.aClass1_Sub17Array3);
		}
		if (Static405.anInt9105 != Static97.aClass1_Sub6_Sub2_1.anInt4555) {
			throw new RuntimeException("gnp1 pos:" + Static97.aClass1_Sub6_Sub2_1.anInt4555 + " psize:" + Static405.anInt9105);
		}
		for (local26 = 0; local26 < Static157.anInt4503; local26++) {
			if (Static380.aClass17_29.method738((long) Static427.anIntArray711[local26]) == null) {
				throw new RuntimeException("gnp2 pos:" + local26 + " size:" + Static157.anInt4503);
			}
		}
	}
}
