import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class3_Sub1_Sub35 extends Class3_Sub1 {

	@OriginalMember(owner = "client!uh", name = "B", descriptor = "[I")
	private final int[] anIntArray727 = new int[3];

	@OriginalMember(owner = "client!uh", name = "C", descriptor = "I")
	private int anInt10051 = 3216;

	@OriginalMember(owner = "client!uh", name = "z", descriptor = "I")
	private int anInt10055 = 3216;

	@OriginalMember(owner = "client!uh", name = "G", descriptor = "I")
	private int anInt10056 = 4096;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub35() {
		super(1, true);
	}

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)V")
	private void method8575() {
		@Pc(19) double local19 = Math.cos((double) ((float) this.anInt10051 / 4096.0F));
		this.anIntArray727[0] = (int) (Math.sin((double) ((float) this.anInt10055 / 4096.0F)) * 4096.0D * local19);
		this.anIntArray727[1] = (int) (local19 * Math.cos((double) ((float) this.anInt10055 / 4096.0F)) * 4096.0D);
		this.anIntArray727[2] = (int) (Math.sin((double) ((float) this.anInt10051 / 4096.0F)) * 4096.0D);
		@Pc(77) int local77 = this.anIntArray727[0] * this.anIntArray727[0] >> 12;
		@Pc(89) int local89 = this.anIntArray727[1] * this.anIntArray727[1] >> 12;
		@Pc(101) int local101 = this.anIntArray727[2] * this.anIntArray727[2] >> 12;
		@Pc(114) int local114 = (int) (Math.sqrt((double) (local89 + local77 + local101 >> 12)) * 4096.0D);
		if (local114 != 0) {
			this.anIntArray727[1] = (this.anIntArray727[1] << 12) / local114;
			this.anIntArray727[0] = (this.anIntArray727[0] << 12) / local114;
			this.anIntArray727[2] = (this.anIntArray727[2] << 12) / local114;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9573(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass305_41.method6989(arg0);
		if (super.aClass305_41.aBoolean550) {
			@Pc(28) int local28 = Static416.anInt3517 * this.anInt10056 >> 12;
			@Pc(38) int[] local38 = this.method9577(0, Static652.anInt2344 & arg0 - 1);
			@Pc(44) int[] local44 = this.method9577(0, arg0);
			@Pc(56) int[] local56 = this.method9577(0, arg0 + 1 & Static652.anInt2344);
			for (@Pc(58) int local58 = 0; local58 < Static379.anInt5859; local58++) {
				@Pc(73) int local73 = local28 * (local56[local58] - local38[local58]) >> 12;
				@Pc(93) int local93 = (local44[Static711.anInt10997 & local58 - 1] - local44[local58 + 1 & Static711.anInt10997]) * local28 >> 12;
				@Pc(97) int local97 = local93 >> 4;
				if (local97 < 0) {
					local97 = -local97;
				}
				@Pc(109) int local109 = local73 >> 4;
				if (local109 < 0) {
					local109 = -local109;
				}
				if (local97 > 255) {
					local97 = 255;
				}
				if (local109 > 255) {
					local109 = 255;
				}
				@Pc(141) int local141 = Class3_Sub1_Sub36.aByteArray108[local97 + (local109 * (local109 + 1) >> 1)] & 0xFF;
				@Pc(147) int local147 = local93 * local141 >> 8;
				@Pc(153) int local153 = local141 * local73 >> 8;
				@Pc(159) int local159 = local141 * 4096 >> 8;
				@Pc(168) int local168 = local153 * this.anIntArray727[1] >> 12;
				@Pc(177) int local177 = this.anIntArray727[0] * local147 >> 12;
				@Pc(186) int local186 = this.anIntArray727[2] * local159 >> 12;
				local11[local58] = local168 + local177 + local186;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
	@Override
	public void method9578() {
		this.method8575();
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt10056 = arg1.method2028(-14795);
		} else if (arg0 == 1) {
			this.anInt10055 = arg1.method2028(-14795);
		} else if (arg0 == 2) {
			this.anInt10051 = arg1.method2028(-14795);
		}
	}
}
