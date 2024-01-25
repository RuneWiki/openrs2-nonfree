import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class1_Sub3_Sub23 extends Class1_Sub3 {

	@OriginalMember(owner = "client!mn", name = "K", descriptor = "[I")
	private final int[] anIntArray367 = new int[3];

	@OriginalMember(owner = "client!mn", name = "N", descriptor = "I")
	private int anInt4553 = 4096;

	@OriginalMember(owner = "client!mn", name = "R", descriptor = "I")
	private int anInt4556 = 409;

	@OriginalMember(owner = "client!mn", name = "M", descriptor = "I")
	private int anInt4552 = 4096;

	@OriginalMember(owner = "client!mn", name = "I", descriptor = "I")
	private int anInt4551 = 4096;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6083(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass20_41.method474(arg0);
		if (super.aClass20_41.aBoolean14) {
			@Pc(29) int[][] local29 = this.method6072(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static347.anInt5974; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(68) int local68 = local61 - this.anIntArray367[0];
				if (local68 < 0) {
					local68 = -local68;
				}
				if (this.anInt4556 < local68) {
					local45[local55] = local61;
					local49[local55] = local37[local55];
					local53[local55] = local41[local55];
				} else {
					@Pc(103) int local103 = local37[local55];
					local68 = local103 - this.anIntArray367[1];
					if (local68 < 0) {
						local68 = -local68;
					}
					if (this.anInt4556 < local68) {
						local45[local55] = local61;
						local49[local55] = local103;
						local53[local55] = local41[local55];
					} else {
						@Pc(144) int local144 = local41[local55];
						local68 = local144 - this.anIntArray367[2];
						if (local68 < 0) {
							local68 = -local68;
						}
						if (local68 > this.anInt4556) {
							local45[local55] = local61;
							local49[local55] = local103;
							local53[local55] = local144;
						} else {
							local45[local55] = local61 * this.anInt4552 >> 12;
							local49[local55] = local103 * this.anInt4551 >> 12;
							local53[local55] = local144 * this.anInt4553 >> 12;
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4556 = arg0.method4093();
		} else if (arg1 == 1) {
			this.anInt4553 = arg0.method4093();
		} else if (arg1 == 2) {
			this.anInt4551 = arg0.method4093();
		} else if (arg1 == 3) {
			this.anInt4552 = arg0.method4093();
		} else if (arg1 == 4) {
			@Pc(59) int local59 = arg0.method4142();
			this.anIntArray367[0] = (local59 & 0xFF0000) << 4;
			this.anIntArray367[2] = local59 >> 12 & 0x0;
			this.anIntArray367[1] = local59 >> 4 & 0xFF0;
		}
	}
}
