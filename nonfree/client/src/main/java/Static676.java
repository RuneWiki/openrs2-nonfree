import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static676 {

	@OriginalMember(owner = "client!wt", name = "v", descriptor = "[Lclient!cr;")
	public static Class51[] aClass51Array1;

	@OriginalMember(owner = "client!wt", name = "l", descriptor = "Z")
	public static boolean aBoolean801 = true;

	@OriginalMember(owner = "client!wt", name = "y", descriptor = "[I")
	public static final int[] anIntArray727 = new int[4];

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(II)Z")
	public static boolean method8964(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(Z)V")
	public static void method8966() {
		try {
			@Pc(16) int local16;
			if (Static91.anInt1809 == 1) {
				local16 = Static570.aClass4_Sub3_Sub4_6.method6768();
				if (local16 > 0 && Static570.aClass4_Sub3_Sub4_6.method6751()) {
					local16 -= Static670.anInt6846;
					if (local16 < 0) {
						local16 = 0;
					}
					Static570.aClass4_Sub3_Sub4_6.method6787(local16);
					return;
				}
				Static570.aClass4_Sub3_Sub4_6.method6785();
				Static570.aClass4_Sub3_Sub4_6.method6773();
				Static108.aClass287_1 = null;
				Static641.aClass4_Sub43_2 = null;
				if (Static586.aClass34_116 == null) {
					Static91.anInt1809 = 0;
				} else {
					Static91.anInt1809 = 2;
				}
			}
			if (Static91.anInt1809 == 3) {
				local16 = Static570.aClass4_Sub3_Sub4_6.method6768();
				if (local16 < Static414.anInt5938 && Static570.aClass4_Sub3_Sub4_6.method6751()) {
					local16 += Static282.anInt4509;
					if (Static414.anInt5938 < local16) {
						local16 = Static414.anInt5938;
					}
					Static570.aClass4_Sub3_Sub4_6.method6787(local16);
				} else {
					Static91.anInt1809 = 0;
					Static282.anInt4509 = 0;
				}
			}
		} catch (@Pc(94) Exception local94) {
			local94.printStackTrace();
			Static570.aClass4_Sub3_Sub4_6.method6785();
			Static641.aClass4_Sub43_2 = null;
			Static91.anInt1809 = 0;
			Static108.aClass287_1 = null;
			Static554.aClass4_Sub3_Sub4_5 = null;
			Static586.aClass34_116 = null;
		}
	}
}
