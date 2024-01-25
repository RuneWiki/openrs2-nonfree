import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "Lclient!la;")
	public static final Class136 aClass136_146 = new Class136(30, -2);

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
	public static final int anInt5384 = 0;

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIBI)V")
	public static void method4440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 0;
		@Pc(18) int local18 = arg2;
		@Pc(21) int local21 = -arg2;
		@Pc(23) int local23 = -1;
		@Pc(32) int local32 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg0 + arg2);
		@Pc(41) int local41 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg0 - arg2);
		Static201.method3084(Static296.anIntArrayArray42[arg1], local41, local32, arg3);
		while (local16 < local18) {
			local23 += 2;
			local21 += local23;
			@Pc(70) int local70;
			@Pc(75) int local75;
			@Pc(94) int local94;
			@Pc(103) int local103;
			if (local21 > 0) {
				local18--;
				local21 -= local18 << 1;
				local70 = arg1 - local18;
				local75 = arg1 + local18;
				if (local75 >= Static316.anInt5349 && Static418.anInt7030 >= local70) {
					local94 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg0 + local16);
					local103 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg0 - local16);
					if (local75 <= Static418.anInt7030) {
						Static201.method3084(Static296.anIntArrayArray42[local75], local103, local94, arg3);
					}
					if (Static316.anInt5349 <= local70) {
						Static201.method3084(Static296.anIntArrayArray42[local70], local103, local94, arg3);
					}
				}
			}
			local16++;
			local70 = arg1 - local16;
			local75 = arg1 + local16;
			if (local75 >= Static316.anInt5349 && Static418.anInt7030 >= local70) {
				local94 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, local18 + arg0);
				local103 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg0 - local18);
				if (Static418.anInt7030 >= local75) {
					Static201.method3084(Static296.anIntArrayArray42[local75], local103, local94, arg3);
				}
				if (Static316.anInt5349 <= local70) {
					Static201.method3084(Static296.anIntArrayArray42[local70], local103, local94, arg3);
				}
			}
		}
	}
}
