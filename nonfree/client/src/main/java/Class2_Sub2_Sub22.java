import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class2_Sub2_Sub22 extends Class2_Sub2 {

	@OriginalMember(owner = "client!kq", name = "F", descriptor = "I")
	private int anInt3595 = 4096;

	@OriginalMember(owner = "client!kq", name = "J", descriptor = "I")
	private int anInt3599 = 3216;

	@OriginalMember(owner = "client!kq", name = "I", descriptor = "I")
	private int anInt3598 = 3216;

	@OriginalMember(owner = "client!kq", name = "L", descriptor = "[I")
	private final int[] anIntArray307 = new int[3];

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub22() {
		super(1, true);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3595 = arg0.method3555();
		} else if (arg1 == 1) {
			this.anInt3599 = arg0.method3555();
		} else if (arg1 == 2) {
			this.anInt3598 = arg0.method3555();
		}
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "(B)V")
	@Override
	public void method5475() {
		this.method2890();
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5465(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass170_41.method3645(arg0);
		if (super.aClass170_41.aBoolean317) {
			@Pc(28) int local28 = Static297.anInt4831 * this.anInt3595 >> 12;
			@Pc(38) int[] local38 = this.method5472(arg0 - 1 & Static157.anInt2698, 0);
			@Pc(44) int[] local44 = this.method5472(arg0, 0);
			@Pc(54) int[] local54 = this.method5472(arg0 + 1 & Static157.anInt2698, 0);
			for (@Pc(56) int local56 = 0; local56 < Static217.anInt3574; local56++) {
				@Pc(71) int local71 = local28 * (local54[local56] - local38[local56]) >> 12;
				@Pc(92) int local92 = (local44[Static127.anInt2287 & local56 - 1] - local44[local56 + 1 & Static127.anInt2287]) * local28 >> 12;
				@Pc(96) int local96 = local92 >> 4;
				@Pc(100) int local100 = local71 >> 4;
				if (local96 < 0) {
					local96 = -local96;
				}
				if (local100 < 0) {
					local100 = -local100;
				}
				if (local96 > 255) {
					local96 = 255;
				}
				if (local100 > 255) {
					local100 = 255;
				}
				@Pc(141) int local141 = Class119.aByteArray29[((local100 + 1) * local100 >> 1) + local96] & 0xFF;
				@Pc(147) int local147 = local92 * local141 >> 8;
				@Pc(153) int local153 = local141 * local71 >> 8;
				@Pc(159) int local159 = local141 * 4096 >> 8;
				@Pc(168) int local168 = this.anIntArray307[0] * local147 >> 12;
				@Pc(177) int local177 = local153 * this.anIntArray307[1] >> 12;
				@Pc(186) int local186 = this.anIntArray307[2] * local159 >> 12;
				local17[local56] = local186 + local177 + local168;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "(B)V")
	private void method2890() {
		@Pc(15) double local15 = Math.cos((double) ((float) this.anInt3598 / 4096.0F));
		this.anIntArray307[0] = (int) (local15 * Math.sin((double) ((float) this.anInt3599 / 4096.0F)) * 4096.0D);
		this.anIntArray307[1] = (int) (Math.cos((double) ((float) this.anInt3599 / 4096.0F)) * 4096.0D * local15);
		this.anIntArray307[2] = (int) (Math.sin((double) ((float) this.anInt3598 / 4096.0F)) * 4096.0D);
		@Pc(73) int local73 = this.anIntArray307[0] * this.anIntArray307[0] >> 12;
		@Pc(85) int local85 = this.anIntArray307[1] * this.anIntArray307[1] >> 12;
		@Pc(97) int local97 = this.anIntArray307[2] * this.anIntArray307[2] >> 12;
		@Pc(110) int local110 = (int) (Math.sqrt((double) (local97 + local85 + local73 >> 12)) * 4096.0D);
		if (local110 != 0) {
			this.anIntArray307[0] = (this.anIntArray307[0] << 12) / local110;
			this.anIntArray307[1] = (this.anIntArray307[1] << 12) / local110;
			this.anIntArray307[2] = (this.anIntArray307[2] << 12) / local110;
		}
	}
}
