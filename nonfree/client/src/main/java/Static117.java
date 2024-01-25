import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!efa", name = "e", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_70 = new Class363(94, 6);

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(CII)I")
	public static int method1746(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			@Pc(16) char local16 = Character.toLowerCase(arg0);
			local7 = (local16 << 4) + 1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(ILclient!pl;IZ)Lclient!eg;")
	public static Class93 method1747(@OriginalArg(0) int arg0, @OriginalArg(1) Class259 arg1) {
		@Pc(14) byte[] local14 = arg1.method5985(0, arg0);
		return local14 == null ? null : new Class93(local14);
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(II)Lclient!kp;")
	public static Class196 method1748(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static2.aClass196ArrayArray1[local12] == null || Static2.aClass196ArrayArray1[local12][local16] == null) {
			@Pc(30) boolean local30 = Static168.method2918(local12);
			if (!local30) {
				return null;
			}
		}
		return Static2.aClass196ArrayArray1[local12][local16];
	}
}
