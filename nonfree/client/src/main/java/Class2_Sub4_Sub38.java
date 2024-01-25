import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class2_Sub4_Sub38 extends Class2_Sub4 {

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub38() {
		super(3, false);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 0) {
			super.aBoolean789 = arg1.method4464() == 1;
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7564(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass271_41.method5621(arg0);
		if (super.aClass271_41.aBoolean543) {
			@Pc(26) int[] local26 = this.method7568(arg0, 0);
			@Pc(32) int[] local32 = this.method7568(arg0, 1);
			@Pc(38) int[] local38 = this.method7568(arg0, 2);
			for (@Pc(40) int local40 = 0; local40 < Static143.anInt7434; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local11[local40] = local26[local40];
				} else if (local46 == 0) {
					local11[local40] = local32[local40];
				} else {
					local11[local40] = (4096 - local46) * local32[local40] + local46 * local26[local40] >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7561(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass143_41.method2531(arg0);
		if (super.aClass143_41.aBoolean214) {
			@Pc(26) int[] local26 = this.method7568(arg0, 2);
			@Pc(32) int[][] local32 = this.method7567(arg0, 0);
			@Pc(38) int[][] local38 = this.method7567(arg0, 1);
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local32[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static143.anInt7434; local76++) {
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
					@Pc(93) int local93 = 4096 - local82;
					local42[local76] = local93 * local66[local76] + local54[local76] * local82 >> 12;
					local46[local76] = local58[local76] * local82 + local70[local76] * local93 >> 12;
					local50[local76] = local74[local76] * local93 + local82 * local62[local76] >> 12;
				}
			}
		}
		return local16;
	}
}
