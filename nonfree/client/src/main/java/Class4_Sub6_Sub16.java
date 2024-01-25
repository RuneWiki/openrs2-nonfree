import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class4_Sub6_Sub16 extends Class4_Sub6 {

	@OriginalMember(owner = "client!jr", name = "N", descriptor = "I")
	private int anInt3715 = 3216;

	@OriginalMember(owner = "client!jr", name = "J", descriptor = "I")
	private int anInt3712 = 4096;

	@OriginalMember(owner = "client!jr", name = "O", descriptor = "I")
	private int anInt3716 = 3216;

	@OriginalMember(owner = "client!jr", name = "T", descriptor = "[I")
	private final int[] anIntArray253 = new int[3];

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub16() {
		super(1, true);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Z)V")
	@Override
	public void method5509() {
		this.method3073();
	}

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "(I)V")
	private void method3073() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt3716 / 4096.0F));
		this.anIntArray253[0] = (int) (local11 * Math.sin((double) ((float) this.anInt3715 / 4096.0F)) * 4096.0D);
		this.anIntArray253[1] = (int) (local11 * 4096.0D * Math.cos((double) ((float) this.anInt3715 / 4096.0F)));
		this.anIntArray253[2] = (int) (Math.sin((double) ((float) this.anInt3716 / 4096.0F)) * 4096.0D);
		@Pc(75) int local75 = this.anIntArray253[0] * this.anIntArray253[0] >> 12;
		@Pc(87) int local87 = this.anIntArray253[1] * this.anIntArray253[1] >> 12;
		@Pc(99) int local99 = this.anIntArray253[2] * this.anIntArray253[2] >> 12;
		@Pc(112) int local112 = (int) (Math.sqrt((double) (local99 + local87 + local75 >> 12)) * 4096.0D);
		if (local112 != 0) {
			this.anIntArray253[2] = (this.anIntArray253[2] << 12) / local112;
			this.anIntArray253[1] = (this.anIntArray253[1] << 12) / local112;
			this.anIntArray253[0] = (this.anIntArray253[0] << 12) / local112;
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt3712 = arg1.method2536();
		} else if (arg0 == 1) {
			this.anInt3715 = arg1.method2536();
		} else if (arg0 == 2) {
			this.anInt3716 = arg1.method2536();
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5510(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass82_41.method2265(arg0);
		if (super.aClass82_41.aBoolean243) {
			@Pc(30) int local30 = Static256.anInt4776 * this.anInt3712 >> 12;
			@Pc(40) int[] local40 = this.method5508(arg0 - 1 & Static211.anInt3929, 0);
			@Pc(46) int[] local46 = this.method5508(arg0, 0);
			@Pc(56) int[] local56 = this.method5508(Static211.anInt3929 & arg0 + 1, 0);
			for (@Pc(58) int local58 = 0; local58 < Static80.anInt1616; local58++) {
				@Pc(73) int local73 = (local56[local58] - local40[local58]) * local30 >> 12;
				@Pc(93) int local93 = local30 * (local46[local58 - 1 & Static203.anInt3883] - local46[Static203.anInt3883 & local58 + 1]) >> 12;
				@Pc(97) int local97 = local93 >> 4;
				@Pc(101) int local101 = local73 >> 4;
				if (local97 < 0) {
					local97 = -local97;
				}
				if (local101 < 0) {
					local101 = -local101;
				}
				if (local97 > 255) {
					local97 = 255;
				}
				if (local101 > 255) {
					local101 = 255;
				}
				@Pc(141) int local141 = Class9.aByteArray98[local97 + (local101 * (local101 + 1) >> 1)] & 0xFF;
				@Pc(147) int local147 = local93 * local141 >> 8;
				@Pc(153) int local153 = local141 * 4096 >> 8;
				@Pc(159) int local159 = local141 * local73 >> 8;
				@Pc(168) int local168 = local147 * this.anIntArray253[0] >> 12;
				@Pc(177) int local177 = local159 * this.anIntArray253[1] >> 12;
				@Pc(186) int local186 = this.anIntArray253[2] * local153 >> 12;
				local19[local58] = local186 + local168 + local177;
			}
		}
		return local19;
	}
}
