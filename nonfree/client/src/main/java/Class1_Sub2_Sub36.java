import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class1_Sub2_Sub36 extends Class1_Sub2 {

	@OriginalMember(owner = "client!wf", name = "K", descriptor = "I")
	private int anInt7141 = 1;

	@OriginalMember(owner = "client!wf", name = "L", descriptor = "I")
	private int anInt7142 = 2048;

	@OriginalMember(owner = "client!wf", name = "N", descriptor = "I")
	private int anInt7143 = 0;

	@OriginalMember(owner = "client!wf", name = "O", descriptor = "I")
	private int anInt7144 = 5;

	@OriginalMember(owner = "client!wf", name = "Q", descriptor = "I")
	private int anInt7145 = 2;

	@OriginalMember(owner = "client!wf", name = "M", descriptor = "[B")
	private byte[] aByteArray94 = new byte[512];

	@OriginalMember(owner = "client!wf", name = "S", descriptor = "[S")
	private short[] aShortArray113 = new short[512];

	@OriginalMember(owner = "client!wf", name = "J", descriptor = "I")
	private int anInt7140 = 5;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "(I)V")
	@Override
	public void method5967() {
		this.aByteArray94 = Static336.method4404(this.anInt7143);
		this.method5790();
	}

	@OriginalMember(owner = "client!wf", name = "h", descriptor = "(I)V")
	private void method5790() {
		@Pc(16) Random local16 = new Random((long) this.anInt7143);
		this.aShortArray113 = new short[512];
		if (this.anInt7142 > 0) {
			for (@Pc(25) int local25 = 0; local25 < 512; local25++) {
				this.aShortArray113[local25] = (short) Static133.method1697(this.anInt7142, local16);
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt7140 = this.anInt7144 = arg0.method2915();
		} else if (arg1 == 1) {
			this.anInt7143 = arg0.method2915();
		} else if (arg1 == 2) {
			this.anInt7142 = arg0.method2896();
		} else if (arg1 == 3) {
			this.anInt7145 = arg0.method2915();
		} else if (arg1 == 4) {
			this.anInt7141 = arg0.method2915();
		} else if (arg1 == 5) {
			this.anInt7140 = arg0.method2915();
		} else if (arg1 == 6) {
			this.anInt7144 = arg0.method2915();
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5961(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass22_41.method312(arg0);
		if (super.aClass22_41.aBoolean44) {
			@Pc(29) int local29 = this.anInt7144 * Static258.anIntArray335[arg0] + 2048;
			@Pc(33) int local33 = local29 >> 12;
			@Pc(37) int local37 = local33 + 1;
			for (@Pc(39) int local39 = 0; local39 < Static218.anInt3990; local39++) {
				Static21.anInt339 = Integer.MAX_VALUE;
				Static458.anInt7293 = Integer.MAX_VALUE;
				Static268.anInt4676 = Integer.MAX_VALUE;
				Static453.anInt7213 = Integer.MAX_VALUE;
				@Pc(58) int local58 = this.anInt7140 * Static434.anIntArray495[local39] + 2048;
				@Pc(62) int local62 = local58 >> 12;
				@Pc(66) int local66 = local62 + 1;
				@Pc(154) int local154;
				for (@Pc(70) int local70 = local33 - 1; local70 <= local37; local70++) {
					@Pc(95) int local95 = this.aByteArray94[(local70 >= this.anInt7144 ? local70 - this.anInt7144 : local70) & 0xFF] & 0xFF;
					for (@Pc(99) int local99 = local62 - 1; local99 <= local66; local99++) {
						@Pc(124) int local124 = (this.aByteArray94[(local99 < this.anInt7140 ? local99 : local99 - this.anInt7140) + local95 & 0xFF] & 0xFF) * 2;
						@Pc(128) int local128 = -(local99 << 12);
						@Pc(132) int local132 = local124 + 1;
						@Pc(138) int local138 = local128 + local58 - this.aShortArray113[local124];
						@Pc(151) int local151 = local29 - (local70 << 12) - this.aShortArray113[local132];
						local154 = this.anInt7141;
						@Pc(185) int local185;
						if (local154 == 1) {
							local185 = local151 * local151 + local138 * local138 >> 12;
						} else if (local154 == 3) {
							local138 = local138 >= 0 ? local138 : -local138;
							local151 = local151 < 0 ? -local151 : local151;
							local185 = local151 >= local138 ? local151 : local138;
						} else if (local154 == 4) {
							local138 = (int) (Math.sqrt((double) ((float) (local138 < 0 ? -local138 : local138) / 4096.0F)) * 4096.0D);
							local151 = (int) (Math.sqrt((double) ((float) (local151 >= 0 ? local151 : -local151) / 4096.0F)) * 4096.0D);
							local185 = local151 + local138;
							local185 = local185 * local185 >> 12;
						} else if (local154 == 5) {
							local151 *= local151;
							local138 *= local138;
							local185 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local138 + local151) / 1.6777216E7F))) * 4096.0D);
						} else if (local154 == 2) {
							local185 = (local138 < 0 ? -local138 : local138) + (local151 >= 0 ? local151 : -local151);
						} else {
							local185 = (int) (Math.sqrt((double) ((float) (local138 * local138 + local151 * local151) / 1.6777216E7F)) * 4096.0D);
						}
						if (local185 < Static453.anInt7213) {
							Static21.anInt339 = Static458.anInt7293;
							Static458.anInt7293 = Static268.anInt4676;
							Static268.anInt4676 = Static453.anInt7213;
							Static453.anInt7213 = local185;
						} else if (local185 < Static268.anInt4676) {
							Static21.anInt339 = Static458.anInt7293;
							Static458.anInt7293 = Static268.anInt4676;
							Static268.anInt4676 = local185;
						} else if (Static458.anInt7293 > local185) {
							Static21.anInt339 = Static458.anInt7293;
							Static458.anInt7293 = local185;
						} else if (local185 < Static21.anInt339) {
							Static21.anInt339 = local185;
						}
					}
				}
				local154 = this.anInt7145;
				if (local154 == 0) {
					local11[local39] = Static453.anInt7213;
				} else if (local154 == 1) {
					local11[local39] = Static268.anInt4676;
				} else if (local154 == 3) {
					local11[local39] = Static458.anInt7293;
				} else if (local154 == 4) {
					local11[local39] = Static21.anInt339;
				} else if (local154 == 2) {
					local11[local39] = Static268.anInt4676 - Static453.anInt7213;
				}
			}
		}
		return local11;
	}
}
