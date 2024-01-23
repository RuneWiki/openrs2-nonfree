import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ai", name = "Z", descriptor = "I")
	private int anInt218 = 409;

	@OriginalMember(owner = "client!ai", name = "db", descriptor = "[I")
	private int[] anIntArray12 = new int[3];

	@OriginalMember(owner = "client!ai", name = "hb", descriptor = "I")
	private int anInt223 = 4096;

	@OriginalMember(owner = "client!ai", name = "gb", descriptor = "I")
	private int anInt222 = 4096;

	@OriginalMember(owner = "client!ai", name = "jb", descriptor = "I")
	private int anInt225 = 4096;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3735(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass75_41.method2410(arg0);
		if (super.aClass75_41.aBoolean134) {
			@Pc(29) int[][] local29 = this.method3737(0, arg0);
			@Pc(33) int[] local33 = local29[2];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[0];
			@Pc(45) int[] local45 = local11[1];
			@Pc(49) int[] local49 = local11[0];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static157.anInt3431; local55++) {
				@Pc(61) int local61 = local41[local55];
				@Pc(69) int local69 = local61 - this.anIntArray12[0];
				if (local69 < 0) {
					local69 = -local69;
				}
				if (this.anInt218 < local69) {
					local49[local55] = local61;
					local45[local55] = local37[local55];
					local53[local55] = local33[local55];
				} else {
					@Pc(100) int local100 = local37[local55];
					local69 = local100 - this.anIntArray12[1];
					if (local69 < 0) {
						local69 = -local69;
					}
					if (local69 > this.anInt218) {
						local49[local55] = local61;
						local45[local55] = local100;
						local53[local55] = local33[local55];
					} else {
						@Pc(137) int local137 = local33[local55];
						local69 = local137 - this.anIntArray12[2];
						if (local69 < 0) {
							local69 = -local69;
						}
						if (this.anInt218 < local69) {
							local49[local55] = local61;
							local45[local55] = local100;
							local53[local55] = local137;
						} else {
							local49[local55] = this.anInt225 * local61 >> 12;
							local45[local55] = this.anInt222 * local100 >> 12;
							local53[local55] = this.anInt223 * local137 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt218 = arg0.method3805();
		} else if (arg1 == 1) {
			this.anInt223 = arg0.method3805();
		} else if (arg1 == 2) {
			this.anInt222 = arg0.method3805();
		} else if (arg1 == 3) {
			this.anInt225 = arg0.method3805();
		} else if (arg1 == 4) {
			@Pc(56) int local56 = arg0.method3806();
			this.anIntArray12[0] = (local56 & 0xFF0000) << 4;
			this.anIntArray12[1] = local56 >> 4 & 0xFF0;
			this.anIntArray12[2] = local56 >> 12 & 0x0;
		}
	}
}
