import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ada")
public final class Class2_Sub2_Sub1 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ada", name = "L", descriptor = "[I")
	private final int[] anIntArray29 = new int[3];

	@OriginalMember(owner = "client!ada", name = "K", descriptor = "I")
	private int anInt336 = 4096;

	@OriginalMember(owner = "client!ada", name = "I", descriptor = "I")
	private int anInt334 = 409;

	@OriginalMember(owner = "client!ada", name = "P", descriptor = "I")
	private int anInt339 = 4096;

	@OriginalMember(owner = "client!ada", name = "J", descriptor = "I")
	private int anInt335 = 4096;

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt334 = arg0.method4294();
		} else if (arg1 == 1) {
			this.anInt335 = arg0.method4294();
		} else if (arg1 == 2) {
			this.anInt336 = arg0.method4294();
		} else if (arg1 == 3) {
			this.anInt339 = arg0.method4294();
		} else if (arg1 == 4) {
			@Pc(66) int local66 = arg0.method4341();
			this.anIntArray29[2] = local66 >> 12 & 0x0;
			this.anIntArray29[0] = (local66 & 0xFF0000) << 4;
			this.anIntArray29[1] = local66 >> 4 & 0xFF0;
		}
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7946(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass314_41.method7006(arg0);
		if (super.aClass314_41.aBoolean653) {
			@Pc(27) int[][] local27 = this.method7947(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			for (@Pc(53) int local53 = 0; local53 < Static153.anInt3070; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(67) int local67 = local59 - this.anIntArray29[0];
				if (local67 < 0) {
					local67 = -local67;
				}
				if (this.anInt334 < local67) {
					local43[local53] = local59;
					local47[local53] = local35[local53];
					local51[local53] = local39[local53];
				} else {
					@Pc(101) int local101 = local35[local53];
					local67 = local101 - this.anIntArray29[1];
					if (local67 < 0) {
						local67 = -local67;
					}
					if (local67 > this.anInt334) {
						local43[local53] = local59;
						local47[local53] = local101;
						local51[local53] = local39[local53];
					} else {
						@Pc(145) int local145 = local39[local53];
						local67 = local145 - this.anIntArray29[2];
						if (local67 < 0) {
							local67 = -local67;
						}
						if (local67 > this.anInt334) {
							local43[local53] = local59;
							local47[local53] = local101;
							local51[local53] = local145;
						} else {
							local43[local53] = local59 * this.anInt339 >> 12;
							local47[local53] = local101 * this.anInt336 >> 12;
							local51[local53] = this.anInt335 * local145 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
