import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class2_Sub10_Sub16 extends Class2_Sub10 {

	@OriginalMember(owner = "client!jc", name = "F", descriptor = "[I")
	private final int[] anIntArray347 = new int[3];

	@OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
	private int anInt5047 = 4096;

	@OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
	private int anInt5048 = 4096;

	@OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
	private int anInt5052 = 409;

	@OriginalMember(owner = "client!jc", name = "J", descriptor = "I")
	private int anInt5051 = 4096;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8411(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass250_41.method6392(arg0);
		if (super.aClass250_41.aBoolean573) {
			@Pc(29) int[][] local29 = this.method8408(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static93.anInt1862; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(69) int local69 = local61 - this.anIntArray347[0];
				if (local69 < 0) {
					local69 = -local69;
				}
				if (this.anInt5052 < local69) {
					local45[local55] = local61;
					local49[local55] = local37[local55];
					local53[local55] = local41[local55];
				} else {
					@Pc(103) int local103 = local37[local55];
					local69 = local103 - this.anIntArray347[1];
					if (local69 < 0) {
						local69 = -local69;
					}
					if (this.anInt5052 < local69) {
						local45[local55] = local61;
						local49[local55] = local103;
						local53[local55] = local41[local55];
					} else {
						@Pc(147) int local147 = local41[local55];
						local69 = local147 - this.anIntArray347[2];
						if (local69 < 0) {
							local69 = -local69;
						}
						if (this.anInt5052 < local69) {
							local45[local55] = local61;
							local49[local55] = local103;
							local53[local55] = local147;
						} else {
							local45[local55] = local61 * this.anInt5051 >> 12;
							local49[local55] = this.anInt5047 * local103 >> 12;
							local53[local55] = local147 * this.anInt5048 >> 12;
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5052 = arg0.method6884();
		} else if (arg1 == 1) {
			this.anInt5048 = arg0.method6884();
		} else if (arg1 == 2) {
			this.anInt5047 = arg0.method6884();
		} else if (arg1 == 3) {
			this.anInt5051 = arg0.method6884();
		} else if (arg1 == 4) {
			@Pc(68) int local68 = arg0.method6870();
			this.anIntArray347[0] = (local68 & 0xFF0000) << 4;
			this.anIntArray347[1] = local68 >> 4 & 0xFF0;
			this.anIntArray347[2] = local68 >> 12 & 0x0;
		}
	}
}
