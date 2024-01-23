import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class2_Sub1_Sub25 extends Class2_Sub1 {

	@OriginalMember(owner = "client!nm", name = "T", descriptor = "I")
	private int anInt3864 = 4096;

	@OriginalMember(owner = "client!nm", name = "bb", descriptor = "[I")
	private int[] anIntArray307 = new int[3];

	@OriginalMember(owner = "client!nm", name = "fb", descriptor = "I")
	private int anInt3874 = 409;

	@OriginalMember(owner = "client!nm", name = "hb", descriptor = "I")
	private int anInt3876 = 4096;

	@OriginalMember(owner = "client!nm", name = "jb", descriptor = "I")
	private int anInt3878 = 4096;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4941(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = this.aClass150_41.method3894(arg0);
		if (this.aClass150_41.aBoolean405) {
			@Pc(29) int[][] local29 = this.method4937(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[2];
			@Pc(41) int[] local41 = local29[1];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static114.anInt1359; local55++) {
				@Pc(66) int local66 = local33[local55];
				@Pc(74) int local74 = local66 - this.anIntArray307[0];
				if (local74 < 0) {
					local74 = -local74;
				}
				if (this.anInt3874 >= local74) {
					@Pc(112) int local112 = local41[local55];
					local74 = local112 - this.anIntArray307[1];
					if (local74 < 0) {
						local74 = -local74;
					}
					if (this.anInt3874 >= local74) {
						@Pc(157) int local157 = local37[local55];
						local74 = local157 - this.anIntArray307[2];
						if (local74 < 0) {
							local74 = -local74;
						}
						if (this.anInt3874 < local74) {
							local45[local55] = local66;
							local49[local55] = local112;
							local53[local55] = local157;
						} else {
							local45[local55] = local66 * this.anInt3878 >> 12;
							local49[local55] = this.anInt3864 * local112 >> 12;
							local53[local55] = local157 * this.anInt3876 >> 12;
						}
					} else {
						local45[local55] = local66;
						local49[local55] = local112;
						local53[local55] = local37[local55];
					}
				} else {
					local45[local55] = local66;
					local49[local55] = local41[local55];
					local53[local55] = local37[local55];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3874 = arg0.method4242();
		} else if (arg1 == 1) {
			this.anInt3876 = arg0.method4242();
		} else if (arg1 == 2) {
			this.anInt3864 = arg0.method4242();
		} else if (arg1 == 3) {
			this.anInt3878 = arg0.method4242();
		} else if (arg1 == 4) {
			@Pc(60) int local60 = arg0.method4245();
			this.anIntArray307[1] = local60 >> 4 & 0xFF0;
			this.anIntArray307[0] = (local60 & 0xFF0000) << 4;
			this.anIntArray307[2] = local60 >> 12 & 0x0;
		}
	}
}
