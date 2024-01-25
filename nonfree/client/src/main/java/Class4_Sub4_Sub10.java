import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class4_Sub4_Sub10 extends Class4_Sub4 {

	@OriginalMember(owner = "client!ho", name = "M", descriptor = "I")
	private int anInt4236 = 3216;

	@OriginalMember(owner = "client!ho", name = "Q", descriptor = "I")
	private int anInt4238 = 3216;

	@OriginalMember(owner = "client!ho", name = "L", descriptor = "I")
	private int anInt4235 = 4096;

	@OriginalMember(owner = "client!ho", name = "N", descriptor = "[I")
	private final int[] anIntArray394 = new int[3];

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub10() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt4235 = arg1.method5982();
		} else if (arg0 == 1) {
			this.anInt4238 = arg1.method5982();
		} else if (arg0 == 2) {
			this.anInt4236 = arg1.method5982();
		}
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)V")
	@Override
	public void method7894() {
		this.method3595();
	}

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "(I)V")
	private void method3595() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt4236 / 4096.0F));
		this.anIntArray394[0] = (int) (local11 * 4096.0D * Math.sin((double) ((float) this.anInt4238 / 4096.0F)));
		this.anIntArray394[1] = (int) (local11 * Math.cos((double) ((float) this.anInt4238 / 4096.0F)) * 4096.0D);
		this.anIntArray394[2] = (int) (Math.sin((double) ((float) this.anInt4236 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray394[0] * this.anIntArray394[0] >> 12;
		@Pc(85) int local85 = this.anIntArray394[1] * this.anIntArray394[1] >> 12;
		@Pc(97) int local97 = this.anIntArray394[2] * this.anIntArray394[2] >> 12;
		@Pc(110) int local110 = (int) (Math.sqrt((double) (local85 + local69 + local97 >> 12)) * 4096.0D);
		if (local110 != 0) {
			this.anIntArray394[2] = (this.anIntArray394[2] << 12) / local110;
			this.anIntArray394[0] = (this.anIntArray394[0] << 12) / local110;
			this.anIntArray394[1] = (this.anIntArray394[1] << 12) / local110;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method7883(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass343_41.method7596(arg0);
		if (super.aClass343_41.aBoolean638) {
			@Pc(28) int local28 = Static293.anInt5417 * this.anInt4235 >> 12;
			@Pc(40) int[] local40 = this.method7890(0, arg0 - 1 & Static360.anInt6375);
			@Pc(48) int[] local48 = this.method7890(0, arg0);
			@Pc(58) int[] local58 = this.method7890(0, Static360.anInt6375 & arg0 + 1);
			for (@Pc(60) int local60 = 0; local60 < Static560.anInt9394; local60++) {
				@Pc(74) int local74 = (local58[local60] - local40[local60]) * local28 >> 12;
				@Pc(94) int local94 = (local48[Static571.anInt9405 & local60 - 1] - local48[local60 + 1 & Static571.anInt9405]) * local28 >> 12;
				@Pc(98) int local98 = local94 >> 4;
				@Pc(102) int local102 = local74 >> 4;
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
				@Pc(141) int local141 = Class167.aByteArray50[((local102 + 1) * local102 >> 1) + local98] & 0xFF;
				@Pc(147) int local147 = local141 * local74 >> 8;
				@Pc(153) int local153 = local141 * local94 >> 8;
				@Pc(159) int local159 = local141 * 4096 >> 8;
				@Pc(168) int local168 = local153 * this.anIntArray394[0] >> 12;
				@Pc(177) int local177 = local147 * this.anIntArray394[1] >> 12;
				@Pc(186) int local186 = local159 * this.anIntArray394[2] >> 12;
				local11[local60] = local177 + local168 + local186;
			}
		}
		return local11;
	}
}
