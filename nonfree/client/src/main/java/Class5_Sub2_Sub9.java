import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class5_Sub2_Sub9 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ds", name = "D", descriptor = "I")
	private int anInt1680 = 4096;

	@OriginalMember(owner = "client!ds", name = "C", descriptor = "I")
	private int anInt1679 = 16;

	@OriginalMember(owner = "client!ds", name = "H", descriptor = "I")
	private int anInt1684 = 0;

	@OriginalMember(owner = "client!ds", name = "F", descriptor = "I")
	private int anInt1682 = 0;

	@OriginalMember(owner = "client!ds", name = "K", descriptor = "I")
	private int anInt1685 = 2000;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8820(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass246_41.method5949(arg0);
		if (super.aClass246_41.aBoolean561) {
			@Pc(25) int local25 = this.anInt1680 >> 1;
			@Pc(30) int[][] local30 = super.aClass246_41.method5950();
			@Pc(37) Random local37 = new Random((long) this.anInt1682);
			for (@Pc(39) int local39 = 0; local39 < this.anInt1685; local39++) {
				@Pc(62) int local62 = this.anInt1680 <= 0 ? this.anInt1684 : this.anInt1684 + Static57.method964(this.anInt1680, local37) - local25;
				@Pc(68) int local68 = local62 >> 4 & 0xFF;
				@Pc(75) int local75 = Static57.method964(Static314.anInt6320, local37);
				@Pc(80) int local80 = Static57.method964(Static423.anInt7200, local37);
				@Pc(92) int local92 = local75 + (this.anInt1679 * Static46.anIntArray61[local68] >> 12);
				@Pc(103) int local103 = (this.anInt1679 * Static457.anIntArray613[local68] >> 12) + local80;
				@Pc(107) int local107 = local103 - local80;
				@Pc(112) int local112 = local92 - local75;
				if (local112 != 0 || local107 != 0) {
					if (local112 < 0) {
						local112 = -local112;
					}
					if (local107 < 0) {
						local107 = -local107;
					}
					@Pc(136) boolean local136 = local112 < local107;
					@Pc(140) int local140;
					@Pc(144) int local144;
					if (local136) {
						local140 = local75;
						local75 = local80;
						local144 = local92;
						local80 = local140;
						local92 = local103;
						local103 = local144;
					}
					if (local92 < local75) {
						local140 = local75;
						local144 = local80;
						local75 = local92;
						local92 = local140;
						local80 = local103;
						local103 = local144;
					}
					local140 = local80;
					local144 = local92 - local75;
					@Pc(177) int local177 = local103 - local80;
					@Pc(182) int local182 = -local144 / 2;
					@Pc(186) int local186 = 2048 / local144;
					@Pc(196) int local196 = 1024 - (Static57.method964(4096, local37) >> 2);
					if (local177 < 0) {
						local177 = -local177;
					}
					@Pc(211) int local211 = local80 >= local103 ? -1 : 1;
					for (@Pc(213) int local213 = local75; local213 < local92; local213++) {
						@Pc(226) int local226 = local196 + (-local75 + local213) * local186 + 1024;
						@Pc(230) int local230 = local213 & Static550.anInt6610;
						@Pc(234) int local234 = local140 & Static271.anInt4487;
						local182 += local177;
						if (local136) {
							local30[local234][local230] = local226;
						} else {
							local30[local230][local234] = local226;
						}
						if (local182 > 0) {
							local182 += -local144;
							local140 += local211;
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
	@Override
	public void method8819() {
		Static606.method8449();
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1682 = arg0.method8645();
		} else if (arg1 == 1) {
			this.anInt1685 = arg0.method8631();
		} else if (arg1 == 2) {
			this.anInt1679 = arg0.method8645();
		} else if (arg1 == 3) {
			this.anInt1684 = arg0.method8631();
		} else if (arg1 == 4) {
			this.anInt1680 = arg0.method8631();
		}
	}
}
