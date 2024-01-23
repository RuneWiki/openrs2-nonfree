import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class3_Sub2_Sub4 extends Class3_Sub2 {

	@OriginalMember(owner = "client!bf", name = "P", descriptor = "I")
	private int anInt404 = 4096;

	@OriginalMember(owner = "client!bf", name = "M", descriptor = "I")
	private int anInt401 = 4096;

	@OriginalMember(owner = "client!bf", name = "U", descriptor = "I")
	private int anInt407 = 4096;

	@OriginalMember(owner = "client!bf", name = "V", descriptor = "I")
	private int anInt408 = 409;

	@OriginalMember(owner = "client!bf", name = "W", descriptor = "[I")
	private int[] anIntArray32 = new int[3];

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt408 = arg1.method3948();
		} else if (arg0 == 1) {
			this.anInt404 = arg1.method3948();
		} else if (arg0 == 2) {
			this.anInt407 = arg1.method3948();
		} else if (arg0 == 3) {
			this.anInt401 = arg1.method3948();
		} else if (arg0 == 4) {
			@Pc(73) int local73 = arg1.method3899();
			this.anIntArray32[0] = (local73 & 0xFF0000) << 4;
			this.anIntArray32[2] = local73 >> 12 & 0x0;
			this.anIntArray32[1] = local73 >> 4 & 0xFF0;
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method4955(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass150_41.method3994(arg0);
		if (this.aClass150_41.aBoolean319) {
			@Pc(22) int[][] local22 = this.method4965(arg0, 0);
			@Pc(26) int[] local26 = local22[2];
			@Pc(30) int[] local30 = local22[1];
			@Pc(34) int[] local34 = local11[0];
			@Pc(38) int[] local38 = local22[0];
			@Pc(42) int[] local42 = local11[2];
			@Pc(46) int[] local46 = local11[1];
			for (@Pc(48) int local48 = 0; local48 < Static22.anInt421; local48++) {
				@Pc(55) int local55 = local38[local48];
				@Pc(63) int local63 = local55 - this.anIntArray32[0];
				if (local63 < 0) {
					local63 = -local63;
				}
				if (local63 > this.anInt408) {
					local34[local48] = local55;
					local46[local48] = local30[local48];
					local42[local48] = local26[local48];
				} else {
					@Pc(97) int local97 = local30[local48];
					local63 = local97 - this.anIntArray32[1];
					if (local63 < 0) {
						local63 = -local63;
					}
					if (local63 <= this.anInt408) {
						@Pc(142) int local142 = local26[local48];
						local63 = local142 - this.anIntArray32[2];
						if (local63 < 0) {
							local63 = -local63;
						}
						if (local63 <= this.anInt408) {
							local34[local48] = local55 * this.anInt401 >> 12;
							local46[local48] = local97 * this.anInt407 >> 12;
							local42[local48] = this.anInt404 * local142 >> 12;
						} else {
							local34[local48] = local55;
							local46[local48] = local97;
							local42[local48] = local142;
						}
					} else {
						local34[local48] = local55;
						local46[local48] = local97;
						local42[local48] = local26[local48];
					}
				}
			}
		}
		return local11;
	}
}
