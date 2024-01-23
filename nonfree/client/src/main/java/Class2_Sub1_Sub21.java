import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class2_Sub1_Sub21 extends Class2_Sub1 {

	@OriginalMember(owner = "client!kg", name = "P", descriptor = "I")
	private int anInt3292 = 409;

	@OriginalMember(owner = "client!kg", name = "Q", descriptor = "I")
	private int anInt3293 = 4096;

	@OriginalMember(owner = "client!kg", name = "T", descriptor = "I")
	private int anInt3296 = 4096;

	@OriginalMember(owner = "client!kg", name = "O", descriptor = "I")
	private int anInt3291 = 4096;

	@OriginalMember(owner = "client!kg", name = "K", descriptor = "[I")
	private int[] anIntArray332 = new int[3];

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4586(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = this.aClass25_41.method652(arg0);
		if (this.aClass25_41.aBoolean53) {
			@Pc(27) int[][] local27 = this.method4600(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local16[0];
			@Pc(47) int[] local47 = local16[2];
			@Pc(51) int[] local51 = local16[1];
			for (@Pc(53) int local53 = 0; local53 < Static281.anInt5558; local53++) {
				@Pc(64) int local64 = local31[local53];
				@Pc(71) int local71 = local64 - this.anIntArray332[0];
				if (local71 < 0) {
					local71 = -local71;
				}
				if (this.anInt3292 < local71) {
					local43[local53] = local64;
					local51[local53] = local35[local53];
					local47[local53] = local39[local53];
				} else {
					@Pc(109) int local109 = local35[local53];
					local71 = local109 - this.anIntArray332[1];
					if (local71 < 0) {
						local71 = -local71;
					}
					if (local71 <= this.anInt3292) {
						@Pc(147) int local147 = local39[local53];
						local71 = local147 - this.anIntArray332[2];
						if (local71 < 0) {
							local71 = -local71;
						}
						if (local71 > this.anInt3292) {
							local43[local53] = local64;
							local51[local53] = local109;
							local47[local53] = local147;
						} else {
							local43[local53] = local64 * this.anInt3293 >> 12;
							local51[local53] = this.anInt3296 * local109 >> 12;
							local47[local53] = local147 * this.anInt3291 >> 12;
						}
					} else {
						local43[local53] = local64;
						local51[local53] = local109;
						local47[local53] = local39[local53];
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3292 = arg0.method2130();
		} else if (arg1 == 1) {
			this.anInt3291 = arg0.method2130();
		} else if (arg1 == 2) {
			this.anInt3296 = arg0.method2130();
		} else if (arg1 == 3) {
			this.anInt3293 = arg0.method2130();
		} else if (arg1 == 4) {
			@Pc(63) int local63 = arg0.method2166();
			this.anIntArray332[0] = (local63 & 0xFF0000) << 4;
			this.anIntArray332[2] = local63 >> 12 & 0x0;
			this.anIntArray332[1] = local63 >> 4 & 0xFF0;
		}
	}
}
