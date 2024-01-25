import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class1_Sub8_Sub15 extends Class1_Sub8 {

	@OriginalMember(owner = "client!hq", name = "K", descriptor = "[I")
	private final int[] anIntArray350 = new int[3];

	@OriginalMember(owner = "client!hq", name = "P", descriptor = "I")
	private int anInt3411 = 4096;

	@OriginalMember(owner = "client!hq", name = "R", descriptor = "I")
	private int anInt3413 = 3216;

	@OriginalMember(owner = "client!hq", name = "U", descriptor = "I")
	private int anInt3416 = 3216;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub15() {
		super(1, true);
	}

	@OriginalMember(owner = "client!hq", name = "d", descriptor = "(I)V")
	@Override
	public void method6033() {
		this.method2659();
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(Z)V")
	private void method2659() {
		@Pc(19) double local19 = Math.cos((double) ((float) this.anInt3413 / 4096.0F));
		this.anIntArray350[0] = (int) (local19 * Math.sin((double) ((float) this.anInt3416 / 4096.0F)) * 4096.0D);
		this.anIntArray350[1] = (int) (Math.cos((double) ((float) this.anInt3416 / 4096.0F)) * local19 * 4096.0D);
		this.anIntArray350[2] = (int) (Math.sin((double) ((float) this.anInt3413 / 4096.0F)) * 4096.0D);
		@Pc(77) int local77 = this.anIntArray350[0] * this.anIntArray350[0] >> 12;
		@Pc(89) int local89 = this.anIntArray350[1] * this.anIntArray350[1] >> 12;
		@Pc(101) int local101 = this.anIntArray350[2] * this.anIntArray350[2] >> 12;
		@Pc(115) int local115 = (int) (Math.sqrt((double) (local101 + local77 + local89 >> 12)) * 4096.0D);
		if (local115 != 0) {
			this.anIntArray350[0] = (this.anIntArray350[0] << 12) / local115;
			this.anIntArray350[1] = (this.anIntArray350[1] << 12) / local115;
			this.anIntArray350[2] = (this.anIntArray350[2] << 12) / local115;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6031(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass225_41.method5085(arg0);
		if (super.aClass225_41.aBoolean421) {
			@Pc(30) int local30 = Static368.anInt6729 * this.anInt3411 >> 12;
			@Pc(40) int[] local40 = this.method6037(0, arg0 - 1 & Static443.anInt7904);
			@Pc(46) int[] local46 = this.method6037(0, arg0);
			@Pc(56) int[] local56 = this.method6037(0, arg0 + 1 & Static443.anInt7904);
			for (@Pc(58) int local58 = 0; local58 < Static18.anInt439; local58++) {
				@Pc(72) int local72 = (local56[local58] - local40[local58]) * local30 >> 12;
				@Pc(93) int local93 = local30 * (local46[local58 - 1 & Static283.anInt5397] - local46[Static283.anInt5397 & local58 + 1]) >> 12;
				@Pc(97) int local97 = local93 >> 4;
				if (local97 < 0) {
					local97 = -local97;
				}
				@Pc(106) int local106 = local72 >> 4;
				if (local106 < 0) {
					local106 = -local106;
				}
				if (local97 > 255) {
					local97 = 255;
				}
				if (local106 > 255) {
					local106 = 255;
				}
				@Pc(141) int local141 = Class220.aByteArray81[local97 + ((local106 + 1) * local106 >> 1)] & 0xFF;
				@Pc(147) int local147 = local141 * local93 >> 8;
				@Pc(153) int local153 = local141 * local72 >> 8;
				@Pc(159) int local159 = local141 * 4096 >> 8;
				@Pc(168) int local168 = local147 * this.anIntArray350[0] >> 12;
				@Pc(177) int local177 = this.anIntArray350[1] * local153 >> 12;
				@Pc(186) int local186 = this.anIntArray350[2] * local159 >> 12;
				local11[local58] = local186 + local177 + local168;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt3411 = arg1.method1177();
		} else if (arg0 == 1) {
			this.anInt3416 = arg1.method1177();
		} else if (arg0 == 2) {
			this.anInt3413 = arg1.method1177();
		}
	}
}
