import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!nu", name = "P", descriptor = "Ljava/lang/Object;")
	public static Object anObject13;

	@OriginalMember(owner = "client!nu", name = "Q", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_104 = new Class171(3, 1);

	@OriginalMember(owner = "client!nu", name = "S", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_105 = new Class171(51, 6);

	@OriginalMember(owner = "client!nu", name = "T", descriptor = "[Lclient!uaa;")
	public static final Class3_Sub13[] aClass3_Sub13Array3 = new Class3_Sub13[8];

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIBI)V")
	public static void method5647(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static315.aByteArrayArrayArray13 = new byte[4][arg0][arg1];
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lclient!dt;I)Lclient!pha;")
	public static Class3_Sub8 method5649(@OriginalArg(0) Class3_Sub4 arg0) {
		arg0.method7954();
		@Pc(13) int local13 = arg0.method7954();
		@Pc(22) Class3_Sub8 local22 = Static163.method2590(local13);
		local22.anInt10703 = arg0.method7954();
		@Pc(31) int local31 = arg0.method7954();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) int local39 = arg0.method7954();
			local22.method8785(local39, arg0);
		}
		local22.method8780();
		return local22;
	}
}
