import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class1_Sub1_Sub21 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ll", name = "C", descriptor = "I")
	private int anInt5233 = 4096;

	@OriginalMember(owner = "client!ll", name = "D", descriptor = "I")
	private int anInt5234 = 409;

	@OriginalMember(owner = "client!ll", name = "J", descriptor = "[I")
	private final int[] anIntArray401 = new int[3];

	@OriginalMember(owner = "client!ll", name = "E", descriptor = "I")
	private int anInt5235 = 4096;

	@OriginalMember(owner = "client!ll", name = "L", descriptor = "I")
	private int anInt5239 = 4096;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7705(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass46_41.method856(arg0);
		if (super.aClass46_41.aBoolean76) {
			@Pc(29) int[][] local29 = this.method7700(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local13[0];
			@Pc(49) int[] local49 = local13[1];
			@Pc(53) int[] local53 = local13[2];
			for (@Pc(55) int local55 = 0; local55 < Static279.anInt4906; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(69) int local69 = local61 - this.anIntArray401[0];
				if (local69 < 0) {
					local69 = -local69;
				}
				if (this.anInt5234 < local69) {
					local45[local55] = local61;
					local49[local55] = local37[local55];
					local53[local55] = local41[local55];
				} else {
					@Pc(100) int local100 = local37[local55];
					local69 = local100 - this.anIntArray401[1];
					if (local69 < 0) {
						local69 = -local69;
					}
					if (this.anInt5234 < local69) {
						local45[local55] = local61;
						local49[local55] = local100;
						local53[local55] = local41[local55];
					} else {
						@Pc(136) int local136 = local41[local55];
						local69 = local136 - this.anIntArray401[2];
						if (local69 < 0) {
							local69 = -local69;
						}
						if (local69 > this.anInt5234) {
							local45[local55] = local61;
							local49[local55] = local100;
							local53[local55] = local136;
						} else {
							local45[local55] = this.anInt5233 * local61 >> 12;
							local49[local55] = this.anInt5239 * local100 >> 12;
							local53[local55] = local136 * this.anInt5235 >> 12;
						}
					}
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5234 = arg0.method5771();
		} else if (arg1 == 1) {
			this.anInt5235 = arg0.method5771();
		} else if (arg1 == 2) {
			this.anInt5239 = arg0.method5771();
		} else if (arg1 == 3) {
			this.anInt5233 = arg0.method5771();
		} else if (arg1 == 4) {
			@Pc(59) int local59 = arg0.method5797();
			this.anIntArray401[2] = local59 >> 12 & 0x0;
			this.anIntArray401[1] = local59 >> 4 & 0xFF0;
			this.anIntArray401[0] = (local59 & 0xFF0000) << 4;
		}
	}
}
