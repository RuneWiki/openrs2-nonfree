import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
	public static int anInt5908;

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "[Lclient!s;")
	public static Class112[] aClass112Array3;

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_61 = new Class269(30, 7);

	@OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
	public static int anInt5912 = 0;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "([Lclient!gs;II)V")
	public static void method4923(@OriginalArg(0) Class11_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class11_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt9928;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt9928 > local27 + (local29 & 0x1)) {
				@Pc(44) Class11_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method4923(arg0, arg1, local10 - 1);
		method4923(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ILjava/lang/Object;BI)[B")
	public static byte[] method4924(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return Static501.method7134(local18, arg0);
		} else if (arg1 instanceof Class81) {
			@Pc(30) Class81 local30 = (Class81) arg1;
			return local30.method1785(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(B)V")
	public static void method4926() {
		@Pc(8) int local8 = Static404.aClass2_Sub13_2.aClass33_Sub10_1.method4036();
		if (local8 == 0) {
			Static198.aByteArrayArrayArray8 = null;
			Static565.method7810(0);
		} else if (local8 == 1) {
			Static145.method2795((byte) 0);
			Static565.method7810(512);
			if (Static244.aByteArrayArrayArray9 != null) {
				Static225.method3813();
			}
		} else {
			Static145.method2795((byte) (Static143.anInt3169 - 4 & 0xFF));
			Static565.method7810(2);
		}
		Static181.anInt4005 = Static16.anInt308;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZI)Z")
	public static boolean method4927(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}
}
