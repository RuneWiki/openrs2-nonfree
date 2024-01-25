import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static672 {

	@OriginalMember(owner = "client!ws", name = "n", descriptor = "Lclient!si;")
	public static final Class323 aClass323_6 = new Class323();

	@OriginalMember(owner = "client!ws", name = "s", descriptor = "S")
	public static short aShort117 = 256;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(III)Z")
	public static boolean method8770(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILclient!rv;)Lclient!je;")
	public static Class110_Sub2 method8771(@OriginalArg(1) Class5_Sub15 arg0) {
		@Pc(12) Class110 local12 = Static273.method3805(arg0);
		@Pc(18) int local18 = arg0.method3671();
		@Pc(22) int local22 = arg0.method3671();
		@Pc(26) int local26 = arg0.method3698();
		return new Class110_Sub2(local12.aClass112_16, local12.aClass4_11, local12.anInt8734, local12.anInt8739, local12.anInt8729, local12.anInt8731, local12.anInt8738, local12.anInt8732, local12.anInt8733, local18, local22, local26);
	}
}
