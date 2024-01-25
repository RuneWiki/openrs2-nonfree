import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class5_Sub2_Sub33 extends Class5_Sub2 {

	@OriginalMember(owner = "client!te", name = "N", descriptor = "I")
	private int anInt5828 = 0;

	@OriginalMember(owner = "client!te", name = "R", descriptor = "I")
	private int anInt5830 = 4096;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5828 = arg0.method1845();
		} else if (arg1 == 1) {
			this.anInt5830 = arg0.method1845();
		} else if (arg1 == 2) {
			super.aBoolean488 = arg0.method1832() == 1;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5806(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass154_41.method4027(arg0);
		if (super.aClass154_41.aBoolean336) {
			@Pc(29) int[][] local29 = this.method5818(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static15.anInt493; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local41[local55];
				if (local61 < this.anInt5828) {
					local45[local55] = this.anInt5828;
				} else if (local61 > this.anInt5830) {
					local45[local55] = this.anInt5830;
				} else {
					local45[local55] = local61;
				}
				if (local65 < this.anInt5828) {
					local49[local55] = this.anInt5828;
				} else if (this.anInt5830 < local65) {
					local49[local55] = this.anInt5830;
				} else {
					local49[local55] = local65;
				}
				if (this.anInt5828 > local69) {
					local53[local55] = this.anInt5828;
				} else if (local69 <= this.anInt5830) {
					local53[local55] = local69;
				} else {
					local53[local55] = this.anInt5830;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5821(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass52_41.method1260(arg0);
		if (super.aClass52_41.aBoolean95) {
			@Pc(28) int[] local28 = this.method5808(0, arg0);
			for (@Pc(30) int local30 = 0; local30 < Static15.anInt493; local30++) {
				@Pc(36) int local36 = local28[local30];
				if (local36 < this.anInt5828) {
					local11[local30] = this.anInt5828;
				} else if (this.anInt5830 >= local36) {
					local11[local30] = local36;
				} else {
					local11[local30] = this.anInt5830;
				}
			}
		}
		return local11;
	}
}
