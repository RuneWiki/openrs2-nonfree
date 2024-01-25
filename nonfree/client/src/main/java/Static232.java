import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!id", name = "m", descriptor = "Lclient!eia;")
	public static Class92 aClass92_3;

	@OriginalMember(owner = "client!id", name = "h", descriptor = "Lclient!kca;")
	public static final Class187 aClass187_10 = new Class187(1);

	@OriginalMember(owner = "client!id", name = "i", descriptor = "I")
	public static int anInt7424 = -2;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIILclient!uw;I)V")
	public static void method6241(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class350 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(16) Class2_Sub31 local16 = (Class2_Sub31) Static228.aClass238_26.method5833(); local16 != null; local16 = (Class2_Sub31) Static228.aClass238_26.method5838()) {
			if (local16.anInt5790 == arg0 && arg1 << 9 == local16.anInt5789 && arg3 << 9 == local16.anInt5791 && arg2.anInt9607 == local16.aClass350_1.anInt9607) {
				if (local16.aClass2_Sub2_Sub5_3 != null) {
					Static1.aClass2_Sub2_Sub2_6.method1042(local16.aClass2_Sub2_Sub5_3);
					local16.aClass2_Sub2_Sub5_3 = null;
				}
				if (local16.aClass2_Sub2_Sub5_2 != null) {
					Static1.aClass2_Sub2_Sub2_6.method1042(local16.aClass2_Sub2_Sub5_2);
					local16.aClass2_Sub2_Sub5_2 = null;
				}
				local16.method8599();
				return;
			}
		}
	}
}
