import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public final class Class5_Sub2_Sub26 extends Class5_Sub2 {

	@OriginalMember(owner = "client!qu", name = "I", descriptor = "I")
	private int anInt7875 = 3216;

	@OriginalMember(owner = "client!qu", name = "M", descriptor = "I")
	private int anInt7878 = 3216;

	@OriginalMember(owner = "client!qu", name = "J", descriptor = "[I")
	private final int[] anIntArray444 = new int[3];

	@OriginalMember(owner = "client!qu", name = "F", descriptor = "I")
	private int anInt7872 = 4096;

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub26() {
		super(1, true);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7872 = arg0.method5968();
		} else if (arg1 == 1) {
			this.anInt7878 = arg0.method5968();
		} else if (arg1 == 2) {
			this.anInt7875 = arg0.method5968();
		}
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(Z)V")
	private void method6940() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt7875 / 4096.0F));
		this.anIntArray444[0] = (int) (local11 * 4096.0D * Math.sin((double) ((float) this.anInt7878 / 4096.0F)));
		this.anIntArray444[1] = (int) (Math.cos((double) ((float) this.anInt7878 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray444[2] = (int) (Math.sin((double) ((float) this.anInt7875 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray444[0] * this.anIntArray444[0] >> 12;
		@Pc(81) int local81 = this.anIntArray444[1] * this.anIntArray444[1] >> 12;
		@Pc(93) int local93 = this.anIntArray444[2] * this.anIntArray444[2] >> 12;
		@Pc(106) int local106 = (int) (Math.sqrt((double) (local93 + local69 + local81 >> 12)) * 4096.0D);
		if (local106 != 0) {
			this.anIntArray444[1] = (this.anIntArray444[1] << 12) / local106;
			this.anIntArray444[0] = (this.anIntArray444[0] << 12) / local106;
			this.anIntArray444[2] = (this.anIntArray444[2] << 12) / local106;
		}
	}

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "(I)V")
	@Override
	public void method9044() {
		this.method6940();
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9034(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass379_41.method9012(arg0);
		if (super.aClass379_41.aBoolean761) {
			@Pc(29) int local29 = this.anInt7872 * Static219.anInt4124 >> 12;
			@Pc(39) int[] local39 = this.method9042(arg0 - 1 & Static273.anInt4903, 0);
			@Pc(45) int[] local45 = this.method9042(arg0, 0);
			@Pc(57) int[] local57 = this.method9042(arg0 + 1 & Static273.anInt4903, 0);
			for (@Pc(59) int local59 = 0; local59 < Static597.anInt10025; local59++) {
				@Pc(74) int local74 = (local57[local59] - local39[local59]) * local29 >> 12;
				@Pc(95) int local95 = (local45[local59 - 1 & Static28.anInt365] - local45[Static28.anInt365 & local59 + 1]) * local29 >> 12;
				@Pc(99) int local99 = local95 >> 4;
				@Pc(103) int local103 = local74 >> 4;
				if (local99 < 0) {
					local99 = -local99;
				}
				if (local103 < 0) {
					local103 = -local103;
				}
				if (local99 > 255) {
					local99 = 255;
				}
				if (local103 > 255) {
					local103 = 255;
				}
				@Pc(143) int local143 = OutputStream_Sub2.aByteArray13[local99 + (local103 * (local103 + 1) >> 1)] & 0xFF;
				@Pc(149) int local149 = local95 * local143 >> 8;
				@Pc(155) int local155 = local143 * 4096 >> 8;
				@Pc(161) int local161 = local74 * local143 >> 8;
				@Pc(170) int local170 = local149 * this.anIntArray444[0] >> 12;
				@Pc(179) int local179 = this.anIntArray444[1] * local161 >> 12;
				@Pc(188) int local188 = local155 * this.anIntArray444[2] >> 12;
				local18[local59] = local188 + local179 + local170;
			}
		}
		return local18;
	}
}
