import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class1_Sub2_Sub9 extends Class1_Sub2 {

	@OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
	private int anInt1293 = 409;

	@OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
	private int anInt1295 = 4096;

	@OriginalMember(owner = "client!dd", name = "O", descriptor = "[I")
	private final int[] anIntArray146 = new int[3];

	@OriginalMember(owner = "client!dd", name = "P", descriptor = "I")
	private int anInt1297 = 4096;

	@OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
	private int anInt1296 = 4096;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt1293 = arg1.method3115();
		} else if (arg0 == 1) {
			this.anInt1296 = arg1.method3115();
		} else if (arg0 == 2) {
			this.anInt1297 = arg1.method3115();
		} else if (arg0 == 3) {
			this.anInt1295 = arg1.method3115();
		} else if (arg0 == 4) {
			@Pc(62) int local62 = arg1.method3137();
			this.anIntArray146[0] = (local62 & 0xFF0000) << 4;
			this.anIntArray146[2] = local62 >> 12 & 0x0;
			this.anIntArray146[1] = local62 >> 4 & 0xFF0;
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5664(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass129_41.method3671(arg0);
		if (super.aClass129_41.aBoolean338) {
			@Pc(21) int[][] local21 = this.method5659(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static251.anInt6509; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(60) int local60 = local53 - this.anIntArray146[0];
				if (local60 < 0) {
					local60 = -local60;
				}
				if (local60 > this.anInt1293) {
					local37[local47] = local53;
					local41[local47] = local29[local47];
					local45[local47] = local33[local47];
				} else {
					@Pc(94) int local94 = local29[local47];
					local60 = local94 - this.anIntArray146[1];
					if (local60 < 0) {
						local60 = -local60;
					}
					if (this.anInt1293 < local60) {
						local37[local47] = local53;
						local41[local47] = local94;
						local45[local47] = local33[local47];
					} else {
						@Pc(134) int local134 = local33[local47];
						local60 = local134 - this.anIntArray146[2];
						if (local60 < 0) {
							local60 = -local60;
						}
						if (this.anInt1293 < local60) {
							local37[local47] = local53;
							local41[local47] = local94;
							local45[local47] = local134;
						} else {
							local37[local47] = this.anInt1295 * local53 >> 12;
							local41[local47] = this.anInt1297 * local94 >> 12;
							local45[local47] = local134 * this.anInt1296 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
