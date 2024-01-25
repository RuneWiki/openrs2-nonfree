import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!afa", name = "c", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_5 = new Class319(24, -1);

	@OriginalMember(owner = "client!afa", name = "e", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_6 = new Class81(108, -2);

	@OriginalMember(owner = "client!afa", name = "g", descriptor = "[Lclient!to;")
	public static final Class1_Sub48[] aClass1_Sub48Array1 = new Class1_Sub48[300];

	@OriginalMember(owner = "client!afa", name = "h", descriptor = "S")
	public static short aShort1 = 256;

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(ILclient!r;IIII)V")
	public static void method207(@OriginalArg(0) int arg0, @OriginalArg(1) Class12 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg1.da(arg4, arg2, arg0 + arg4, arg3 + arg2);
		arg1.method6418(arg3, arg4, arg2, arg0, -16777216);
		if (Static587.anInt9497 < 100) {
			return;
		}
		@Pc(33) float local33 = (float) Static313.anInt4087 / (float) Static313.anInt4095;
		@Pc(35) int local35 = arg0;
		@Pc(37) int local37 = arg3;
		if (local33 < 1.0F) {
			local37 = (int) ((float) arg0 * local33);
		} else {
			local35 = (int) ((float) arg3 / local33);
		}
		@Pc(64) int local64 = arg2 + (arg3 - local37) / 2;
		@Pc(73) int local73 = arg4 + (arg0 - local35) / 2;
		if (Static398.aClass10_30 == null || Static398.aClass10_30.E() != arg0 || Static398.aClass10_30.u() != arg3) {
			Static313.method3495(Static313.anInt4085, Static313.anInt4096 + Static313.anInt4087, Static313.anInt4085 + Static313.anInt4095, Static313.anInt4096, local73, local64, local73 + local35, local64 + local37);
			Static313.method3474(arg1);
			Static398.aClass10_30 = arg1.method6470(local73, local64, local35, local37, false);
		}
		Static398.aClass10_30.method7679(local73, local64);
		@Pc(125) int local125 = Static307.anInt5544 * local35 / Static313.anInt4095;
		@Pc(131) int local131 = local37 * Static78.anInt1869 / Static313.anInt4087;
		@Pc(140) int local140 = local73 + local35 * Static518.anInt8571 / Static313.anInt4095;
		@Pc(153) int local153 = local37 + local64 - local131 - local37 * Static81.anInt1905 / Static313.anInt4087;
		@Pc(155) int local155 = -1996554240;
		if (Static353.aClass230_3 == Static275.aClass230_2) {
			local155 = -1996488705;
		}
		arg1.J(local140, local153, local125, local131, local155, 1);
		arg1.method6435(local140, local153, local125, local131, local155, 0);
		if (Static538.anInt8880 <= 0) {
			return;
		}
		@Pc(198) int local198;
		if (Static44.anInt1118 <= 50) {
			local198 = Static44.anInt1118 * 5;
		} else {
			local198 = 500 - Static44.anInt1118 * 5;
		}
		for (@Pc(214) Class1_Sub27 local214 = (Class1_Sub27) Static313.aClass361_41.method7854(); local214 != null; local214 = (Class1_Sub27) Static313.aClass361_41.method7853()) {
			@Pc(222) Class196 local222 = Static313.aClass46_2.method1408(local214.anInt5625);
			if (Static562.method7553(local222)) {
				@Pc(239) int local239;
				@Pc(251) int local251;
				if (local214.anInt5625 == Static297.anInt8265) {
					local239 = local73 + local35 * local214.anInt5627 / Static313.anInt4095;
					local251 = local64 + (Static313.anInt4087 - local214.anInt5623) * local37 / Static313.anInt4087;
					arg1.method6418(4, local239 - 2, local251 + -2, 4, local198 << 24 | 0xFFFF00);
				} else if (Static519.anInt8575 != -1 && Static519.anInt8575 == local222.anInt5173) {
					local239 = local73 + local214.anInt5627 * local35 / Static313.anInt4095;
					local251 = local37 * (Static313.anInt4087 - local214.anInt5623) / Static313.anInt4087 + local64;
					arg1.method6418(4, local239 - 2, local251 - 2, 4, local198 << 24 | 0xFFFF00);
				}
			}
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(ZIZIIII)V")
	public static void method208(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 >= arg5) {
			return;
		}
		@Pc(13) int local13 = (arg5 + arg4) / 2;
		@Pc(15) int local15 = arg4;
		@Pc(19) Class208_Sub1 local19 = Static161.aClass208_Sub1Array1[local13];
		Static161.aClass208_Sub1Array1[local13] = Static161.aClass208_Sub1Array1[arg5];
		Static161.aClass208_Sub1Array1[arg5] = local19;
		for (@Pc(31) int local31 = arg4; local31 < arg5; local31++) {
			if (Static208.method7271(Static161.aClass208_Sub1Array1[local31], arg1, arg0, arg3, arg2, local19) <= 0) {
				@Pc(48) Class208_Sub1 local48 = Static161.aClass208_Sub1Array1[local31];
				Static161.aClass208_Sub1Array1[local31] = Static161.aClass208_Sub1Array1[local15];
				Static161.aClass208_Sub1Array1[local15++] = local48;
			}
		}
		Static161.aClass208_Sub1Array1[arg5] = Static161.aClass208_Sub1Array1[local15];
		Static161.aClass208_Sub1Array1[local15] = local19;
		method208(arg0, arg1, arg2, arg3, arg4, local15 - 1);
		method208(arg0, arg1, arg2, arg3, local15 + 1, arg5);
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(ILjava/io/File;Ljava/lang/String;)V")
	public static void method209(@OriginalArg(1) File arg0, @OriginalArg(2) String arg1) {
		Static457.aHashtable7.put(arg1, arg0);
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lclient!io;I)V")
	public static void method211(@OriginalArg(0) Class1_Sub20 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static147.anInt2831; local7++) {
			@Pc(13) int local13 = arg0.method4427();
			@Pc(17) int local17 = arg0.method4426();
			if (local17 == 65535) {
				local17 = -1;
			}
			if (Static408.aClass208_Sub1Array2[local13] != null) {
				Static408.aClass208_Sub1Array2[local13].anInt5559 = local17;
			}
		}
	}
}
