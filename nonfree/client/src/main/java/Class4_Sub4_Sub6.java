import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class4_Sub4_Sub6 extends Class4_Sub4 {

	@OriginalMember(owner = "client!en", name = "G", descriptor = "I")
	private int anInt2943 = 409;

	@OriginalMember(owner = "client!en", name = "N", descriptor = "I")
	private int anInt2947 = 4096;

	@OriginalMember(owner = "client!en", name = "Q", descriptor = "[I")
	private final int[] anIntArray264 = new int[3];

	@OriginalMember(owner = "client!en", name = "I", descriptor = "I")
	private int anInt2945 = 4096;

	@OriginalMember(owner = "client!en", name = "S", descriptor = "I")
	private int anInt2951 = 4096;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub6() {
		super(1, false);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7887(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass201_41.method4419(arg0);
		if (super.aClass201_41.aBoolean392) {
			@Pc(29) int[][] local29 = this.method7892(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static560.anInt9394; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(69) int local69 = local61 - this.anIntArray264[0];
				if (local69 < 0) {
					local69 = -local69;
				}
				if (this.anInt2943 < local69) {
					local45[local55] = local61;
					local49[local55] = local37[local55];
					local53[local55] = local41[local55];
				} else {
					@Pc(103) int local103 = local37[local55];
					local69 = local103 - this.anIntArray264[1];
					if (local69 < 0) {
						local69 = -local69;
					}
					if (this.anInt2943 < local69) {
						local45[local55] = local61;
						local49[local55] = local103;
						local53[local55] = local41[local55];
					} else {
						@Pc(147) int local147 = local41[local55];
						local69 = local147 - this.anIntArray264[2];
						if (local69 < 0) {
							local69 = -local69;
						}
						if (local69 > this.anInt2943) {
							local45[local55] = local61;
							local49[local55] = local103;
							local53[local55] = local147;
						} else {
							local45[local55] = this.anInt2947 * local61 >> 12;
							local49[local55] = this.anInt2951 * local103 >> 12;
							local53[local55] = this.anInt2945 * local147 >> 12;
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt2943 = arg1.method5982();
		} else if (arg0 == 1) {
			this.anInt2945 = arg1.method5982();
		} else if (arg0 == 2) {
			this.anInt2951 = arg1.method5982();
		} else if (arg0 == 3) {
			this.anInt2947 = arg1.method5982();
		} else if (arg0 == 4) {
			@Pc(61) int local61 = arg1.method6023();
			this.anIntArray264[0] = (local61 & 0xFF0000) << 4;
			this.anIntArray264[1] = local61 >> 4 & 0xFF0;
			this.anIntArray264[2] = local61 >> 12 & 0x0;
		}
	}
}
