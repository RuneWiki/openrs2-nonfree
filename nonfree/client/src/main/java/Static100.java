import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!de", name = "G", descriptor = "[Lclient!wu;")
	public static Class399[] aClass399Array1;

	@OriginalMember(owner = "client!de", name = "C", descriptor = "Lclient!fw;")
	public static final Class125 aClass125_9 = new Class125(64);

	@OriginalMember(owner = "client!de", name = "g", descriptor = "(I)I")
	public static int method1674() {
		return Static421.anIntArray369 == null ? 0 : Static421.anIntArray369.length * 2;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZII)Z")
	public static boolean method1681(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static455.aBoolean533) {
			return false;
		}
		@Pc(12) int local12 = arg1 >> 16;
		@Pc(16) int local16 = arg1 & 0xFFFF;
		if (Static339.aClass299ArrayArray1[local12] == null || Static339.aClass299ArrayArray1[local12][local16] == null) {
			return false;
		}
		@Pc(44) Class299 local44 = Static339.aClass299ArrayArray1[local12][local16];
		@Pc(58) Class14_Sub2_Sub20 local58;
		if (arg0 == -1 && local44.anInt8610 == 0) {
			for (local58 = (Class14_Sub2_Sub20) Static111.aClass32_7.method584(); local58 != null; local58 = (Class14_Sub2_Sub20) Static111.aClass32_7.method577()) {
				if (local58.anInt10001 == 47 || local58.anInt10001 == 1011 || local58.anInt10001 == 30 || local58.anInt10001 == 6 || local58.anInt10001 == 18) {
					for (@Pc(159) Class299 local159 = Static391.method5936(local58.anInt10000); local159 != null; local159 = Static197.method2950(local159)) {
						if (local44.anInt8526 == local159.anInt8526) {
							return true;
						}
					}
				}
			}
		} else {
			for (local58 = (Class14_Sub2_Sub20) Static111.aClass32_7.method584(); local58 != null; local58 = (Class14_Sub2_Sub20) Static111.aClass32_7.method577()) {
				if (arg0 == local58.anInt10004 && local44.anInt8526 == local58.anInt10000 && (local58.anInt10001 == 47 || local58.anInt10001 == 1011 || local58.anInt10001 == 30 || local58.anInt10001 == 6 || local58.anInt10001 == 18)) {
					return true;
				}
			}
		}
		return false;
	}
}
