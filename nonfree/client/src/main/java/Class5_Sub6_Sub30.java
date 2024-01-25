import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pba")
public final class Class5_Sub6_Sub30 extends Class5_Sub6 {

	@OriginalMember(owner = "client!pba", name = "J", descriptor = "I")
	private int anInt7786 = 4096;

	@OriginalMember(owner = "client!pba", name = "C", descriptor = "Z")
	private boolean aBoolean568 = true;

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8122(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass242_41.method5691(arg0);
		if (super.aClass242_41.aBoolean487) {
			@Pc(31) int[] local31 = this.method8117(Static442.anInt7781 & arg0 - 1, 0);
			@Pc(37) int[] local37 = this.method8117(arg0, 0);
			@Pc(47) int[] local47 = this.method8117(arg0 + 1 & Static442.anInt7781, 0);
			@Pc(51) int[] local51 = local11[0];
			@Pc(55) int[] local55 = local11[1];
			@Pc(59) int[] local59 = local11[2];
			for (@Pc(61) int local61 = 0; local61 < Static421.anInt7443; local61++) {
				@Pc(74) int local74 = (local47[local61] - local31[local61]) * this.anInt7786;
				@Pc(93) int local93 = this.anInt7786 * (local37[Static575.anInt9380 & local61 + 1] - local37[local61 - 1 & Static575.anInt9380]);
				@Pc(97) int local97 = local93 >> 12;
				@Pc(101) int local101 = local74 >> 12;
				@Pc(107) int local107 = local97 * local97 >> 12;
				@Pc(113) int local113 = local101 * local101 >> 12;
				@Pc(127) int local127 = (int) (Math.sqrt((double) ((float) (local107 + local113 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(141) int local141;
				@Pc(133) int local133;
				@Pc(137) int local137;
				if (local127 == 0) {
					local137 = 0;
					local141 = 0;
					local133 = 0;
				} else {
					local133 = local74 / local127;
					local137 = 16777216 / local127;
					local141 = local93 / local127;
				}
				if (this.aBoolean568) {
					local141 = (local141 >> 1) + 2048;
					local133 = (local133 >> 1) + 2048;
					local137 = (local137 >> 1) + 2048;
				}
				local51[local61] = local141;
				local55[local61] = local133;
				local59[local61] = local137;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7786 = arg0.method3698();
		} else if (arg1 == 1) {
			this.aBoolean568 = arg0.method3642() == 1;
		}
	}
}
