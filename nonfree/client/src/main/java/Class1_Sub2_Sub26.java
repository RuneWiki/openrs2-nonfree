import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class1_Sub2_Sub26 extends Class1_Sub2 {

	@OriginalMember(owner = "client!oi", name = "U", descriptor = "Z")
	private boolean aBoolean178 = true;

	@OriginalMember(owner = "client!oi", name = "ab", descriptor = "I")
	private int anInt3250 = 4096;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub26() {
		super(1, false);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3512(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass74_41.method2454(arg0);
		if (super.aClass74_41.aBoolean175) {
			@Pc(32) int[] local32 = this.method3514(arg0 - 1 & Static92.anInt2170, 0);
			@Pc(38) int[] local38 = this.method3514(arg0, 0);
			@Pc(48) int[] local48 = this.method3514(Static92.anInt2170 & arg0 + 1, 0);
			@Pc(52) int[] local52 = local16[0];
			@Pc(56) int[] local56 = local16[1];
			@Pc(60) int[] local60 = local16[2];
			for (@Pc(62) int local62 = 0; local62 < Static105.anInt2391; local62++) {
				@Pc(75) int local75 = this.anInt3250 * (local48[local62] - local32[local62]);
				@Pc(95) int local95 = (local38[local62 + 1 & Static32.anInt814] - local38[local62 - 1 & Static32.anInt814]) * this.anInt3250;
				@Pc(99) int local99 = local75 >> 12;
				@Pc(103) int local103 = local95 >> 12;
				@Pc(109) int local109 = local103 * local103 >> 12;
				@Pc(115) int local115 = local99 * local99 >> 12;
				@Pc(129) int local129 = (int) (Math.sqrt((double) ((float) (local115 + local109 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(133) int local133;
				@Pc(137) int local137;
				@Pc(135) int local135;
				if (local129 == 0) {
					local133 = 0;
					local135 = 0;
					local137 = 0;
				} else {
					local137 = local75 / local129;
					local135 = 16777216 / local129;
					local133 = local95 / local129;
				}
				if (this.aBoolean178) {
					local135 = (local135 >> 1) + 2048;
					local133 = (local133 >> 1) + 2048;
					local137 = (local137 >> 1) + 2048;
				}
				local52[local62] = local133;
				local56[local62] = local137;
				local60[local62] = local135;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3250 = arg0.method946();
		} else if (arg1 == 1) {
			this.aBoolean178 = arg0.method895() == 1;
		}
	}
}
