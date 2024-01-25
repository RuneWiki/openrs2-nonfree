import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!u", name = "n", descriptor = "[Lclient!rn;")
	public static Class18[] aClass18Array12;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_127 = new Class205(27, 8);

	@OriginalMember(owner = "client!u", name = "m", descriptor = "I")
	public static int anInt5782 = 0;

	@OriginalMember(owner = "client!u", name = "x", descriptor = "I")
	public static int anInt5792 = 0;

	@OriginalMember(owner = "client!u", name = "A", descriptor = "Lclient!eo;")
	public static final Class62 aClass62_17 = new Class62(0, 5);

	@OriginalMember(owner = "client!u", name = "B", descriptor = "I")
	public static int anInt5795 = 0;

	@OriginalMember(owner = "client!u", name = "C", descriptor = "Lclient!rc;")
	public static Class205 aClass205_128 = null;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
	public static void method4971() {
		if (Static154.anInt2989 == 0) {
			return;
		}
		try {
			if (++Static19.anInt435 > 1500) {
				if (Static88.aClass221_1 != null) {
					Static88.aClass221_1.method4801();
					Static88.aClass221_1 = null;
				}
				if (Static74.anInt1434 >= 1) {
					Static139.anInt2783 = -5;
					Static154.anInt2989 = 0;
					return;
				}
				if (Static379.anInt6374 == Static225.anInt4017) {
					Static225.anInt4017 = Static218.anInt4547;
				} else {
					Static225.anInt4017 = Static379.anInt6374;
				}
				Static19.anInt435 = 0;
				Static74.anInt1434++;
				Static154.anInt2989 = 1;
			}
			if (Static154.anInt2989 == 1) {
				Static35.aClass182_1 = Static359.aClass111_5.method2798(Static225.anInt4017, Static301.aString58);
				Static154.anInt2989 = 2;
			}
			@Pc(111) int local111;
			if (Static154.anInt2989 == 2) {
				if (Static35.aClass182_1.anInt4498 == 2) {
					throw new IOException();
				}
				if (Static35.aClass182_1.anInt4498 != 1) {
					return;
				}
				Static88.aClass221_1 = new Class221((Socket) Static35.aClass182_1.anObject6, Static359.aClass111_5);
				Static35.aClass182_1 = null;
				Static88.aClass221_1.method4796(Static372.aClass2_Sub16_Sub2_4.aByteArray112, Static372.aClass2_Sub16_Sub2_4.anInt6145);
				if (Static269.aClass85_2 != null) {
					Static269.aClass85_2.method4224();
				}
				if (Static156.aClass85_1 != null) {
					Static156.aClass85_1.method4224();
				}
				local111 = Static88.aClass221_1.method4794();
				if (Static269.aClass85_2 != null) {
					Static269.aClass85_2.method4224();
				}
				if (Static156.aClass85_1 != null) {
					Static156.aClass85_1.method4224();
				}
				if (local111 != 101) {
					Static139.anInt2783 = local111;
					Static154.anInt2989 = 0;
					Static88.aClass221_1.method4801();
					Static88.aClass221_1 = null;
					return;
				}
				Static154.anInt2989 = 3;
			}
			if (Static154.anInt2989 == 3 && Static88.aClass221_1.method4795() >= 2) {
				local111 = Static88.aClass221_1.method4794() << 8 | Static88.aClass221_1.method4794();
				Static341.method5002(local111);
				if (Static347.anInt5864 == -1) {
					Static154.anInt2989 = 0;
					Static139.anInt2783 = 6;
					Static88.aClass221_1.method4801();
					Static88.aClass221_1 = null;
				} else {
					Static154.anInt2989 = 0;
					Static88.aClass221_1.method4801();
					Static88.aClass221_1 = null;
					Static302.method2601();
				}
			}
		} catch (@Pc(189) IOException local189) {
			if (Static88.aClass221_1 != null) {
				Static88.aClass221_1.method4801();
				Static88.aClass221_1 = null;
			}
			if (Static74.anInt1434 < 1) {
				Static74.anInt1434++;
				Static19.anInt435 = 0;
				Static154.anInt2989 = 1;
				if (Static379.anInt6374 == Static225.anInt4017) {
					Static225.anInt4017 = Static218.anInt4547;
				} else {
					Static225.anInt4017 = Static379.anInt6374;
				}
			} else {
				Static139.anInt2783 = -4;
				Static154.anInt2989 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V")
	public static void method4972() {
		for (@Pc(18) Class2_Sub43 local18 = (Class2_Sub43) Static370.aClass30_43.method694(); local18 != null; local18 = (Class2_Sub43) Static370.aClass30_43.method682()) {
			if (local18.anInt6042 > 0) {
				local18.anInt6042--;
			}
			if (local18.anInt6042 != 0) {
				if (local18.anInt6036 > 0) {
					local18.anInt6036--;
				}
				if (local18.anInt6036 == 0 && local18.anInt6039 >= 1 && local18.anInt6046 >= 1 && Static246.anInt4374 - 2 >= local18.anInt6039 && Static185.anInt3485 - 2 >= local18.anInt6046 && (local18.anInt6041 < 0 || Static102.method2140(local18.anInt6044, local18.anInt6041))) {
					Static69.method1128(local18.anInt6043, local18.anInt6041, local18.anInt6040, local18.anInt6034, -1, local18.anInt6039, local18.anInt6046, local18.anInt6044);
					local18.anInt6036 = -1;
					if (local18.anInt6047 == local18.anInt6041 && local18.anInt6047 == -1) {
						local18.method5617();
					} else if (local18.anInt6047 == local18.anInt6041 && local18.anInt6034 == local18.anInt6035 && local18.anInt6044 == local18.anInt6038) {
						local18.method5617();
					}
				}
			} else if (local18.anInt6047 < 0 || Static102.method2140(local18.anInt6038, local18.anInt6047)) {
				Static69.method1128(local18.anInt6043, local18.anInt6047, local18.anInt6040, local18.anInt6035, -1, local18.anInt6039, local18.anInt6046, local18.anInt6038);
				local18.method5617();
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!kk;ZI)V")
	public static void method4974(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (Static266.aClass128_3 == null) {
			return;
		}
		try {
			Static266.aClass128_3.method2974(0L);
			Static266.aClass128_3.method2971(arg1, 24, arg0.aByteArray112);
		} catch (@Pc(22) Exception local22) {
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIII)V")
	public static void method4975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg0) {
			Static315.method4662(arg0, Static15.anIntArrayArray1[arg2], arg3, arg1);
		} else {
			Static315.method4662(arg3, Static15.anIntArrayArray1[arg2], arg0, arg1);
		}
	}
}
