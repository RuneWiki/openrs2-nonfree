import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public final class Class4_Sub4_Sub26 extends Class4_Sub4 {

	@OriginalMember(owner = "client!nt", name = "F", descriptor = "I")
	private int anInt6549 = 585;

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt6549 = arg1.method5982();
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method7883(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass343_41.method7596(arg0);
		if (super.aClass343_41.aBoolean638) {
			@Pc(24) int local24 = Static450.anIntArray619[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static560.anInt9394; local26++) {
				@Pc(32) int local32 = Static80.anIntArray212[local26];
				@Pc(73) int local73;
				if (local32 > this.anInt6549 && local32 < 4096 - this.anInt6549 && local24 > 2048 - this.anInt6549 && local24 < this.anInt6549 + 2048) {
					local73 = 2048 - local32;
					local73 = local73 < 0 ? -local73 : local73;
					local73 <<= 0xC;
					local73 /= 2048 - this.anInt6549;
					local16[local26] = 4096 - local73;
				} else if (2048 - this.anInt6549 < local32 && this.anInt6549 + 2048 > local32) {
					local73 = local24 - 2048;
					local73 = local73 < 0 ? -local73 : local73;
					local73 -= this.anInt6549;
					local73 <<= 0xC;
					local16[local26] = local73 / (2048 - this.anInt6549);
				} else if (local24 < this.anInt6549 || 4096 - this.anInt6549 < local24) {
					local73 = local32 - 2048;
					@Pc(192) int local192 = local73 < 0 ? -local73 : local73;
					@Pc(197) int local197 = local192 - this.anInt6549;
					@Pc(201) int local201 = local197 << 12;
					local16[local26] = local201 / (2048 - this.anInt6549);
				} else if (local32 >= this.anInt6549 && 4096 - this.anInt6549 >= local32) {
					local16[local26] = 0;
				} else {
					local73 = 2048 - local24;
					local73 = local73 >= 0 ? local73 : -local73;
					local73 <<= 0xC;
					local73 /= 2048 - this.anInt6549;
					local16[local26] = 4096 - local73;
				}
			}
		}
		return local16;
	}
}
