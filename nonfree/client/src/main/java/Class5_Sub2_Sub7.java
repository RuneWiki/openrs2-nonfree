import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class5_Sub2_Sub7 extends Class5_Sub2 {

	@OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
	private int anInt1837 = 4096;

	@OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
	private int anInt1841 = 4096;

	@OriginalMember(owner = "client!dd", name = "K", descriptor = "[I")
	private final int[] anIntArray117 = new int[3];

	@OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
	private int anInt1836 = 4096;

	@OriginalMember(owner = "client!dd", name = "N", descriptor = "I")
	private int anInt1843 = 409;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub7() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1843 = arg0.method5968();
		} else if (arg1 == 1) {
			this.anInt1836 = arg0.method5968();
		} else if (arg1 == 2) {
			this.anInt1841 = arg0.method5968();
		} else if (arg1 == 3) {
			this.anInt1837 = arg0.method5968();
		} else if (arg1 == 4) {
			@Pc(62) int local62 = arg0.method5931();
			this.anIntArray117[0] = (local62 & 0xFF0000) << 4;
			this.anIntArray117[1] = local62 >> 4 & 0xFF0;
			this.anIntArray117[2] = local62 >> 12 & 0x0;
		}
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method9037(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass160_41.method3854(arg0);
		if (super.aClass160_41.aBoolean310) {
			@Pc(27) int[][] local27 = this.method9033(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			for (@Pc(53) int local53 = 0; local53 < Static597.anInt10025; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(67) int local67 = local59 - this.anIntArray117[0];
				if (local67 < 0) {
					local67 = -local67;
				}
				if (this.anInt1843 < local67) {
					local43[local53] = local59;
					local47[local53] = local35[local53];
					local51[local53] = local39[local53];
				} else {
					@Pc(98) int local98 = local35[local53];
					local67 = local98 - this.anIntArray117[1];
					if (local67 < 0) {
						local67 = -local67;
					}
					if (local67 > this.anInt1843) {
						local43[local53] = local59;
						local47[local53] = local98;
						local51[local53] = local39[local53];
					} else {
						@Pc(142) int local142 = local39[local53];
						local67 = local142 - this.anIntArray117[2];
						if (local67 < 0) {
							local67 = -local67;
						}
						if (local67 > this.anInt1843) {
							local43[local53] = local59;
							local47[local53] = local98;
							local51[local53] = local142;
						} else {
							local43[local53] = this.anInt1837 * local59 >> 12;
							local47[local53] = local98 * this.anInt1841 >> 12;
							local51[local53] = this.anInt1836 * local142 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
