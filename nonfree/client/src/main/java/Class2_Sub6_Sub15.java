import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class2_Sub6_Sub15 extends Class2_Sub6 {

	@OriginalMember(owner = "client!jh", name = "I", descriptor = "I")
	private int anInt4260 = 409;

	@OriginalMember(owner = "client!jh", name = "N", descriptor = "[I")
	private final int[] anIntArray284 = new int[3];

	@OriginalMember(owner = "client!jh", name = "P", descriptor = "I")
	private int anInt4265 = 4096;

	@OriginalMember(owner = "client!jh", name = "J", descriptor = "I")
	private int anInt4261 = 4096;

	@OriginalMember(owner = "client!jh", name = "S", descriptor = "I")
	private int anInt4267 = 4096;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			this.anInt4260 = arg1.method8546();
		} else if (arg0 == 1) {
			this.anInt4267 = arg1.method8546();
		} else if (arg0 == 2) {
			this.anInt4261 = arg1.method8546();
		} else if (arg0 == 3) {
			this.anInt4265 = arg1.method8546();
		} else if (arg0 == 4) {
			@Pc(66) int local66 = arg1.method8539();
			this.anIntArray284[0] = (local66 & 0xFF0000) << 4;
			this.anIntArray284[1] = local66 >> 4 & 0xFF0;
			this.anIntArray284[2] = local66 >> 12 & 0x0;
		}
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8470(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = super.aClass52_41.method962(arg0);
		if (super.aClass52_41.aBoolean88) {
			@Pc(27) int[][] local27 = this.method8465(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local13[0];
			@Pc(47) int[] local47 = local13[1];
			@Pc(51) int[] local51 = local13[2];
			for (@Pc(53) int local53 = 0; local53 < Static51.anInt1085; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(67) int local67 = local59 - this.anIntArray284[0];
				if (local67 < 0) {
					local67 = -local67;
				}
				if (this.anInt4260 < local67) {
					local43[local53] = local59;
					local47[local53] = local35[local53];
					local51[local53] = local39[local53];
				} else {
					@Pc(105) int local105 = local35[local53];
					local67 = local105 - this.anIntArray284[1];
					if (local67 < 0) {
						local67 = -local67;
					}
					if (this.anInt4260 < local67) {
						local43[local53] = local59;
						local47[local53] = local105;
						local51[local53] = local39[local53];
					} else {
						@Pc(142) int local142 = local39[local53];
						local67 = local142 - this.anIntArray284[2];
						if (local67 < 0) {
							local67 = -local67;
						}
						if (this.anInt4260 < local67) {
							local43[local53] = local59;
							local47[local53] = local105;
							local51[local53] = local142;
						} else {
							local43[local53] = this.anInt4265 * local59 >> 12;
							local47[local53] = this.anInt4261 * local105 >> 12;
							local51[local53] = this.anInt4267 * local142 >> 12;
						}
					}
				}
			}
		}
		return local13;
	}
}
