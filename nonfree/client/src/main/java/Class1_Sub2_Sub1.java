import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class1_Sub2_Sub1 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
	private int anInt146 = 409;

	@OriginalMember(owner = "client!ad", name = "J", descriptor = "I")
	private int anInt144 = 4096;

	@OriginalMember(owner = "client!ad", name = "P", descriptor = "I")
	private int anInt148 = 4096;

	@OriginalMember(owner = "client!ad", name = "K", descriptor = "[I")
	private final int[] anIntArray6 = new int[3];

	@OriginalMember(owner = "client!ad", name = "H", descriptor = "I")
	private int anInt142 = 4096;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt146 = arg0.method4498();
		} else if (arg1 == 1) {
			this.anInt142 = arg0.method4498();
		} else if (arg1 == 2) {
			this.anInt144 = arg0.method4498();
		} else if (arg1 == 3) {
			this.anInt148 = arg0.method4498();
		} else if (arg1 == 4) {
			@Pc(62) int local62 = arg0.method4496();
			this.anIntArray6[1] = local62 >> 4 & 0xFF0;
			this.anIntArray6[2] = local62 >> 12 & 0x0;
			this.anIntArray6[0] = (local62 & 0xFF0000) << 4;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5865(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass190_41.method4096(arg0);
		if (super.aClass190_41.aBoolean401) {
			@Pc(21) int[][] local21 = this.method5867(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static410.anInt7198; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(61) int local61 = local53 - this.anIntArray6[0];
				if (local61 < 0) {
					local61 = -local61;
				}
				if (this.anInt146 < local61) {
					local37[local47] = local53;
					local41[local47] = local29[local47];
					local45[local47] = local33[local47];
				} else {
					@Pc(96) int local96 = local29[local47];
					local61 = local96 - this.anIntArray6[1];
					if (local61 < 0) {
						local61 = -local61;
					}
					if (local61 > this.anInt146) {
						local37[local47] = local53;
						local41[local47] = local96;
						local45[local47] = local33[local47];
					} else {
						@Pc(135) int local135 = local33[local47];
						local61 = local135 - this.anIntArray6[2];
						if (local61 < 0) {
							local61 = -local61;
						}
						if (local61 > this.anInt146) {
							local37[local47] = local53;
							local41[local47] = local96;
							local45[local47] = local135;
						} else {
							local37[local47] = this.anInt148 * local53 >> 12;
							local41[local47] = local96 * this.anInt144 >> 12;
							local45[local47] = local135 * this.anInt142 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
