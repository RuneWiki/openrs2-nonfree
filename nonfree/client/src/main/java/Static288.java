import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!oi", name = "P", descriptor = "Lclient!bu;")
	public static Class32 aClass32_66;

	@OriginalMember(owner = "client!oi", name = "N", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_167 = new Class189("K", "T", "K", "K");

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(II)I")
	public static int method4088(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(33) int local33 = local22 | local22 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILclient!cu;)Lclient!qn;")
	public static Class3_Sub2 method4089(@OriginalArg(1) Class3_Sub7 arg0) {
		arg0.method2582();
		@Pc(13) int local13 = arg0.method2582();
		@Pc(17) Class3_Sub2 local17 = Static201.method4119(local13);
		local17.anInt7553 = arg0.method2582();
		@Pc(33) int local33 = arg0.method2582();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(41) int local41 = arg0.method2582();
			local17.method5892(arg0, local41);
		}
		local17.method5898();
		return local17;
	}
}
