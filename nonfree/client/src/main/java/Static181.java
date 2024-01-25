import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!fs", name = "q", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_81 = new Class305(21, -1);

	@OriginalMember(owner = "client!fs", name = "E", descriptor = "Lclient!gh;")
	public static final Class131 aClass131_18 = new Class131(10, 2, 2, 0);

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!jha;I)V")
	public static void method7336(@OriginalArg(0) Class28_Sub1_Sub4_Sub2_Sub2 arg0) {
		@Pc(19) Class5_Sub52 local19 = (Class5_Sub52) Static520.aClass300_40.method7188((long) arg0.anInt5512);
		if (local19 == null) {
			Static331.method5106(0, arg0.anIntArray307[0], arg0.anIntArray308[0], arg0, arg0.aByte145, (Class28_Sub1_Sub4_Sub2_Sub1) null, (Class164) null);
		} else {
			local19.method7757();
		}
	}
}
