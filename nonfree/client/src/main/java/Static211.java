import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!oc", name = "nb", descriptor = "[Lclient!cq;")
	public static Class8[] aClass8Array11;

	@OriginalMember(owner = "client!oc", name = "bb", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_69 = new Class37(16);

	@OriginalMember(owner = "client!oc", name = "kb", descriptor = "[Lclient!rf;")
	public static final Class1_Sub2_Sub13[] aClass1_Sub2_Sub13Array3 = new Class1_Sub2_Sub13[14];

	@OriginalMember(owner = "client!oc", name = "mb", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_70 = new Class37(5);

	@OriginalMember(owner = "client!oc", name = "ob", descriptor = "Z")
	public static boolean aBoolean353 = true;

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(B)V")
	public static void method3855() {
		@Pc(9) Class37 local9 = Static165.aClass37_54;
		synchronized (Static165.aClass37_54) {
			Static165.aClass37_54.method914();
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I[Lclient!ps;B)V")
	public static void method3856(@OriginalArg(0) int arg0, @OriginalArg(1) Class163[] arg1) {
		for (@Pc(13) int local13 = 0; local13 < arg1.length; local13++) {
			@Pc(19) Class163 local19 = arg1[local13];
			if (local19 != null) {
				if (local19.anInt4934 == 0) {
					if (local19.aClass163Array3 != null) {
						method3856(arg0, local19.aClass163Array3);
					}
					@Pc(40) Class1_Sub26 local40 = (Class1_Sub26) Static298.aClass207_35.method5555((long) local19.anInt4947);
					if (local40 != null) {
						Static125.method2001(arg0, local40.anInt3825);
					}
				}
				@Pc(56) Class1_Sub8 local56;
				if (arg0 == 0 && local19.anObjectArray15 != null) {
					local56 = new Class1_Sub8();
					local56.aClass163_3 = local19;
					local56.anObjectArray1 = local19.anObjectArray15;
					Static122.method1972(local56);
				}
				if (arg0 == 1 && local19.anObjectArray17 != null) {
					if (local19.anInt4923 >= 0) {
						@Pc(81) Class163 local81 = Static248.method22(local19.anInt4947);
						if (local81 == null || local81.aClass163Array3 == null || local81.aClass163Array3.length <= local19.anInt4923 || local81.aClass163Array3[local19.anInt4923] != local19) {
							continue;
						}
					}
					local56 = new Class1_Sub8();
					local56.aClass163_3 = local19;
					local56.anObjectArray1 = local19.anObjectArray17;
					Static122.method1972(local56);
				}
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([BI)[B")
	public static byte[] method3860(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static361.method1853(arg0, 0, local9, 0, local6);
		return local9;
	}
}
