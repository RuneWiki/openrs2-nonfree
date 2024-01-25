import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class4_Sub2_Sub35 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ug", name = "O", descriptor = "[I")
	private int[] anIntArray552;

	@OriginalMember(owner = "client!ug", name = "S", descriptor = "[I")
	private int[] anIntArray553;

	@OriginalMember(owner = "client!ug", name = "K", descriptor = "I")
	private int anInt9747 = 2048;

	@OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
	private int anInt9745 = 0;

	@OriginalMember(owner = "client!ug", name = "T", descriptor = "I")
	private int anInt9753 = 10;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V")
	private void method7503() {
		this.anIntArray552 = new int[this.anInt9753 + 1];
		this.anIntArray553 = new int[this.anInt9753 + 1];
		@Pc(27) int local27 = 0;
		@Pc(32) int local32 = 4096 / this.anInt9753;
		@Pc(39) int local39 = this.anInt9747 * local32 >> 12;
		for (@Pc(41) int local41 = 0; local41 < this.anInt9753; local41++) {
			this.anIntArray552[local41] = local27;
			this.anIntArray553[local41] = local39 + local27;
			local27 += local32;
		}
		this.anIntArray552[this.anInt9753] = 4096;
		this.anIntArray553[this.anInt9753] = this.anIntArray553[0] + 4096;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9753 = arg0.method7004();
		} else if (arg1 == 1) {
			this.anInt9747 = arg0.method7054();
		} else if (arg1 == 2) {
			this.anInt9745 = arg0.method7004();
		}
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V")
	@Override
	public void method8210() {
		this.method7503();
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method8203(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass135_41.method3011(arg0);
		if (super.aClass135_41.aBoolean278) {
			@Pc(24) int local24 = Static217.anIntArray501[arg0];
			@Pc(34) int local34;
			if (this.anInt9745 == 0) {
				@Pc(32) short local32 = 0;
				for (local34 = 0; local34 < this.anInt9753; local34++) {
					if (local24 >= this.anIntArray552[local34] && this.anIntArray552[local34 + 1] > local24) {
						if (this.anIntArray553[local34] > local24) {
							local32 = 4096;
						}
						break;
					}
				}
				Static599.method3056(local16, 0, Static417.anInt5248, local32);
			} else {
				for (@Pc(78) int local78 = 0; local78 < Static417.anInt5248; local78++) {
					local34 = 0;
					@Pc(84) short local84 = 0;
					@Pc(88) int local88 = Static579.anIntArray585[local78];
					@Pc(91) int local91 = this.anInt9745;
					if (local91 == 1) {
						local34 = local88;
					} else if (local91 == 2) {
						local34 = (local88 + local24 - 4096 >> 1) + 2048;
					} else if (local91 == 3) {
						local34 = (local88 - local24 >> 1) + 2048;
					}
					for (local91 = 0; local91 < this.anInt9753; local91++) {
						if (local34 >= this.anIntArray552[local91] && this.anIntArray552[local91 + 1] > local34) {
							if (local34 < this.anIntArray553[local91]) {
								local84 = 4096;
							}
							break;
						}
					}
					local16[local78] = local84;
				}
			}
		}
		return local16;
	}
}
