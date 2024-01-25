import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class1_Sub3_Sub31 extends Class1_Sub3 {

	@OriginalMember(owner = "client!sv", name = "I", descriptor = "I")
	private int anInt6458 = 3216;

	@OriginalMember(owner = "client!sv", name = "R", descriptor = "I")
	private int anInt6465 = 4096;

	@OriginalMember(owner = "client!sv", name = "T", descriptor = "[I")
	private final int[] anIntArray534 = new int[3];

	@OriginalMember(owner = "client!sv", name = "S", descriptor = "I")
	private int anInt6466 = 3216;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub31() {
		super(1, true);
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6084(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass172_41.method3962(arg0);
		if (super.aClass172_41.aBoolean327) {
			@Pc(27) int local27 = this.anInt6465 * Static286.anInt4991 >> 12;
			@Pc(39) int[] local39 = this.method6076(0, arg0 - 1 & Static274.anInt4887);
			@Pc(45) int[] local45 = this.method6076(0, arg0);
			@Pc(57) int[] local57 = this.method6076(0, arg0 + 1 & Static274.anInt4887);
			for (@Pc(59) int local59 = 0; local59 < Static347.anInt5974; local59++) {
				@Pc(74) int local74 = local27 * (local57[local59] - local39[local59]) >> 12;
				@Pc(95) int local95 = local27 * (local45[local59 - 1 & Static307.anInt5524] - local45[local59 + 1 & Static307.anInt5524]) >> 12;
				@Pc(99) int local99 = local95 >> 4;
				@Pc(103) int local103 = local74 >> 4;
				if (local99 < 0) {
					local99 = -local99;
				}
				if (local99 > 255) {
					local99 = 255;
				}
				if (local103 < 0) {
					local103 = -local103;
				}
				if (local103 > 255) {
					local103 = 255;
				}
				@Pc(141) int local141 = Class104.aByteArray39[(local103 * (local103 + 1) >> 1) + local99] & 0xFF;
				@Pc(147) int local147 = local141 * local74 >> 8;
				@Pc(153) int local153 = local141 * local95 >> 8;
				@Pc(159) int local159 = local141 * 4096 >> 8;
				@Pc(168) int local168 = this.anIntArray534[1] * local147 >> 12;
				@Pc(177) int local177 = local159 * this.anIntArray534[2] >> 12;
				@Pc(186) int local186 = this.anIntArray534[0] * local153 >> 12;
				local16[local59] = local177 + local168 + local186;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "(B)V")
	private void method5165() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt6466 / 4096.0F));
		this.anIntArray534[0] = (int) (Math.sin((double) ((float) this.anInt6458 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray534[1] = (int) (Math.cos((double) ((float) this.anInt6458 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray534[2] = (int) (Math.sin((double) ((float) this.anInt6466 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray534[0] * this.anIntArray534[0] >> 12;
		@Pc(85) int local85 = this.anIntArray534[1] * this.anIntArray534[1] >> 12;
		@Pc(97) int local97 = this.anIntArray534[2] * this.anIntArray534[2] >> 12;
		@Pc(112) int local112 = (int) (Math.sqrt((double) (local69 + local85 + local97 >> 12)) * 4096.0D);
		if (local112 != 0) {
			this.anIntArray534[2] = (this.anIntArray534[2] << 12) / local112;
			this.anIntArray534[0] = (this.anIntArray534[0] << 12) / local112;
			this.anIntArray534[1] = (this.anIntArray534[1] << 12) / local112;
		}
	}

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "(I)V")
	@Override
	public void method6074() {
		this.method5165();
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6465 = arg0.method4093();
		} else if (arg1 == 1) {
			this.anInt6458 = arg0.method4093();
		} else if (arg1 == 2) {
			this.anInt6466 = arg0.method4093();
		}
	}
}
