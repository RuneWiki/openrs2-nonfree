import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!d", name = "q", descriptor = "I")
	public static int anInt1348;

	@OriginalMember(owner = "client!d", name = "w", descriptor = "I")
	public static int anInt1353 = 0;

	@OriginalMember(owner = "client!d", name = "G", descriptor = "Z")
	public static boolean aBoolean116 = false;

	@OriginalMember(owner = "client!d", name = "J", descriptor = "Lclient!tq;")
	public static Class239 aClass239_2 = null;

	@OriginalMember(owner = "client!d", name = "P", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_17 = new Class186(50, 6);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(III[B)[B")
	public static byte[] method1225(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static459.method5354(arg1, arg0, local6, 0, 32768);
		return local6;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I[Lclient!tq;I)V")
	public static void method1226(@OriginalArg(1) Class239[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg0.length; local15++) {
			@Pc(21) Class239 local21 = arg0[local15];
			if (local21 != null) {
				if (local21.anInt6447 == 0) {
					if (local21.aClass239Array1 != null) {
						method1226(local21.aClass239Array1, arg1);
					}
					@Pc(42) Class6_Sub16 local42 = (Class6_Sub16) Static20.aClass137_3.method3175((long) local21.anInt6423);
					if (local42 != null) {
						Static277.method4189(arg1, local42.anInt2715);
					}
				}
				@Pc(61) Class6_Sub29 local61;
				if (arg1 == 0 && local21.anObjectArray32 != null) {
					local61 = new Class6_Sub29();
					local61.aClass239_10 = local21;
					local61.anObjectArray4 = local21.anObjectArray32;
					Static308.method4424(local61);
				}
				if (arg1 == 1 && local21.anObjectArray31 != null) {
					if (local21.anInt6487 >= 0) {
						@Pc(86) Class239 local86 = Static299.method4387(local21.anInt6423);
						if (local86 == null || local86.aClass239Array1 == null || local86.aClass239Array1.length <= local21.anInt6487 || local21 != local86.aClass239Array1[local21.anInt6487]) {
							continue;
						}
					}
					local61 = new Class6_Sub29();
					local61.anObjectArray4 = local21.anObjectArray31;
					local61.aClass239_10 = local21;
					Static308.method4424(local61);
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(III)Lclient!jk;")
	public static Class3_Sub4 method1227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class189 local7 = Static30.aClass189ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass3_Sub4_3;
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(III)Z")
	public static boolean method1229(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
