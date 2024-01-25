import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

	@OriginalMember(owner = "client!rda", name = "fb", descriptor = "Lclient!fha;")
	public static final Class109 aClass109_51 = new Class109();

	@OriginalMember(owner = "client!rda", name = "hb", descriptor = "Lclient!wj;")
	public static final Class375 aClass375_6 = new Class375("game3", 2);

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IB)Lclient!ou;")
	public static Class259 method6788(@OriginalArg(0) int arg0) {
		@Pc(12) Class259 local12 = (Class259) Static435.aClass32_31.method630((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(27) byte[] local27 = Static313.aClass380_75.method8620(0, arg0);
		local12 = new Class259();
		if (local27 != null) {
			local12.method5575(new Class2_Sub22(local27));
		}
		local12.method5577();
		Static435.aClass32_31.method629(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(II)Z")
	public static boolean method6790(@OriginalArg(1) int arg0) {
		return (-arg0 & arg0) == arg0;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIBIIII)Lclient!cd;")
	public static Class12 method6791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(38) long local38 = (long) arg1 * 76724863L ^ (long) arg5 * 32147369L ^ (long) arg3 * 986053L ^ (long) arg2 * 67481L ^ (long) arg4 * 97549L ^ (long) arg0 * 475427L;
		@Pc(44) Class12 local44 = (Class12) Static228.aClass32_37.method630(local38);
		if (local44 == null) {
			local44 = Static566.aClass95_14.method6954(arg2, arg4, arg0, arg3, arg5, arg1);
			Static228.aClass32_37.method629(local44, local38);
			return local44;
		} else {
			return local44;
		}
	}
}
