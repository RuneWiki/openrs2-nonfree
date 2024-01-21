import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class1_Sub1_Sub6 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub6() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3313(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass39_41.method1383(arg0);
		if (super.aClass39_41.aBoolean82) {
			@Pc(26) int[] local26 = this.method3303(arg0, 2);
			@Pc(32) int[][] local32 = this.method3307(0, arg0);
			@Pc(38) int[][] local38 = this.method3307(1, arg0);
			@Pc(42) int[] local42 = local16[2];
			@Pc(46) int[] local46 = local16[0];
			@Pc(50) int[] local50 = local16[1];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[2];
			@Pc(62) int[] local62 = local38[0];
			@Pc(66) int[] local66 = local38[1];
			@Pc(70) int[] local70 = local38[2];
			@Pc(74) int[] local74 = local32[1];
			for (@Pc(76) int local76 = 0; local76 < Static176.anInt3921; local76++) {
				@Pc(82) int local82 = local26[local76];
				if (local82 == 4096) {
					local46[local76] = local54[local76];
					local50[local76] = local74[local76];
					local42[local76] = local58[local76];
				} else if (local82 == 0) {
					local46[local76] = local62[local76];
					local50[local76] = local66[local76];
					local42[local76] = local70[local76];
				} else {
					@Pc(114) int local114 = 4096 - local82;
					local46[local76] = local62[local76] * local114 + local54[local76] * local82 >> 12;
					local50[local76] = local82 * local74[local76] + local114 * local66[local76] >> 12;
					local42[local76] = local58[local76] * local82 + local114 * local70[local76] >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			super.aBoolean185 = arg1.method1738() == 1;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3310(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass80_41.method2876(arg0);
		if (super.aClass80_41.aBoolean151) {
			@Pc(21) int[] local21 = this.method3303(arg0, 0);
			@Pc(29) int[] local29 = this.method3303(arg0, 1);
			@Pc(35) int[] local35 = this.method3303(arg0, 2);
			for (@Pc(37) int local37 = 0; local37 < Static176.anInt3921; local37++) {
				@Pc(43) int local43 = local35[local37];
				if (local43 == 4096) {
					local11[local37] = local21[local37];
				} else if (local43 == 0) {
					local11[local37] = local29[local37];
				} else {
					local11[local37] = local21[local37] * local43 + (4096 - local43) * local29[local37] >> 12;
				}
			}
		}
		return local11;
	}
}
