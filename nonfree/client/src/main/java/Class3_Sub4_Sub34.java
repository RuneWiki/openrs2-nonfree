import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class3_Sub4_Sub34 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ss", name = "Q", descriptor = "I")
	private int anInt6465 = 0;

	@OriginalMember(owner = "client!ss", name = "N", descriptor = "I")
	private int anInt6462 = 0;

	@OriginalMember(owner = "client!ss", name = "O", descriptor = "I")
	private int anInt6463 = 1;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6465 = arg0.method4096();
		} else if (arg1 == 1) {
			this.anInt6462 = arg0.method4096();
		} else if (arg1 == 3) {
			this.anInt6463 = arg0.method4096();
		}
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method6134(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass109_41.method2831(arg0);
		if (super.aClass109_41.aBoolean250) {
			@Pc(24) int local24 = Static317.anIntArray337[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static148.anInt2687; local32++) {
				@Pc(38) int local38 = Static401.anIntArray419[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(67) int local67;
				if (this.anInt6465 == 0) {
					local67 = (local38 - local24) * this.anInt6463;
				} else {
					@Pc(57) int local57 = local30 * local30 + local44 * local44 >> 12;
					local67 = (int) (Math.sqrt((double) ((float) local57 / 4096.0F)) * 4096.0D);
					local67 = (int) ((double) (local67 * this.anInt6463) * 3.141592653589793D);
				}
				local67 -= local67 & 0xFFFFF000;
				if (this.anInt6462 == 0) {
					local67 = Static418.anIntArray448[local67 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt6462 == 2) {
					local67 -= 2048;
					if (local67 < 0) {
						local67 = -local67;
					}
					local67 = 2048 - local67 << 1;
				}
				local11[local32] = local67;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ss", name = "g", descriptor = "(I)V")
	@Override
	public void method6146() {
		Static417.method5714();
	}
}
