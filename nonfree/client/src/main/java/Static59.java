import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!bu", name = "w", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_61 = new Class179(99, 6);

	@OriginalMember(owner = "client!bu", name = "y", descriptor = "I")
	public static int anInt1156 = 1;

	@OriginalMember(owner = "client!bu", name = "E", descriptor = "I")
	public static int anInt1160 = -1;

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(I[BIIIII)Z")
	public static boolean method1101(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg2 % 8;
		@Pc(13) int local13;
		if (local9 == 0) {
			local13 = 0;
		} else {
			local13 = 8 - local9;
		}
		@Pc(29) int local29 = -((arg4 + 8 - 1) / 8);
		@Pc(38) int local38 = -((arg2 + 8 - 1) / 8);
		for (@Pc(40) int local40 = local29; local40 < 0; local40++) {
			for (@Pc(44) int local44 = local38; local44 < 0; local44++) {
				if (arg1[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local13;
			if (arg1[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg0;
		}
		return false;
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(B)V")
	public static void method1102() {
		@Pc(7) Class114 local7 = null;
		try {
			@Pc(17) Class103 local17 = Static569.aClass380_6.method8822("2");
			while (local17.anInt2541 == 0) {
				Static520.method7923(1L);
			}
			if (local17.anInt2541 == 1) {
				local7 = (Class114) local17.anObject9;
				@Pc(39) byte[] local39 = new byte[(int) local7.method2455()];
				@Pc(54) int local54;
				for (@Pc(41) int local41 = 0; local41 < local39.length; local41 += local54) {
					local54 = local7.method2456(local41, local39.length - local41, local39);
					if (local54 == -1) {
						throw new IOException("EOF");
					}
				}
				Static90.method1511(new Class6_Sub23(local39));
			}
		} catch (@Pc(83) Exception local83) {
		}
		try {
			if (local7 != null) {
				local7.method2462();
			}
		} catch (@Pc(90) Exception local90) {
		}
	}

	@OriginalMember(owner = "client!bu", name = "g", descriptor = "(I)V")
	public static void method1103(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static140.anInt2434 == 2) {
				Static47.aClass329Array1[0].method7842(Static364.aClass40Array1[0]);
				Static47.aClass329Array1[1].method7842(Static364.aClass40Array1[1]);
			} else if (Static140.anInt2434 == 3) {
				Static47.aClass329Array1[0].method7842(Static364.aClass40Array1[0]);
				Static47.aClass329Array1[1].method7842(Static364.aClass40Array1[1]);
				Static47.aClass329Array1[2].method7842(Static364.aClass40Array1[2]);
			} else {
				Static47.aClass329Array1[0].method7842(Static364.aClass40Array1[0]);
				Static47.aClass329Array1[1].method7842(Static364.aClass40Array1[1]);
				Static47.aClass329Array1[2].method7842(Static364.aClass40Array1[2]);
				Static47.aClass329Array1[3].method7842(Static364.aClass40Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static140.anInt2434 == 2) {
				Static47.aClass329Array1[0].method7842(Static364.aClass40Array1[2]);
			} else if (Static140.anInt2434 == 3) {
				Static47.aClass329Array1[0].method7842(Static364.aClass40Array1[3]);
				Static47.aClass329Array1[1].method7842(Static364.aClass40Array1[4]);
			} else {
				Static47.aClass329Array1[0].method7842(Static364.aClass40Array1[4]);
				Static47.aClass329Array1[1].method7842(Static364.aClass40Array1[5]);
				Static47.aClass329Array1[2].method7842(Static364.aClass40Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static140.anInt2434 == 2) {
				Static47.aClass329Array1[0].method7842(Static364.aClass40Array1[3]);
				return;
			}
			if (Static140.anInt2434 == 3) {
				Static47.aClass329Array1[0].method7842(Static364.aClass40Array1[5]);
				return;
			}
			Static47.aClass329Array1[0].method7842(Static364.aClass40Array1[7]);
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IB)Z")
	public static boolean method1104(@OriginalArg(0) int arg0) {
		if (arg0 == 44 || arg0 == 50 || arg0 == 60 || arg0 == 5 || arg0 == 1001) {
			return true;
		} else {
			return arg0 == 12 || arg0 == 1003;
		}
	}
}
