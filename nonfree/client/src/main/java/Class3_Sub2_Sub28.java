import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class3_Sub2_Sub28 extends Class3_Sub2 {

	@OriginalMember(owner = "client!rt", name = "G", descriptor = "I")
	private int anInt8716 = 2048;

	@OriginalMember(owner = "client!rt", name = "A", descriptor = "[B")
	private byte[] aByteArray100 = new byte[512];

	@OriginalMember(owner = "client!rt", name = "z", descriptor = "I")
	private int anInt8712 = 0;

	@OriginalMember(owner = "client!rt", name = "H", descriptor = "I")
	private int anInt8717 = 2;

	@OriginalMember(owner = "client!rt", name = "Q", descriptor = "I")
	private int anInt8722 = 5;

	@OriginalMember(owner = "client!rt", name = "M", descriptor = "[S")
	private short[] aShortArray128 = new short[512];

	@OriginalMember(owner = "client!rt", name = "D", descriptor = "I")
	private int anInt8715 = 5;

	@OriginalMember(owner = "client!rt", name = "S", descriptor = "I")
	private int anInt8724 = 1;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(B)V")
	private void method7453() {
		@Pc(12) Random local12 = new Random((long) this.anInt8712);
		this.aShortArray128 = new short[512];
		if (this.anInt8716 > 0) {
			for (@Pc(26) int local26 = 0; local26 < 512; local26++) {
				this.aShortArray128[local26] = (short) Static522.method7729(local12, this.anInt8716);
			}
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8594(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass40_41.method1572(arg0);
		if (super.aClass40_41.aBoolean97) {
			@Pc(30) int local30 = this.anInt8715 * Static372.anIntArray207[arg0] + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static491.anInt8519; local40++) {
				Static371.anInt7004 = Integer.MAX_VALUE;
				Static24.anInt934 = Integer.MAX_VALUE;
				Static184.anInt3540 = Integer.MAX_VALUE;
				Static460.anInt8090 = Integer.MAX_VALUE;
				@Pc(59) int local59 = Static546.anIntArray582[local40] * this.anInt8722 + 2048;
				@Pc(63) int local63 = local59 >> 12;
				@Pc(67) int local67 = local63 + 1;
				@Pc(155) int local155;
				for (@Pc(71) int local71 = local34 - 1; local71 <= local38; local71++) {
					@Pc(96) int local96 = this.aByteArray100[(local71 >= this.anInt8715 ? local71 - this.anInt8715 : local71) & 0xFF] & 0xFF;
					for (@Pc(100) int local100 = local63 - 1; local100 <= local67; local100++) {
						@Pc(125) int local125 = (this.aByteArray100[(local100 >= this.anInt8722 ? local100 - this.anInt8722 : local100) + local96 & 0xFF] & 0xFF) * 2;
						@Pc(129) int local129 = local125 + 1;
						@Pc(139) int local139 = local59 - this.aShortArray128[local125] - (local100 << 12);
						@Pc(152) int local152 = local30 - (local71 << 12) - this.aShortArray128[local129];
						local155 = this.anInt8724;
						@Pc(186) int local186;
						if (local155 == 1) {
							local186 = local139 * local139 + local152 * local152 >> 12;
						} else if (local155 == 3) {
							local152 = local152 >= 0 ? local152 : -local152;
							local139 = local139 < 0 ? -local139 : local139;
							local186 = local139 > local152 ? local139 : local152;
						} else if (local155 == 4) {
							local139 = (int) (Math.sqrt((double) ((float) (local139 >= 0 ? local139 : -local139) / 4096.0F)) * 4096.0D);
							local152 = (int) (Math.sqrt((double) ((float) (local152 < 0 ? -local152 : local152) / 4096.0F)) * 4096.0D);
							local186 = local139 + local152;
							local186 = local186 * local186 >> 12;
						} else if (local155 == 5) {
							local139 *= local139;
							local152 *= local152;
							local186 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local152 + local139) / 1.6777216E7F))) * 4096.0D);
						} else if (local155 == 2) {
							local186 = (local152 < 0 ? -local152 : local152) + (local139 >= 0 ? local139 : -local139);
						} else {
							local186 = (int) (Math.sqrt((double) ((float) (local152 * local152 + local139 * local139) / 1.6777216E7F)) * 4096.0D);
						}
						if (local186 < Static460.anInt8090) {
							Static371.anInt7004 = Static24.anInt934;
							Static24.anInt934 = Static184.anInt3540;
							Static184.anInt3540 = Static460.anInt8090;
							Static460.anInt8090 = local186;
						} else if (Static184.anInt3540 > local186) {
							Static371.anInt7004 = Static24.anInt934;
							Static24.anInt934 = Static184.anInt3540;
							Static184.anInt3540 = local186;
						} else if (local186 < Static24.anInt934) {
							Static371.anInt7004 = Static24.anInt934;
							Static24.anInt934 = local186;
						} else if (local186 < Static371.anInt7004) {
							Static371.anInt7004 = local186;
						}
					}
				}
				local155 = this.anInt8717;
				if (local155 == 0) {
					local11[local40] = Static460.anInt8090;
				} else if (local155 == 1) {
					local11[local40] = Static184.anInt3540;
				} else if (local155 == 3) {
					local11[local40] = Static24.anInt934;
				} else if (local155 == 4) {
					local11[local40] = Static371.anInt7004;
				} else if (local155 == 2) {
					local11[local40] = Static184.anInt3540 - Static460.anInt8090;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt8722 = this.anInt8715 = arg0.method4225();
		} else if (arg1 == 1) {
			this.anInt8712 = arg0.method4225();
		} else if (arg1 == 2) {
			this.anInt8716 = arg0.method4221();
		} else if (arg1 == 3) {
			this.anInt8717 = arg0.method4225();
		} else if (arg1 == 4) {
			this.anInt8724 = arg0.method4225();
		} else if (arg1 == 5) {
			this.anInt8722 = arg0.method4225();
		} else if (arg1 == 6) {
			this.anInt8715 = arg0.method4225();
		}
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)V")
	@Override
	public void method8598() {
		this.aByteArray100 = Static136.method2561(this.anInt8712);
		this.method7453();
	}
}
