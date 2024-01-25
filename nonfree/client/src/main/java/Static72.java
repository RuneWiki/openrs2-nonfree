import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!cn", name = "m", descriptor = "[[B")
	public static byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
	public static int anInt1882;

	@OriginalMember(owner = "client!cn", name = "j", descriptor = "Lclient!tw;")
	public static final Class322 aClass322_1 = new Class322();

	@OriginalMember(owner = "client!cn", name = "k", descriptor = "Lclient!au;")
	public static final Class22 aClass22_15 = new Class22();

	@OriginalMember(owner = "client!cn", name = "l", descriptor = "Lclient!jb;")
	public static final Class161 aClass161_4 = new Class161(3);

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIZZB)V")
	public static void method1551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(10) int local10 = (arg2 + arg0) / 2;
		@Pc(12) int local12 = arg0;
		@Pc(16) Class222_Sub1 local16 = Static353.aClass222_Sub1Array1[local10];
		Static353.aClass222_Sub1Array1[local10] = Static353.aClass222_Sub1Array1[arg2];
		Static353.aClass222_Sub1Array1[arg2] = local16;
		for (@Pc(28) int local28 = arg0; local28 < arg2; local28++) {
			if (Static348.method5306(Static353.aClass222_Sub1Array1[local28], arg4, arg1, local16, arg3, arg5) <= 0) {
				@Pc(48) Class222_Sub1 local48 = Static353.aClass222_Sub1Array1[local28];
				Static353.aClass222_Sub1Array1[local28] = Static353.aClass222_Sub1Array1[local12];
				Static353.aClass222_Sub1Array1[local12++] = local48;
			}
		}
		Static353.aClass222_Sub1Array1[arg2] = Static353.aClass222_Sub1Array1[local12];
		Static353.aClass222_Sub1Array1[local12] = local16;
		method1551(arg0, arg1, local12 - 1, arg3, arg4, arg5);
		method1551(local12 + 1, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IFIZIIIB)[I")
	public static int[] method1556(@OriginalArg(1) float arg0) {
		@Pc(14) int[] local14 = new int[2048];
		@Pc(18) Class4_Sub2_Sub23 local18 = new Class4_Sub2_Sub23();
		local18.aBoolean571 = true;
		local18.anInt7951 = 35;
		local18.anInt7952 = 8;
		local18.anInt7957 = (int) (arg0 * 4096.0F);
		local18.anInt7956 = 4;
		local18.anInt7950 = 8;
		local18.method8210();
		Static407.method6144(2048, 1);
		local18.method6224(local14, 0);
		return local14;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILjava/lang/String;ZZLjava/lang/String;)V")
	public static void method1558(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) String arg3) {
		Static392.method2874(-1, arg3, arg1, arg2, true, arg0);
	}
}
