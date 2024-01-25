import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!bs", name = "y", descriptor = "Lclient!fw;")
	public static Class120 aClass120_1;

	@OriginalMember(owner = "client!bs", name = "K", descriptor = "Z")
	public static boolean aBoolean76;

	@OriginalMember(owner = "client!bs", name = "I", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_12 = new Class269(17, 3);

	@OriginalMember(owner = "client!bs", name = "J", descriptor = "Lclient!hda;")
	public static final Class143 aClass143_2 = new Class143();

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(III)B")
	public static byte method949(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ZIIIII)V")
	public static void method950(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static108.method1816(Static177.anInt3963, arg3, Static570.anInt9385);
		@Pc(17) int local17 = Static108.method1816(Static177.anInt3963, arg1, Static570.anInt9385);
		@Pc(23) int local23 = Static108.method1816(Static252.anInt4988, arg4, Static306.anInt5020);
		@Pc(29) int local29 = Static108.method1816(Static252.anInt4988, arg2, Static306.anInt5020);
		for (@Pc(31) int local31 = local11; local31 <= local17; local31++) {
			Static259.method4236(local23, local29, arg0, Static618.anIntArrayArray101[local31]);
		}
	}
}
