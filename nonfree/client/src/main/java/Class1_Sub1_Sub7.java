import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class1_Sub1_Sub7 extends Class1_Sub1 {

	@OriginalMember(owner = "client!fe", name = "V", descriptor = "[B")
	private byte[] aByteArray25 = new byte[512];

	@OriginalMember(owner = "client!fe", name = "ab", descriptor = "I")
	private int anInt1464 = 2048;

	@OriginalMember(owner = "client!fe", name = "db", descriptor = "I")
	private int anInt1466 = 0;

	@OriginalMember(owner = "client!fe", name = "fb", descriptor = "I")
	private int anInt1468 = 5;

	@OriginalMember(owner = "client!fe", name = "W", descriptor = "I")
	private int anInt1460 = 5;

	@OriginalMember(owner = "client!fe", name = "U", descriptor = "[S")
	private short[] aShortArray20 = new short[512];

	@OriginalMember(owner = "client!fe", name = "kb", descriptor = "I")
	private int anInt1472 = 1;

	@OriginalMember(owner = "client!fe", name = "mb", descriptor = "I")
	private int anInt1474 = 2;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1460 = this.anInt1468 = arg0.method2945();
		} else if (arg1 == 1) {
			this.anInt1466 = arg0.method2945();
		} else if (arg1 == 2) {
			this.anInt1464 = arg0.method2964();
		} else if (arg1 == 3) {
			this.anInt1474 = arg0.method2945();
		} else if (arg1 == 4) {
			this.anInt1472 = arg0.method2945();
		} else if (arg1 == 5) {
			this.anInt1460 = arg0.method2945();
		} else if (arg1 == 6) {
			this.anInt1468 = arg0.method2945();
		}
	}

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "(B)V")
	private void method1159() {
		@Pc(12) Random local12 = new Random((long) this.anInt1466);
		this.aShortArray20 = new short[512];
		if (this.anInt1464 > 0) {
			for (@Pc(31) int local31 = 0; local31 < 512; local31++) {
				this.aShortArray20[local31] = (short) Static206.method3285(local12, this.anInt1464);
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3705(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass37_41.method1168(arg0);
		if (super.aClass37_41.aBoolean131) {
			@Pc(32) int local32 = Static187.anIntArray345[arg0] * this.anInt1468 + 2048;
			@Pc(36) int local36 = local32 >> 12;
			@Pc(40) int local40 = local36 + 1;
			for (@Pc(42) int local42 = 0; local42 < Static11.anInt294; local42++) {
				Static51.anInt3049 = Integer.MAX_VALUE;
				Static203.anInt204 = Integer.MAX_VALUE;
				Static114.anInt2505 = Integer.MAX_VALUE;
				Static221.anInt4833 = Integer.MAX_VALUE;
				@Pc(62) int local62 = Static36.anIntArray81[local42] * this.anInt1460 + 2048;
				@Pc(66) int local66 = local62 >> 12;
				@Pc(70) int local70 = local66 + 1;
				@Pc(153) int local153;
				for (@Pc(74) int local74 = local36 - 1; local74 <= local40; local74++) {
					@Pc(94) int local94 = this.aByteArray25[(this.anInt1468 > local74 ? local74 : local74 - this.anInt1468) & 0xFF] & 0xFF;
					for (@Pc(98) int local98 = local66 - 1; local98 <= local70; local98++) {
						@Pc(124) int local124 = (this.aByteArray25[local94 + (local98 >= this.anInt1460 ? local98 - this.anInt1460 : local98) & 0xFF] & 0xFF) * 2;
						@Pc(128) int local128 = -(local98 << 12);
						@Pc(132) int local132 = local124 + 1;
						@Pc(138) int local138 = local128 + local62 - this.aShortArray20[local124];
						@Pc(150) int local150 = local32 - (local74 << 12) - this.aShortArray20[local132];
						local153 = this.anInt1472;
						@Pc(182) int local182;
						if (local153 == 1) {
							local182 = local150 * local150 + local138 * local138 >> 12;
						} else if (local153 == 3) {
							local138 = local138 >= 0 ? local138 : -local138;
							local150 = local150 < 0 ? -local150 : local150;
							local182 = local138 <= local150 ? local150 : local138;
						} else if (local153 == 4) {
							local138 = (int) (Math.sqrt((double) ((float) (local138 >= 0 ? local138 : -local138) / 4096.0F)) * 4096.0D);
							local150 = (int) (Math.sqrt((double) ((float) (local150 < 0 ? -local150 : local150) / 4096.0F)) * 4096.0D);
							local182 = local150 + local138;
							local182 = local182 * local182 >> 12;
						} else if (local153 == 5) {
							local150 *= local150;
							local138 *= local138;
							local182 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local150 + local138) / 1.6777216E7F))) * 4096.0D);
						} else if (local153 == 2) {
							local182 = (local150 >= 0 ? local150 : -local150) + (local138 >= 0 ? local138 : -local138);
						} else {
							local182 = (int) (Math.sqrt((double) ((float) (local150 * local150 + local138 * local138) / 1.6777216E7F)) * 4096.0D);
						}
						if (local182 < Static221.anInt4833) {
							Static51.anInt3049 = Static203.anInt204;
							Static203.anInt204 = Static114.anInt2505;
							Static114.anInt2505 = Static221.anInt4833;
							Static221.anInt4833 = local182;
						} else if (Static114.anInt2505 > local182) {
							Static51.anInt3049 = Static203.anInt204;
							Static203.anInt204 = Static114.anInt2505;
							Static114.anInt2505 = local182;
						} else if (Static203.anInt204 > local182) {
							Static51.anInt3049 = Static203.anInt204;
							Static203.anInt204 = local182;
						} else if (local182 < Static51.anInt3049) {
							Static51.anInt3049 = local182;
						}
					}
				}
				local153 = this.anInt1474;
				if (local153 == 0) {
					local18[local42] = Static221.anInt4833;
				} else if (local153 == 1) {
					local18[local42] = Static114.anInt2505;
				} else if (local153 == 3) {
					local18[local42] = Static203.anInt204;
				} else if (local153 == 4) {
					local18[local42] = Static51.anInt3049;
				} else if (local153 == 2) {
					local18[local42] = Static114.anInt2505 - Static221.anInt4833;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(Z)V")
	@Override
	public void method3716() {
		this.aByteArray25 = Static133.method2212(this.anInt1466);
		this.method1159();
	}
}
