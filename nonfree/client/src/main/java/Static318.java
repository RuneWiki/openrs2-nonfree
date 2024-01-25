import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "Z")
	public static boolean aBoolean427 = false;

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_103 = new Class44(6, 0);

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIIII[I)Z")
	public static boolean method5026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int[] arg5) {
		if (arg4 < 0) {
			arg4 = 0;
		}
		if (arg0 > Static429.anInt4560) {
			arg0 = Static429.anInt4560;
		}
		if (arg4 >= arg0) {
			return true;
		}
		@Pc(33) int local33 = arg0 - arg4 >> 2;
		arg2 += arg4 * arg3;
		arg1 += arg4 - 1;
		@Pc(64) int local64;
		@Pc(76) int local76;
		if (Static38.anInt993 == 1) {
			Static24.anInt440 += local33;
			while (true) {
				local33--;
				if (local33 < 0) {
					local33 = arg0 - arg4 & 0x3;
					while (true) {
						local33--;
						if (local33 < 0) {
							return true;
						}
						arg1++;
						if (arg2 < arg5[arg1]) {
							arg5[arg1] = arg2;
						}
						arg2 += arg3;
					}
				}
				local64 = arg1 + 1;
				if (arg5[local64] > arg2) {
					arg5[local64] = arg2;
				}
				local76 = arg2 + arg3;
				local64++;
				if (local76 < arg5[local64]) {
					arg5[local64] = local76;
				}
				local76 += arg3;
				local64++;
				if (arg5[local64] > local76) {
					arg5[local64] = local76;
				}
				local76 += arg3;
				arg1 = local64 + 1;
				if (local76 < arg5[arg1]) {
					arg5[arg1] = local76;
				}
				arg2 = local76 + arg3;
			}
		} else {
			arg2 -= 38400;
			while (true) {
				local33--;
				if (local33 < 0) {
					local33 = arg0 - arg4 & 0x3;
					while (true) {
						local33--;
						if (local33 < 0) {
							return true;
						}
						@Pc(227) int local227 = ~arg2;
						arg1++;
						if (local227 > ~arg5[arg1]) {
							return false;
						}
						arg2 += arg3;
					}
				}
				local64 = arg1 + 1;
				if (arg5[local64] > arg2) {
					return false;
				}
				local76 = arg2 + arg3;
				local64++;
				if (arg5[local64] > local76) {
					return false;
				}
				local76 += arg3;
				local64++;
				if (local76 < arg5[local64]) {
					return false;
				}
				local76 += arg3;
				arg1 = local64 + 1;
				if (arg5[arg1] > local76) {
					return false;
				}
				arg2 = local76 + arg3;
			}
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)Lclient!f;")
	public static Class99 method5027() {
		try {
			return (Class99) Class.forName("Class99_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class99_Sub1();
		}
	}
}
