import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
	public static int anInt3866;

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "Lclient!ma;")
	public static final Class222 aClass222_1 = new Class222();

	@OriginalMember(owner = "client!gk", name = "x", descriptor = "Lclient!fca;")
	public static final Class114 aClass114_22 = new Class114();

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)V")
	public static void method3288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static635.aClass226ArrayArrayArray3[0][arg1][arg2] != null && Static635.aClass226ArrayArrayArray3[0][arg1][arg2].aClass226_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static635.aClass226ArrayArrayArray3[local22][arg1][arg2] == null) {
				@Pc(44) Class226 local44 = Static635.aClass226ArrayArrayArray3[local22][arg1][arg2] = new Class226(local22);
				if (local20) {
					local44.aByte100++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIBIIII)V")
	public static void method3289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 != 8 && arg3 != 16) {
			@Pc(17) Class226 local17 = Static635.aClass226ArrayArrayArray3[arg4][arg5][arg0];
			if (local17 == null) {
				local17 = new Class226(arg4);
			}
			if (arg3 == 1) {
				local17.aShort67 = (short) arg2;
				local17.aShort66 = (short) arg1;
			} else if (arg3 == 2) {
				local17.aShort68 = (short) arg1;
				local17.aShort65 = (short) arg2;
			}
			if (Static563.aBoolean781) {
				Static23.method291();
			}
			return;
		}
		@Pc(69) int local69;
		@Pc(74) int local74;
		@Pc(78) int local78;
		@Pc(83) int local83;
		@Pc(93) int local93;
		@Pc(103) int local103;
		if (arg3 != 8) {
			local69 = Static671.anInt10769 + (arg5 << Static588.anInt9672);
			local74 = local69 - Static671.anInt10769;
			local78 = arg0 << Static588.anInt9672;
			local83 = local78 + Static671.anInt10769;
			local93 = Static605.aClass109Array5[arg4].method7695(arg0, arg5 + 1);
			local103 = Static605.aClass109Array5[arg4].method7695(arg0 + 1, arg5);
			Static108.aClass38Array1[Static479.anInt8053++] = new Class38(arg3, arg4, local69, local74, local74, local69, local93, local103, local103 - arg1, local93 - arg1, local78, local83, local83, local78);
			return;
		}
		local69 = arg5 << Static588.anInt9672;
		local74 = Static671.anInt10769 + local69;
		local78 = arg0 << Static588.anInt9672;
		local83 = Static671.anInt10769 + local78;
		local93 = Static605.aClass109Array5[arg4].method7695(arg0, arg5);
		local103 = Static605.aClass109Array5[arg4].method7695(arg0 + 1, arg5 - -1);
		Static108.aClass38Array1[Static479.anInt8053++] = new Class38(arg3, arg4, local69, local74, local74, local69, local93, local103, local103 - arg1, local93 - arg1, local78, local83, local83, local78);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
	public static void method3290() {
		Static327.aClass340_37.method8000();
	}
}
