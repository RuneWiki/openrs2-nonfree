import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!ar", name = "Q", descriptor = "Lclient!mi;")
	public static Class160 aClass160_1;

	@OriginalMember(owner = "client!ar", name = "I", descriptor = "Lclient!sc;")
	public static final Class220 aClass220_13 = new Class220(12, 0, 1, 0);

	@OriginalMember(owner = "client!ar", name = "K", descriptor = "I")
	public static int anInt416 = 0;

	@OriginalMember(owner = "client!ar", name = "P", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_9 = new Class129(10, 7);

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(III)V")
	public static void method323(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class5_Sub2_Sub9 local12 = Static72.method1073(15, 0);
		local12.method3026();
		local12.anInt3826 = arg1;
		local12.anInt3818 = arg0;
	}
}
