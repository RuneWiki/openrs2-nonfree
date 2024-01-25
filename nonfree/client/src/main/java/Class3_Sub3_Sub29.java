import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class3_Sub3_Sub29 extends Class3_Sub3 {

	@OriginalMember(owner = "client!qh", name = "K", descriptor = "I")
	private int anInt5032 = 4096;

	@OriginalMember(owner = "client!qh", name = "N", descriptor = "I")
	private int anInt5035 = 0;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method5734(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass84_41.method2091(arg0);
		if (super.aClass84_41.aBoolean144) {
			@Pc(21) int[][] local21 = this.method5729(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static131.anInt2755; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local29[local47];
				@Pc(61) int local61 = local33[local47];
				if (this.anInt5035 > local53) {
					local37[local47] = this.anInt5035;
				} else if (local53 > this.anInt5032) {
					local37[local47] = this.anInt5032;
				} else {
					local37[local47] = local53;
				}
				if (local57 < this.anInt5035) {
					local41[local47] = this.anInt5035;
				} else if (this.anInt5032 >= local57) {
					local41[local47] = local57;
				} else {
					local41[local47] = this.anInt5032;
				}
				if (this.anInt5035 > local61) {
					local45[local47] = this.anInt5035;
				} else if (local61 > this.anInt5032) {
					local45[local47] = this.anInt5032;
				} else {
					local45[local47] = local61;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5035 = arg0.method3649();
		} else if (arg1 == 1) {
			this.anInt5032 = arg0.method3649();
		} else if (arg1 == 2) {
			super.aBoolean454 = arg0.method3643() == 1;
		}
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5727(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass217_41.method5701(arg0);
		if (super.aClass217_41.aBoolean451) {
			@Pc(26) int[] local26 = this.method5733(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static131.anInt2755; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (this.anInt5035 > local34) {
					local16[local28] = this.anInt5035;
				} else if (this.anInt5032 < local34) {
					local16[local28] = this.anInt5032;
				} else {
					local16[local28] = local34;
				}
			}
		}
		return local16;
	}
}
