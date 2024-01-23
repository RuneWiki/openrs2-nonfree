import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class4_Sub1_Sub16 extends Class4_Sub1 {

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
	private int anInt2497 = 409;

	@OriginalMember(owner = "client!jb", name = "X", descriptor = "[I")
	private int[] anIntArray215 = new int[3];

	@OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
	private int anInt2498 = 4096;

	@OriginalMember(owner = "client!jb", name = "V", descriptor = "I")
	private int anInt2506 = 4096;

	@OriginalMember(owner = "client!jb", name = "ab", descriptor = "I")
	private int anInt2510 = 4096;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt2497 = arg1.method3085();
		} else if (arg0 == 1) {
			this.anInt2498 = arg1.method3085();
		} else if (arg0 == 2) {
			this.anInt2506 = arg1.method3085();
		} else if (arg0 == 3) {
			this.anInt2510 = arg1.method3085();
		} else if (arg0 == 4) {
			@Pc(63) int local63 = arg1.method3063();
			this.anIntArray215[0] = (local63 & 0xFF0000) << 4;
			this.anIntArray215[1] = local63 >> 4 & 0xFF0;
			this.anIntArray215[2] = local63 >> 12 & 0x0;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4542(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = this.aClass113_41.method2911(arg0);
		if (this.aClass113_41.aBoolean232) {
			@Pc(17) int[][] local17 = this.method4549(0, arg0);
			@Pc(21) int[] local21 = local17[1];
			@Pc(25) int[] local25 = local17[2];
			@Pc(29) int[] local29 = local17[0];
			@Pc(33) int[] local33 = local7[0];
			@Pc(37) int[] local37 = local7[2];
			@Pc(41) int[] local41 = local7[1];
			for (@Pc(43) int local43 = 0; local43 < Static68.anInt1753; local43++) {
				@Pc(50) int local50 = local29[local43];
				@Pc(58) int local58 = local50 - this.anIntArray215[0];
				if (local58 < 0) {
					local58 = -local58;
				}
				if (this.anInt2497 >= local58) {
					@Pc(92) int local92 = local21[local43];
					local58 = local92 - this.anIntArray215[1];
					if (local58 < 0) {
						local58 = -local58;
					}
					if (local58 <= this.anInt2497) {
						@Pc(137) int local137 = local25[local43];
						local58 = local137 - this.anIntArray215[2];
						if (local58 < 0) {
							local58 = -local58;
						}
						if (local58 > this.anInt2497) {
							local33[local43] = local50;
							local41[local43] = local92;
							local37[local43] = local137;
						} else {
							local33[local43] = local50 * this.anInt2510 >> 12;
							local41[local43] = local92 * this.anInt2506 >> 12;
							local37[local43] = this.anInt2498 * local137 >> 12;
						}
					} else {
						local33[local43] = local50;
						local41[local43] = local92;
						local37[local43] = local25[local43];
					}
				} else {
					local33[local43] = local50;
					local41[local43] = local21[local43];
					local37[local43] = local25[local43];
				}
			}
		}
		return local7;
	}
}
