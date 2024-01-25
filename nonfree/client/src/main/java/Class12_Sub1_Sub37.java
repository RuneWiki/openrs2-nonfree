import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class12_Sub1_Sub37 extends Class12_Sub1 {

	@OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
	private int anInt9206 = 4096;

	@OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
	private int anInt9207 = 4096;

	@OriginalMember(owner = "client!ve", name = "M", descriptor = "[I")
	private final int[] anIntArray675 = new int[3];

	@OriginalMember(owner = "client!ve", name = "I", descriptor = "I")
	private int anInt9208 = 409;

	@OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
	private int anInt9205 = 4096;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9208 = arg0.method5199();
		} else if (arg1 == 1) {
			this.anInt9205 = arg0.method5199();
		} else if (arg1 == 2) {
			this.anInt9207 = arg0.method5199();
		} else if (arg1 == 3) {
			this.anInt9206 = arg0.method5199();
		} else if (arg1 == 4) {
			@Pc(62) int local62 = arg0.method5195();
			this.anIntArray675[2] = local62 >> 12 & 0x0;
			this.anIntArray675[0] = (local62 & 0xFF0000) << 4;
			this.anIntArray675[1] = local62 >> 4 & 0xFF0;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7793(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method1462(arg0);
		if (super.aClass53_41.aBoolean108) {
			@Pc(26) int[][] local26 = this.method7790(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static357.anInt6670; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(66) int local66 = local58 - this.anIntArray675[0];
				if (local66 < 0) {
					local66 = -local66;
				}
				if (this.anInt9208 < local66) {
					local42[local52] = local58;
					local46[local52] = local34[local52];
					local50[local52] = local38[local52];
				} else {
					@Pc(100) int local100 = local34[local52];
					local66 = local100 - this.anIntArray675[1];
					if (local66 < 0) {
						local66 = -local66;
					}
					if (local66 > this.anInt9208) {
						local42[local52] = local58;
						local46[local52] = local100;
						local50[local52] = local38[local52];
					} else {
						@Pc(144) int local144 = local38[local52];
						local66 = local144 - this.anIntArray675[2];
						if (local66 < 0) {
							local66 = -local66;
						}
						if (this.anInt9208 < local66) {
							local42[local52] = local58;
							local46[local52] = local100;
							local50[local52] = local144;
						} else {
							local42[local52] = this.anInt9206 * local58 >> 12;
							local46[local52] = local100 * this.anInt9207 >> 12;
							local50[local52] = local144 * this.anInt9205 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
