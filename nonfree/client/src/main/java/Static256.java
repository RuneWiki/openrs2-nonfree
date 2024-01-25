import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!ip", name = "e", descriptor = "J")
	public static long aLong122;

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_85 = new Class180(5, 2);

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!dga;I[[B)V")
	public static void method3783(@OriginalArg(0) Class73_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(8) int local8 = Static73.aByteArrayArray6.length;
		for (@Pc(14) int local14 = 0; local14 < local8; local14++) {
			@Pc(20) byte[] local20 = arg1[local14];
			if (local20 != null) {
				@Pc(33) int local33 = (Static77.anIntArray125[local14] >> 8) * 64 - Static287.anInt4910;
				@Pc(43) int local43 = (Static77.anIntArray125[local14] & 0xFF) * 64 - Static72.anInt1361;
				Static72.method1380();
				arg0.method1814(Static674.aClass13_22, local33, Static1.aClass252Array5, local20, local43);
			}
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IBI)Z")
	public static boolean method3785(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x60000) != 0 | Static375.method5426(arg1, arg0) || Static639.method8893(arg0, arg1) || Static651.method9019(arg1, arg0);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIBIIII)Lclient!dn;")
	public static Class35 method3787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(38) long local38 = (long) arg2 * 986053L ^ (long) arg1 * 97549L ^ (long) arg0 * 67481L ^ (long) arg3 * 475427L ^ (long) arg5 * 32147369L ^ (long) arg4 * 76724863L;
		@Pc(44) Class35 local44 = (Class35) Static601.aClass165_71.method4389(local38);
		if (local44 == null) {
			local44 = Static90.aClass13_18.method8456(arg0, arg1, arg3, arg2, arg5, arg4);
			Static601.aClass165_71.method4392(local44, local38);
			return local44;
		} else {
			return local44;
		}
	}
}
