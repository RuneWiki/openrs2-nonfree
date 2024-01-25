import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray16 = new boolean[100];

	@OriginalMember(owner = "client!kn", name = "g", descriptor = "[C")
	public static final char[] aCharArray5 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)Lclient!fo;")
	public static Class1_Sub4_Sub9 method3247() {
		@Pc(15) Class1_Sub4_Sub9 local15 = (Class1_Sub4_Sub9) Static156.aClass159_5.method4261();
		if (local15 != null) {
			local15.method5628();
			local15.method5632();
			return local15;
		}
		do {
			local15 = (Class1_Sub4_Sub9) Static139.aClass159_6.method4261();
			if (local15 == null) {
				return null;
			}
			if (local15.method1867() > Static162.method3252()) {
				return null;
			}
			local15.method5628();
			local15.method5632();
		} while ((Long.MIN_VALUE & local15.aLong214) == 0L);
		return local15;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIZILclient!g;Lclient!uo;II)V")
	public static void method3251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class71 arg3, @OriginalArg(5) Class32 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(5) Interface5 local5 = null;
		if (arg5 == 0) {
			local5 = (Interface5) Static352.method5612(arg0, arg6, arg2);
		}
		if (arg5 == 1) {
			local5 = (Interface5) Static223.method5335(arg0, arg6, arg2);
		}
		if (arg5 == 2) {
			local5 = (Interface5) Static258.method4649(arg0, arg6, arg2, ol.class);
		}
		if (arg5 == 3) {
			local5 = (Interface5) Static127.method2619(arg0, arg6, arg2);
		}
		if (local5 == null) {
			return;
		}
		@Pc(64) int local64 = local5.method4794();
		@Pc(68) int local68 = local5.method4797();
		@Pc(74) Class141 local74 = Static119.method2548(local5.method4799());
		if (local74.method3835()) {
			Static249.method4471(arg0, arg6, local74, arg2);
		}
		if (local5.method4795()) {
			local5.method4796(arg4);
		}
		if (arg5 != 0) {
			if (arg5 == 1) {
				Static243.method4380(arg0, arg6, arg2);
				return;
			}
			if (arg5 == 2) {
				Static277.method4851(arg0, arg6, arg2, ol.class);
				if (local74.anInt4262 == 0 || Static233.anInt5573 <= local74.anInt4297 + arg6 || Static134.anInt2971 <= local74.anInt4297 + arg2 || Static233.anInt5573 <= arg6 + local74.anInt4256 || Static134.anInt2971 <= arg2 + local74.anInt4256) {
					return;
				}
				arg3.method1934(local68, local74.anInt4256, local74.aBoolean406, local74.anInt4297, !local74.aBoolean403, arg6, arg2);
			} else if (arg5 == 3) {
				Static35.method851(arg0, arg6, arg2);
				if (local74.anInt4262 == 1) {
					arg3.method1940(arg6, arg2);
					return;
				}
			}
			return;
		}
		Static354.method5643(arg0, arg6, arg2);
		if (local74.anInt4262 != 0) {
			arg3.method1939(arg6, arg2, !local74.aBoolean403, local64, local68, local74.aBoolean406);
			return;
		}
	}
}
