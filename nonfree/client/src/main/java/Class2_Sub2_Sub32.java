import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class2_Sub2_Sub32 extends Class2_Sub2 {

	@OriginalMember(owner = "client!un", name = "J", descriptor = "I")
	private int anInt6731 = 4096;

	@OriginalMember(owner = "client!un", name = "L", descriptor = "[I")
	private final int[] anIntArray564 = new int[3];

	@OriginalMember(owner = "client!un", name = "K", descriptor = "I")
	private int anInt6732 = 4096;

	@OriginalMember(owner = "client!un", name = "N", descriptor = "I")
	private int anInt6734 = 409;

	@OriginalMember(owner = "client!un", name = "R", descriptor = "I")
	private int anInt6737 = 4096;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)[[I")
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
				@Pc(69) int local69 = local61 - this.anIntArray564[0];
				if (local69 < 0) {
					local69 = -local69;
				}
				if (local69 > this.anInt6734) {
					local45[local55] = local61;
					local49[local55] = local37[local55];
					local53[local55] = local41[local55];
				} else {
					@Pc(107) int local107 = local37[local55];
					local69 = local107 - this.anIntArray564[1];
					if (local69 < 0) {
						local69 = -local69;
					}
					if (local69 > this.anInt6734) {
						local45[local55] = local61;
						local49[local55] = local107;
						local53[local55] = local41[local55];
					} else {
						@Pc(144) int local144 = local41[local55];
						local69 = local144 - this.anIntArray564[2];
						if (local69 < 0) {
							local69 = -local69;
						}
						if (local69 > this.anInt6734) {
							local45[local55] = local61;
							local49[local55] = local107;
							local53[local55] = local144;
						} else {
							local45[local55] = this.anInt6737 * local61 >> 12;
							local49[local55] = local107 * this.anInt6732 >> 12;
							local53[local55] = this.anInt6731 * local144 >> 12;
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6734 = arg0.method5500();
		} else if (arg1 == 1) {
			this.anInt6731 = arg0.method5500();
		} else if (arg1 == 2) {
			this.anInt6732 = arg0.method5500();
		} else if (arg1 == 3) {
			this.anInt6737 = arg0.method5500();
		} else if (arg1 == 4) {
			@Pc(63) int local63 = arg0.method5485();
			this.anIntArray564[2] = local63 >> 12 & 0x0;
			this.anIntArray564[0] = (local63 & 0xFF0000) << 4;
			this.anIntArray564[1] = local63 >> 4 & 0xFF0;
		}
	}
}
