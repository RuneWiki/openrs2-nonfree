import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rw")
public final class Class4_Sub2_Sub26 extends Class4_Sub2 {

	@OriginalMember(owner = "client!rw", name = "H", descriptor = "[I")
	public static final int[] anIntArray563 = new int[16384];

	@OriginalMember(owner = "client!rw", name = "D", descriptor = "[I")
	public static final int[] anIntArray562 = new int[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray563[local9] = (int) (Math.sin(local7 * (double) local9) * 16384.0D);
			anIntArray562[local9] = (int) (Math.cos((double) local9 * local7) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub26() {
		super(3, false);
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			super.aBoolean793 = arg1.method8865() == 1;
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8765(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass271_41.method6067(arg0);
		if (super.aClass271_41.aBoolean534) {
			@Pc(21) int[] local21 = this.method8768(0, arg0);
			@Pc(27) int[] local27 = this.method8768(1, arg0);
			@Pc(33) int[] local33 = this.method8768(2, arg0);
			for (@Pc(35) int local35 = 0; local35 < Static269.anInt4330; local35++) {
				@Pc(41) int local41 = local33[local35];
				if (local41 == 4096) {
					local11[local35] = local21[local35];
				} else if (local41 == 0) {
					local11[local35] = local27[local35];
				} else {
					local11[local35] = local27[local35] * (4096 - local41) + local41 * local21[local35] >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8771(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass304_41.method6699(arg0);
		if (super.aClass304_41.aBoolean604) {
			@Pc(26) int[] local26 = this.method8768(2, arg0);
			@Pc(32) int[][] local32 = this.method8772(arg0, 0);
			@Pc(38) int[][] local38 = this.method8772(arg0, 1);
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local32[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static269.anInt4330; local76++) {
				@Pc(82) int local82 = local26[local76];
				if (local82 == 4096) {
					local42[local76] = local54[local76];
					local46[local76] = local58[local76];
					local50[local76] = local62[local76];
				} else if (local82 == 0) {
					local42[local76] = local66[local76];
					local46[local76] = local70[local76];
					local50[local76] = local74[local76];
				} else {
					@Pc(117) int local117 = 4096 - local82;
					local42[local76] = local66[local76] * local117 + local54[local76] * local82 >> 12;
					local46[local76] = local70[local76] * local117 + local58[local76] * local82 >> 12;
					local50[local76] = local74[local76] * local117 + local62[local76] * local82 >> 12;
				}
			}
		}
		return local16;
	}
}
