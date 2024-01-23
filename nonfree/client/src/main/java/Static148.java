import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
	public static int anInt3213;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1138 = Static64.method1101("<col=ff3000>");

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
	public static int anInt3214 = 0;

	@OriginalMember(owner = "client!oi", name = "j", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1139 = Static64.method1101("3D)2Softwarebibliothek gestartet)3");

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)Lclient!ke;")
	public static Class62 method2538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub7 local7 = Static22.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class62 local14 = local7.aClass62_1;
			local7.aClass62_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BI)I")
	public static int method2539(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(6) int local6 = local0 | local0 >>> 1;
		@Pc(12) int local12 = local6 | local6 >>> 2;
		@Pc(18) int local18 = local12 | local12 >>> 4;
		@Pc(28) int local28 = local18 | local18 >>> 8;
		@Pc(39) int local39 = local28 | local28 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILjava/awt/Component;ILclient!mi;I)Lclient!ff;")
	public static Class42 method2541(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class72 arg2, @OriginalArg(4) int arg3) {
		if (Static31.anInt702 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(33) Class42 local33 = (Class42) Class.forName("Class42_Sub1").getDeclaredConstructor().newInstance();
			local33.anIntArray228 = new int[(Static15.aBoolean12 ? 2 : 1) * 256];
			local33.anInt3503 = arg1;
			local33.method2731(arg0);
			local33.anInt3505 = (-1024 & arg1) + 1024;
			if (local33.anInt3505 > 16384) {
				local33.anInt3505 = 16384;
			}
			local33.method2727(local33.anInt3505);
			if (Static180.anInt3932 > 0 && Static207.aClass2_1 == null) {
				Static207.aClass2_1 = new Class2();
				Static207.aClass2_1.aClass72_1 = arg2;
				arg2.method2246(Static207.aClass2_1, Static180.anInt3932);
			}
			if (Static207.aClass2_1 != null) {
				if (Static207.aClass2_1.aClass42Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static207.aClass2_1.aClass42Array1[arg3] = local33;
			}
			return local33;
		} catch (@Pc(106) Throwable local106) {
			try {
				@Pc(112) Class42_Sub2 local112 = new Class42_Sub2(arg2, arg3);
				local112.anIntArray228 = new int[(Static15.aBoolean12 ? 2 : 1) * 256];
				local112.anInt3503 = arg1;
				local112.method2731(arg0);
				local112.anInt3505 = 16384;
				local112.method2727(local112.anInt3505);
				if (Static180.anInt3932 > 0 && Static207.aClass2_1 == null) {
					Static207.aClass2_1 = new Class2();
					Static207.aClass2_1.aClass72_1 = arg2;
					arg2.method2246(Static207.aClass2_1, Static180.anInt3932);
				}
				if (Static207.aClass2_1 != null) {
					if (Static207.aClass2_1.aClass42Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static207.aClass2_1.aClass42Array1[arg3] = local112;
				}
				return local112;
			} catch (@Pc(171) Throwable local171) {
				return new Class42();
			}
		}
	}
}
