import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class6_Sub3_Sub6 extends Class6_Sub3 {

	@OriginalMember(owner = "client!co", name = "J", descriptor = "I")
	private int anInt1327 = 585;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7954(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass137_41.method3408(arg0);
		if (super.aClass137_41.aBoolean306) {
			@Pc(25) int local25 = Static77.anIntArray116[arg0];
			for (@Pc(27) int local27 = 0; local27 < Static35.anInt670; local27++) {
				@Pc(33) int local33 = Static372.anIntArray481[local27];
				@Pc(69) int local69;
				if (local33 > this.anInt1327 && 4096 - this.anInt1327 > local33 && local25 > 2048 - this.anInt1327 && local25 < this.anInt1327 + 2048) {
					local69 = 2048 - local33;
					local69 = local69 >= 0 ? local69 : -local69;
					local69 <<= 0xC;
					local69 /= 2048 - this.anInt1327;
					local17[local27] = 4096 - local69;
				} else if (2048 - this.anInt1327 < local33 && this.anInt1327 + 2048 > local33) {
					local69 = local25 - 2048;
					local69 = local69 < 0 ? -local69 : local69;
					local69 -= this.anInt1327;
					local69 <<= 0xC;
					local17[local27] = local69 / (2048 - this.anInt1327);
				} else if (this.anInt1327 > local25 || local25 > 4096 - this.anInt1327) {
					local69 = local33 - 2048;
					@Pc(177) int local177 = local69 >= 0 ? local69 : -local69;
					@Pc(182) int local182 = local177 - this.anInt1327;
					@Pc(186) int local186 = local182 << 12;
					local17[local27] = local186 / (2048 - this.anInt1327);
				} else if (this.anInt1327 <= local33 && local33 <= 4096 - this.anInt1327) {
					local17[local27] = 0;
				} else {
					local69 = 2048 - local25;
					local69 = local69 >= 0 ? local69 : -local69;
					local69 <<= 0xC;
					local69 /= 2048 - this.anInt1327;
					local17[local27] = 4096 - local69;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt1327 = arg1.method6044();
		}
	}
}
