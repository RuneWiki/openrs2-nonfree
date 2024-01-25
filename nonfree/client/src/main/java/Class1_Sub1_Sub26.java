import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class1_Sub1_Sub26 extends Class1_Sub1 {

	@OriginalMember(owner = "client!oj", name = "J", descriptor = "I")
	private int anInt4726 = 4096;

	@OriginalMember(owner = "client!oj", name = "M", descriptor = "I")
	private int anInt4728 = 4096;

	@OriginalMember(owner = "client!oj", name = "R", descriptor = "I")
	private int anInt4731 = 4096;

	@OriginalMember(owner = "client!oj", name = "U", descriptor = "I")
	private int anInt4734 = 409;

	@OriginalMember(owner = "client!oj", name = "V", descriptor = "[I")
	private final int[] anIntArray252 = new int[3];

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub26() {
		super(1, false);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5626(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass117_41.method2345(arg0);
		if (super.aClass117_41.aBoolean221) {
			@Pc(26) int[][] local26 = this.method5624(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static434.anInt4326; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(66) int local66 = local58 - this.anIntArray252[0];
				if (local66 < 0) {
					local66 = -local66;
				}
				if (this.anInt4734 < local66) {
					local42[local52] = local58;
					local46[local52] = local34[local52];
					local50[local52] = local38[local52];
				} else {
					@Pc(97) int local97 = local34[local52];
					local66 = local97 - this.anIntArray252[1];
					if (local66 < 0) {
						local66 = -local66;
					}
					if (local66 > this.anInt4734) {
						local42[local52] = local58;
						local46[local52] = local97;
						local50[local52] = local38[local52];
					} else {
						@Pc(138) int local138 = local38[local52];
						local66 = local138 - this.anIntArray252[2];
						if (local66 < 0) {
							local66 = -local66;
						}
						if (this.anInt4734 < local66) {
							local42[local52] = local58;
							local46[local52] = local97;
							local50[local52] = local138;
						} else {
							local42[local52] = this.anInt4731 * local58 >> 12;
							local46[local52] = this.anInt4728 * local97 >> 12;
							local50[local52] = this.anInt4726 * local138 >> 12;
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt4734 = arg1.method4485();
		} else if (arg0 == 1) {
			this.anInt4726 = arg1.method4485();
		} else if (arg0 == 2) {
			this.anInt4728 = arg1.method4485();
		} else if (arg0 == 3) {
			this.anInt4731 = arg1.method4485();
		} else if (arg0 == 4) {
			@Pc(61) int local61 = arg1.method4493();
			this.anIntArray252[0] = (local61 & 0xFF0000) << 4;
			this.anIntArray252[1] = local61 >> 4 & 0xFF0;
			this.anIntArray252[2] = local61 >> 12 & 0x0;
		}
	}
}
