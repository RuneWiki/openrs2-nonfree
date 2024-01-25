import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class2_Sub11_Sub6 extends Class2_Sub11 {

	@OriginalMember(owner = "client!gq", name = "I", descriptor = "I")
	private int anInt3478 = 4096;

	@OriginalMember(owner = "client!gq", name = "M", descriptor = "I")
	private int anInt3479 = 3216;

	@OriginalMember(owner = "client!gq", name = "J", descriptor = "I")
	private int anInt3481 = 3216;

	@OriginalMember(owner = "client!gq", name = "D", descriptor = "[I")
	private final int[] anIntArray274 = new int[3];

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub6() {
		super(1, true);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt3478 = arg1.method8575();
		} else if (arg0 == 1) {
			this.anInt3479 = arg1.method8575();
		} else if (arg0 == 2) {
			this.anInt3481 = arg1.method8575();
		}
	}

	@OriginalMember(owner = "client!gq", name = "g", descriptor = "(I)V")
	private void method3057() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt3481 / 4096.0F));
		this.anIntArray274[0] = (int) (Math.sin((double) ((float) this.anInt3479 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray274[1] = (int) (Math.cos((double) ((float) this.anInt3479 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray274[2] = (int) (Math.sin((double) ((float) this.anInt3481 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray274[0] * this.anIntArray274[0] >> 12;
		@Pc(89) int local89 = this.anIntArray274[1] * this.anIntArray274[1] >> 12;
		@Pc(101) int local101 = this.anIntArray274[2] * this.anIntArray274[2] >> 12;
		@Pc(115) int local115 = (int) (Math.sqrt((double) (local69 + local89 + local101 >> 12)) * 4096.0D);
		if (local115 != 0) {
			this.anIntArray274[2] = (this.anIntArray274[2] << 12) / local115;
			this.anIntArray274[1] = (this.anIntArray274[1] << 12) / local115;
			this.anIntArray274[0] = (this.anIntArray274[0] << 12) / local115;
		}
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)V")
	@Override
	public void method9530() {
		this.method3057();
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9531(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass174_41.method3748(arg0, 1);
		if (super.aClass174_41.aBoolean369) {
			@Pc(30) int local30 = Static381.anInt6082 * this.anInt3478 >> 12;
			@Pc(40) int[] local40 = this.method9540(arg0 - 1 & Static332.anInt5074, 0);
			@Pc(46) int[] local46 = this.method9540(arg0, 0);
			@Pc(56) int[] local56 = this.method9540(arg0 + 1 & Static332.anInt5074, 0);
			for (@Pc(58) int local58 = 0; local58 < Static301.anInt10214; local58++) {
				@Pc(73) int local73 = (local56[local58] - local40[local58]) * local30 >> 12;
				@Pc(94) int local94 = local30 * (local46[local58 - 1 & Static78.anInt1356] - local46[local58 + 1 & Static78.anInt1356]) >> 12;
				@Pc(98) int local98 = local94 >> 4;
				@Pc(102) int local102 = local73 >> 4;
				if (local98 < 0) {
					local98 = -local98;
				}
				if (local98 > 255) {
					local98 = 255;
				}
				if (local102 < 0) {
					local102 = -local102;
				}
				if (local102 > 255) {
					local102 = 255;
				}
				@Pc(141) int local141 = Class2_Sub10.aByteArray118[local98 + ((local102 + 1) * local102 >> 1)] & 0xFF;
				@Pc(147) int local147 = local94 * local141 >> 8;
				@Pc(153) int local153 = local141 * 4096 >> 8;
				@Pc(159) int local159 = local141 * local73 >> 8;
				@Pc(168) int local168 = this.anIntArray274[0] * local147 >> 12;
				@Pc(177) int local177 = local159 * this.anIntArray274[1] >> 12;
				@Pc(186) int local186 = this.anIntArray274[2] * local153 >> 12;
				local19[local58] = local177 + local168 + local186;
			}
		}
		return local19;
	}
}
