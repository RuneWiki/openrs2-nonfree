import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!ua", name = "H", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_104 = new Class142(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
	public static int anInt6516 = 0;

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "(I)V")
	public static void method5229() {
		Static249.anInt4440 = 0;
		Static234.aClass43Array1 = new Class43[50];
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIII)V")
	public static void method5230(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = arg0 << 3;
		@Pc(7) int local7 = arg1 << 3;
		Static99.aFloat9 = local3;
		Static336.aFloat72 = local7;
		if (Static139.anInt2147 == 2) {
			Static398.anInt6386 = local3;
			Static39.anInt573 = 0;
			Static129.anInt1972 = local7;
		}
		Static454.method5849();
		Static413.aBoolean582 = true;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIILclient!gq;Lclient!gq;)V")
	public static void method5231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub4 arg3, @OriginalArg(4) Class11_Sub4 arg4) {
		@Pc(4) Class216 local4 = Static161.method2122(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass11_Sub4_2 = arg3;
			local4.aClass11_Sub4_1 = arg4;
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(IIII)V")
	public static void method5232(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class1_Sub3_Sub1 local16 = Static427.method5426(arg1, 11);
		local16.method384();
		local16.anInt387 = arg2;
		local16.anInt381 = arg0;
	}

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "(I)V")
	public static void method5233() {
		if (Static186.aClass117_3 == null) {
			return;
		}
		Static181.aClass63_2.method1025();
		Static210.method5858();
		Static349.method4563();
		Static23.method351();
		Static334.method4390();
		Static462.method5973();
		if (Static203.aClass197_1 != null) {
			Static203.aClass197_1.method4175();
		}
		Static361.method4701();
		Static167.method2199();
		Static326.method4282();
		Static327.method4302(false);
		Static90.method1063();
		for (@Pc(36) int local36 = 0; local36 < 2048; local36++) {
			@Pc(42) Class11_Sub1_Sub3_Sub2 local42 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local36];
			if (local42 != null) {
				local42.aClass1_Sub24_3 = null;
				for (@Pc(49) int local49 = 0; local49 < local42.aClass8Array3.length; local49++) {
					local42.aClass8Array3[local49] = null;
				}
			}
		}
		for (@Pc(74) int local74 = 0; local74 < anInt6516; local74++) {
			@Pc(81) Class11_Sub1_Sub3_Sub1 local81 = Static47.aClass1_Sub44Array1[local74].aClass11_Sub1_Sub3_Sub1_2;
			if (local81 != null) {
				for (@Pc(85) int local85 = 0; local85 < local81.aClass8Array3.length; local85++) {
					local81.aClass8Array3[local85] = null;
				}
			}
		}
		Static18.aClass34_4 = null;
		Static329.aClass34_5 = null;
		Static186.aClass117_3.method5701();
		Static186.aClass117_3 = null;
	}
}
