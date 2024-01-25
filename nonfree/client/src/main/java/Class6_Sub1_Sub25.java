import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qfa")
public final class Class6_Sub1_Sub25 extends Class6_Sub1 {

	@OriginalMember(owner = "client!qfa", name = "K", descriptor = "I")
	private int anInt7774 = 3216;

	@OriginalMember(owner = "client!qfa", name = "O", descriptor = "I")
	private int anInt7778 = 4096;

	@OriginalMember(owner = "client!qfa", name = "J", descriptor = "[I")
	private final int[] anIntArray559 = new int[3];

	@OriginalMember(owner = "client!qfa", name = "P", descriptor = "I")
	private int anInt7779 = 3216;

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub25() {
		super(1, true);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt7778 = arg1.method4999();
		} else if (arg0 == 1) {
			this.anInt7779 = arg1.method4999();
		} else if (arg0 == 2) {
			this.anInt7774 = arg1.method4999();
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)V")
	@Override
	public void method8160() {
		this.method6496();
	}

	@OriginalMember(owner = "client!qfa", name = "h", descriptor = "(I)V")
	private void method6496() {
		@Pc(16) double local16 = Math.cos((double) ((float) this.anInt7774 / 4096.0F));
		this.anIntArray559[0] = (int) (Math.sin((double) ((float) this.anInt7779 / 4096.0F)) * local16 * 4096.0D);
		this.anIntArray559[1] = (int) (Math.cos((double) ((float) this.anInt7779 / 4096.0F)) * 4096.0D * local16);
		this.anIntArray559[2] = (int) (Math.sin((double) ((float) this.anInt7774 / 4096.0F)) * 4096.0D);
		@Pc(74) int local74 = this.anIntArray559[0] * this.anIntArray559[0] >> 12;
		@Pc(86) int local86 = this.anIntArray559[1] * this.anIntArray559[1] >> 12;
		@Pc(98) int local98 = this.anIntArray559[2] * this.anIntArray559[2] >> 12;
		@Pc(111) int local111 = (int) (Math.sqrt((double) (local98 + local86 + local74 >> 12)) * 4096.0D);
		if (local111 != 0) {
			this.anIntArray559[1] = (this.anIntArray559[1] << 12) / local111;
			this.anIntArray559[0] = (this.anIntArray559[0] << 12) / local111;
			this.anIntArray559[2] = (this.anIntArray559[2] << 12) / local111;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8159(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass187_41.method4597(arg0);
		if (super.aClass187_41.aBoolean403) {
			@Pc(22) int local22 = this.anInt7778 * Static337.anInt6232 >> 12;
			@Pc(32) int[] local32 = this.method8165(0, arg0 - 1 & Static574.anInt9711);
			@Pc(38) int[] local38 = this.method8165(0, arg0);
			@Pc(48) int[] local48 = this.method8165(0, arg0 + 1 & Static574.anInt9711);
			for (@Pc(50) int local50 = 0; local50 < Static289.anInt5549; local50++) {
				@Pc(65) int local65 = (local48[local50] - local32[local50]) * local22 >> 12;
				@Pc(86) int local86 = local22 * (local38[local50 - 1 & Static153.anInt3343] - local38[Static153.anInt3343 & local50 + 1]) >> 12;
				@Pc(90) int local90 = local86 >> 4;
				if (local90 < 0) {
					local90 = -local90;
				}
				@Pc(99) int local99 = local65 >> 4;
				if (local99 < 0) {
					local99 = -local99;
				}
				if (local90 > 255) {
					local90 = 255;
				}
				if (local99 > 255) {
					local99 = 255;
				}
				@Pc(135) int local135 = Class11_Sub1.aByteArray83[(local99 * (local99 + 1) >> 1) + local90] & 0xFF;
				@Pc(141) int local141 = local135 * 4096 >> 8;
				@Pc(147) int local147 = local86 * local135 >> 8;
				@Pc(153) int local153 = local65 * local135 >> 8;
				@Pc(162) int local162 = this.anIntArray559[2] * local141 >> 12;
				@Pc(171) int local171 = this.anIntArray559[0] * local147 >> 12;
				@Pc(180) int local180 = local153 * this.anIntArray559[1] >> 12;
				local11[local50] = local180 + local171 + local162;
			}
		}
		return local11;
	}
}
