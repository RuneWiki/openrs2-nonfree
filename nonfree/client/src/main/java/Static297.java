import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "I")
	public static int anInt4985;

	@OriginalMember(owner = "client!kba", name = "c", descriptor = "I")
	public static int anInt4986 = 0;

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IILclient!aj;)Lclient!dw;")
	public static Class3_Sub20 method4579(@OriginalArg(1) int arg0, @OriginalArg(2) Class15 arg1) {
		@Pc(12) byte[] local12 = arg1.method536(arg0);
		return local12 == null ? null : new Class3_Sub20(local12);
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lclient!jp;I)Lclient!mja;")
	public static Class222_Sub1 method4580(@OriginalArg(0) Class3_Sub25 arg0) {
		@Pc(7) Class222 local7 = Static337.method5084(arg0);
		@Pc(13) int local13 = arg0.method8611();
		return new Class222_Sub1(local7.anInt6028, local7.aClass356_11, local7.aClass56_13, local7.anInt6030, local7.anInt6031, local13);
	}
}
