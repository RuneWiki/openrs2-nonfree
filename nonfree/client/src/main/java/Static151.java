import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "Lclient!la;")
	public static Class207 aClass207_34;

	@OriginalMember(owner = "client!fha", name = "i", descriptor = "I")
	public static int anInt2617;

	@OriginalMember(owner = "client!fha", name = "h", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_49 = new Class337(19, -1);

	@OriginalMember(owner = "client!fha", name = "j", descriptor = "I")
	public static final int anInt2618 = 2;

	@OriginalMember(owner = "client!fha", name = "l", descriptor = "I")
	public static int anInt2620 = 0;

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(IIIIIII)V")
	public static void method2222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static234.method3908(arg5);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg5 - arg2;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(28) int local28 = arg5;
		@Pc(31) int local31 = -arg5;
		@Pc(33) int local33 = local14;
		@Pc(36) int local36 = -local14;
		@Pc(38) int local38 = -1;
		@Pc(61) int local61;
		@Pc(69) int local69;
		@Pc(78) int local78;
		@Pc(87) int local87;
		if (arg1 >= Static554.anInt9362 && arg1 <= Static62.anInt1300) {
			@Pc(52) int[] local52 = Static249.anIntArrayArray23[arg1];
			local61 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg4 - arg5);
			local69 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg4 + arg5);
			local78 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg4 - local14);
			local87 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg4 + local14);
			Static491.method7219(local52, local61, arg3, local78);
			Static491.method7219(local52, local78, arg0, local87);
			Static491.method7219(local52, local87, arg3, local69);
		}
		@Pc(107) int local107 = -1;
		while (local10 < local28) {
			local107 += 2;
			local38 += 2;
			local31 += local38;
			local36 += local107;
			if (local36 >= 0 && local33 >= 1) {
				local33--;
				local36 -= local33 << 1;
				Static443.anIntArray408[local33] = local10;
			}
			local10++;
			@Pc(251) int local251;
			@Pc(260) int local260;
			@Pc(267) int[] local267;
			@Pc(153) int local153;
			if (local31 >= 0) {
				local28--;
				local31 -= local28 << 1;
				local153 = arg1 - local28;
				local61 = local28 + arg1;
				if (local61 >= Static554.anInt9362 && Static62.anInt1300 >= local153) {
					if (local14 <= local28) {
						local69 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg4 + local10);
						local78 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg4 - local10);
						if (Static62.anInt1300 >= local61) {
							Static491.method7219(Static249.anIntArrayArray23[local61], local78, arg3, local69);
						}
						if (local153 >= Static554.anInt9362) {
							Static491.method7219(Static249.anIntArrayArray23[local153], local78, arg3, local69);
						}
					} else {
						local69 = Static443.anIntArray408[local28];
						local78 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, local10 + arg4);
						local87 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg4 - local10);
						local251 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg4 + local69);
						local260 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg4 - local69);
						if (local61 <= Static62.anInt1300) {
							local267 = Static249.anIntArrayArray23[local61];
							Static491.method7219(local267, local87, arg3, local260);
							Static491.method7219(local267, local260, arg0, local251);
							Static491.method7219(local267, local251, arg3, local78);
						}
						if (local153 >= Static554.anInt9362) {
							local267 = Static249.anIntArrayArray23[local153];
							Static491.method7219(local267, local87, arg3, local260);
							Static491.method7219(local267, local260, arg0, local251);
							Static491.method7219(local267, local251, arg3, local78);
						}
					}
				}
			}
			local153 = arg1 - local10;
			local61 = arg1 + local10;
			if (Static554.anInt9362 <= local61 && Static62.anInt1300 >= local153) {
				local69 = local28 + arg4;
				local78 = arg4 - local28;
				if (local69 >= Static275.anInt4919 && Static529.anInt9089 >= local78) {
					local69 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, local69);
					local78 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, local78);
					if (local10 >= local14) {
						if (local61 <= Static62.anInt1300) {
							Static491.method7219(Static249.anIntArrayArray23[local61], local78, arg3, local69);
						}
						if (local153 >= Static554.anInt9362) {
							Static491.method7219(Static249.anIntArrayArray23[local153], local78, arg3, local69);
						}
					} else {
						local87 = local10 <= local33 ? local33 : Static443.anIntArray408[local10];
						local251 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg4 + local87);
						local260 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg4 - local87);
						if (local61 <= Static62.anInt1300) {
							local267 = Static249.anIntArrayArray23[local61];
							Static491.method7219(local267, local78, arg3, local260);
							Static491.method7219(local267, local260, arg0, local251);
							Static491.method7219(local267, local251, arg3, local69);
						}
						if (Static554.anInt9362 <= local153) {
							local267 = Static249.anIntArrayArray23[local153];
							Static491.method7219(local267, local78, arg3, local260);
							Static491.method7219(local267, local260, arg0, local251);
							Static491.method7219(local267, local251, arg3, local69);
						}
					}
				}
			}
		}
	}
}
