import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class12_Sub1_Sub29 extends Class12_Sub1 {

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub29() {
		super(3, false);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7798(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass174_41.method4392(arg0);
		if (super.aClass174_41.aBoolean403) {
			@Pc(25) int[] local25 = this.method7795(0, arg0);
			@Pc(31) int[] local31 = this.method7795(1, arg0);
			@Pc(39) int[] local39 = this.method7795(2, arg0);
			for (@Pc(41) int local41 = 0; local41 < Static357.anInt6670; local41++) {
				@Pc(47) int local47 = local39[local41];
				if (local47 == 4096) {
					local15[local41] = local25[local41];
				} else if (local47 == 0) {
					local15[local41] = local31[local41];
				} else {
					local15[local41] = (4096 - local47) * local31[local41] + local47 * local25[local41] >> 12;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean663 = arg0.method5216() == 1;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7793(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass53_41.method1462(arg0);
		if (super.aClass53_41.aBoolean108) {
			@Pc(26) int[] local26 = this.method7795(2, arg0);
			@Pc(32) int[][] local32 = this.method7790(0, arg0);
			@Pc(38) int[][] local38 = this.method7790(1, arg0);
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local32[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static357.anInt6670; local76++) {
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
					@Pc(114) int local114 = 4096 - local82;
					local42[local76] = local54[local76] * local82 + local66[local76] * local114 >> 12;
					local46[local76] = local70[local76] * local114 + local82 * local58[local76] >> 12;
					local50[local76] = local62[local76] * local82 + local114 * local74[local76] >> 12;
				}
			}
		}
		return local16;
	}
}
