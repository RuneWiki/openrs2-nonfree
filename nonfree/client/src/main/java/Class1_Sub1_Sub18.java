import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class1_Sub1_Sub18 extends Class1_Sub1 {

	@OriginalMember(owner = "client!lk", name = "ab", descriptor = "[I")
	private int[] anIntArray246 = new int[3];

	@OriginalMember(owner = "client!lk", name = "cb", descriptor = "I")
	private int anInt2798 = 3216;

	@OriginalMember(owner = "client!lk", name = "jb", descriptor = "I")
	private int anInt2803 = 4096;

	@OriginalMember(owner = "client!lk", name = "lb", descriptor = "I")
	private int anInt2805 = 3216;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub18() {
		super(1, true);
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(Z)V")
	private void method2146() {
		@Pc(7) double local7 = Math.cos((double) ((float) this.anInt2805 / 4096.0F));
		this.anIntArray246[0] = (int) (Math.sin((double) ((float) this.anInt2798 / 4096.0F)) * local7 * 4096.0D);
		this.anIntArray246[1] = (int) (Math.cos((double) ((float) this.anInt2798 / 4096.0F)) * 4096.0D * local7);
		this.anIntArray246[2] = (int) (Math.sin((double) ((float) this.anInt2805 / 4096.0F)) * 4096.0D);
		@Pc(73) int local73 = this.anIntArray246[0] * this.anIntArray246[0] >> 12;
		@Pc(85) int local85 = this.anIntArray246[2] * this.anIntArray246[2] >> 12;
		@Pc(97) int local97 = this.anIntArray246[1] * this.anIntArray246[1] >> 12;
		@Pc(111) int local111 = (int) (Math.sqrt((double) (local85 + local73 + local97 >> 12)) * 4096.0D);
		if (local111 != 0) {
			this.anIntArray246[2] = (this.anIntArray246[2] << 12) / local111;
			this.anIntArray246[1] = (this.anIntArray246[1] << 12) / local111;
			this.anIntArray246[0] = (this.anIntArray246[0] << 12) / local111;
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3705(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass37_41.method1168(arg0);
		if (super.aClass37_41.aBoolean131) {
			@Pc(27) int local27 = Static64.anInt1531 * this.anInt2803 >> 12;
			@Pc(37) int[] local37 = this.method3706(Static30.anInt589 & arg0 - 1, 0);
			@Pc(43) int[] local43 = this.method3706(arg0, 0);
			@Pc(53) int[] local53 = this.method3706(Static30.anInt589 & arg0 + 1, 0);
			for (@Pc(55) int local55 = 0; local55 < Static11.anInt294; local55++) {
				@Pc(70) int local70 = local27 * (local53[local55] - local37[local55]) >> 12;
				@Pc(91) int local91 = (local43[local55 - 1 & Static147.anInt3169] - local43[local55 + 1 & Static147.anInt3169]) * local27 >> 12;
				@Pc(95) int local95 = local91 >> 4;
				if (local95 < 0) {
					local95 = -local95;
				}
				if (local95 > 255) {
					local95 = 255;
				}
				@Pc(114) int local114 = local70 >> 4;
				if (local114 < 0) {
					local114 = -local114;
				}
				if (local114 > 255) {
					local114 = 255;
				}
				@Pc(138) int local138 = Class1_Sub26.aByteArray53[((local114 + 1) * local114 >> 1) + local95] & 0xFF;
				@Pc(144) int local144 = local70 * local138 >> 8;
				@Pc(150) int local150 = local91 * local138 >> 8;
				@Pc(159) int local159 = local144 * this.anIntArray246[1] >> 12;
				@Pc(168) int local168 = this.anIntArray246[0] * local150 >> 12;
				@Pc(174) int local174 = local138 * 4096 >> 8;
				@Pc(183) int local183 = local174 * this.anIntArray246[2] >> 12;
				local16[local55] = local183 + local168 + local159;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(Z)V")
	@Override
	public void method3716() {
		this.method2146();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2803 = arg0.method2964();
		} else if (arg1 == 1) {
			this.anInt2798 = arg0.method2964();
		} else if (arg1 == 2) {
			this.anInt2805 = arg0.method2964();
		}
	}
}
