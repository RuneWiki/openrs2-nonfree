import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!ola", name = "t", descriptor = "I")
	public static int anInt7504 = 0;

	@OriginalMember(owner = "client!ola", name = "a", descriptor = "(ILjava/awt/Component;ILclient!vo;I)Lclient!hia;")
	public static Class70 method6678(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class389 arg3) {
		if (Static24.anInt294 == 0) {
			throw new IllegalStateException();
		} else if (arg0 >= 2) {
			throw new IllegalArgumentException();
		} else {
			try {
				@Pc(36) Class70 local36 = (Class70) Class.forName("cq").getDeclaredConstructor().newInstance();
				local36.anIntArray742 = new int[(Static42.aBoolean76 ? 2 : 1) * 256];
				local36.anInt10695 = arg2;
				local36.method9361(arg1);
				local36.anInt10694 = (-1024 & arg2) + 1024;
				if (local36.anInt10694 > 16384) {
					local36.anInt10694 = 16384;
				}
				local36.method9360(local36.anInt10694);
				if (Static207.anInt3359 > 0 && Static393.aClass339_1 == null) {
					Static393.aClass339_1 = new Class339();
					Static393.aClass339_1.aClass389_6 = arg3;
					arg3.method9276(Static393.aClass339_1, Static207.anInt3359);
				}
				if (Static393.aClass339_1 != null) {
					if (Static393.aClass339_1.aClass70Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static393.aClass339_1.aClass70Array1[arg0] = local36;
				}
				return local36;
			} catch (@Pc(121) Throwable local121) {
				try {
					@Pc(127) Class70_Sub2 local127 = new Class70_Sub2(arg3, arg0);
					local127.anIntArray742 = new int[(Static42.aBoolean76 ? 2 : 1) * 256];
					local127.anInt10695 = arg2;
					local127.method9361(arg1);
					local127.anInt10694 = 16384;
					local127.method9360(local127.anInt10694);
					if (Static207.anInt3359 > 0 && Static393.aClass339_1 == null) {
						Static393.aClass339_1 = new Class339();
						Static393.aClass339_1.aClass389_6 = arg3;
						arg3.method9276(Static393.aClass339_1, Static207.anInt3359);
					}
					if (Static393.aClass339_1 != null) {
						if (Static393.aClass339_1.aClass70Array1[arg0] != null) {
							throw new IllegalArgumentException();
						}
						Static393.aClass339_1.aClass70Array1[arg0] = local127;
					}
					return local127;
				} catch (@Pc(197) Throwable local197) {
					return new Class70();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ola", name = "a", descriptor = "(IBZ)V")
	public static void method6679(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(19) Class2_Sub43 local19 = arg1 ? Static176.aClass2_Sub43_1 : Static205.aClass2_Sub43_2;
		if (local19 == null || arg0 < 0 || local19.anInt7160 <= arg0) {
			return;
		}
		@Pc(41) Class233 local41 = local19.aClass233Array1[arg0];
		if (local41.aByte80 != -1) {
			return;
		}
		@Pc(51) String local51 = local41.aString65;
		@Pc(54) Class221 local54 = Static87.method1292();
		@Pc(60) Class2_Sub33 local60 = Static592.method8154(Static449.aClass349_105, local54.aClass48_1);
		local60.aClass2_Sub20_Sub2_1.method8584(Static125.method1890(local51) + 3);
		local60.aClass2_Sub20_Sub2_1.method8584(arg1 ? 1 : 0);
		local60.aClass2_Sub20_Sub2_1.method8551(arg0);
		local60.aClass2_Sub20_Sub2_1.method8541(local51);
		local54.method5173(local60);
	}
}
