import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tia")
public final class Class3_Sub2_Sub34 extends Class3_Sub2 {

	@OriginalMember(owner = "client!tia", name = "D", descriptor = "I")
	private int anInt9963 = 4096;

	@OriginalMember(owner = "client!tia", name = "G", descriptor = "I")
	private int anInt9966 = 4096;

	@OriginalMember(owner = "client!tia", name = "H", descriptor = "[I")
	private final int[] anIntArray571 = new int[3];

	@OriginalMember(owner = "client!tia", name = "L", descriptor = "I")
	private int anInt9971 = 4096;

	@OriginalMember(owner = "client!tia", name = "E", descriptor = "I")
	private int anInt9970 = 409;

	@OriginalMember(owner = "client!tia", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			this.anInt9970 = arg1.method5272();
		} else if (arg0 == 1) {
			this.anInt9963 = arg1.method5272();
		} else if (arg0 == 2) {
			this.anInt9971 = arg1.method5272();
		} else if (arg0 == 3) {
			this.anInt9966 = arg1.method5272();
		} else if (arg0 == 4) {
			@Pc(75) int local75 = arg1.method5307();
			this.anIntArray571[0] = (local75 & 0xFF0000) << 4;
			this.anIntArray571[1] = local75 >> 4 & 0xFF0;
			this.anIntArray571[2] = local75 >> 12 & 0x0;
		}
	}

	@OriginalMember(owner = "client!tia", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9203(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass36_41.method731(arg0);
		if (super.aClass36_41.aBoolean75) {
			@Pc(30) int[][] local30 = this.method9212(0, arg0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[1];
			@Pc(42) int[] local42 = local30[2];
			@Pc(46) int[] local46 = local11[0];
			@Pc(50) int[] local50 = local11[1];
			@Pc(54) int[] local54 = local11[2];
			for (@Pc(56) int local56 = 0; local56 < Static636.anInt10302; local56++) {
				@Pc(62) int local62 = local34[local56];
				@Pc(70) int local70 = local62 - this.anIntArray571[0];
				if (local70 < 0) {
					local70 = -local70;
				}
				if (local70 > this.anInt9970) {
					local46[local56] = local62;
					local50[local56] = local38[local56];
					local54[local56] = local42[local56];
				} else {
					@Pc(110) int local110 = local38[local56];
					local70 = local110 - this.anIntArray571[1];
					if (local70 < 0) {
						local70 = -local70;
					}
					if (this.anInt9970 < local70) {
						local46[local56] = local62;
						local50[local56] = local110;
						local54[local56] = local42[local56];
					} else {
						@Pc(152) int local152 = local42[local56];
						local70 = local152 - this.anIntArray571[2];
						if (local70 < 0) {
							local70 = -local70;
						}
						if (local70 > this.anInt9970) {
							local46[local56] = local62;
							local50[local56] = local110;
							local54[local56] = local152;
						} else {
							local46[local56] = this.anInt9966 * local62 >> 12;
							local50[local56] = local110 * this.anInt9971 >> 12;
							local54[local56] = local152 * this.anInt9963 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
