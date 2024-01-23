import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class4_Sub6_Sub35 extends Class4_Sub6 {

	@OriginalMember(owner = "client!un", name = "O", descriptor = "I")
	private int anInt5138 = 4096;

	@OriginalMember(owner = "client!un", name = "U", descriptor = "[I")
	private int[] anIntArray454 = new int[3];

	@OriginalMember(owner = "client!un", name = "R", descriptor = "I")
	private int anInt5140 = 4096;

	@OriginalMember(owner = "client!un", name = "K", descriptor = "I")
	private int anInt5135 = 4096;

	@OriginalMember(owner = "client!un", name = "X", descriptor = "I")
	private int anInt5144 = 409;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4379(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = this.aClass84_41.method2153(arg0);
		if (this.aClass84_41.aBoolean183) {
			@Pc(30) int[][] local30 = this.method4377(arg0, 0);
			@Pc(34) int[] local34 = local30[2];
			@Pc(38) int[] local38 = local30[0];
			@Pc(42) int[] local42 = local13[0];
			@Pc(46) int[] local46 = local30[1];
			@Pc(50) int[] local50 = local13[1];
			@Pc(54) int[] local54 = local13[2];
			for (@Pc(56) int local56 = 0; local56 < Static2.anInt19; local56++) {
				@Pc(67) int local67 = local38[local56];
				@Pc(75) int local75 = local67 - this.anIntArray454[0];
				if (local75 < 0) {
					local75 = -local75;
				}
				if (local75 <= this.anInt5144) {
					@Pc(107) int local107 = local46[local56];
					local75 = local107 - this.anIntArray454[1];
					if (local75 < 0) {
						local75 = -local75;
					}
					if (this.anInt5144 >= local75) {
						@Pc(147) int local147 = local34[local56];
						local75 = local147 - this.anIntArray454[2];
						if (local75 < 0) {
							local75 = -local75;
						}
						if (this.anInt5144 >= local75) {
							local42[local56] = local67 * this.anInt5135 >> 12;
							local50[local56] = local107 * this.anInt5140 >> 12;
							local54[local56] = local147 * this.anInt5138 >> 12;
						} else {
							local42[local56] = local67;
							local50[local56] = local107;
							local54[local56] = local147;
						}
					} else {
						local42[local56] = local67;
						local50[local56] = local107;
						local54[local56] = local34[local56];
					}
				} else {
					local42[local56] = local67;
					local50[local56] = local46[local56];
					local54[local56] = local34[local56];
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5144 = arg0.method1837();
		} else if (arg1 == 1) {
			this.anInt5138 = arg0.method1837();
		} else if (arg1 == 2) {
			this.anInt5140 = arg0.method1837();
		} else if (arg1 == 3) {
			this.anInt5135 = arg0.method1837();
		} else if (arg1 == 4) {
			@Pc(65) int local65 = arg0.method1835();
			this.anIntArray454[1] = local65 >> 4 & 0xFF0;
			this.anIntArray454[2] = local65 >> 12 & 0x0;
			this.anIntArray454[0] = (local65 & 0xFF0000) << 4;
		}
	}
}
