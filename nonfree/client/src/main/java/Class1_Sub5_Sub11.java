import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class1_Sub5_Sub11 extends Class1_Sub5 {

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub11() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5805(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass214_41.method5651(arg0);
		if (super.aClass214_41.aBoolean544) {
			@Pc(25) int[] local25 = this.method5802(0, arg0);
			@Pc(31) int[] local31 = this.method5802(1, arg0);
			@Pc(37) int[] local37 = this.method5802(2, arg0);
			for (@Pc(39) int local39 = 0; local39 < Static75.anInt1566; local39++) {
				@Pc(45) int local45 = local37[local39];
				if (local45 == 4096) {
					local15[local39] = local25[local39];
				} else if (local45 == 0) {
					local15[local39] = local31[local39];
				} else {
					local15[local39] = (4096 - local45) * local31[local39] + local25[local39] * local45 >> 12;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean552 = arg0.method5720() == 1;
		}
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5811(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass151_41.method4015(arg0);
		if (super.aClass151_41.aBoolean368) {
			@Pc(26) int[] local26 = this.method5802(2, arg0);
			@Pc(32) int[][] local32 = this.method5807(arg0, 0);
			@Pc(38) int[][] local38 = this.method5807(arg0, 1);
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local32[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static75.anInt1566; local76++) {
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
					@Pc(132) int local132 = 4096 - local82;
					local42[local76] = local132 * local66[local76] + local54[local76] * local82 >> 12;
					local46[local76] = local58[local76] * local82 + local70[local76] * local132 >> 12;
					local50[local76] = local132 * local74[local76] + local82 * local62[local76] >> 12;
				}
			}
		}
		return local16;
	}
}
