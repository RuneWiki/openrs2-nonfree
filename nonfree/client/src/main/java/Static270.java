import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!nj", name = "A", descriptor = "I")
	public static int anInt5255;

	@OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
	public static int anInt5249 = 2;

	@OriginalMember(owner = "client!nj", name = "w", descriptor = "I")
	public static int anInt5251 = -1;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "([BI)[B")
	public static byte[] method4028(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub3 local8 = new Class1_Sub3(arg0);
		@Pc(12) int local12 = local8.method1171();
		@Pc(16) int local16 = local8.method1188();
		if (local16 < 0 || Static388.anInt7097 != 0 && Static388.anInt7097 < local16) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(36) byte[] local36 = new byte[local16];
			local8.method1173(local36, local16);
			return local36;
		} else {
			@Pc(50) int local50 = local8.method1188();
			if (local50 < 0 || Static388.anInt7097 != 0 && Static388.anInt7097 < local50) {
				throw new RuntimeException();
			}
			@Pc(70) byte[] local70 = new byte[local50];
			if (local12 == 1) {
				Static357.method5045(local70, local50, arg0, local16);
			} else {
				Static76.aClass269_1.method6149(local70, local8);
			}
			return local70;
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BIIIII)V")
	public static void method4031(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static337.method4744(arg3, Static164.anInt6595, Static362.anInt6654);
		@Pc(17) int local17 = Static337.method4744(arg4, Static164.anInt6595, Static362.anInt6654);
		@Pc(23) int local23 = Static337.method4744(arg0, Static70.anInt1843, Static105.anInt2417);
		@Pc(29) int local29 = Static337.method4744(arg2, Static70.anInt1843, Static105.anInt2417);
		for (@Pc(39) int local39 = local11; local39 <= local17; local39++) {
			Static228.method3480(local23, arg1, Static60.anIntArrayArray14[local39], local29);
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(B[Ljava/lang/Object;[I)V")
	public static void method4034(@OriginalArg(1) Object[] arg0, @OriginalArg(2) int[] arg1) {
		Static240.method3627(0, arg1.length - 1, arg1, arg0);
	}
}
