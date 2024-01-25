import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class1_Sub4_Sub25 extends Class1_Sub4 {

	@OriginalMember(owner = "client!nd", name = "H", descriptor = "[I")
	private final int[] anIntArray305 = new int[3];

	@OriginalMember(owner = "client!nd", name = "M", descriptor = "I")
	private int anInt4797 = 4096;

	@OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
	private int anInt4798 = 409;

	@OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
	private int anInt4792 = 4096;

	@OriginalMember(owner = "client!nd", name = "K", descriptor = "I")
	private int anInt4795 = 4096;

	static {
		new Class119("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	}

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4798 = arg0.method5335();
		} else if (arg1 == 1) {
			this.anInt4795 = arg0.method5335();
		} else if (arg1 == 2) {
			this.anInt4792 = arg0.method5335();
		} else if (arg1 == 3) {
			this.anInt4797 = arg0.method5335();
		} else if (arg1 == 4) {
			@Pc(63) int local63 = arg0.method5345();
			this.anIntArray305[1] = local63 >> 4 & 0xFF0;
			this.anIntArray305[0] = (local63 & 0xFF0000) << 4;
			this.anIntArray305[2] = local63 >> 12 & 0x0;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method5691(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass50_41.method1086(arg0);
		if (super.aClass50_41.aBoolean131) {
			@Pc(21) int[][] local21 = this.method5696(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static395.anInt6592; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(61) int local61 = local53 - this.anIntArray305[0];
				if (local61 < 0) {
					local61 = -local61;
				}
				if (this.anInt4798 < local61) {
					local37[local47] = local53;
					local41[local47] = local29[local47];
					local45[local47] = local33[local47];
				} else {
					@Pc(96) int local96 = local29[local47];
					local61 = local96 - this.anIntArray305[1];
					if (local61 < 0) {
						local61 = -local61;
					}
					if (local61 > this.anInt4798) {
						local37[local47] = local53;
						local41[local47] = local96;
						local45[local47] = local33[local47];
					} else {
						@Pc(136) int local136 = local33[local47];
						local61 = local136 - this.anIntArray305[2];
						if (local61 < 0) {
							local61 = -local61;
						}
						if (local61 > this.anInt4798) {
							local37[local47] = local53;
							local41[local47] = local96;
							local45[local47] = local136;
						} else {
							local37[local47] = this.anInt4797 * local53 >> 12;
							local41[local47] = this.anInt4792 * local96 >> 12;
							local45[local47] = local136 * this.anInt4795 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
