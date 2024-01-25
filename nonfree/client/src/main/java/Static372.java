import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!mn", name = "k", descriptor = "Lclient!ib;")
	public static Class154 aClass154_2;

	@OriginalMember(owner = "client!mn", name = "l", descriptor = "Lclient!oo;")
	public static final Class264 aClass264_42 = new Class264(4);

	@OriginalMember(owner = "client!mn", name = "m", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_118 = new Class44(52, 8);

	@OriginalMember(owner = "client!mn", name = "n", descriptor = "[Lclient!ru;")
	public static Class217_Sub1[] aClass217_Sub1Array1 = new Class217_Sub1[0];

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Ljava/awt/Component;IIBLclient!td;)Lclient!hp;")
	public static Class112 method5548(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class333 arg3) {
		if (Static515.anInt9036 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(31) Class112 local31 = (Class112) Class.forName("Class112_Sub1").getDeclaredConstructor().newInstance();
			local31.anIntArray471 = new int[(Static40.aBoolean129 ? 2 : 1) * 256];
			local31.anInt6566 = arg1;
			local31.method5384(arg0);
			local31.anInt6567 = (arg1 & 0xFFFFFC00) + 1024;
			if (local31.anInt6567 > 16384) {
				local31.anInt6567 = 16384;
			}
			local31.method5386(local31.anInt6567);
			if (Static650.anInt10864 > 0 && Static302.aClass56_7 == null) {
				Static302.aClass56_7 = new Class56();
				Static302.aClass56_7.aClass333_3 = arg3;
				arg3.method8151(Static650.anInt10864, Static302.aClass56_7);
			}
			if (Static302.aClass56_7 != null) {
				if (Static302.aClass56_7.aClass112Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static302.aClass56_7.aClass112Array1[arg2] = local31;
			}
			return local31;
		} catch (@Pc(106) Throwable local106) {
			try {
				@Pc(117) Class112_Sub2 local117 = new Class112_Sub2(arg3, arg2);
				local117.anIntArray471 = new int[(Static40.aBoolean129 ? 2 : 1) * 256];
				local117.anInt6566 = arg1;
				local117.method5384(arg0);
				local117.anInt6567 = 16384;
				local117.method5386(local117.anInt6567);
				if (Static650.anInt10864 > 0 && Static302.aClass56_7 == null) {
					Static302.aClass56_7 = new Class56();
					Static302.aClass56_7.aClass333_3 = arg3;
					arg3.method8151(Static650.anInt10864, Static302.aClass56_7);
				}
				if (Static302.aClass56_7 != null) {
					if (Static302.aClass56_7.aClass112Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static302.aClass56_7.aClass112Array1[arg2] = local117;
				}
				return local117;
			} catch (@Pc(176) Throwable local176) {
				return new Class112();
			}
		}
	}
}
