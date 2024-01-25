import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!mca", name = "c", descriptor = "Lclient!sl;")
	public static final Class2_Sub17 aClass2_Sub17_11 = new Class2_Sub17(1350);

	@OriginalMember(owner = "client!mca", name = "d", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_208 = new Class200(19, -1);

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(III)Z")
	public static boolean method8049(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lclient!nd;BI)Lclient!br;")
	public static Class2_Sub9 method8055(@OriginalArg(0) Class238 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method5580(arg1);
		return local8 == null ? null : new Class2_Sub9(local8);
	}
}
