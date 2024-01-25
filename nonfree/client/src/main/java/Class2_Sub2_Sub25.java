import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class2_Sub2_Sub25 extends Class2_Sub2 {

	@OriginalMember(owner = "client!qs", name = "L", descriptor = "I")
	private int anInt5695 = 4096;

	@OriginalMember(owner = "client!qs", name = "J", descriptor = "I")
	private int anInt5693 = 0;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5693 = arg0.method5500();
		} else if (arg1 == 1) {
			this.anInt5695 = arg0.method5500();
		} else if (arg1 == 2) {
			super.aBoolean488 = arg0.method5495() == 1;
		}
	}

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "(II)[I")
	@Override
	public int[] method5849(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass82_41.method2034(arg0);
		if (super.aClass82_41.aBoolean199) {
			@Pc(26) int[] local26 = this.method5839(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static429.anInt6518; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (this.anInt5693 > local34) {
					local16[local28] = this.anInt5693;
				} else if (local34 <= this.anInt5695) {
					local16[local28] = local34;
				} else {
					local16[local28] = this.anInt5695;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5836(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass175_41.method4051(arg0);
		if (super.aClass175_41.aBoolean375) {
			@Pc(29) int[][] local29 = this.method5840(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static429.anInt6518; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local41[local55];
				if (local61 < this.anInt5693) {
					local45[local55] = this.anInt5693;
				} else if (local61 > this.anInt5695) {
					local45[local55] = this.anInt5695;
				} else {
					local45[local55] = local61;
				}
				if (this.anInt5693 > local65) {
					local49[local55] = this.anInt5693;
				} else if (local65 <= this.anInt5695) {
					local49[local55] = local65;
				} else {
					local49[local55] = this.anInt5695;
				}
				if (this.anInt5693 > local69) {
					local53[local55] = this.anInt5693;
				} else if (this.anInt5695 >= local69) {
					local53[local55] = local69;
				} else {
					local53[local55] = this.anInt5695;
				}
			}
		}
		return local19;
	}
}
