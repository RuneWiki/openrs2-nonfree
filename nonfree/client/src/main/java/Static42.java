import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
	public static int anInt678;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "Z")
	public static boolean aBoolean48 = false;

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "Lclient!uw;")
	public static Class359 aClass359_12 = null;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)[Lclient!bt;")
	public static Class48[] method597() {
		return new Class48[] { Static314.aClass48_11, Static511.aClass48_16, Static184.aClass48_8, Static216.aClass48_10, Static166.aClass48_7, Static150.aClass48_6, Static430.aClass48_2, Static620.aClass48_18, Static70.aClass48_3, Static87.aClass48_13, Static322.aClass48_12, Static587.aClass48_17, Static437.aClass48_15, Static401.aClass48_14, Static200.aClass48_9 };
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)V")
	public static void method598(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class5_Sub3_Sub17 local9 = Static358.method5408(17, (long) arg0);
		local9.method7286();
		local9.anInt8546 = arg1;
	}
}
