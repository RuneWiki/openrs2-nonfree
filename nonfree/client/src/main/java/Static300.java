import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!kda", name = "n", descriptor = "I")
	public static int anInt5494;

	@OriginalMember(owner = "client!kda", name = "i", descriptor = "Lclient!ju;")
	public static final Class201 aClass201_13 = new Class201(6, 3);

	@OriginalMember(owner = "client!kda", name = "p", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_75 = new Class376(35, -1);

	@OriginalMember(owner = "client!kda", name = "s", descriptor = "I")
	public static final int anInt5498 = 1406;

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(BLclient!od;)I")
	public static int method4652(@OriginalArg(1) Class3_Sub6_Sub16 arg0) {
		@Pc(12) String local12 = Static435.method6378(arg0);
		@Pc(14) int[] local14 = null;
		if (Static315.method4940(arg0.anInt7069)) {
			local14 = Static237.aClass371_2.method8305((int) arg0.aLong202).anIntArray253;
		} else if (arg0.anInt7070 != -1) {
			local14 = Static237.aClass371_2.method8305(arg0.anInt7070).anIntArray253;
		} else if (Static156.method4836(arg0.anInt7069)) {
			@Pc(92) Class3_Sub11 local92 = (Class3_Sub11) Static500.aClass62_40.method1682((long) (int) arg0.aLong202);
			if (local92 != null) {
				@Pc(97) Class23_Sub2_Sub1_Sub2_Sub2 local97 = local92.aClass23_Sub2_Sub1_Sub2_Sub2_1;
				@Pc(100) Class5 local100 = local97.aClass5_1;
				if (local100.anIntArray1 != null) {
					local100 = local100.method56(Static592.aClass47_2);
				}
				if (local100 != null) {
					local14 = local100.anIntArray2;
				}
			}
		} else if (Static340.method5163(arg0.anInt7069)) {
			@Pc(57) Class178 local57;
			if (arg0.anInt7069 == 1007) {
				local57 = Static349.aClass374_2.method8357((int) arg0.aLong202);
			} else {
				local57 = Static349.aClass374_2.method8357((int) (arg0.aLong202 >>> 32 & 0x7FFFFFFFL));
			}
			if (local57.anIntArray313 != null) {
				local57 = local57.method4012(Static592.aClass47_2);
			}
			if (local57 != null) {
				local14 = local57.anIntArray316;
			}
		}
		if (local14 != null) {
			local12 = local12 + Static228.method2115(local14);
		}
		@Pc(140) int local140 = Static17.aClass202_1.method4624(local12, Static359.aClass102Array17);
		if (arg0.aBoolean536) {
			local140 += Static640.aClass102_39.method6957() + 4;
		}
		return local140;
	}
}
