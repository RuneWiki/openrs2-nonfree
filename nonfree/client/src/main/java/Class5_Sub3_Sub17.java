import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class5_Sub3_Sub17 extends Class5_Sub3 {

	@OriginalMember(owner = "client!hq", name = "O", descriptor = "I")
	private int anInt3892 = 0;

	@OriginalMember(owner = "client!hq", name = "G", descriptor = "I")
	private int anInt3893 = 1;

	@OriginalMember(owner = "client!hq", name = "I", descriptor = "I")
	private int anInt3895 = 0;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3892 = arg0.method7291();
		} else if (arg1 == 1) {
			this.anInt3895 = arg0.method7291();
		} else if (arg1 == 3) {
			this.anInt3893 = arg0.method7291();
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9208(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass234_41.method5232(arg0);
		if (super.aClass234_41.aBoolean392) {
			@Pc(28) int local28 = Static458.anIntArray438[arg0];
			@Pc(34) int local34 = local28 - 2048 >> 1;
			for (@Pc(36) int local36 = 0; local36 < Static7.anInt102; local36++) {
				@Pc(42) int local42 = Static382.anIntArray368[local36];
				@Pc(48) int local48 = local42 - 2048 >> 1;
				@Pc(62) int local62;
				if (this.anInt3892 == 0) {
					local62 = (local42 - local28) * this.anInt3893;
				} else {
					@Pc(74) int local74 = local48 * local48 + local34 * local34 >> 12;
					local62 = (int) (Math.sqrt((double) ((float) local74 / 4096.0F)) * 4096.0D);
					local62 = (int) ((double) (local62 * this.anInt3893) * 3.141592653589793D);
				}
				local62 -= local62 & 0xFFFFF000;
				if (this.anInt3895 == 0) {
					local62 = Static536.anIntArray488[local62 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt3895 == 2) {
					local62 -= 2048;
					if (local62 < 0) {
						local62 = -local62;
					}
					local62 = 2048 - local62 << 1;
				}
				local11[local36] = local62;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)V")
	@Override
	public void method9210() {
		Static355.method5212();
	}
}
