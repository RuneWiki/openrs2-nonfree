import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class2_Sub2_Sub23 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ni", name = "P", descriptor = "I")
	private int anInt5016 = 4096;

	@OriginalMember(owner = "client!ni", name = "N", descriptor = "[I")
	private final int[] anIntArray419 = new int[3];

	@OriginalMember(owner = "client!ni", name = "I", descriptor = "I")
	private int anInt5012 = 3216;

	@OriginalMember(owner = "client!ni", name = "Q", descriptor = "I")
	private int anInt5017 = 3216;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub23() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
	@Override
	public void method6262() {
		this.method3959();
	}

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "(Z)V")
	private void method3959() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt5017 / 4096.0F));
		this.anIntArray419[0] = (int) (local11 * Math.sin((double) ((float) this.anInt5012 / 4096.0F)) * 4096.0D);
		this.anIntArray419[1] = (int) (Math.cos((double) ((float) this.anInt5012 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray419[2] = (int) (Math.sin((double) ((float) this.anInt5017 / 4096.0F)) * 4096.0D);
		@Pc(74) int local74 = this.anIntArray419[0] * this.anIntArray419[0] >> 12;
		@Pc(86) int local86 = this.anIntArray419[1] * this.anIntArray419[1] >> 12;
		@Pc(98) int local98 = this.anIntArray419[2] * this.anIntArray419[2] >> 12;
		@Pc(111) int local111 = (int) (Math.sqrt((double) (local98 + local86 + local74 >> 12)) * 4096.0D);
		if (local111 != 0) {
			this.anIntArray419[2] = (this.anIntArray419[2] << 12) / local111;
			this.anIntArray419[0] = (this.anIntArray419[0] << 12) / local111;
			this.anIntArray419[1] = (this.anIntArray419[1] << 12) / local111;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5016 = arg0.method6148();
		} else if (arg1 == 1) {
			this.anInt5012 = arg0.method6148();
		} else if (arg1 == 2) {
			this.anInt5017 = arg0.method6148();
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6274(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass234_41.method5375(arg0);
		if (super.aClass234_41.aBoolean454) {
			@Pc(22) int local22 = Static271.anInt4923 * this.anInt5016 >> 12;
			@Pc(32) int[] local32 = this.method6266(0, arg0 - 1 & Static71.anInt1203);
			@Pc(38) int[] local38 = this.method6266(0, arg0);
			@Pc(48) int[] local48 = this.method6266(0, arg0 + 1 & Static71.anInt1203);
			for (@Pc(50) int local50 = 0; local50 < Static398.anInt6955; local50++) {
				@Pc(65) int local65 = local22 * (local48[local50] - local32[local50]) >> 12;
				@Pc(86) int local86 = local22 * (local38[local50 - 1 & Static210.anInt3600] - local38[Static210.anInt3600 & local50 + 1]) >> 12;
				@Pc(90) int local90 = local86 >> 4;
				if (local90 < 0) {
					local90 = -local90;
				}
				@Pc(102) int local102 = local65 >> 4;
				if (local90 > 255) {
					local90 = 255;
				}
				if (local102 < 0) {
					local102 = -local102;
				}
				if (local102 > 255) {
					local102 = 255;
				}
				@Pc(134) int local134 = Class116.aByteArray38[local90 + (local102 * (local102 + 1) >> 1)] & 0xFF;
				@Pc(140) int local140 = local134 * local65 >> 8;
				@Pc(146) int local146 = local134 * 4096 >> 8;
				@Pc(152) int local152 = local86 * local134 >> 8;
				@Pc(161) int local161 = local152 * this.anIntArray419[0] >> 12;
				@Pc(170) int local170 = this.anIntArray419[1] * local140 >> 12;
				@Pc(179) int local179 = local146 * this.anIntArray419[2] >> 12;
				local11[local50] = local179 + local161 + local170;
			}
		}
		return local11;
	}
}
