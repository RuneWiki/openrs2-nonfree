import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class2_Sub2_Sub24 extends Class2_Sub2 {

	@OriginalMember(owner = "client!n", name = "P", descriptor = "I")
	private int anInt2408;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BILclient!va;)V")
	@Override
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt2408 = arg1.method1456() << 4;
		} else if (arg0 == 1) {
			super.aBoolean160 = arg1.method1461() == 1;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2575(@OriginalArg(0) int arg0) {
		@Pc(12) int[] local12 = super.aClass76_38.method2290(arg0);
		if (super.aClass76_38.aBoolean142) {
			@Pc(26) int[] local26 = this.method2573(arg0, 1);
			@Pc(32) int[] local32 = this.method2573(arg0, 2);
			for (@Pc(34) int local34 = 0; local34 < Static149.anInt3233; local34++) {
				@Pc(46) int local46 = local26[local34] * 255 >> 12 & 0xFF;
				@Pc(55) int local55 = local32[local34] * this.anInt2408 >> 12;
				@Pc(63) int local63 = Static45.anIntArray135[local46] * local55 >> 12;
				@Pc(71) int local71 = Static20.anIntArray37[local46] * local55 >> 12;
				@Pc(80) int local80 = Static75.anInt1778 & arg0 + (local71 >> 12);
				@Pc(88) int local88 = (local63 >> 12) + local34 & Static145.anInt2636;
				@Pc(94) int[] local94 = this.method2573(local80, 0);
				local12[local34] = local94[local88];
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2579(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass62_38.method1904(arg0);
		if (super.aClass62_38.aBoolean118) {
			@Pc(29) int[] local29 = this.method2573(arg0, 1);
			@Pc(35) int[] local35 = this.method2573(arg0, 2);
			@Pc(39) int[] local39 = local7[1];
			@Pc(43) int[] local43 = local7[2];
			@Pc(47) int[] local47 = local7[0];
			for (@Pc(49) int local49 = 0; local49 < Static149.anInt3233; local49++) {
				@Pc(61) int local61 = local29[local49] * 255 >> 12 & 0xFF;
				@Pc(70) int local70 = local35[local49] * this.anInt2408 >> 12;
				@Pc(78) int local78 = local70 * Static45.anIntArray135[local61] >> 12;
				@Pc(86) int local86 = Static20.anIntArray37[local61] * local70 >> 12;
				@Pc(94) int local94 = (local86 >> 12) + arg0 & Static75.anInt1778;
				@Pc(102) int local102 = Static145.anInt2636 & (local78 >> 12) + local49;
				@Pc(108) int[][] local108 = this.method2582(0, local94);
				local47[local49] = local108[0][local102];
				local39[local49] = local108[1][local102];
				local43[local49] = local108[2][local102];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(B)V")
	@Override
	public void method2574() {
		Static100.method1657();
	}
}
