import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bca")
public final class Class3_Sub6_Sub3 extends Class3_Sub6 {

	@OriginalMember(owner = "client!bca", name = "E", descriptor = "I")
	private int anInt635 = 4096;

	@OriginalMember(owner = "client!bca", name = "C", descriptor = "I")
	private int anInt633 = 0;

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method7776(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass155_41.method3666(arg0);
		if (super.aClass155_41.aBoolean306) {
			@Pc(29) int[][] local29 = this.method7773(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static521.anInt8383; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local41[local55];
				if (local61 < this.anInt633) {
					local45[local55] = this.anInt633;
				} else if (this.anInt635 >= local61) {
					local45[local55] = local61;
				} else {
					local45[local55] = this.anInt635;
				}
				if (local65 < this.anInt633) {
					local49[local55] = this.anInt633;
				} else if (local65 > this.anInt635) {
					local49[local55] = this.anInt635;
				} else {
					local49[local55] = local65;
				}
				if (local69 < this.anInt633) {
					local53[local55] = this.anInt633;
				} else if (this.anInt635 < local69) {
					local53[local55] = this.anInt635;
				} else {
					local53[local55] = local69;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt633 = arg0.method5198();
		} else if (arg1 == 1) {
			this.anInt635 = arg0.method5198();
		} else if (arg1 == 2) {
			super.aBoolean729 = arg0.method5175() == 1;
		}
	}

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7775(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass213_41.method4803(arg0);
		if (super.aClass213_41.aBoolean407) {
			@Pc(29) int[] local29 = this.method7769(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static521.anInt8383; local31++) {
				@Pc(37) int local37 = local29[local31];
				if (this.anInt633 > local37) {
					local19[local31] = this.anInt633;
				} else if (this.anInt635 >= local37) {
					local19[local31] = local37;
				} else {
					local19[local31] = this.anInt635;
				}
			}
		}
		return local19;
	}
}
