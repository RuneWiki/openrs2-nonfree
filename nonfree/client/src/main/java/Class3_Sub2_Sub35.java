import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class3_Sub2_Sub35 extends Class3_Sub2 {

	@OriginalMember(owner = "client!uf", name = "A", descriptor = "I")
	private int anInt9461 = 0;

	@OriginalMember(owner = "client!uf", name = "C", descriptor = "I")
	private int anInt9463 = 5;

	@OriginalMember(owner = "client!uf", name = "H", descriptor = "I")
	private int anInt9467 = 5;

	@OriginalMember(owner = "client!uf", name = "K", descriptor = "I")
	private int anInt9469 = 2048;

	@OriginalMember(owner = "client!uf", name = "z", descriptor = "I")
	private int anInt9460 = 2;

	@OriginalMember(owner = "client!uf", name = "M", descriptor = "[S")
	private short[] aShortArray174 = new short[512];

	@OriginalMember(owner = "client!uf", name = "I", descriptor = "[B")
	private byte[] aByteArray105 = new byte[512];

	@OriginalMember(owner = "client!uf", name = "N", descriptor = "I")
	private int anInt9470 = 1;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	@Override
	public void method8712() {
		this.aByteArray105 = Static190.method3052(this.anInt9461);
		this.method8006();
	}

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "(B)V")
	private void method8006() {
		@Pc(18) Random local18 = new Random((long) this.anInt9461);
		this.aShortArray174 = new short[512];
		if (this.anInt9469 > 0) {
			for (@Pc(27) int local27 = 0; local27 < 512; local27++) {
				this.aShortArray174[local27] = (short) Static610.method8052(this.anInt9469, local18);
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8710(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass340_41.method7837(arg0);
		if (super.aClass340_41.aBoolean687) {
			@Pc(30) int local30 = this.anInt9467 * Static201.anIntArray251[arg0] + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static30.anInt908; local40++) {
				Static591.anInt9339 = Integer.MAX_VALUE;
				Static429.anInt7554 = Integer.MAX_VALUE;
				Static533.anInt8763 = Integer.MAX_VALUE;
				Static32.anInt960 = Integer.MAX_VALUE;
				@Pc(59) int local59 = this.anInt9463 * Static26.anIntArray20[local40] + 2048;
				@Pc(63) int local63 = local59 >> 12;
				@Pc(67) int local67 = local63 + 1;
				@Pc(152) int local152;
				for (@Pc(71) int local71 = local34 - 1; local71 <= local38; local71++) {
					@Pc(92) int local92 = this.aByteArray105[(local71 >= this.anInt9467 ? local71 - this.anInt9467 : local71) & 0xFF] & 0xFF;
					for (@Pc(96) int local96 = local63 - 1; local96 <= local67; local96++) {
						@Pc(124) int local124 = (this.aByteArray105[local92 + (local96 >= this.anInt9463 ? local96 - this.anInt9463 : local96) & 0xFF] & 0xFF) * 2;
						@Pc(129) int local129 = local59 - (local96 << 12);
						@Pc(133) int local133 = local124 + 1;
						@Pc(136) int local136 = local129 - this.aShortArray174[local124];
						@Pc(149) int local149 = local30 - (local71 << 12) - this.aShortArray174[local133];
						local152 = this.anInt9470;
						@Pc(185) int local185;
						if (local152 == 1) {
							local185 = local149 * local149 + local136 * local136 >> 12;
						} else if (local152 == 3) {
							local149 = local149 >= 0 ? local149 : -local149;
							local136 = local136 >= 0 ? local136 : -local136;
							local185 = local136 <= local149 ? local149 : local136;
						} else if (local152 == 4) {
							local136 = (int) (Math.sqrt((double) ((float) (local136 >= 0 ? local136 : -local136) / 4096.0F)) * 4096.0D);
							local149 = (int) (Math.sqrt((double) ((float) (local149 >= 0 ? local149 : -local149) / 4096.0F)) * 4096.0D);
							local185 = local136 + local149;
							local185 = local185 * local185 >> 12;
						} else if (local152 == 5) {
							local149 *= local149;
							local136 *= local136;
							local185 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local136 + local149) / 1.6777216E7F))) * 4096.0D);
						} else if (local152 == 2) {
							local185 = (local136 >= 0 ? local136 : -local136) + (local149 < 0 ? -local149 : local149);
						} else {
							local185 = (int) (Math.sqrt((double) ((float) (local149 * local149 + local136 * local136) / 1.6777216E7F)) * 4096.0D);
						}
						if (local185 < Static32.anInt960) {
							Static591.anInt9339 = Static429.anInt7554;
							Static429.anInt7554 = Static533.anInt8763;
							Static533.anInt8763 = Static32.anInt960;
							Static32.anInt960 = local185;
						} else if (local185 < Static533.anInt8763) {
							Static591.anInt9339 = Static429.anInt7554;
							Static429.anInt7554 = Static533.anInt8763;
							Static533.anInt8763 = local185;
						} else if (local185 < Static429.anInt7554) {
							Static591.anInt9339 = Static429.anInt7554;
							Static429.anInt7554 = local185;
						} else if (local185 < Static591.anInt9339) {
							Static591.anInt9339 = local185;
						}
					}
				}
				local152 = this.anInt9460;
				if (local152 == 0) {
					local17[local40] = Static32.anInt960;
				} else if (local152 == 1) {
					local17[local40] = Static533.anInt8763;
				} else if (local152 == 3) {
					local17[local40] = Static429.anInt7554;
				} else if (local152 == 4) {
					local17[local40] = Static591.anInt9339;
				} else if (local152 == 2) {
					local17[local40] = Static533.anInt8763 - Static32.anInt960;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9463 = this.anInt9467 = arg0.method4888();
		} else if (arg1 == 1) {
			this.anInt9461 = arg0.method4888();
		} else if (arg1 == 2) {
			this.anInt9469 = arg0.method4858();
		} else if (arg1 == 3) {
			this.anInt9460 = arg0.method4888();
		} else if (arg1 == 4) {
			this.anInt9470 = arg0.method4888();
		} else if (arg1 == 5) {
			this.anInt9463 = arg0.method4888();
		} else if (arg1 == 6) {
			this.anInt9467 = arg0.method4888();
		}
	}
}
