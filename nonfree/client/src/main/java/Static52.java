import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!cq", name = "G", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_26 = new Class209("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ljava/awt/Component;BZ)Lclient!a;")
	public static Class1 method883(@OriginalArg(0) Component arg0) {
		return new Class1_Sub1(arg0, true);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIIIII)V")
	public static void method887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static135.method2307(arg0);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg0 - arg2;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg0;
		@Pc(24) int local24 = -arg0;
		@Pc(26) int local26 = local15;
		@Pc(29) int local29 = -local15;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = -1;
		@Pc(63) int local63;
		@Pc(71) int local71;
		@Pc(80) int local80;
		@Pc(88) int local88;
		if (Static430.anInt7123 <= arg5 && arg5 <= Static181.anInt3543) {
			@Pc(55) int[] local55 = Static280.anIntArrayArray51[arg5];
			local63 = Static327.method4554(arg3 - arg0, Static184.anInt3600, Static8.anInt223);
			local71 = Static327.method4554(arg0 + arg3, Static184.anInt3600, Static8.anInt223);
			local80 = Static327.method4554(arg3 - local15, Static184.anInt3600, Static8.anInt223);
			local88 = Static327.method4554(local15 + arg3, Static184.anInt3600, Static8.anInt223);
			Static64.method1247(local63, local55, local80, arg1);
			Static64.method1247(local80, local55, local88, arg4);
			Static64.method1247(local88, local55, local71, arg1);
		}
		while (local10 < local21) {
			local31 += 2;
			local33 += 2;
			local29 += local33;
			local24 += local31;
			if (local29 >= 0 && local26 >= 1) {
				local26--;
				local29 -= local26 << 1;
				Static195.anIntArray332[local26] = local10;
			}
			local10++;
			@Pc(206) int local206;
			@Pc(214) int local214;
			@Pc(225) int[] local225;
			@Pc(155) int local155;
			if (local24 >= 0) {
				local21--;
				local24 -= local21 << 1;
				local155 = arg5 - local21;
				local63 = local21 + arg5;
				if (local63 >= Static430.anInt7123 && local155 <= Static181.anInt3543) {
					if (local21 < local15) {
						local71 = Static195.anIntArray332[local21];
						local80 = Static327.method4554(local10 + arg3, Static184.anInt3600, Static8.anInt223);
						local88 = Static327.method4554(arg3 - local10, Static184.anInt3600, Static8.anInt223);
						local206 = Static327.method4554(arg3 + local71, Static184.anInt3600, Static8.anInt223);
						local214 = Static327.method4554(arg3 - local71, Static184.anInt3600, Static8.anInt223);
						if (Static181.anInt3543 >= local63) {
							local225 = Static280.anIntArrayArray51[local63];
							Static64.method1247(local88, local225, local214, arg1);
							Static64.method1247(local214, local225, local206, arg4);
							Static64.method1247(local206, local225, local80, arg1);
						}
						if (local155 >= Static430.anInt7123) {
							local225 = Static280.anIntArrayArray51[local155];
							Static64.method1247(local88, local225, local214, arg1);
							Static64.method1247(local214, local225, local206, arg4);
							Static64.method1247(local206, local225, local80, arg1);
						}
					} else {
						local71 = Static327.method4554(local10 + arg3, Static184.anInt3600, Static8.anInt223);
						local80 = Static327.method4554(arg3 - local10, Static184.anInt3600, Static8.anInt223);
						if (Static181.anInt3543 >= local63) {
							Static64.method1247(local80, Static280.anIntArrayArray51[local63], local71, arg1);
						}
						if (Static430.anInt7123 <= local155) {
							Static64.method1247(local80, Static280.anIntArrayArray51[local155], local71, arg1);
						}
					}
				}
			}
			local155 = arg5 - local10;
			local63 = local10 + arg5;
			if (local63 >= Static430.anInt7123 && local155 <= Static181.anInt3543) {
				local71 = arg3 + local21;
				local80 = arg3 - local21;
				if (Static8.anInt223 <= local71 && local80 <= Static184.anInt3600) {
					local71 = Static327.method4554(local71, Static184.anInt3600, Static8.anInt223);
					local80 = Static327.method4554(local80, Static184.anInt3600, Static8.anInt223);
					if (local15 <= local10) {
						if (Static181.anInt3543 >= local63) {
							Static64.method1247(local80, Static280.anIntArrayArray51[local63], local71, arg1);
						}
						if (Static430.anInt7123 <= local155) {
							Static64.method1247(local80, Static280.anIntArrayArray51[local155], local71, arg1);
						}
					} else {
						local88 = local10 > local26 ? Static195.anIntArray332[local10] : local26;
						local206 = Static327.method4554(local88 + arg3, Static184.anInt3600, Static8.anInt223);
						local214 = Static327.method4554(arg3 - local88, Static184.anInt3600, Static8.anInt223);
						if (local63 <= Static181.anInt3543) {
							local225 = Static280.anIntArrayArray51[local63];
							Static64.method1247(local80, local225, local214, arg1);
							Static64.method1247(local214, local225, local206, arg4);
							Static64.method1247(local206, local225, local71, arg1);
						}
						if (Static430.anInt7123 <= local155) {
							local225 = Static280.anIntArrayArray51[local155];
							Static64.method1247(local80, local225, local214, arg1);
							Static64.method1247(local214, local225, local206, arg4);
							Static64.method1247(local206, local225, local71, arg1);
						}
					}
				}
			}
		}
	}
}
