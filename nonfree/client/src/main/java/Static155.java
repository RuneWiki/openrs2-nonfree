import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!io", name = "f", descriptor = "Lclient!mj;")
	public static Class156 aClass156_2;

	@OriginalMember(owner = "client!io", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString27;

	@OriginalMember(owner = "client!io", name = "p", descriptor = "I")
	public static int anInt2789;

	@OriginalMember(owner = "client!io", name = "l", descriptor = "Lclient!ku;")
	public static final Class139 aClass139_33 = new Class139(8);

	@OriginalMember(owner = "client!io", name = "n", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_41 = new Class244(68, -1);

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!mj;I)[Lclient!ae;")
	public static Class5[] method2391(@OriginalArg(0) Class156 arg0) {
		if (!arg0.method3661()) {
			return new Class5[0];
		}
		@Pc(21) Class133 local21 = arg0.method3640();
		while (local21.anInt3257 == 0) {
			Static37.method613(10L);
		}
		if (local21.anInt3257 == 2) {
			return new Class5[0];
		}
		@Pc(40) int[] local40 = (int[]) local21.anObject3;
		@Pc(46) Class5[] local46 = new Class5[local40.length >> 2];
		for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
			@Pc(54) Class5 local54 = new Class5();
			local46[local48] = local54;
			local54.anInt115 = local40[local48 << 2];
			local54.anInt116 = local40[(local48 << 2) + 1];
			local54.anInt112 = local40[(local48 << 2) + 2];
			local54.anInt111 = local40[(local48 << 2) + 3];
		}
		return local46;
	}
}
