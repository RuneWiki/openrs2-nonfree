import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!fg", name = "D", descriptor = "[[B")
	public static byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!fg", name = "H", descriptor = "Lclient!eq;")
	public static Class97 aClass97_37;

	@OriginalMember(owner = "client!fg", name = "M", descriptor = "Lclient!d;")
	public static Interface6 anInterface6_5;

	@OriginalMember(owner = "client!fg", name = "N", descriptor = "[Lclient!fw;")
	public static Class120[] aClass120Array1;

	@OriginalMember(owner = "client!fg", name = "I", descriptor = "I")
	public static int anInt3484 = 0;

	@OriginalMember(owner = "client!fg", name = "L", descriptor = "I")
	public static int anInt3487 = 0;

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
	public static void method2867() {
		Static81.aClass233_8.method5663();
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIII)V")
	public static void method2868(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class121 local9 = Static600.aClass121ArrayArray1[arg1][arg0];
		Static616.method8375(local9 == null ? Static264.aClass121_1 : local9, arg2);
	}
}
