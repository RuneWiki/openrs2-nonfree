import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class5_Sub3_Sub13 extends Class5_Sub3 {

	@OriginalMember(owner = "client!fo", name = "R", descriptor = "I")
	private int anInt3199 = 4096;

	@OriginalMember(owner = "client!fo", name = "T", descriptor = "I")
	private int anInt3201 = 409;

	@OriginalMember(owner = "client!fo", name = "S", descriptor = "I")
	private int anInt3206 = 4096;

	@OriginalMember(owner = "client!fo", name = "J", descriptor = "I")
	private int anInt3207 = 4096;

	@OriginalMember(owner = "client!fo", name = "N", descriptor = "[I")
	private final int[] anIntArray149 = new int[3];

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub13() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9206(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass343_41.method7661(arg0);
		if (super.aClass343_41.aBoolean592) {
			@Pc(27) int[][] local27 = this.method9207(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static7.anInt102; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(67) int local67 = local59 - this.anIntArray149[0];
				if (local67 < 0) {
					local67 = -local67;
				}
				if (local67 > this.anInt3201) {
					local43[local53] = local59;
					local47[local53] = local35[local53];
					local51[local53] = local39[local53];
				} else {
					@Pc(100) int local100 = local35[local53];
					local67 = local100 - this.anIntArray149[1];
					if (local67 < 0) {
						local67 = -local67;
					}
					if (this.anInt3201 < local67) {
						local43[local53] = local59;
						local47[local53] = local100;
						local51[local53] = local39[local53];
					} else {
						@Pc(146) int local146 = local39[local53];
						local67 = local146 - this.anIntArray149[2];
						if (local67 < 0) {
							local67 = -local67;
						}
						if (local67 > this.anInt3201) {
							local43[local53] = local59;
							local47[local53] = local100;
							local51[local53] = local146;
						} else {
							local43[local53] = this.anInt3199 * local59 >> 12;
							local47[local53] = this.anInt3206 * local100 >> 12;
							local51[local53] = local146 * this.anInt3207 >> 12;
						}
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3201 = arg0.method7333();
		} else if (arg1 == 1) {
			this.anInt3207 = arg0.method7333();
		} else if (arg1 == 2) {
			this.anInt3206 = arg0.method7333();
		} else if (arg1 == 3) {
			this.anInt3199 = arg0.method7333();
		} else if (arg1 == 4) {
			@Pc(74) int local74 = arg0.method7331();
			this.anIntArray149[2] = local74 >> 12 & 0x0;
			this.anIntArray149[0] = (local74 & 0xFF0000) << 4;
			this.anIntArray149[1] = local74 >> 4 & 0xFF0;
		}
	}
}
