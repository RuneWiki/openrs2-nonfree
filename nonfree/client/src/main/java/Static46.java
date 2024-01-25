import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bh", name = "F", descriptor = "[I")
	public static int[] anIntArray54;

	@OriginalMember(owner = "client!bh", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString15;

	@OriginalMember(owner = "client!bh", name = "H", descriptor = "[I")
	public static int[] anIntArray55;

	@OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
	public static int anInt795 = 0;

	@OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
	public static int anInt800 = -1;

	@OriginalMember(owner = "client!bh", name = "I", descriptor = "Lclient!nl;")
	public static final Class258 aClass258_1 = new Class258("", 14);

	@OriginalMember(owner = "client!bh", name = "G", descriptor = "Lclient!gn;")
	public static final Class136 aClass136_5 = new Class136(64);

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!oba;)V")
	public static void method626(@OriginalArg(1) Class19_Sub1_Sub3_Sub2_Sub2 arg0) {
		@Pc(16) Class3_Sub49 local16 = (Class3_Sub49) Static81.aClass136_7.method3503((long) arg0.anInt7796);
		if (local16 == null) {
			return;
		}
		if (local16.aClass3_Sub22_Sub1_3 != null) {
			Static155.aClass3_Sub22_Sub4_1.method9062(local16.aClass3_Sub22_Sub1_3);
			local16.aClass3_Sub22_Sub1_3 = null;
		}
		local16.method9446();
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!gja;I)V")
	public static void method629(@OriginalArg(0) Class19_Sub1_Sub3_Sub2_Sub1 arg0) {
		for (@Pc(15) Class3_Sub49 local15 = (Class3_Sub49) Static627.aClass357_58.method8391(); local15 != null; local15 = (Class3_Sub49) Static627.aClass357_58.method8392()) {
			if (arg0 == local15.aClass19_Sub1_Sub3_Sub2_Sub1_3) {
				if (local15.aClass3_Sub22_Sub1_3 != null) {
					Static155.aClass3_Sub22_Sub4_1.method9062(local15.aClass3_Sub22_Sub1_3);
					local15.aClass3_Sub22_Sub1_3 = null;
				}
				local15.method9446();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)Z")
	public static boolean method633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x60000) != 0 | Static1.method7205(arg0, arg1) || Static506.method7242(arg0, arg1);
	}
}
