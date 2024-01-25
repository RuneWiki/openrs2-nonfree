import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class5_Sub1_Sub16 extends Class5_Sub1 {

	@OriginalMember(owner = "client!iu", name = "G", descriptor = "I")
	private int anInt3142 = 0;

	@OriginalMember(owner = "client!iu", name = "K", descriptor = "I")
	private int anInt3146 = 4096;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5763(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass154_41.method3176(arg0);
		if (super.aClass154_41.aBoolean254) {
			@Pc(29) int[][] local29 = this.method5764(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static148.anInt2666; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local41[local55];
				if (local61 < this.anInt3142) {
					local45[local55] = this.anInt3142;
				} else if (local61 <= this.anInt3146) {
					local45[local55] = local61;
				} else {
					local45[local55] = this.anInt3146;
				}
				if (this.anInt3142 > local65) {
					local49[local55] = this.anInt3142;
				} else if (local65 <= this.anInt3146) {
					local49[local55] = local65;
				} else {
					local49[local55] = this.anInt3146;
				}
				if (this.anInt3142 > local69) {
					local53[local55] = this.anInt3142;
				} else if (local69 <= this.anInt3146) {
					local53[local55] = local69;
				} else {
					local53[local55] = this.anInt3146;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt3142 = arg1.method5598();
		} else if (arg0 == 1) {
			this.anInt3146 = arg1.method5598();
		} else if (arg0 == 2) {
			super.aBoolean486 = arg1.method5539() == 1;
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5770(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass239_41.method5400(arg0);
		if (super.aClass239_41.aBoolean460) {
			@Pc(26) int[] local26 = this.method5772(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static148.anInt2666; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (this.anInt3142 > local34) {
					local16[local28] = this.anInt3142;
				} else if (this.anInt3146 < local34) {
					local16[local28] = this.anInt3146;
				} else {
					local16[local28] = local34;
				}
			}
		}
		return local16;
	}
}
