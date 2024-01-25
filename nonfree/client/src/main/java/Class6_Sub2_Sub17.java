import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class6_Sub2_Sub17 extends Class6_Sub2 {

	@OriginalMember(owner = "client!jn", name = "B", descriptor = "I")
	private int anInt3280 = 1;

	@OriginalMember(owner = "client!jn", name = "C", descriptor = "I")
	private int anInt3281 = 2;

	@OriginalMember(owner = "client!jn", name = "E", descriptor = "I")
	private int anInt3282 = 5;

	@OriginalMember(owner = "client!jn", name = "A", descriptor = "I")
	private int anInt3279 = 5;

	@OriginalMember(owner = "client!jn", name = "L", descriptor = "[S")
	private short[] aShortArray59 = new short[512];

	@OriginalMember(owner = "client!jn", name = "D", descriptor = "[B")
	private byte[] aByteArray47 = new byte[512];

	@OriginalMember(owner = "client!jn", name = "I", descriptor = "I")
	private int anInt3284 = 0;

	@OriginalMember(owner = "client!jn", name = "N", descriptor = "I")
	private int anInt3287 = 2048;

	static {
		new Class193("", 73);
	}

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5859(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass100_41.method2225(arg0);
		if (super.aClass100_41.aBoolean185) {
			@Pc(31) int local31 = Static168.anIntArray278[arg0] * this.anInt3279 + 2048;
			@Pc(35) int local35 = local31 >> 12;
			@Pc(39) int local39 = local35 + 1;
			for (@Pc(41) int local41 = 0; local41 < Static185.anInt4925; local41++) {
				Static374.anInt6211 = Integer.MAX_VALUE;
				Static176.anInt3080 = Integer.MAX_VALUE;
				Static238.anInt4072 = Integer.MAX_VALUE;
				Static15.anInt272 = Integer.MAX_VALUE;
				@Pc(60) int local60 = this.anInt3282 * Static53.anIntArray95[local41] + 2048;
				@Pc(64) int local64 = local60 >> 12;
				@Pc(68) int local68 = local64 + 1;
				@Pc(159) int local159;
				for (@Pc(72) int local72 = local35 - 1; local72 <= local39; local72++) {
					@Pc(97) int local97 = this.aByteArray47[(local72 < this.anInt3279 ? local72 : local72 - this.anInt3279) & 0xFF] & 0xFF;
					for (@Pc(101) int local101 = local64 - 1; local101 <= local68; local101++) {
						@Pc(130) int local130 = (this.aByteArray47[local97 + (this.anInt3282 > local101 ? local101 : local101 - this.anInt3282) & 0xFF] & 0xFF) * 2;
						@Pc(135) int local135 = local130 + 1;
						@Pc(143) int local143 = local60 - this.aShortArray59[local130] - (local101 << 12);
						@Pc(156) int local156 = local31 - this.aShortArray59[local135] - (local72 << 12);
						local159 = this.anInt3280;
						@Pc(192) int local192;
						if (local159 == 1) {
							local192 = local143 * local143 + local156 * local156 >> 12;
						} else if (local159 == 3) {
							local156 = local156 >= 0 ? local156 : -local156;
							local143 = local143 >= 0 ? local143 : -local143;
							local192 = local143 <= local156 ? local156 : local143;
						} else if (local159 == 4) {
							local143 = (int) (Math.sqrt((double) ((float) (local143 < 0 ? -local143 : local143) / 4096.0F)) * 4096.0D);
							local156 = (int) (Math.sqrt((double) ((float) (local156 < 0 ? -local156 : local156) / 4096.0F)) * 4096.0D);
							local192 = local143 + local156;
							local192 = local192 * local192 >> 12;
						} else if (local159 == 5) {
							local156 *= local156;
							local143 *= local143;
							local192 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local143 + local156) / 1.6777216E7F))) * 4096.0D);
						} else if (local159 == 2) {
							local192 = (local156 >= 0 ? local156 : -local156) + (local143 < 0 ? -local143 : local143);
						} else {
							local192 = (int) (Math.sqrt((double) ((float) (local143 * local143 + local156 * local156) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static15.anInt272 > local192) {
							Static374.anInt6211 = Static176.anInt3080;
							Static176.anInt3080 = Static238.anInt4072;
							Static238.anInt4072 = Static15.anInt272;
							Static15.anInt272 = local192;
						} else if (Static238.anInt4072 > local192) {
							Static374.anInt6211 = Static176.anInt3080;
							Static176.anInt3080 = Static238.anInt4072;
							Static238.anInt4072 = local192;
						} else if (Static176.anInt3080 > local192) {
							Static374.anInt6211 = Static176.anInt3080;
							Static176.anInt3080 = local192;
						} else if (local192 < Static374.anInt6211) {
							Static374.anInt6211 = local192;
						}
					}
				}
				local159 = this.anInt3281;
				if (local159 == 0) {
					local11[local41] = Static15.anInt272;
				} else if (local159 == 1) {
					local11[local41] = Static238.anInt4072;
				} else if (local159 == 3) {
					local11[local41] = Static176.anInt3080;
				} else if (local159 == 4) {
					local11[local41] = Static374.anInt6211;
				} else if (local159 == 2) {
					local11[local41] = Static238.anInt4072 - Static15.anInt272;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "(I)V")
	private void method2933() {
		@Pc(12) Random local12 = new Random((long) this.anInt3284);
		this.aShortArray59 = new short[512];
		if (this.anInt3287 > 0) {
			for (@Pc(24) int local24 = 0; local24 < 512; local24++) {
				this.aShortArray59[local24] = (short) Static235.method3704(this.anInt3287, local12);
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3282 = this.anInt3279 = arg0.method3111();
		} else if (arg1 == 1) {
			this.anInt3284 = arg0.method3111();
		} else if (arg1 == 2) {
			this.anInt3287 = arg0.method3108();
		} else if (arg1 == 3) {
			this.anInt3281 = arg0.method3111();
		} else if (arg1 == 4) {
			this.anInt3280 = arg0.method3111();
		} else if (arg1 == 5) {
			this.anInt3282 = arg0.method3111();
		} else if (arg1 == 6) {
			this.anInt3279 = arg0.method3111();
		}
	}

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "(I)V")
	@Override
	public void method5862() {
		this.aByteArray47 = Static113.method1858(this.anInt3284);
		this.method2933();
	}
}
