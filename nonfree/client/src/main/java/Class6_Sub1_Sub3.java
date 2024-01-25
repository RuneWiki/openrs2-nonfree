import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class6_Sub1_Sub3 extends Class6_Sub1 {

	@OriginalMember(owner = "client!bh", name = "C", descriptor = "[I")
	public static final int[] anIntArray56 = new int[16384];

	@OriginalMember(owner = "client!bh", name = "I", descriptor = "[I")
	public static final int[] anIntArray58 = new int[16384];

	@OriginalMember(owner = "client!bh", name = "E", descriptor = "I")
	private int anInt958 = 4096;

	@OriginalMember(owner = "client!bh", name = "D", descriptor = "I")
	private int anInt957 = 409;

	@OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
	private int anInt959 = 4096;

	@OriginalMember(owner = "client!bh", name = "H", descriptor = "[I")
	private final int[] anIntArray57 = new int[3];

	@OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
	private int anInt962 = 4096;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray56[local9] = (int) (Math.sin(local7 * (double) local9) * 16384.0D);
			anIntArray58[local9] = (int) (Math.cos(local7 * (double) local9) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt957 = arg0.method8363();
		} else if (arg1 == 1) {
			this.anInt959 = arg0.method8363();
		} else if (arg1 == 2) {
			this.anInt958 = arg0.method8363();
		} else if (arg1 == 3) {
			this.anInt962 = arg0.method8363();
		} else if (arg1 == 4) {
			@Pc(61) int local61 = arg0.method8344();
			this.anIntArray57[2] = local61 >> 12 & 0x0;
			this.anIntArray57[1] = local61 >> 4 & 0xFF0;
			this.anIntArray57[0] = (local61 & 0xFF0000) << 4;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8957(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass54_41.method1386(arg0);
		if (super.aClass54_41.aBoolean81) {
			@Pc(25) int[][] local25 = this.method8959(arg0, 0);
			@Pc(29) int[] local29 = local25[0];
			@Pc(33) int[] local33 = local25[1];
			@Pc(37) int[] local37 = local25[2];
			@Pc(41) int[] local41 = local11[0];
			@Pc(45) int[] local45 = local11[1];
			@Pc(49) int[] local49 = local11[2];
			for (@Pc(51) int local51 = 0; local51 < Static479.anInt8231; local51++) {
				@Pc(57) int local57 = local29[local51];
				@Pc(65) int local65 = local57 - this.anIntArray57[0];
				if (local65 < 0) {
					local65 = -local65;
				}
				if (local65 > this.anInt957) {
					local41[local51] = local57;
					local45[local51] = local33[local51];
					local49[local51] = local37[local51];
				} else {
					@Pc(100) int local100 = local33[local51];
					local65 = local100 - this.anIntArray57[1];
					if (local65 < 0) {
						local65 = -local65;
					}
					if (local65 > this.anInt957) {
						local41[local51] = local57;
						local45[local51] = local100;
						local49[local51] = local37[local51];
					} else {
						@Pc(140) int local140 = local37[local51];
						local65 = local140 - this.anIntArray57[2];
						if (local65 < 0) {
							local65 = -local65;
						}
						if (local65 > this.anInt957) {
							local41[local51] = local57;
							local45[local51] = local100;
							local49[local51] = local140;
						} else {
							local41[local51] = local57 * this.anInt962 >> 12;
							local45[local51] = local100 * this.anInt958 >> 12;
							local49[local51] = this.anInt959 * local140 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
