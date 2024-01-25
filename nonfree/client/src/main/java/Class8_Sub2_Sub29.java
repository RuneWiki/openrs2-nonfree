import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class8_Sub2_Sub29 extends Class8_Sub2 {

	@OriginalMember(owner = "client!qh", name = "H", descriptor = "I")
	private int anInt8363 = 3216;

	@OriginalMember(owner = "client!qh", name = "O", descriptor = "I")
	private int anInt8368 = 4096;

	@OriginalMember(owner = "client!qh", name = "Q", descriptor = "I")
	private int anInt8369 = 3216;

	@OriginalMember(owner = "client!qh", name = "R", descriptor = "[I")
	private final int[] anIntArray449 = new int[3];

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub29() {
		super(1, true);
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method8507(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass50_41.method1685(arg0);
		if (super.aClass50_41.aBoolean135) {
			@Pc(28) int local28 = Static174.anInt4171 * this.anInt8368 >> 12;
			@Pc(38) int[] local38 = this.method8505(Static17.anInt866 & arg0 - 1, 0);
			@Pc(44) int[] local44 = this.method8505(arg0, 0);
			@Pc(54) int[] local54 = this.method8505(arg0 + 1 & Static17.anInt866, 0);
			for (@Pc(56) int local56 = 0; local56 < Static538.anInt9297; local56++) {
				@Pc(71) int local71 = local28 * (local54[local56] - local38[local56]) >> 12;
				@Pc(91) int local91 = local28 * (local44[Static263.anInt5634 & local56 - 1] - local44[Static263.anInt5634 & local56 + 1]) >> 12;
				@Pc(95) int local95 = local91 >> 4;
				@Pc(99) int local99 = local71 >> 4;
				if (local95 < 0) {
					local95 = -local95;
				}
				if (local99 < 0) {
					local99 = -local99;
				}
				if (local95 > 255) {
					local95 = 255;
				}
				if (local99 > 255) {
					local99 = 255;
				}
				@Pc(136) int local136 = Class255.aByteArray68[local95 + (local99 * (local99 + 1) >> 1)] & 0xFF;
				@Pc(142) int local142 = local136 * local71 >> 8;
				@Pc(148) int local148 = local91 * local136 >> 8;
				@Pc(154) int local154 = local136 * 4096 >> 8;
				@Pc(163) int local163 = local154 * this.anIntArray449[2] >> 12;
				@Pc(172) int local172 = local148 * this.anIntArray449[0] >> 12;
				@Pc(181) int local181 = local142 * this.anIntArray449[1] >> 12;
				local17[local56] = local181 + local172 + local163;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)V")
	private void method6907() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt8363 / 4096.0F));
		this.anIntArray449[0] = (int) (local11 * 4096.0D * Math.sin((double) ((float) this.anInt8369 / 4096.0F)));
		this.anIntArray449[1] = (int) (Math.cos((double) ((float) this.anInt8369 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray449[2] = (int) (Math.sin((double) ((float) this.anInt8363 / 4096.0F)) * 4096.0D);
		@Pc(74) int local74 = this.anIntArray449[0] * this.anIntArray449[0] >> 12;
		@Pc(86) int local86 = this.anIntArray449[1] * this.anIntArray449[1] >> 12;
		@Pc(98) int local98 = this.anIntArray449[2] * this.anIntArray449[2] >> 12;
		@Pc(111) int local111 = (int) (Math.sqrt((double) (local86 + local74 + local98 >> 12)) * 4096.0D);
		if (local111 != 0) {
			this.anIntArray449[1] = (this.anIntArray449[1] << 12) / local111;
			this.anIntArray449[2] = (this.anIntArray449[2] << 12) / local111;
			this.anIntArray449[0] = (this.anIntArray449[0] << 12) / local111;
		}
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)V")
	@Override
	public void method8508() {
		this.method6907();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt8368 = arg1.method8578();
		} else if (arg0 == 1) {
			this.anInt8369 = arg1.method8578();
		} else if (arg0 == 2) {
			this.anInt8363 = arg1.method8578();
		}
	}
}
