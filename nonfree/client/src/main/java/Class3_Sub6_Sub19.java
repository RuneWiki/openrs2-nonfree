import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class3_Sub6_Sub19 extends Class3_Sub6 {

	@OriginalMember(owner = "client!kr", name = "P", descriptor = "I")
	private int anInt5435 = 4096;

	@OriginalMember(owner = "client!kr", name = "O", descriptor = "I")
	private int anInt5434 = 4096;

	@OriginalMember(owner = "client!kr", name = "R", descriptor = "[I")
	private final int[] anIntArray259 = new int[3];

	@OriginalMember(owner = "client!kr", name = "Q", descriptor = "I")
	private int anInt5436 = 4096;

	@OriginalMember(owner = "client!kr", name = "N", descriptor = "I")
	private int anInt5433 = 409;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8006(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass339_41.method7670(arg0);
		if (super.aClass339_41.aBoolean647) {
			@Pc(29) int[][] local29 = this.method8005(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static481.anInt8358; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(69) int local69 = local61 - this.anIntArray259[0];
				if (local69 < 0) {
					local69 = -local69;
				}
				if (local69 > this.anInt5433) {
					local45[local55] = local61;
					local49[local55] = local37[local55];
					local53[local55] = local41[local55];
				} else {
					@Pc(104) int local104 = local37[local55];
					local69 = local104 - this.anIntArray259[1];
					if (local69 < 0) {
						local69 = -local69;
					}
					if (this.anInt5433 < local69) {
						local45[local55] = local61;
						local49[local55] = local104;
						local53[local55] = local41[local55];
					} else {
						@Pc(148) int local148 = local41[local55];
						local69 = local148 - this.anIntArray259[2];
						if (local69 < 0) {
							local69 = -local69;
						}
						if (this.anInt5433 < local69) {
							local45[local55] = local61;
							local49[local55] = local104;
							local53[local55] = local148;
						} else {
							local45[local55] = local61 * this.anInt5434 >> 12;
							local49[local55] = local104 * this.anInt5435 >> 12;
							local53[local55] = this.anInt5436 * local148 >> 12;
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5433 = arg0.method6811();
		} else if (arg1 == 1) {
			this.anInt5436 = arg0.method6811();
		} else if (arg1 == 2) {
			this.anInt5435 = arg0.method6811();
		} else if (arg1 == 3) {
			this.anInt5434 = arg0.method6811();
		} else if (arg1 == 4) {
			@Pc(55) int local55 = arg0.method6830();
			this.anIntArray259[2] = local55 >> 12 & 0x0;
			this.anIntArray259[1] = local55 >> 4 & 0xFF0;
			this.anIntArray259[0] = (local55 & 0xFF0000) << 4;
		}
	}
}
