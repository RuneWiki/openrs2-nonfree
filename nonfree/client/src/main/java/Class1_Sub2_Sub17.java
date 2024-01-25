import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class1_Sub2_Sub17 extends Class1_Sub2 {

	@OriginalMember(owner = "client!il", name = "G", descriptor = "I")
	private int anInt2743 = 4096;

	@OriginalMember(owner = "client!il", name = "I", descriptor = "[I")
	private final int[] anIntArray325 = new int[3];

	@OriginalMember(owner = "client!il", name = "Q", descriptor = "I")
	private int anInt2751 = 3216;

	@OriginalMember(owner = "client!il", name = "J", descriptor = "I")
	private int anInt2745 = 3216;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub17() {
		super(1, true);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt2743 = arg1.method3115();
		} else if (arg0 == 1) {
			this.anInt2751 = arg1.method3115();
		} else if (arg0 == 2) {
			this.anInt2745 = arg1.method3115();
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V")
	private void method2662() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt2745 / 4096.0F));
		this.anIntArray325[0] = (int) (Math.sin((double) ((float) this.anInt2751 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray325[1] = (int) (local11 * 4096.0D * Math.cos((double) ((float) this.anInt2751 / 4096.0F)));
		this.anIntArray325[2] = (int) (Math.sin((double) ((float) this.anInt2745 / 4096.0F)) * 4096.0D);
		@Pc(75) int local75 = this.anIntArray325[0] * this.anIntArray325[0] >> 12;
		@Pc(87) int local87 = this.anIntArray325[1] * this.anIntArray325[1] >> 12;
		@Pc(99) int local99 = this.anIntArray325[2] * this.anIntArray325[2] >> 12;
		@Pc(112) int local112 = (int) (Math.sqrt((double) (local99 + local87 + local75 >> 12)) * 4096.0D);
		if (local112 != 0) {
			this.anIntArray325[0] = (this.anIntArray325[0] << 12) / local112;
			this.anIntArray325[2] = (this.anIntArray325[2] << 12) / local112;
			this.anIntArray325[1] = (this.anIntArray325[1] << 12) / local112;
		}
	}

	@OriginalMember(owner = "client!il", name = "d", descriptor = "(I)V")
	@Override
	public void method5661() {
		this.method2662();
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5662(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass84_41.method2422(arg0);
		if (super.aClass84_41.aBoolean227) {
			@Pc(27) int local27 = this.anInt2743 * Static102.anInt2096 >> 12;
			@Pc(39) int[] local39 = this.method5654(0, Static206.anInt4136 & arg0 - 1);
			@Pc(47) int[] local47 = this.method5654(0, arg0);
			@Pc(59) int[] local59 = this.method5654(0, arg0 + 1 & Static206.anInt4136);
			for (@Pc(61) int local61 = 0; local61 < Static251.anInt6509; local61++) {
				@Pc(76) int local76 = (local59[local61] - local39[local61]) * local27 >> 12;
				@Pc(97) int local97 = (local47[Static260.anInt5056 & local61 - 1] - local47[Static260.anInt5056 & local61 + 1]) * local27 >> 12;
				@Pc(101) int local101 = local97 >> 4;
				if (local101 < 0) {
					local101 = -local101;
				}
				@Pc(113) int local113 = local76 >> 4;
				if (local113 < 0) {
					local113 = -local113;
				}
				if (local101 > 255) {
					local101 = 255;
				}
				if (local113 > 255) {
					local113 = 255;
				}
				@Pc(146) int local146 = Class10_Sub4.aByteArray87[local101 + (local113 * (local113 + 1) >> 1)] & 0xFF;
				@Pc(152) int local152 = local97 * local146 >> 8;
				@Pc(158) int local158 = local76 * local146 >> 8;
				@Pc(164) int local164 = local146 * 4096 >> 8;
				@Pc(173) int local173 = this.anIntArray325[2] * local164 >> 12;
				@Pc(182) int local182 = this.anIntArray325[1] * local158 >> 12;
				@Pc(191) int local191 = local152 * this.anIntArray325[0] >> 12;
				local11[local61] = local182 + local191 + local173;
			}
		}
		return local11;
	}
}
