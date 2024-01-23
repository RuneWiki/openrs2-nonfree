import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class8_Sub3_Sub5 extends Class8_Sub3 {

	@OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
	private int anInt575 = 4096;

	@OriginalMember(owner = "client!bf", name = "N", descriptor = "I")
	private int anInt577 = 4096;

	@OriginalMember(owner = "client!bf", name = "M", descriptor = "[I")
	private int[] anIntArray43 = new int[3];

	@OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
	private int anInt576 = 409;

	@OriginalMember(owner = "client!bf", name = "U", descriptor = "I")
	private int anInt584 = 4096;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4217(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = this.aClass166_41.method4037(arg0);
		if (this.aClass166_41.aBoolean451) {
			@Pc(30) int[][] local30 = this.method4224(arg0, 0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[2];
			@Pc(42) int[] local42 = local30[1];
			@Pc(46) int[] local46 = local18[1];
			@Pc(50) int[] local50 = local18[0];
			@Pc(54) int[] local54 = local18[2];
			for (@Pc(56) int local56 = 0; local56 < Static239.anInt4789; local56++) {
				@Pc(63) int local63 = local34[local56];
				@Pc(71) int local71 = local63 - this.anIntArray43[0];
				if (local71 < 0) {
					local71 = -local71;
				}
				if (this.anInt576 >= local71) {
					@Pc(107) int local107 = local42[local56];
					local71 = local107 - this.anIntArray43[1];
					if (local71 < 0) {
						local71 = -local71;
					}
					if (this.anInt576 >= local71) {
						@Pc(149) int local149 = local38[local56];
						local71 = local149 - this.anIntArray43[2];
						if (local71 < 0) {
							local71 = -local71;
						}
						if (this.anInt576 < local71) {
							local50[local56] = local63;
							local46[local56] = local107;
							local54[local56] = local149;
						} else {
							local50[local56] = local63 * this.anInt575 >> 12;
							local46[local56] = this.anInt584 * local107 >> 12;
							local54[local56] = this.anInt577 * local149 >> 12;
						}
					} else {
						local50[local56] = local63;
						local46[local56] = local107;
						local54[local56] = local38[local56];
					}
				} else {
					local50[local56] = local63;
					local46[local56] = local42[local56];
					local54[local56] = local38[local56];
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt576 = arg1.method2375();
		} else if (arg0 == 1) {
			this.anInt577 = arg1.method2375();
		} else if (arg0 == 2) {
			this.anInt584 = arg1.method2375();
		} else if (arg0 == 3) {
			this.anInt575 = arg1.method2375();
		} else if (arg0 == 4) {
			@Pc(59) int local59 = arg1.method2323();
			this.anIntArray43[2] = local59 >> 12 & 0x0;
			this.anIntArray43[1] = local59 >> 4 & 0xFF0;
			this.anIntArray43[0] = (local59 & 0xFF0000) << 4;
		}
	}
}
