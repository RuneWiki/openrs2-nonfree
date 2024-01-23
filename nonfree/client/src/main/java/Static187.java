import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
	public static int anInt3564;

	@OriginalMember(owner = "client!nf", name = "C", descriptor = "I")
	public static int anInt3579;

	@OriginalMember(owner = "client!nf", name = "s", descriptor = "Z")
	public static boolean aBoolean243 = true;

	@OriginalMember(owner = "client!nf", name = "w", descriptor = "I")
	public static int anInt3573 = 0;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIBI)V")
	public static void method3060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class1_Sub7 local12 = (Class1_Sub7) Static229.aClass142_19.method3543((long) arg0);
		if (local12 == null) {
			local12 = new Class1_Sub7();
			Static229.aClass142_19.method3537(local12, (long) arg0);
		}
		if (local12.anIntArray23.length <= arg2) {
			@Pc(41) int[] local41 = new int[arg2 + 1];
			@Pc(46) int[] local46 = new int[arg2 + 1];
			@Pc(48) int local48;
			for (local48 = 0; local48 < local12.anIntArray23.length; local48++) {
				local46[local48] = local12.anIntArray23[local48];
				local41[local48] = local12.anIntArray22[local48];
			}
			for (local48 = local12.anIntArray23.length; local48 < arg2; local48++) {
				local46[local48] = -1;
				local41[local48] = 0;
			}
			local12.anIntArray23 = local46;
			local12.anIntArray22 = local41;
		}
		local12.anIntArray23[arg2] = arg1;
		local12.anIntArray22[arg2] = arg3;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILclient!hi;)Lclient!hi;")
	public static Class66 method3064(@OriginalArg(1) Class66 arg0) {
		if (arg0.anInt2221 != -1) {
			return Static53.method968(arg0.anInt2221);
		}
		@Pc(21) int local21 = arg0.anInt2157 >>> 16;
		@Pc(26) Class98 local26 = new Class98(Static302.aClass142_26);
		for (@Pc(37) Class1_Sub25 local37 = (Class1_Sub25) local26.method2609(); local37 != null; local37 = (Class1_Sub25) local26.method2613()) {
			if (local37.anInt4289 == local21) {
				return Static53.method968((int) local37.aLong214);
			}
		}
		return null;
	}
}
