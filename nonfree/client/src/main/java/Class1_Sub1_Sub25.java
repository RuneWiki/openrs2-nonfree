import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class1_Sub1_Sub25 extends Class1_Sub1 {

	@OriginalMember(owner = "client!nn", name = "E", descriptor = "I")
	private int anInt5959 = 0;

	@OriginalMember(owner = "client!nn", name = "D", descriptor = "I")
	private int anInt5958 = 4096;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5959 = arg0.method5771();
		} else if (arg1 == 1) {
			this.anInt5958 = arg0.method5771();
		} else if (arg1 == 2) {
			super.aBoolean737 = arg0.method5750() == 1;
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7705(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass46_41.method856(arg0);
		if (super.aClass46_41.aBoolean76) {
			@Pc(29) int[][] local29 = this.method7700(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static279.anInt4906; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local41[local55];
				if (this.anInt5959 > local61) {
					local45[local55] = this.anInt5959;
				} else if (this.anInt5958 >= local61) {
					local45[local55] = local61;
				} else {
					local45[local55] = this.anInt5958;
				}
				if (this.anInt5959 > local65) {
					local49[local55] = this.anInt5959;
				} else if (local65 <= this.anInt5958) {
					local49[local55] = local65;
				} else {
					local49[local55] = this.anInt5958;
				}
				if (this.anInt5959 > local69) {
					local53[local55] = this.anInt5959;
				} else if (this.anInt5958 >= local69) {
					local53[local55] = local69;
				} else {
					local53[local55] = this.anInt5958;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7706(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass223_41.method4438(arg0);
		if (super.aClass223_41.aBoolean442) {
			@Pc(29) int[] local29 = this.method7709(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static279.anInt4906; local31++) {
				@Pc(37) int local37 = local29[local31];
				if (local37 < this.anInt5959) {
					local19[local31] = this.anInt5959;
				} else if (this.anInt5958 < local37) {
					local19[local31] = this.anInt5958;
				} else {
					local19[local31] = local37;
				}
			}
		}
		return local19;
	}
}
