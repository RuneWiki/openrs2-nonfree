import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class2_Sub1_Sub17 extends Class2_Sub1 {

	@OriginalMember(owner = "client!jd", name = "M", descriptor = "I")
	private int anInt3284 = 4096;

	@OriginalMember(owner = "client!jd", name = "Q", descriptor = "[I")
	private final int[] anIntArray260 = new int[3];

	@OriginalMember(owner = "client!jd", name = "L", descriptor = "I")
	private int anInt3283 = 4096;

	@OriginalMember(owner = "client!jd", name = "R", descriptor = "I")
	private int anInt3287 = 409;

	@OriginalMember(owner = "client!jd", name = "U", descriptor = "I")
	private int anInt3290 = 4096;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt3287 = arg1.method5753();
		} else if (arg0 == 1) {
			this.anInt3290 = arg1.method5753();
		} else if (arg0 == 2) {
			this.anInt3283 = arg1.method5753();
		} else if (arg0 == 3) {
			this.anInt3284 = arg1.method5753();
		} else if (arg0 == 4) {
			@Pc(63) int local63 = arg1.method5736();
			this.anIntArray260[1] = local63 >> 4 & 0xFF0;
			this.anIntArray260[2] = local63 >> 12 & 0x0;
			this.anIntArray260[0] = (local63 & 0xFF0000) << 4;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6060(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass26_41.method350(arg0);
		if (super.aClass26_41.aBoolean41) {
			@Pc(27) int[][] local27 = this.method6061(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			for (@Pc(53) int local53 = 0; local53 < Static391.anInt7118; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(67) int local67 = local59 - this.anIntArray260[0];
				if (local67 < 0) {
					local67 = -local67;
				}
				if (this.anInt3287 < local67) {
					local43[local53] = local59;
					local47[local53] = local35[local53];
					local51[local53] = local39[local53];
				} else {
					@Pc(105) int local105 = local35[local53];
					local67 = local105 - this.anIntArray260[1];
					if (local67 < 0) {
						local67 = -local67;
					}
					if (this.anInt3287 < local67) {
						local43[local53] = local59;
						local47[local53] = local105;
						local51[local53] = local39[local53];
					} else {
						@Pc(142) int local142 = local39[local53];
						local67 = local142 - this.anIntArray260[2];
						if (local67 < 0) {
							local67 = -local67;
						}
						if (this.anInt3287 < local67) {
							local43[local53] = local59;
							local47[local53] = local105;
							local51[local53] = local142;
						} else {
							local43[local53] = this.anInt3284 * local59 >> 12;
							local47[local53] = local105 * this.anInt3283 >> 12;
							local51[local53] = local142 * this.anInt3290 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
