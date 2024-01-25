import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class1_Sub2_Sub2 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ag", name = "L", descriptor = "[I")
	private final int[] anIntArray9 = new int[3];

	@OriginalMember(owner = "client!ag", name = "I", descriptor = "I")
	private int anInt191 = 3216;

	@OriginalMember(owner = "client!ag", name = "M", descriptor = "I")
	private int anInt194 = 4096;

	@OriginalMember(owner = "client!ag", name = "R", descriptor = "I")
	private int anInt197 = 3216;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub2() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "(I)V")
	private void method164() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt191 / 4096.0F));
		this.anIntArray9[0] = (int) (local11 * Math.sin((double) ((float) this.anInt197 / 4096.0F)) * 4096.0D);
		this.anIntArray9[1] = (int) (Math.cos((double) ((float) this.anInt197 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray9[2] = (int) (Math.sin((double) ((float) this.anInt191 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray9[0] * this.anIntArray9[0] >> 12;
		@Pc(89) int local89 = this.anIntArray9[1] * this.anIntArray9[1] >> 12;
		@Pc(101) int local101 = this.anIntArray9[2] * this.anIntArray9[2] >> 12;
		@Pc(114) int local114 = (int) (Math.sqrt((double) (local101 + local89 + local69 >> 12)) * 4096.0D);
		if (local114 != 0) {
			this.anIntArray9[1] = (this.anIntArray9[1] << 12) / local114;
			this.anIntArray9[2] = (this.anIntArray9[2] << 12) / local114;
			this.anIntArray9[0] = (this.anIntArray9[0] << 12) / local114;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5868(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass264_41.method5969(arg0);
		if (super.aClass264_41.aBoolean657) {
			@Pc(27) int local27 = this.anInt194 * Static302.anInt5027 >> 12;
			@Pc(37) int[] local37 = this.method5872(0, Static421.anInt7373 & arg0 - 1);
			@Pc(43) int[] local43 = this.method5872(0, arg0);
			@Pc(53) int[] local53 = this.method5872(0, Static421.anInt7373 & arg0 + 1);
			for (@Pc(55) int local55 = 0; local55 < Static410.anInt7198; local55++) {
				@Pc(70) int local70 = local27 * (local53[local55] - local37[local55]) >> 12;
				@Pc(91) int local91 = (local43[local55 - 1 & Static301.anInt5026] - local43[local55 + 1 & Static301.anInt5026]) * local27 >> 12;
				@Pc(95) int local95 = local91 >> 4;
				if (local95 < 0) {
					local95 = -local95;
				}
				@Pc(107) int local107 = local70 >> 4;
				if (local95 > 255) {
					local95 = 255;
				}
				if (local107 < 0) {
					local107 = -local107;
				}
				if (local107 > 255) {
					local107 = 255;
				}
				@Pc(139) int local139 = Class9_Sub2.aByteArray30[local95 + (local107 * (local107 + 1) >> 1)] & 0xFF;
				@Pc(145) int local145 = local139 * 4096 >> 8;
				@Pc(151) int local151 = local70 * local139 >> 8;
				@Pc(157) int local157 = local91 * local139 >> 8;
				@Pc(166) int local166 = this.anIntArray9[2] * local145 >> 12;
				@Pc(175) int local175 = this.anIntArray9[1] * local151 >> 12;
				@Pc(184) int local184 = this.anIntArray9[0] * local157 >> 12;
				local11[local55] = local166 + local184 + local175;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V")
	@Override
	public void method5864() {
		this.method164();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt194 = arg0.method4498();
		} else if (arg1 == 1) {
			this.anInt197 = arg0.method4498();
		} else if (arg1 == 2) {
			this.anInt191 = arg0.method4498();
		}
	}
}
