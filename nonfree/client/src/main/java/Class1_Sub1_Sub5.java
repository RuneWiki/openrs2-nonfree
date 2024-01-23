import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class1_Sub1_Sub5 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ee", name = "Q", descriptor = "I")
	private int anInt1303 = 4096;

	@OriginalMember(owner = "client!ee", name = "S", descriptor = "I")
	private int anInt1304 = 0;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1304 = arg0.method2244();
		} else if (arg1 == 1) {
			this.anInt1303 = arg0.method2244();
		} else if (arg1 == 2) {
			this.aBoolean410 = arg0.method2199() == 1;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method4714(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = this.aClass45_41.method1139(arg0);
		if (this.aClass45_41.aBoolean95) {
			@Pc(29) int[][] local29 = this.method4715(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local18[0];
			@Pc(49) int[] local49 = local18[2];
			@Pc(53) int[] local53 = local18[1];
			for (@Pc(55) int local55 = 0; local55 < Static62.anInt1350; local55++) {
				@Pc(62) int local62 = local41[local55];
				@Pc(66) int local66 = local33[local55];
				@Pc(70) int local70 = local37[local55];
				if (local66 < this.anInt1304) {
					local45[local55] = this.anInt1304;
				} else if (local66 > this.anInt1303) {
					local45[local55] = this.anInt1303;
				} else {
					local45[local55] = local66;
				}
				if (this.anInt1304 > local70) {
					local53[local55] = this.anInt1304;
				} else if (this.anInt1303 < local70) {
					local53[local55] = this.anInt1303;
				} else {
					local53[local55] = local70;
				}
				if (this.anInt1304 > local62) {
					local49[local55] = this.anInt1304;
				} else if (this.anInt1303 < local62) {
					local49[local55] = this.anInt1303;
				} else {
					local49[local55] = local62;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4717(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = this.aClass194_41.method4738(arg0);
		if (this.aClass194_41.aBoolean411) {
			@Pc(28) int[] local28 = this.method4716(0, arg0);
			for (@Pc(30) int local30 = 0; local30 < Static62.anInt1350; local30++) {
				@Pc(41) int local41 = local28[local30];
				if (this.anInt1304 > local41) {
					local11[local30] = this.anInt1304;
				} else if (this.anInt1303 < local41) {
					local11[local30] = this.anInt1303;
				} else {
					local11[local30] = local41;
				}
			}
		}
		return local11;
	}
}
