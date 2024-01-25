import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
	public static int anInt6216;

	@OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
	public static int anInt6217;

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "Ljava/lang/String;")
	public static final String aString360 = "flash3:";

	@OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
	public static int anInt6215 = 0;

	@OriginalMember(owner = "client!vd", name = "u", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_103 = new Class66(16);

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZZLclient!dh;IIBLclient!dh;)I")
	public static int method5520(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class47_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class47_Sub1 arg5) {
		@Pc(10) int local10 = Static321.method5422(arg4, arg2, arg0, arg5);
		if (local10 != 0) {
			return arg0 ? -local10 : local10;
		} else if (arg3 == -1) {
			return 0;
		} else {
			@Pc(40) int local40 = Static321.method5422(arg3, arg2, arg1, arg5);
			return arg1 ? -local40 : local40;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
	public static void method5521() {
		while (true) {
			if (Static6.aClass5_Sub1_Sub1_1.method179(Static179.anInt3568) >= 11) {
				@Pc(14) int local14 = Static6.aClass5_Sub1_Sub1_1.method182(11);
				if (local14 != 2047) {
					@Pc(19) boolean local19 = false;
					if (Static312.aClass25_Sub1_Sub1_Sub1Array1[local14] == null) {
						Static312.aClass25_Sub1_Sub1_Sub1Array1[local14] = new Class25_Sub1_Sub1_Sub1();
						Static312.aClass25_Sub1_Sub1_Sub1Array1[local14].anInt5287 = local14;
						local19 = true;
						if (Static227.aClass5_Sub1Array1[local14] != null) {
							Static312.aClass25_Sub1_Sub1_Sub1Array1[local14].method3686(Static227.aClass5_Sub1Array1[local14]);
						}
					}
					Static220.anIntArray311[Static161.anInt3258++] = local14;
					@Pc(60) Class25_Sub1_Sub1_Sub1 local60 = Static312.aClass25_Sub1_Sub1_Sub1Array1[local14];
					local60.anInt5320 = Static180.anInt3606;
					@Pc(70) int local70 = Static301.anIntArray504[Static6.aClass5_Sub1_Sub1_1.method182(3)];
					@Pc(75) int local75 = Static6.aClass5_Sub1_Sub1_1.method182(1);
					if (local75 == 1) {
						Static178.anIntArray266[Static47.anInt1211++] = local14;
					}
					@Pc(93) int local93 = Static6.aClass5_Sub1_Sub1_1.method182(5);
					if (local93 > 15) {
						local93 -= 32;
					}
					@Pc(104) int local104 = Static6.aClass5_Sub1_Sub1_1.method182(1);
					@Pc(111) int local111 = Static6.aClass5_Sub1_Sub1_1.method182(5);
					if (local111 > 15) {
						local111 -= 32;
					}
					if (local19) {
						local60.method4648(local70);
					}
					local60.method3684(local93 + Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0], local104 == 1, local111 + Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0], Static156.anInt3123);
					continue;
				}
			}
			Static6.aClass5_Sub1_Sub1_1.method175();
			return;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V")
	public static void method5522(@OriginalArg(0) int arg0) {
		Static156.anInt3125 = arg0;
		Static131.aClass66_45.method1933();
	}
}
