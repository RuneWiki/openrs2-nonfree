import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kca")
public final class Class3_Sub9_Sub23 extends Class3_Sub9 {

	@OriginalMember(owner = "client!kca", name = "I", descriptor = "[Lclient!vl;")
	public static final Class371[] aClass371Array1 = new Class371[5];

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass371Array1.length; local4++) {
			aClass371Array1[local4] = new Class371();
		}
	}

	@OriginalMember(owner = "client!kca", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub23() {
		super(3, false);
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9165(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass113_41.method3239(arg0);
		if (super.aClass113_41.aBoolean275) {
			@Pc(26) int[] local26 = this.method9162(arg0, 0);
			@Pc(32) int[] local32 = this.method9162(arg0, 1);
			@Pc(38) int[] local38 = this.method9162(arg0, 2);
			for (@Pc(40) int local40 = 0; local40 < Static62.anInt1251; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local16[local40] = local26[local40];
				} else if (local46 == 0) {
					local16[local40] = local32[local40];
				} else {
					local16[local40] = local46 * local26[local40] + (4096 - local46) * local32[local40] >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean804 = arg0.method8632() == 1;
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method9168(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass348_41.method8552(arg0);
		if (super.aClass348_41.aBoolean748) {
			@Pc(26) int[] local26 = this.method9162(arg0, 2);
			@Pc(32) int[][] local32 = this.method9167(0, arg0);
			@Pc(38) int[][] local38 = this.method9167(1, arg0);
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local32[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static62.anInt1251; local76++) {
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
					@Pc(97) int local97 = 4096 - local82;
					local42[local76] = local97 * local66[local76] + local82 * local54[local76] >> 12;
					local46[local76] = local82 * local58[local76] + local70[local76] * local97 >> 12;
					local50[local76] = local82 * local62[local76] + local74[local76] * local97 >> 12;
				}
			}
		}
		return local11;
	}
}
