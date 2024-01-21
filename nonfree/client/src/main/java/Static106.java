import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!kc", name = "ab", descriptor = "Lclient!sa;")
	public static Class3_Sub3_Sub2_Sub3 aClass3_Sub3_Sub2_Sub3_3;

	@OriginalMember(owner = "client!kc", name = "kb", descriptor = "Lclient!ke;")
	public static Class52 aClass52_22;

	@OriginalMember(owner = "client!kc", name = "Z", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1068 = Static193.method3027("To play on this world move to a free area first)3");

	@OriginalMember(owner = "client!kc", name = "nb", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1074 = Static193.method3027("Please remove ");

	@OriginalMember(owner = "client!kc", name = "bb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1069 = aClass70_1074;

	@OriginalMember(owner = "client!kc", name = "cb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1070 = Static193.method3027("Ausw-=hlen");

	@OriginalMember(owner = "client!kc", name = "eb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1071 = aClass70_1068;

	@OriginalMember(owner = "client!kc", name = "ib", descriptor = "[Lclient!oc;")
	public static final Class70[] aClass70Array40 = new Class70[100];

	@OriginalMember(owner = "client!kc", name = "jb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1072 = Static193.method3027("3D)2Softwarebibliothek gestartet");

	@OriginalMember(owner = "client!kc", name = "lb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1073 = aClass70_1074;

	@OriginalMember(owner = "client!kc", name = "mb", descriptor = "[S")
	public static final short[] aShortArray26 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILjava/awt/Component;Lclient!ja;II)Lclient!lc;")
	public static Class56 method1505(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(4) int arg3) {
		if (Static91.anInt1796 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(33) Class56 local33 = (Class56) Class.forName("Class56_Sub1").getDeclaredConstructor().newInstance();
			local33.anInt3352 = arg0;
			local33.anIntArray251 = new int[(Static150.aBoolean144 ? 2 : 1) * 256];
			local33.method2450(arg1);
			local33.anInt3357 = (arg0 & 0xFFFFFC00) + 1024;
			if (local33.anInt3357 > 16384) {
				local33.anInt3357 = 16384;
			}
			local33.method2446(local33.anInt3357);
			if (Static176.anInt3589 > 0 && Static69.aClass37_1 == null) {
				Static69.aClass37_1 = new Class37();
				Static69.aClass37_1.aClass47_3 = arg2;
				arg2.method1363(Static69.aClass37_1, Static176.anInt3589);
			}
			if (Static69.aClass37_1 != null) {
				if (Static69.aClass37_1.aClass56Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static69.aClass37_1.aClass56Array1[arg3] = local33;
			}
			return local33;
		} catch (@Pc(106) Throwable local106) {
			try {
				@Pc(112) Class56_Sub2 local112 = new Class56_Sub2(arg2, arg3);
				local112.anInt3352 = arg0;
				local112.anIntArray251 = new int[(Static150.aBoolean144 ? 2 : 1) * 256];
				local112.method2450(arg1);
				local112.anInt3357 = 16384;
				local112.method2446(local112.anInt3357);
				if (Static176.anInt3589 > 0 && Static69.aClass37_1 == null) {
					Static69.aClass37_1 = new Class37();
					Static69.aClass37_1.aClass47_3 = arg2;
					arg2.method1363(Static69.aClass37_1, Static176.anInt3589);
				}
				if (Static69.aClass37_1 != null) {
					if (Static69.aClass37_1.aClass56Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static69.aClass37_1.aClass56Array1[arg3] = local112;
				}
				return local112;
			} catch (@Pc(179) Throwable local179) {
				return new Class56();
			}
		}
	}
}
