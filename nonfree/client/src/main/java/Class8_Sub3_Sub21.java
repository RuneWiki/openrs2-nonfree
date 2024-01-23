import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class8_Sub3_Sub21 extends Class8_Sub3 {

	@OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
	private int anInt2692 = 4096;

	@OriginalMember(owner = "client!kb", name = "P", descriptor = "I")
	private int anInt2694 = 0;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method4227(@OriginalArg(0) int arg0) {
		@Pc(20) int[] local20 = this.aClass59_41.method1366(arg0);
		if (this.aClass59_41.aBoolean131) {
			@Pc(31) int[] local31 = this.method4230(arg0, 0);
			for (@Pc(33) int local33 = 0; local33 < Static239.anInt4789; local33++) {
				@Pc(40) int local40 = local31[local33];
				if (local40 < this.anInt2694) {
					local20[local33] = this.anInt2694;
				} else if (local40 > this.anInt2692) {
					local20[local33] = this.anInt2692;
				} else {
					local20[local33] = local40;
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4217(@OriginalArg(0) int arg0) {
		@Pc(9) int[][] local9 = this.aClass166_41.method4037(arg0);
		if (this.aClass166_41.aBoolean451) {
			@Pc(31) int[][] local31 = this.method4224(arg0, 0);
			@Pc(35) int[] local35 = local31[0];
			@Pc(39) int[] local39 = local31[2];
			@Pc(43) int[] local43 = local31[1];
			@Pc(47) int[] local47 = local9[0];
			@Pc(51) int[] local51 = local9[2];
			@Pc(55) int[] local55 = local9[1];
			for (@Pc(57) int local57 = 0; local57 < Static239.anInt4789; local57++) {
				@Pc(68) int local68 = local35[local57];
				@Pc(72) int local72 = local43[local57];
				@Pc(76) int local76 = local39[local57];
				if (local68 < this.anInt2694) {
					local47[local57] = this.anInt2694;
				} else if (this.anInt2692 >= local68) {
					local47[local57] = local68;
				} else {
					local47[local57] = this.anInt2692;
				}
				if (local72 < this.anInt2694) {
					local55[local57] = this.anInt2694;
				} else if (this.anInt2692 < local72) {
					local55[local57] = this.anInt2692;
				} else {
					local55[local57] = local72;
				}
				if (local76 < this.anInt2694) {
					local51[local57] = this.anInt2694;
				} else if (this.anInt2692 < local76) {
					local51[local57] = this.anInt2692;
				} else {
					local51[local57] = local76;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt2694 = arg1.method2375();
		} else if (arg0 == 1) {
			this.anInt2692 = arg1.method2375();
		} else if (arg0 == 2) {
			this.aBoolean469 = arg1.method2334() == 1;
		}
	}
}
