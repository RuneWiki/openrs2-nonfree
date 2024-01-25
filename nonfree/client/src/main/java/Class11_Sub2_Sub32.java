import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class11_Sub2_Sub32 extends Class11_Sub2 {

	@OriginalMember(owner = "client!ra", name = "D", descriptor = "I")
	private int anInt5383 = 409;

	@OriginalMember(owner = "client!ra", name = "F", descriptor = "I")
	private int anInt5385 = 4096;

	@OriginalMember(owner = "client!ra", name = "E", descriptor = "I")
	private int anInt5384 = 4096;

	@OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
	private int anInt5390 = 4096;

	@OriginalMember(owner = "client!ra", name = "M", descriptor = "[I")
	private final int[] anIntArray407 = new int[3];

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5383 = arg0.method5187();
		} else if (arg1 == 1) {
			this.anInt5390 = arg0.method5187();
		} else if (arg1 == 2) {
			this.anInt5384 = arg0.method5187();
		} else if (arg1 == 3) {
			this.anInt5385 = arg0.method5187();
		} else if (arg1 == 4) {
			@Pc(57) int local57 = arg0.method5221();
			this.anIntArray407[0] = (local57 & 0xFF0000) << 4;
			this.anIntArray407[1] = local57 >> 4 & 0xFF0;
			this.anIntArray407[2] = local57 >> 12 & 0x0;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5709(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass63_41.method1118(arg0);
		if (super.aClass63_41.aBoolean85) {
			@Pc(29) int[][] local29 = this.method5715(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static339.anInt6549; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(69) int local69 = local61 - this.anIntArray407[0];
				if (local69 < 0) {
					local69 = -local69;
				}
				if (local69 > this.anInt5383) {
					local45[local55] = local61;
					local49[local55] = local37[local55];
					local53[local55] = local41[local55];
				} else {
					@Pc(100) int local100 = local37[local55];
					local69 = local100 - this.anIntArray407[1];
					if (local69 < 0) {
						local69 = -local69;
					}
					if (local69 > this.anInt5383) {
						local45[local55] = local61;
						local49[local55] = local100;
						local53[local55] = local41[local55];
					} else {
						@Pc(141) int local141 = local41[local55];
						local69 = local141 - this.anIntArray407[2];
						if (local69 < 0) {
							local69 = -local69;
						}
						if (this.anInt5383 < local69) {
							local45[local55] = local61;
							local49[local55] = local100;
							local53[local55] = local141;
						} else {
							local45[local55] = local61 * this.anInt5385 >> 12;
							local49[local55] = local100 * this.anInt5384 >> 12;
							local53[local55] = this.anInt5390 * local141 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
