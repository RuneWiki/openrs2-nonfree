import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!mda", name = "N", descriptor = "I")
	public static int anInt6197;

	@OriginalMember(owner = "client!mda", name = "Z", descriptor = "I")
	public static int anInt6205;

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lclient!uq;III)Lclient!eb;")
	public static Class91 method5238(@OriginalArg(0) Class362 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) byte[] local9 = arg0.method8368(arg1, 0);
		return local9 == null ? null : new Class91(local9);
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lclient!fq;IIIII)V")
	public static void method5241(@OriginalArg(0) Class34_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static247.anInt4367) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static133.anInt2551) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static155.anInt2874 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class368 local62 = Static254.aClass368ArrayArrayArray2[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static582.aClass35Array3[local17].method7461(local32, local23) + Static582.aClass35Array3[local17].method7461(local32, local23 + 1) + Static582.aClass35Array3[local17].method7461(local32 + 1, local23) + Static582.aClass35Array3[local17].method7461(local32 + 1, local23 + 1)) / 4 - (Static582.aClass35Array3[arg1].method7461(arg3, arg2) + Static582.aClass35Array3[arg1].method7461(arg3, arg2 + 1) + Static582.aClass35Array3[arg1].method7461(arg3 + 1, arg2) + Static582.aClass35Array3[arg1].method7461(arg3 + 1, arg2 + 1)) / 4;
									@Pc(151) Class34_Sub1_Sub5 local151 = local62.aClass34_Sub1_Sub5_2;
									@Pc(154) Class34_Sub1_Sub5 local154 = local62.aClass34_Sub1_Sub5_1;
									if (local151 != null && local151.method7841()) {
										arg0.method7842(local148, local151, (local23 - arg2) * Static599.anInt7773 + (1 - arg4) * Static579.anInt9391, (local32 - arg3) * Static599.anInt7773 + (1 - arg5) * Static579.anInt9391, Static50.aClass95_1, local1);
									}
									if (local154 != null && local154.method7841()) {
										arg0.method7842(local148, local154, (local23 - arg2) * Static599.anInt7773 + (1 - arg4) * Static579.anInt9391, (local32 - arg3) * Static599.anInt7773 + (1 - arg5) * Static579.anInt9391, Static50.aClass95_1, local1);
									}
									for (@Pc(227) Class205 local227 = local62.aClass205_4; local227 != null; local227 = local227.aClass205_3) {
										@Pc(231) Class34_Sub1_Sub1 local231 = local227.aClass34_Sub1_Sub1_1;
										if (local231 != null && local231.method7841() && (local23 == local231.aShort98 || local23 == local3) && (local32 == local231.aShort99 || local32 == local11)) {
											@Pc(260) int local260 = local231.aShort97 + 1 - local231.aShort98;
											@Pc(268) int local268 = local231.aShort96 + 1 - local231.aShort99;
											arg0.method7842(local148, local231, (local231.aShort98 - arg2) * Static599.anInt7773 + (local260 - arg4) * Static579.anInt9391, (local231.aShort99 - arg3) * Static599.anInt7773 + (local268 - arg5) * Static579.anInt9391, Static50.aClass95_1, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
