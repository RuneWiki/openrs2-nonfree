import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class5_Sub3_Sub21 extends Class5_Sub3 {

	@OriginalMember(owner = "client!mc", name = "N", descriptor = "[Lclient!gba;")
	private Class125[] aClass125Array1;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9206(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass343_41.method7661(arg0);
		if (super.aClass343_41.aBoolean592) {
			@Pc(23) int local23 = Static7.anInt102;
			@Pc(25) int local25 = Static122.anInt2020;
			@Pc(29) int[][] local29 = new int[local25][local23];
			@Pc(34) int[][][] local34 = super.aClass343_41.method7660();
			this.method5175(local29);
			for (@Pc(40) int local40 = 0; local40 < Static122.anInt2020; local40++) {
				@Pc(46) int[] local46 = local29[local40];
				@Pc(50) int[][] local50 = local34[local40];
				@Pc(54) int[] local54 = local50[0];
				@Pc(58) int[] local58 = local50[1];
				@Pc(62) int[] local62 = local50[2];
				for (@Pc(64) int local64 = 0; local64 < Static7.anInt102; local64++) {
					@Pc(70) int local70 = local46[local64];
					local62[local64] = (local70 & 0xFF) << 4;
					local58[local64] = local70 >> 4 & 0xFF0;
					local54[local64] = local70 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([[IB)V")
	private void method5175(@OriginalArg(0) int[][] arg0) {
		@Pc(15) int local15 = Static7.anInt102;
		@Pc(17) int local17 = Static122.anInt2020;
		Static2.method23(arg0);
		Static239.method3796(Static652.anInt10663, Static517.anInt8205);
		if (this.aClass125Array1 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < this.aClass125Array1.length; local31++) {
			@Pc(38) Class125 local38 = this.aClass125Array1[local31];
			@Pc(41) int local41 = local38.anInt9674;
			@Pc(44) int local44 = local38.anInt9675;
			if (local41 < 0) {
				if (local44 >= 0) {
					local38.method8244(local15, local17);
				}
			} else if (local44 < 0) {
				local38.method8246(local15, local17);
			} else {
				local38.method8245(local15, local17);
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9208(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass234_41.method5232(arg0);
		if (super.aClass234_41.aBoolean392) {
			this.method5175(super.aClass234_41.method5230());
		}
		return local16;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass125Array1 = new Class125[arg0.method7291()];
			for (@Pc(15) int local15 = 0; local15 < this.aClass125Array1.length; local15++) {
				@Pc(21) int local21 = arg0.method7291();
				if (local21 == 0) {
					this.aClass125Array1[local15] = Static546.method7475(arg0);
				} else if (local21 == 1) {
					this.aClass125Array1[local15] = Static113.method3799(arg0);
				} else if (local21 == 2) {
					this.aClass125Array1[local15] = Static98.method1525(arg0);
				} else if (local21 == 3) {
					this.aClass125Array1[local15] = Static282.method4539(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean769 = arg0.method7291() == 1;
		}
	}
}
