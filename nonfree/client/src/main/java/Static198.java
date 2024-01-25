import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "Lclient!ju;")
	public static final Class201 aClass201_9 = new Class201(12, 7);

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(BJI)Lclient!cl;")
	public static Class3_Sub6_Sub7 method3146(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		@Pc(19) Class3_Sub6_Sub7 local19 = (Class3_Sub6_Sub7) Static538.aClass62_46.method1682((long) arg1 << 56 | arg0);
		if (local19 == null) {
			local19 = new Class3_Sub6_Sub7(arg1, arg0);
			Static538.aClass62_46.method1686(local19.aLong309, local19);
		}
		return local19;
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(IIII)V")
	public static void method3149(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class182 local14 = Static44.aClass182ArrayArray1[arg0][arg2];
		Static2.method20(arg1, local14 == null ? Static527.aClass182_2 : local14);
	}
}
