import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_272 = new Class202("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "I")
	public static int anInt9377 = -1;

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "[I")
	public static final int[] anIntArray767 = new int[8];

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "([JII[Ljava/lang/Object;I)V")
	public static void method7796(@OriginalArg(0) long[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object[] arg3) {
		if (arg2 <= arg1) {
			return;
		}
		@Pc(15) int local15 = (arg1 + arg2) / 2;
		@Pc(17) int local17 = arg1;
		@Pc(21) long local21 = arg0[local15];
		arg0[local15] = arg0[arg2];
		arg0[arg2] = local21;
		@Pc(35) Object local35 = arg3[local15];
		arg3[local15] = arg3[arg2];
		arg3[arg2] = local35;
		@Pc(53) int local53 = local21 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(55) int local55 = arg1; local55 < arg2; local55++) {
			if (arg0[local55] < (long) (local55 & local53) + local21) {
				@Pc(76) long local76 = arg0[local55];
				arg0[local55] = arg0[local17];
				arg0[local17] = local76;
				@Pc(90) Object local90 = arg3[local55];
				arg3[local55] = arg3[local17];
				arg3[local17++] = local90;
			}
		}
		arg0[arg2] = arg0[local17];
		arg0[local17] = local21;
		arg3[arg2] = arg3[local17];
		arg3[local17] = local35;
		method7796(arg0, arg1, local17 - 1, arg3);
		method7796(arg0, local17 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIII)V")
	public static void method7798(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static328.anInt6154 <= arg2 && arg2 <= Static394.anInt7462) {
			@Pc(27) int local27 = Static84.method1650(Static7.anInt8119, arg0, Static34.anInt603);
			@Pc(33) int local33 = Static84.method1650(Static7.anInt8119, arg1, Static34.anInt603);
			Static164.method2784(arg3, local33, local27, arg2);
		}
	}
}
