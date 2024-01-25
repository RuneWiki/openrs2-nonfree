import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_38 = new Class359(85, -1);

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
	public static int anInt2366 = -1;

	@OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
	public static int anInt2368 = 0;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IILclient!ha;IIIZ)Lclient!ka;")
	public static Class153 method2122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class65 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(6) long local6 = (long) arg3;
		@Pc(12) Class153 local12 = (Class153) Static327.aClass340_37.method7999(local6);
		if (local12 == null) {
			@Pc(22) Class329 local22 = Static347.method5290(arg3, Static676.aClass390_129);
			if (local22 == null) {
				return null;
			}
			if (local22.anInt9048 < 13) {
				local22.method7672();
			}
			local12 = arg2.method6964(local22, 2055, Static190.anInt5146, 64, 768);
			Static327.aClass340_37.method7986(local6, local12);
		}
		local12 = local12.method8580((byte) 2, 2055, true);
		if (arg5 != 0) {
			local12.a(arg5);
		}
		if (arg0 != 0) {
			local12.FA(arg0);
		}
		if (arg1 != 0) {
			local12.VA(arg1);
		}
		if (arg4 != 0) {
			local12.H(0, arg4, 0);
		}
		return local12;
	}
}
