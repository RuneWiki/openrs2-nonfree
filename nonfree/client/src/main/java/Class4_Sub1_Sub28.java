import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class4_Sub1_Sub28 extends Class4_Sub1 {

	@OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
	private int anInt7916 = 4096;

	@OriginalMember(owner = "client!qe", name = "E", descriptor = "I")
	private int anInt7918 = 4096;

	@OriginalMember(owner = "client!qe", name = "I", descriptor = "I")
	private int anInt7921 = 409;

	@OriginalMember(owner = "client!qe", name = "F", descriptor = "[I")
	private final int[] anIntArray416 = new int[3];

	@OriginalMember(owner = "client!qe", name = "O", descriptor = "I")
	private int anInt7925 = 4096;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt7921 = arg1.method4936();
		} else if (arg0 == 1) {
			this.anInt7918 = arg1.method4936();
		} else if (arg0 == 2) {
			this.anInt7925 = arg1.method4936();
		} else if (arg0 == 3) {
			this.anInt7916 = arg1.method4936();
		} else if (arg0 == 4) {
			@Pc(60) int local60 = arg1.method4934();
			this.anIntArray416[0] = (local60 & 0xFF0000) << 4;
			this.anIntArray416[2] = local60 >> 12 & 0x0;
			this.anIntArray416[1] = local60 >> 4 & 0xFF0;
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8388(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass84_41.method2457(arg0);
		if (super.aClass84_41.aBoolean194) {
			@Pc(29) int[][] local29 = this.method8385(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static376.anInt7260; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(69) int local69 = local61 - this.anIntArray416[0];
				if (local69 < 0) {
					local69 = -local69;
				}
				if (this.anInt7921 < local69) {
					local45[local55] = local61;
					local49[local55] = local37[local55];
					local53[local55] = local41[local55];
				} else {
					@Pc(107) int local107 = local37[local55];
					local69 = local107 - this.anIntArray416[1];
					if (local69 < 0) {
						local69 = -local69;
					}
					if (local69 > this.anInt7921) {
						local45[local55] = local61;
						local49[local55] = local107;
						local53[local55] = local41[local55];
					} else {
						@Pc(148) int local148 = local41[local55];
						local69 = local148 - this.anIntArray416[2];
						if (local69 < 0) {
							local69 = -local69;
						}
						if (this.anInt7921 < local69) {
							local45[local55] = local61;
							local49[local55] = local107;
							local53[local55] = local148;
						} else {
							local45[local55] = this.anInt7916 * local61 >> 12;
							local49[local55] = local107 * this.anInt7925 >> 12;
							local53[local55] = local148 * this.anInt7918 >> 12;
						}
					}
				}
			}
		}
		return local19;
	}
}
