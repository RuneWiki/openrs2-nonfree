import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hea")
public final class Class3_Sub2_Sub13 extends Class3_Sub2 {

	@OriginalMember(owner = "client!hea", name = "C", descriptor = "I")
	private int anInt4025 = 4096;

	@OriginalMember(owner = "client!hea", name = "B", descriptor = "I")
	private int anInt4024 = 3216;

	@OriginalMember(owner = "client!hea", name = "E", descriptor = "I")
	private int anInt4027 = 3216;

	@OriginalMember(owner = "client!hea", name = "z", descriptor = "[I")
	private final int[] anIntArray210 = new int[3];

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub13() {
		super(1, true);
	}

	@OriginalMember(owner = "client!hea", name = "c", descriptor = "(I)V")
	private void method3560() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt4024 / 4096.0F));
		this.anIntArray210[0] = (int) (local11 * 4096.0D * Math.sin((double) ((float) this.anInt4027 / 4096.0F)));
		this.anIntArray210[1] = (int) (local11 * Math.cos((double) ((float) this.anInt4027 / 4096.0F)) * 4096.0D);
		this.anIntArray210[2] = (int) (Math.sin((double) ((float) this.anInt4024 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray210[0] * this.anIntArray210[0] >> 12;
		@Pc(81) int local81 = this.anIntArray210[1] * this.anIntArray210[1] >> 12;
		@Pc(93) int local93 = this.anIntArray210[2] * this.anIntArray210[2] >> 12;
		@Pc(107) int local107 = (int) (Math.sqrt((double) (local69 + local81 + local93 >> 12)) * 4096.0D);
		if (local107 != 0) {
			this.anIntArray210[1] = (this.anIntArray210[1] << 12) / local107;
			this.anIntArray210[2] = (this.anIntArray210[2] << 12) / local107;
			this.anIntArray210[0] = (this.anIntArray210[0] << 12) / local107;
		}
	}

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "(I)V")
	@Override
	public void method8598() {
		this.method3560();
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8594(@OriginalArg(1) int arg0) {
		@Pc(27) int[] local27 = super.aClass40_41.method1572(arg0);
		if (super.aClass40_41.aBoolean97) {
			@Pc(38) int local38 = Static317.anInt5971 * this.anInt4025 >> 12;
			@Pc(48) int[] local48 = this.method8603(Class4_Sub1_Sub3_Sub2.lb & arg0 - 1, 0);
			@Pc(54) int[] local54 = this.method8603(arg0, 0);
			@Pc(64) int[] local64 = this.method8603(arg0 + 1 & Class4_Sub1_Sub3_Sub2.lb, 0);
			for (@Pc(66) int local66 = 0; local66 < Static491.anInt8519; local66++) {
				@Pc(80) int local80 = local38 * (local64[local66] - local48[local66]) >> 12;
				@Pc(101) int local101 = (local54[Static309.anInt5846 & local66 - 1] - local54[local66 + 1 & Static309.anInt5846]) * local38 >> 12;
				@Pc(105) int local105 = local101 >> 4;
				if (local105 < 0) {
					local105 = -local105;
				}
				@Pc(114) int local114 = local80 >> 4;
				if (local114 < 0) {
					local114 = -local114;
				}
				if (local105 > 255) {
					local105 = 255;
				}
				if (local114 > 255) {
					local114 = 255;
				}
				@Pc(150) int local150 = Class141_Sub3.aByteArray93[local105 + ((local114 + 1) * local114 >> 1)] & 0xFF;
				@Pc(156) int local156 = local101 * local150 >> 8;
				@Pc(162) int local162 = local80 * local150 >> 8;
				@Pc(168) int local168 = local150 * 4096 >> 8;
				@Pc(177) int local177 = this.anIntArray210[0] * local156 >> 12;
				@Pc(186) int local186 = local162 * this.anIntArray210[1] >> 12;
				@Pc(195) int local195 = this.anIntArray210[2] * local168 >> 12;
				local27[local66] = local186 + local177 + local195;
			}
		}
		return local27;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4025 = arg0.method4221();
		} else if (arg1 == 1) {
			this.anInt4027 = arg0.method4221();
		} else if (arg1 == 2) {
			this.anInt4024 = arg0.method4221();
		}
	}
}
