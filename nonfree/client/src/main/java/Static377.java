import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_214 = new Class175("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!tb", name = "p", descriptor = "[I")
	public static final int[] anIntArray475 = new int[14];

	@OriginalMember(owner = "client!tb", name = "s", descriptor = "Z")
	public static boolean aBoolean459 = false;

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_243 = new Class184(25, 4);

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIII)V")
	public static void method5207(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static446.anInt7541 = arg0;
		Static180.anInt3687 = arg3;
		Static360.anInt6488 = arg1;
		Static220.anInt4290 = arg2;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIB)V")
	public static void method5211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub3_Sub7 local8 = Static139.method2522(6, arg0);
		local8.method1570();
		local8.anInt1933 = arg1;
	}
}
