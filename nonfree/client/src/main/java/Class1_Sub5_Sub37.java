import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class1_Sub5_Sub37 extends Class1_Sub5 {

	@OriginalMember(owner = "client!um", name = "M", descriptor = "I")
	private int anInt6311 = 0;

	@OriginalMember(owner = "client!um", name = "N", descriptor = "I")
	private int anInt6312 = 1;

	@OriginalMember(owner = "client!um", name = "W", descriptor = "I")
	private int anInt6317 = 0;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(I)V")
	@Override
	public void method5801() {
		Static341.method5649();
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5805(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass214_41.method5651(arg0);
		if (super.aClass214_41.aBoolean544) {
			@Pc(23) int local23 = Static191.anIntArray379[arg0];
			@Pc(29) int local29 = local23 - 2048 >> 1;
			for (@Pc(31) int local31 = 0; local31 < Static75.anInt1566; local31++) {
				@Pc(37) int local37 = Static49.anIntArray492[local31];
				@Pc(43) int local43 = local37 - 2048 >> 1;
				@Pc(54) int local54;
				if (this.anInt6317 == 0) {
					local54 = this.anInt6312 * (local37 - local23);
				} else {
					@Pc(67) int local67 = local43 * local43 + local29 * local29 >> 12;
					local54 = (int) (Math.sqrt((double) ((float) local67 / 4096.0F)) * 4096.0D);
					local54 = (int) ((double) (this.anInt6312 * local54) * 3.141592653589793D);
				}
				local54 -= local54 & 0xFFFFF000;
				if (this.anInt6311 == 0) {
					local54 = Static204.anIntArray679[local54 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt6311 == 2) {
					local54 -= 2048;
					if (local54 < 0) {
						local54 = -local54;
					}
					local54 = 2048 - local54 << 1;
				}
				local15[local31] = local54;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6317 = arg0.method5720();
		} else if (arg1 == 1) {
			this.anInt6311 = arg0.method5720();
		} else if (arg1 == 3) {
			this.anInt6312 = arg0.method5720();
		}
	}
}
