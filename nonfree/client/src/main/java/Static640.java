import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static640 {

	@OriginalMember(owner = "client!wia", name = "F", descriptor = "I")
	public static int anInt10331;

	@OriginalMember(owner = "client!wia", name = "J", descriptor = "Lclient!sh;")
	public static Class314 aClass314_2;

	@OriginalMember(owner = "client!wia", name = "G", descriptor = "Z")
	public static boolean aBoolean751 = false;

	@OriginalMember(owner = "client!wia", name = "K", descriptor = "I")
	public static int anInt10333 = 100;

	@OriginalMember(owner = "client!wia", name = "O", descriptor = "[I")
	public static final int[] anIntArray731 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(Lclient!qg;IILjava/awt/Component;I)Lclient!bl;")
	public static Class39 method8785(@OriginalArg(0) Class286 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int arg3) {
		if (Static489.anInt8544 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(28) Class39 local28 = (Class39) Class.forName("Class39_Sub1").getDeclaredConstructor().newInstance();
			local28.anInt5641 = arg3;
			local28.anIntArray351 = new int[(Static40.aBoolean75 ? 2 : 1) * 256];
			local28.method4901(arg2);
			local28.anInt5635 = (-1024 & arg3) + 1024;
			if (local28.anInt5635 > 16384) {
				local28.anInt5635 = 16384;
			}
			local28.method4893(local28.anInt5635);
			if (Static474.anInt7663 > 0 && Static153.aClass45_1 == null) {
				Static153.aClass45_1 = new Class45();
				Static153.aClass45_1.aClass286_1 = arg0;
				arg0.method6575(Static474.anInt7663, Static153.aClass45_1);
			}
			if (Static153.aClass45_1 != null) {
				if (Static153.aClass45_1.aClass39Array1[arg1] != null) {
					throw new IllegalArgumentException();
				}
				Static153.aClass45_1.aClass39Array1[arg1] = local28;
			}
			return local28;
		} catch (@Pc(103) Throwable local103) {
			try {
				@Pc(109) Class39_Sub2 local109 = new Class39_Sub2(arg0, arg1);
				local109.anInt5641 = arg3;
				local109.anIntArray351 = new int[(Static40.aBoolean75 ? 2 : 1) * 256];
				local109.method4901(arg2);
				local109.anInt5635 = 16384;
				local109.method4893(local109.anInt5635);
				if (Static474.anInt7663 > 0 && Static153.aClass45_1 == null) {
					Static153.aClass45_1 = new Class45();
					Static153.aClass45_1.aClass286_1 = arg0;
					arg0.method6575(Static474.anInt7663, Static153.aClass45_1);
				}
				if (Static153.aClass45_1 != null) {
					if (Static153.aClass45_1.aClass39Array1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static153.aClass45_1.aClass39Array1[arg1] = local109;
				}
				return local109;
			} catch (@Pc(173) Throwable local173) {
				return new Class39();
			}
		}
	}

	@OriginalMember(owner = "client!wia", name = "b", descriptor = "(II)Lclient!wf;")
	public static Class362_Sub1 method8786(@OriginalArg(1) int arg0) {
		return Static327.aBoolean416 && Static455.anInt9458 <= arg0 && Static528.anInt3398 >= arg0 ? Static614.aClass362_Sub1Array2[arg0 - Static455.anInt9458] : null;
	}
}
