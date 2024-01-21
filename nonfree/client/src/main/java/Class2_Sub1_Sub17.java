import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class2_Sub1_Sub17 extends Class2_Sub1 {

	@OriginalMember(owner = "client!kh", name = "cb", descriptor = "I")
	private int anInt2240;

	@OriginalMember(owner = "client!kh", name = "jb", descriptor = "I")
	private int anInt2244;

	@OriginalMember(owner = "client!kh", name = "eb", descriptor = "I")
	private int anInt2241;

	@OriginalMember(owner = "client!kh", name = "pb", descriptor = "I")
	private int anInt2247;

	@OriginalMember(owner = "client!kh", name = "mb", descriptor = "[I")
	private int[] anIntArray372;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method2982(@OriginalArg(1) int arg0) {
		@Pc(14) int[][] local14 = super.aClass11_39.method511(arg0);
		if (super.aClass11_39.aBoolean37) {
			@Pc(28) int[][] local28 = this.method2991(arg0, 0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local14[0];
			@Pc(48) int[] local48 = local14[1];
			@Pc(52) int[] local52 = local14[2];
			for (@Pc(54) int local54 = 0; local54 < Static129.anInt3118; local54++) {
				@Pc(60) int local60 = local32[local54];
				@Pc(68) int local68 = local60 - this.anIntArray372[0];
				if (local68 < 0) {
					local68 = -local68;
				}
				if (local68 > this.anInt2247) {
					local44[local54] = local60;
					local48[local54] = local36[local54];
					local52[local54] = local40[local54];
				} else {
					@Pc(106) int local106 = local36[local54];
					local68 = local106 - this.anIntArray372[1];
					if (local68 < 0) {
						local68 = -local68;
					}
					if (local68 > this.anInt2247) {
						local44[local54] = local60;
						local48[local54] = local106;
						local52[local54] = local40[local54];
					} else {
						@Pc(145) int local145 = local40[local54];
						local68 = local145 - this.anIntArray372[2];
						if (local68 < 0) {
							local68 = -local68;
						}
						if (local68 > this.anInt2247) {
							local44[local54] = local60;
							local48[local54] = local106;
							local52[local54] = local145;
						} else {
							local44[local54] = this.anInt2244 * local60 >> 12;
							local48[local54] = local106 * this.anInt2240 >> 12;
							local52[local54] = this.anInt2241 * local145 >> 12;
						}
					}
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2247 = arg0.method2353();
		} else if (arg1 == 1) {
			this.anInt2241 = arg0.method2353();
		} else if (arg1 == 2) {
			this.anInt2240 = arg0.method2353();
		} else if (arg1 == 3) {
			this.anInt2244 = arg0.method2353();
		} else if (arg1 == 4) {
			@Pc(64) int local64 = arg0.method2341();
			this.anIntArray372[0] = (local64 & 0xFF0000) << 4;
			this.anIntArray372[1] = local64 >> 4 & 0xFF0;
			this.anIntArray372[2] = local64 >> 12 & 0x0;
		}
	}
}
