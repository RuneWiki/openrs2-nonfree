import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class1_Sub1_Sub28 extends Class1_Sub1 {

	@OriginalMember(owner = "client!qg", name = "Y", descriptor = "I")
	private int anInt3726 = 2048;

	@OriginalMember(owner = "client!qg", name = "hb", descriptor = "I")
	private int anInt3733 = 2;

	@OriginalMember(owner = "client!qg", name = "kb", descriptor = "I")
	private int anInt3736 = 0;

	@OriginalMember(owner = "client!qg", name = "db", descriptor = "I")
	private int anInt3730 = 5;

	@OriginalMember(owner = "client!qg", name = "fb", descriptor = "[S")
	private short[] aShortArray31 = new short[512];

	@OriginalMember(owner = "client!qg", name = "ob", descriptor = "I")
	private int anInt3739 = 1;

	@OriginalMember(owner = "client!qg", name = "pb", descriptor = "I")
	private int anInt3740 = 5;

	@OriginalMember(owner = "client!qg", name = "rb", descriptor = "[B")
	private byte[] aByteArray35 = new byte[512];

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)V")
	@Override
	public void method3739() {
		this.aByteArray35 = Static28.method526(this.anInt3736);
		this.method2847();
	}

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "(I)V")
	private void method2847() {
		@Pc(12) Random local12 = new Random((long) this.anInt3736);
		this.aShortArray31 = new short[512];
		if (this.anInt3726 > 0) {
			for (@Pc(21) int local21 = 0; local21 < 512; local21++) {
				this.aShortArray31[local21] = (short) Static108.method1839(local12, this.anInt3726);
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3730 = this.anInt3740 = arg0.method3793();
		} else if (arg1 == 1) {
			this.anInt3736 = arg0.method3793();
		} else if (arg1 == 2) {
			this.anInt3726 = arg0.method3805();
		} else if (arg1 == 3) {
			this.anInt3733 = arg0.method3793();
		} else if (arg1 == 4) {
			this.anInt3739 = arg0.method3793();
		} else if (arg1 == 5) {
			this.anInt3730 = arg0.method3793();
		} else if (arg1 == 6) {
			this.anInt3740 = arg0.method3793();
		}
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3729(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass17_41.method474(arg0);
		if (super.aClass17_41.aBoolean24) {
			@Pc(30) int local30 = this.anInt3740 * Static211.anIntArray334[arg0] + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static157.anInt3431; local40++) {
				Static61.anInt1422 = Integer.MAX_VALUE;
				Static166.anInt3737 = Integer.MAX_VALUE;
				Static38.anInt917 = Integer.MAX_VALUE;
				Static219.anInt4600 = Integer.MAX_VALUE;
				@Pc(59) int local59 = Static73.anIntArray105[local40] * this.anInt3730 + 2048;
				@Pc(63) int local63 = local59 >> 12;
				@Pc(67) int local67 = local63 + 1;
				@Pc(155) int local155;
				for (@Pc(71) int local71 = local34 - 1; local71 <= local38; local71++) {
					@Pc(92) int local92 = this.aByteArray35[(this.anInt3740 <= local71 ? local71 - this.anInt3740 : local71) & 0xFF] & 0xFF;
					for (@Pc(96) int local96 = local63 - 1; local96 <= local67; local96++) {
						@Pc(125) int local125 = (this.aByteArray35[local92 + (this.anInt3730 <= local96 ? local96 - this.anInt3730 : local96) & 0xFF] & 0xFF) * 2;
						@Pc(129) int local129 = -(local96 << 12);
						@Pc(133) int local133 = local125 + 1;
						@Pc(139) int local139 = local129 + local59 - this.aShortArray31[local125];
						@Pc(152) int local152 = local30 - this.aShortArray31[local133] - (local71 << 12);
						local155 = this.anInt3739;
						@Pc(190) int local190;
						if (local155 == 1) {
							local190 = local152 * local152 + local139 * local139 >> 12;
						} else if (local155 == 3) {
							local152 = local152 >= 0 ? local152 : -local152;
							local139 = local139 < 0 ? -local139 : local139;
							local190 = local152 >= local139 ? local152 : local139;
						} else if (local155 == 4) {
							local139 = (int) (Math.sqrt((double) ((float) (local139 < 0 ? -local139 : local139) / 4096.0F)) * 4096.0D);
							local152 = (int) (Math.sqrt((double) ((float) (local152 >= 0 ? local152 : -local152) / 4096.0F)) * 4096.0D);
							local190 = local139 + local152;
							local190 = local190 * local190 >> 12;
						} else if (local155 == 5) {
							local152 *= local152;
							local139 *= local139;
							local190 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local139 + local152) / 1.6777216E7F))) * 4096.0D);
						} else if (local155 == 2) {
							local190 = (local152 >= 0 ? local152 : -local152) + (local139 >= 0 ? local139 : -local139);
						} else {
							local190 = (int) (Math.sqrt((double) ((float) (local152 * local152 + local139 * local139) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static219.anInt4600 > local190) {
							Static61.anInt1422 = Static166.anInt3737;
							Static166.anInt3737 = Static38.anInt917;
							Static38.anInt917 = Static219.anInt4600;
							Static219.anInt4600 = local190;
						} else if (local190 < Static38.anInt917) {
							Static61.anInt1422 = Static166.anInt3737;
							Static166.anInt3737 = Static38.anInt917;
							Static38.anInt917 = local190;
						} else if (Static166.anInt3737 > local190) {
							Static61.anInt1422 = Static166.anInt3737;
							Static166.anInt3737 = local190;
						} else if (Static61.anInt1422 > local190) {
							Static61.anInt1422 = local190;
						}
					}
				}
				local155 = this.anInt3733;
				if (local155 == 0) {
					local17[local40] = Static219.anInt4600;
				} else if (local155 == 1) {
					local17[local40] = Static38.anInt917;
				} else if (local155 == 3) {
					local17[local40] = Static166.anInt3737;
				} else if (local155 == 4) {
					local17[local40] = Static61.anInt1422;
				} else if (local155 == 2) {
					local17[local40] = Static38.anInt917 - Static219.anInt4600;
				}
			}
		}
		return local17;
	}
}
