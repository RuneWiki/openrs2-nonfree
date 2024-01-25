import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class1_Sub2_Sub28 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ol", name = "O", descriptor = "I")
	private int anInt4438 = 5;

	@OriginalMember(owner = "client!ol", name = "M", descriptor = "I")
	private int anInt4436 = 2048;

	@OriginalMember(owner = "client!ol", name = "N", descriptor = "I")
	private int anInt4437 = 1;

	@OriginalMember(owner = "client!ol", name = "P", descriptor = "I")
	private int anInt4439 = 0;

	@OriginalMember(owner = "client!ol", name = "Q", descriptor = "I")
	private int anInt4440 = 2;

	@OriginalMember(owner = "client!ol", name = "R", descriptor = "[B")
	private byte[] aByteArray74 = new byte[512];

	@OriginalMember(owner = "client!ol", name = "U", descriptor = "I")
	private int anInt4442 = 5;

	@OriginalMember(owner = "client!ol", name = "S", descriptor = "[S")
	private short[] aShortArray93 = new short[512];

	static {
		new Class169("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
	}

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)V")
	private void method3930() {
		@Pc(20) Random local20 = new Random((long) this.anInt4439);
		this.aShortArray93 = new short[512];
		if (this.anInt4436 > 0) {
			for (@Pc(32) int local32 = 0; local32 < 512; local32++) {
				this.aShortArray93[local32] = (short) Static351.method4927(this.anInt4436, local20);
			}
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			this.anInt4438 = this.anInt4442 = arg1.method5174();
		} else if (arg0 == 1) {
			this.anInt4439 = arg1.method5174();
		} else if (arg0 == 2) {
			this.anInt4436 = arg1.method5177();
		} else if (arg0 == 3) {
			this.anInt4440 = arg1.method5174();
		} else if (arg0 == 4) {
			this.anInt4437 = arg1.method5174();
		} else if (arg0 == 5) {
			this.anInt4438 = arg1.method5174();
		} else if (arg0 == 6) {
			this.anInt4442 = arg1.method5174();
		}
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5508(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass74_41.method1354(arg0);
		if (super.aClass74_41.aBoolean145) {
			@Pc(30) int local30 = this.anInt4442 * Static394.anIntArray751[arg0] + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static158.anInt2658; local40++) {
				Static291.anInt5037 = Integer.MAX_VALUE;
				Static53.anInt1117 = Integer.MAX_VALUE;
				Static228.anInt3846 = Integer.MAX_VALUE;
				Static374.anInt6105 = Integer.MAX_VALUE;
				@Pc(59) int local59 = this.anInt4438 * Static87.anIntArray211[local40] + 2048;
				@Pc(63) int local63 = local59 >> 12;
				@Pc(67) int local67 = local63 + 1;
				@Pc(146) int local146;
				for (@Pc(71) int local71 = local34 - 1; local71 <= local38; local71++) {
					@Pc(92) int local92 = this.aByteArray74[(this.anInt4442 <= local71 ? local71 - this.anInt4442 : local71) & 0xFF] & 0xFF;
					for (@Pc(96) int local96 = local63 - 1; local96 <= local67; local96++) {
						@Pc(120) int local120 = (this.aByteArray74[(local96 >= this.anInt4438 ? local96 - this.anInt4438 : local96) + local92 & 0xFF] & 0xFF) * 2;
						@Pc(125) int local125 = local120 + 1;
						@Pc(132) int local132 = local59 - this.aShortArray93[local120] - (local96 << 12);
						@Pc(143) int local143 = local30 - (local71 << 12) - this.aShortArray93[local125];
						local146 = this.anInt4437;
						@Pc(174) int local174;
						if (local146 == 1) {
							local174 = local132 * local132 + local143 * local143 >> 12;
						} else if (local146 == 3) {
							local143 = local143 >= 0 ? local143 : -local143;
							local132 = local132 >= 0 ? local132 : -local132;
							local174 = local132 > local143 ? local132 : local143;
						} else if (local146 == 4) {
							local132 = (int) (Math.sqrt((double) ((float) (local132 < 0 ? -local132 : local132) / 4096.0F)) * 4096.0D);
							local143 = (int) (Math.sqrt((double) ((float) (local143 < 0 ? -local143 : local143) / 4096.0F)) * 4096.0D);
							local174 = local143 + local132;
							local174 = local174 * local174 >> 12;
						} else if (local146 == 5) {
							local143 *= local143;
							local132 *= local132;
							local174 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local143 + local132) / 1.6777216E7F))) * 4096.0D);
						} else if (local146 == 2) {
							local174 = (local143 >= 0 ? local143 : -local143) + (local132 >= 0 ? local132 : -local132);
						} else {
							local174 = (int) (Math.sqrt((double) ((float) (local132 * local132 + local143 * local143) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static374.anInt6105 > local174) {
							Static291.anInt5037 = Static53.anInt1117;
							Static53.anInt1117 = Static228.anInt3846;
							Static228.anInt3846 = Static374.anInt6105;
							Static374.anInt6105 = local174;
						} else if (local174 < Static228.anInt3846) {
							Static291.anInt5037 = Static53.anInt1117;
							Static53.anInt1117 = Static228.anInt3846;
							Static228.anInt3846 = local174;
						} else if (local174 < Static53.anInt1117) {
							Static291.anInt5037 = Static53.anInt1117;
							Static53.anInt1117 = local174;
						} else if (local174 < Static291.anInt5037) {
							Static291.anInt5037 = local174;
						}
					}
				}
				local146 = this.anInt4440;
				if (local146 == 0) {
					local11[local40] = Static374.anInt6105;
				} else if (local146 == 1) {
					local11[local40] = Static228.anInt3846;
				} else if (local146 == 3) {
					local11[local40] = Static53.anInt1117;
				} else if (local146 == 4) {
					local11[local40] = Static291.anInt5037;
				} else if (local146 == 2) {
					local11[local40] = Static228.anInt3846 - Static374.anInt6105;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)V")
	@Override
	public void method5505() {
		this.aByteArray74 = Static196.method2843(this.anInt4439);
		this.method3930();
	}
}
