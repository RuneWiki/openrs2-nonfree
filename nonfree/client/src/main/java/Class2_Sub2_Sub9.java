import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class2_Sub2_Sub9 extends Class2_Sub2 {

	@OriginalMember(owner = "client!dt", name = "D", descriptor = "I")
	private int anInt1544 = 0;

	@OriginalMember(owner = "client!dt", name = "G", descriptor = "I")
	private int anInt1547 = 2;

	@OriginalMember(owner = "client!dt", name = "M", descriptor = "[S")
	private short[] aShortArray1 = new short[512];

	@OriginalMember(owner = "client!dt", name = "P", descriptor = "[B")
	private byte[] aByteArray9 = new byte[512];

	@OriginalMember(owner = "client!dt", name = "C", descriptor = "I")
	private int anInt1543 = 2048;

	@OriginalMember(owner = "client!dt", name = "N", descriptor = "I")
	private int anInt1551 = 1;

	@OriginalMember(owner = "client!dt", name = "Q", descriptor = "I")
	private int anInt1553 = 5;

	@OriginalMember(owner = "client!dt", name = "O", descriptor = "I")
	private int anInt1552 = 5;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1552 = this.anInt1553 = arg0.method3580();
		} else if (arg1 == 1) {
			this.anInt1544 = arg0.method3580();
		} else if (arg1 == 2) {
			this.anInt1543 = arg0.method3555();
		} else if (arg1 == 3) {
			this.anInt1547 = arg0.method3580();
		} else if (arg1 == 4) {
			this.anInt1551 = arg0.method3580();
		} else if (arg1 == 5) {
			this.anInt1552 = arg0.method3580();
		} else if (arg1 == 6) {
			this.anInt1553 = arg0.method3580();
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5465(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass170_41.method3645(arg0);
		if (super.aClass170_41.aBoolean317) {
			@Pc(31) int local31 = this.anInt1553 * Static405.anIntArray555[arg0] + 2048;
			@Pc(35) int local35 = local31 >> 12;
			@Pc(39) int local39 = local35 + 1;
			for (@Pc(41) int local41 = 0; local41 < Static217.anInt3574; local41++) {
				Static294.anInt1006 = Integer.MAX_VALUE;
				Static360.anInt6077 = Integer.MAX_VALUE;
				Static376.anInt6255 = Integer.MAX_VALUE;
				Static398.anInt6532 = Integer.MAX_VALUE;
				@Pc(60) int local60 = this.anInt1552 * Static145.anIntArray199[local41] + 2048;
				@Pc(64) int local64 = local60 >> 12;
				@Pc(68) int local68 = local64 + 1;
				@Pc(149) int local149;
				for (@Pc(72) int local72 = local35 - 1; local72 <= local39; local72++) {
					@Pc(92) int local92 = this.aByteArray9[(this.anInt1553 > local72 ? local72 : local72 - this.anInt1553) & 0xFF] & 0xFF;
					for (@Pc(96) int local96 = local64 - 1; local96 <= local68; local96++) {
						@Pc(120) int local120 = (this.aByteArray9[(local96 >= this.anInt1552 ? local96 - this.anInt1552 : local96) + local92 & 0xFF] & 0xFF) * 2;
						@Pc(124) int local124 = local120 + 1;
						@Pc(133) int local133 = local60 - this.aShortArray1[local120] - (local96 << 12);
						@Pc(146) int local146 = local31 - this.aShortArray1[local124] - (local72 << 12);
						local149 = this.anInt1551;
						@Pc(180) int local180;
						if (local149 == 1) {
							local180 = local133 * local133 + local146 * local146 >> 12;
						} else if (local149 == 3) {
							local146 = local146 < 0 ? -local146 : local146;
							local133 = local133 < 0 ? -local133 : local133;
							local180 = local133 <= local146 ? local146 : local133;
						} else if (local149 == 4) {
							local133 = (int) (Math.sqrt((double) ((float) (local133 >= 0 ? local133 : -local133) / 4096.0F)) * 4096.0D);
							local146 = (int) (Math.sqrt((double) ((float) (local146 < 0 ? -local146 : local146) / 4096.0F)) * 4096.0D);
							local180 = local133 + local146;
							local180 = local180 * local180 >> 12;
						} else if (local149 == 5) {
							local133 *= local133;
							local146 *= local146;
							local180 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local146 + local133) / 1.6777216E7F))) * 4096.0D);
						} else if (local149 == 2) {
							local180 = (local133 >= 0 ? local133 : -local133) + (local146 >= 0 ? local146 : -local146);
						} else {
							local180 = (int) (Math.sqrt((double) ((float) (local133 * local133 + local146 * local146) / 1.6777216E7F)) * 4096.0D);
						}
						if (local180 < Static398.anInt6532) {
							Static294.anInt1006 = Static360.anInt6077;
							Static360.anInt6077 = Static376.anInt6255;
							Static376.anInt6255 = Static398.anInt6532;
							Static398.anInt6532 = local180;
						} else if (local180 < Static376.anInt6255) {
							Static294.anInt1006 = Static360.anInt6077;
							Static360.anInt6077 = Static376.anInt6255;
							Static376.anInt6255 = local180;
						} else if (Static360.anInt6077 > local180) {
							Static294.anInt1006 = Static360.anInt6077;
							Static360.anInt6077 = local180;
						} else if (Static294.anInt1006 > local180) {
							Static294.anInt1006 = local180;
						}
					}
				}
				local149 = this.anInt1547;
				if (local149 == 0) {
					local18[local41] = Static398.anInt6532;
				} else if (local149 == 1) {
					local18[local41] = Static376.anInt6255;
				} else if (local149 == 3) {
					local18[local41] = Static360.anInt6077;
				} else if (local149 == 4) {
					local18[local41] = Static294.anInt1006;
				} else if (local149 == 2) {
					local18[local41] = Static376.anInt6255 - Static398.anInt6532;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "(B)V")
	@Override
	public void method5475() {
		this.aByteArray9 = Static308.method4223(this.anInt1544);
		this.method1207();
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(Z)V")
	private void method1207() {
		@Pc(18) Random local18 = new Random((long) this.anInt1544);
		this.aShortArray1 = new short[512];
		if (this.anInt1543 > 0) {
			for (@Pc(30) int local30 = 0; local30 < 512; local30++) {
				this.aShortArray1[local30] = (short) Static175.method2474(this.anInt1543, local18);
			}
		}
	}
}
