import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!sh", name = "A", descriptor = "I")
	public static int anInt6595;

	@OriginalMember(owner = "client!sh", name = "o", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_203 = new Class214(1, -1);

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIZIZ)I")
	public static int method5326(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) boolean arg2) {
		@Pc(10) Class4_Sub38 local10 = Static351.method5112(false, arg1);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray540.length; local18++) {
			if (local10.anIntArray540[local18] >= 0 && Static139.aClass193_1.anInt5591 > local10.anIntArray540[local18]) {
				@Pc(47) Class274 local47 = Static139.aClass193_1.method4650(local10.anIntArray540[local18]);
				@Pc(57) int local57 = local47.method6251(arg0, Static203.aClass202_1.method4864(arg0).anInt5158);
				if (arg2) {
					local16 += local57 * local10.anIntArray541[local18];
				} else {
					local16 += local57;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!iu;)V")
	public static void method5328(@OriginalArg(1) Class4_Sub20_Sub1 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static239.anInt4701; local3++) {
			@Pc(9) int local9 = Static401.anIntArray572[local3];
			@Pc(13) Class11_Sub5_Sub2_Sub1 local13 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local9];
			@Pc(17) int local17 = arg0.method4614();
			if ((local17 & 0x10) != 0) {
				local17 += arg0.method4614() << 8;
			}
			if ((local17 & 0x4000) != 0) {
				local17 += arg0.method4614() << 16;
			}
			Static97.method1859(local9, local13, arg0, local17);
		}
	}
}
