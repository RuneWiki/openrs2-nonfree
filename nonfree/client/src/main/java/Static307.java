import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!oq", name = "i", descriptor = "F")
	public static float aFloat115;

	@OriginalMember(owner = "client!oq", name = "k", descriptor = "I")
	public static int anInt4787;

	@OriginalMember(owner = "client!oq", name = "g", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_84 = new Class194(29, 0);

	@OriginalMember(owner = "client!oq", name = "h", descriptor = "Lclient!nv;")
	public static final Class177 aClass177_30 = new Class177();

	@OriginalMember(owner = "client!oq", name = "j", descriptor = "I")
	public static int anInt4786 = -1;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIZ)V")
	public static void method3798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class5_Sub2_Sub9 local12 = Static72.method1073(12, arg0);
		local12.method3026();
		local12.anInt3818 = arg1;
	}
}
