import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class1_Sub1_Sub26 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ng", name = "M", descriptor = "I")
	private int anInt4082 = 4096;

	@OriginalMember(owner = "client!ng", name = "O", descriptor = "I")
	private int anInt4084 = 4096;

	@OriginalMember(owner = "client!ng", name = "T", descriptor = "I")
	private int anInt4088 = 409;

	@OriginalMember(owner = "client!ng", name = "L", descriptor = "I")
	private int anInt4081 = 4096;

	@OriginalMember(owner = "client!ng", name = "P", descriptor = "[I")
	private int[] anIntArray359 = new int[3];

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub26() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method4714(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = this.aClass45_41.method1139(arg0);
		if (this.aClass45_41.aBoolean95) {
			@Pc(29) int[][] local29 = this.method4715(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local18[0];
			@Pc(49) int[] local49 = local18[1];
			@Pc(53) int[] local53 = local18[2];
			for (@Pc(55) int local55 = 0; local55 < Static62.anInt1350; local55++) {
				@Pc(66) int local66 = local33[local55];
				@Pc(74) int local74 = local66 - this.anIntArray359[0];
				if (local74 < 0) {
					local74 = -local74;
				}
				if (local74 > this.anInt4088) {
					local45[local55] = local66;
					local49[local55] = local37[local55];
					local53[local55] = local41[local55];
				} else {
					@Pc(108) int local108 = local37[local55];
					local74 = local108 - this.anIntArray359[1];
					if (local74 < 0) {
						local74 = -local74;
					}
					if (this.anInt4088 < local74) {
						local45[local55] = local66;
						local49[local55] = local108;
						local53[local55] = local41[local55];
					} else {
						@Pc(150) int local150 = local41[local55];
						local74 = local150 - this.anIntArray359[2];
						if (local74 < 0) {
							local74 = -local74;
						}
						if (local74 > this.anInt4088) {
							local45[local55] = local66;
							local49[local55] = local108;
							local53[local55] = local150;
						} else {
							local45[local55] = this.anInt4081 * local66 >> 12;
							local49[local55] = local108 * this.anInt4082 >> 12;
							local53[local55] = this.anInt4084 * local150 >> 12;
						}
					}
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4088 = arg0.method2244();
		} else if (arg1 == 1) {
			this.anInt4084 = arg0.method2244();
		} else if (arg1 == 2) {
			this.anInt4082 = arg0.method2244();
		} else if (arg1 == 3) {
			this.anInt4081 = arg0.method2244();
		} else if (arg1 == 4) {
			@Pc(57) int local57 = arg0.method2215();
			this.anIntArray359[1] = local57 >> 4 & 0xFF0;
			this.anIntArray359[2] = local57 >> 12 & 0x0;
			this.anIntArray359[0] = (local57 & 0xFF0000) << 4;
		}
	}
}
