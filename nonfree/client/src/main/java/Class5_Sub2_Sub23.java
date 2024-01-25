import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class5_Sub2_Sub23 extends Class5_Sub2 {

	@OriginalMember(owner = "client!mh", name = "G", descriptor = "[S")
	private short[] aShortArray79 = new short[512];

	@OriginalMember(owner = "client!mh", name = "N", descriptor = "I")
	private int anInt6710 = 2048;

	@OriginalMember(owner = "client!mh", name = "P", descriptor = "I")
	private int anInt6711 = 5;

	@OriginalMember(owner = "client!mh", name = "O", descriptor = "[B")
	private byte[] aByteArray56 = new byte[512];

	@OriginalMember(owner = "client!mh", name = "M", descriptor = "I")
	private int anInt6709 = 1;

	@OriginalMember(owner = "client!mh", name = "K", descriptor = "I")
	private int anInt6707 = 5;

	@OriginalMember(owner = "client!mh", name = "S", descriptor = "I")
	private int anInt6714 = 0;

	@OriginalMember(owner = "client!mh", name = "T", descriptor = "I")
	private int anInt6715 = 2;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8942(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass333_41.method7747(arg0);
		if (super.aClass333_41.aBoolean779) {
			@Pc(31) int local31 = Static369.anIntArray377[arg0] * this.anInt6711 + 2048;
			@Pc(35) int local35 = local31 >> 12;
			@Pc(39) int local39 = local35 + 1;
			for (@Pc(41) int local41 = 0; local41 < Static195.anInt3759; local41++) {
				Static397.anInt7048 = Integer.MAX_VALUE;
				Static322.anInt6043 = Integer.MAX_VALUE;
				Static628.anInt10249 = Integer.MAX_VALUE;
				Static570.anInt9309 = Integer.MAX_VALUE;
				@Pc(60) int local60 = Static554.anIntArray510[local41] * this.anInt6707 + 2048;
				@Pc(64) int local64 = local60 >> 12;
				@Pc(68) int local68 = local64 + 1;
				@Pc(153) int local153;
				for (@Pc(72) int local72 = local35 - 1; local72 <= local39; local72++) {
					@Pc(93) int local93 = this.aByteArray56[(this.anInt6711 <= local72 ? local72 - this.anInt6711 : local72) & 0xFF] & 0xFF;
					for (@Pc(97) int local97 = local64 - 1; local97 <= local68; local97++) {
						@Pc(126) int local126 = (this.aByteArray56[(this.anInt6707 <= local97 ? local97 - this.anInt6707 : local97) + local93 & 0xFF] & 0xFF) * 2;
						@Pc(131) int local131 = local60 - (local97 << 12);
						@Pc(135) int local135 = local126 + 1;
						@Pc(138) int local138 = local131 - this.aShortArray79[local126];
						@Pc(150) int local150 = local31 - this.aShortArray79[local135] - (local72 << 12);
						local153 = this.anInt6709;
						@Pc(184) int local184;
						if (local153 == 1) {
							local184 = local138 * local138 + local150 * local150 >> 12;
						} else if (local153 == 3) {
							local150 = local150 < 0 ? -local150 : local150;
							local138 = local138 >= 0 ? local138 : -local138;
							local184 = local150 < local138 ? local138 : local150;
						} else if (local153 == 4) {
							local138 = (int) (Math.sqrt((double) ((float) (local138 < 0 ? -local138 : local138) / 4096.0F)) * 4096.0D);
							local150 = (int) (Math.sqrt((double) ((float) (local150 >= 0 ? local150 : -local150) / 4096.0F)) * 4096.0D);
							local184 = local138 + local150;
							local184 = local184 * local184 >> 12;
						} else if (local153 == 5) {
							local138 *= local138;
							local150 *= local150;
							local184 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local138 + local150) / 1.6777216E7F))) * 4096.0D);
						} else if (local153 == 2) {
							local184 = (local138 < 0 ? -local138 : local138) + (local150 >= 0 ? local150 : -local150);
						} else {
							local184 = (int) (Math.sqrt((double) ((float) (local150 * local150 + local138 * local138) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static570.anInt9309 > local184) {
							Static397.anInt7048 = Static322.anInt6043;
							Static322.anInt6043 = Static628.anInt10249;
							Static628.anInt10249 = Static570.anInt9309;
							Static570.anInt9309 = local184;
						} else if (Static628.anInt10249 > local184) {
							Static397.anInt7048 = Static322.anInt6043;
							Static322.anInt6043 = Static628.anInt10249;
							Static628.anInt10249 = local184;
						} else if (local184 < Static322.anInt6043) {
							Static397.anInt7048 = Static322.anInt6043;
							Static322.anInt6043 = local184;
						} else if (local184 < Static397.anInt7048) {
							Static397.anInt7048 = local184;
						}
					}
				}
				local153 = this.anInt6715;
				if (local153 == 0) {
					local17[local41] = Static570.anInt9309;
				} else if (local153 == 1) {
					local17[local41] = Static628.anInt10249;
				} else if (local153 == 3) {
					local17[local41] = Static322.anInt6043;
				} else if (local153 == 4) {
					local17[local41] = Static397.anInt7048;
				} else if (local153 == 2) {
					local17[local41] = Static628.anInt10249 - Static570.anInt9309;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "(I)V")
	private void method5587() {
		@Pc(16) Random local16 = new Random((long) this.anInt6714);
		this.aShortArray79 = new short[512];
		if (this.anInt6710 > 0) {
			for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
				this.aShortArray79[local28] = (short) Static508.method7270(this.anInt6710, local16);
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)V")
	@Override
	public void method8951() {
		this.aByteArray56 = Static353.method5334(this.anInt6714);
		this.method5587();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6707 = this.anInt6711 = arg0.method7816();
		} else if (arg1 == 1) {
			this.anInt6714 = arg0.method7816();
		} else if (arg1 == 2) {
			this.anInt6710 = arg0.method7860();
		} else if (arg1 == 3) {
			this.anInt6715 = arg0.method7816();
		} else if (arg1 == 4) {
			this.anInt6709 = arg0.method7816();
		} else if (arg1 == 5) {
			this.anInt6707 = arg0.method7816();
		} else if (arg1 == 6) {
			this.anInt6711 = arg0.method7816();
		}
	}
}
