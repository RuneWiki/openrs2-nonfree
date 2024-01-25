import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
	public static int anInt15 = -1;

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "Lclient!tl;")
	public static final Class227 aClass227_1 = new Class227(64);

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!uh;)V")
	public static void method13(@OriginalArg(1) Class1_Sub7 arg0) {
		if (arg0.aClass1_Sub31_5 != null) {
			arg0.aClass1_Sub31_5.anInt5824 = 0;
		}
		arg0.aBoolean477 = false;
		for (@Pc(18) Class1_Sub7 local18 = arg0.method4407(); local18 != null; local18 = arg0.method4408()) {
			method13(local18);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!tq;)V")
	public static void method14(@OriginalArg(0) Class164 arg0) {
		for (@Pc(1) int local1 = Static365.anInt5878; local1 < Static337.anInt5599; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static19.anInt329; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static230.anInt6113; local7++) {
					@Pc(16) Class132 local16 = Static25.aClass132ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class25_Sub5 local21 = local16.aClass25_Sub5_1;
						@Pc(24) Class25_Sub5 local24 = local16.aClass25_Sub5_2;
						if (local21 != null && local21.method5236()) {
							Static8.method78(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5236()) {
								Static8.method78(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5235(false, arg0, local21, 0, 0, 0);
								local24.method5233();
							}
							local21.method5233();
						}
						for (@Pc(70) Class116 local70 = local16.aClass116_3; local70 != null; local70 = local70.aClass116_2) {
							@Pc(74) Class25_Sub1 local74 = local70.aClass25_Sub1_1;
							if (local74 != null && local74.method5236()) {
								Static8.method78(arg0, local74, local1, local4, local7, local74.aShort87 + 1 - local74.aShort88, local74.aShort90 - local74.aShort89 + 1);
								local74.method5233();
							}
						}
						@Pc(111) Class25_Sub4 local111 = local16.aClass25_Sub4_2;
						if (local111 != null && local111.method5236()) {
							Static13.method110(arg0, local111, local1, local4, local7);
							local111.method5233();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)V")
	public static void method15(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub6_Sub11 local8 = Static295.method4455(arg0, 2);
		local8.method2998();
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BIIIIII)I")
	public static int method17(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 & 0x1) == 1) {
			@Pc(8) int local8 = arg3;
			arg3 = arg0;
			arg0 = local8;
		}
		@Pc(16) int local16 = arg1 & 0x3;
		if (local16 == 0) {
			return arg4;
		} else if (local16 == 1) {
			return 1 + 7 - arg3 - arg5;
		} else if (local16 == 2) {
			return 7 + 1 - arg4 - arg0;
		} else {
			return arg5;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
	public static void method18() {
		Static114.aClass77_15.method1362();
		Static76.aClass77_36.method1362();
	}
}
