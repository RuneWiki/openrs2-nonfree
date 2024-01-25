import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class3_Sub1_Sub27 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ov", name = "J", descriptor = "I")
	private int anInt7484 = 4096;

	@OriginalMember(owner = "client!ov", name = "L", descriptor = "I")
	private int anInt7485 = 4096;

	@OriginalMember(owner = "client!ov", name = "P", descriptor = "[I")
	private final int[] anIntArray479 = new int[3];

	@OriginalMember(owner = "client!ov", name = "U", descriptor = "I")
	private int anInt7491 = 4096;

	@OriginalMember(owner = "client!ov", name = "N", descriptor = "I")
	private int anInt7487 = 409;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt7487 = arg1.method6535();
		} else if (arg0 == 1) {
			this.anInt7491 = arg1.method6535();
		} else if (arg0 == 2) {
			this.anInt7484 = arg1.method6535();
		} else if (arg0 == 3) {
			this.anInt7485 = arg1.method6535();
		} else if (arg0 == 4) {
			@Pc(59) int local59 = arg1.method6506();
			this.anIntArray479[2] = local59 >> 12 & 0x0;
			this.anIntArray479[1] = local59 >> 4 & 0xFF0;
			this.anIntArray479[0] = (local59 & 0xFF0000) << 4;
		}
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method8371(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass220_41.method5791(arg0);
		if (super.aClass220_41.aBoolean587) {
			@Pc(29) int[][] local29 = this.method8360(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static131.anInt2935; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(69) int local69 = local61 - this.anIntArray479[0];
				if (local69 < 0) {
					local69 = -local69;
				}
				if (local69 > this.anInt7487) {
					local45[local55] = local61;
					local49[local55] = local37[local55];
					local53[local55] = local41[local55];
				} else {
					@Pc(104) int local104 = local37[local55];
					local69 = local104 - this.anIntArray479[1];
					if (local69 < 0) {
						local69 = -local69;
					}
					if (local69 > this.anInt7487) {
						local45[local55] = local61;
						local49[local55] = local104;
						local53[local55] = local41[local55];
					} else {
						@Pc(144) int local144 = local41[local55];
						local69 = local144 - this.anIntArray479[2];
						if (local69 < 0) {
							local69 = -local69;
						}
						if (local69 > this.anInt7487) {
							local45[local55] = local61;
							local49[local55] = local104;
							local53[local55] = local144;
						} else {
							local45[local55] = this.anInt7485 * local61 >> 12;
							local49[local55] = local104 * this.anInt7484 >> 12;
							local53[local55] = this.anInt7491 * local144 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
