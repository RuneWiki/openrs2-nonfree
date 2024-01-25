import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class2_Sub6_Sub21 extends Class2_Sub6 {

	@OriginalMember(owner = "client!ma", name = "K", descriptor = "I")
	private int anInt3898 = 1;

	@OriginalMember(owner = "client!ma", name = "Q", descriptor = "I")
	private int anInt3903 = 2048;

	@OriginalMember(owner = "client!ma", name = "R", descriptor = "[S")
	private short[] aShortArray83 = new short[512];

	@OriginalMember(owner = "client!ma", name = "S", descriptor = "I")
	private int anInt3904 = 2;

	@OriginalMember(owner = "client!ma", name = "P", descriptor = "I")
	private int anInt3902 = 5;

	@OriginalMember(owner = "client!ma", name = "T", descriptor = "[B")
	private byte[] aByteArray64 = new byte[512];

	@OriginalMember(owner = "client!ma", name = "J", descriptor = "I")
	private int anInt3897 = 0;

	@OriginalMember(owner = "client!ma", name = "Z", descriptor = "I")
	private int anInt3908 = 5;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5642(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass166_41.method3993(arg0);
		if (super.aClass166_41.aBoolean336) {
			@Pc(29) int local29 = Static138.anIntArray291[arg0] * this.anInt3908 + 2048;
			@Pc(33) int local33 = local29 >> 12;
			@Pc(37) int local37 = local33 + 1;
			for (@Pc(39) int local39 = 0; local39 < Static151.anInt2711; local39++) {
				Static276.anInt4914 = Integer.MAX_VALUE;
				Static31.anInt695 = Integer.MAX_VALUE;
				Static145.anInt2658 = Integer.MAX_VALUE;
				Static72.anInt1356 = Integer.MAX_VALUE;
				@Pc(58) int local58 = Static160.anIntArray329[local39] * this.anInt3902 + 2048;
				@Pc(62) int local62 = local58 >> 12;
				@Pc(66) int local66 = local62 + 1;
				@Pc(155) int local155;
				for (@Pc(70) int local70 = local33 - 1; local70 <= local37; local70++) {
					@Pc(94) int local94 = this.aByteArray64[(local70 >= this.anInt3908 ? local70 - this.anInt3908 : local70) & 0xFF] & 0xFF;
					for (@Pc(98) int local98 = local62 - 1; local98 <= local66; local98++) {
						@Pc(127) int local127 = (this.aByteArray64[(this.anInt3902 <= local98 ? local98 - this.anInt3902 : local98) + local94 & 0xFF] & 0xFF) * 2;
						@Pc(131) int local131 = local98 << 12;
						@Pc(135) int local135 = local127 + 1;
						@Pc(139) int local139 = local58 - local131 - this.aShortArray83[local127];
						@Pc(152) int local152 = local29 - (local70 << 12) - this.aShortArray83[local135];
						local155 = this.anInt3898;
						@Pc(188) int local188;
						if (local155 == 1) {
							local188 = local139 * local139 + local152 * local152 >> 12;
						} else if (local155 == 3) {
							local152 = local152 < 0 ? -local152 : local152;
							local139 = local139 < 0 ? -local139 : local139;
							local188 = local139 <= local152 ? local152 : local139;
						} else if (local155 == 4) {
							local139 = (int) (Math.sqrt((double) ((float) (local139 < 0 ? -local139 : local139) / 4096.0F)) * 4096.0D);
							local152 = (int) (Math.sqrt((double) ((float) (local152 >= 0 ? local152 : -local152) / 4096.0F)) * 4096.0D);
							local188 = local152 + local139;
							local188 = local188 * local188 >> 12;
						} else if (local155 == 5) {
							local152 *= local152;
							local139 *= local139;
							local188 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local152 + local139) / 1.6777216E7F))) * 4096.0D);
						} else if (local155 == 2) {
							local188 = (local139 >= 0 ? local139 : -local139) + (local152 >= 0 ? local152 : -local152);
						} else {
							local188 = (int) (Math.sqrt((double) ((float) (local152 * local152 + local139 * local139) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static72.anInt1356 > local188) {
							Static276.anInt4914 = Static31.anInt695;
							Static31.anInt695 = Static145.anInt2658;
							Static145.anInt2658 = Static72.anInt1356;
							Static72.anInt1356 = local188;
						} else if (Static145.anInt2658 > local188) {
							Static276.anInt4914 = Static31.anInt695;
							Static31.anInt695 = Static145.anInt2658;
							Static145.anInt2658 = local188;
						} else if (local188 < Static31.anInt695) {
							Static276.anInt4914 = Static31.anInt695;
							Static31.anInt695 = local188;
						} else if (local188 < Static276.anInt4914) {
							Static276.anInt4914 = local188;
						}
					}
				}
				local155 = this.anInt3904;
				if (local155 == 0) {
					local16[local39] = Static72.anInt1356;
				} else if (local155 == 1) {
					local16[local39] = Static145.anInt2658;
				} else if (local155 == 3) {
					local16[local39] = Static31.anInt695;
				} else if (local155 == 4) {
					local16[local39] = Static276.anInt4914;
				} else if (local155 == 2) {
					local16[local39] = Static145.anInt2658 - Static72.anInt1356;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3902 = this.anInt3908 = arg0.method4240();
		} else if (arg1 == 1) {
			this.anInt3897 = arg0.method4240();
		} else if (arg1 == 2) {
			this.anInt3903 = arg0.method4245();
		} else if (arg1 == 3) {
			this.anInt3904 = arg0.method4240();
		} else if (arg1 == 4) {
			this.anInt3898 = arg0.method4240();
		} else if (arg1 == 5) {
			this.anInt3902 = arg0.method4240();
		} else if (arg1 == 6) {
			this.anInt3908 = arg0.method4240();
		}
	}

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)V")
	@Override
	public void method5639() {
		this.aByteArray64 = Static343.method5242(this.anInt3897);
		this.method3587();
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V")
	private void method3587() {
		@Pc(18) Random local18 = new Random((long) this.anInt3897);
		this.aShortArray83 = new short[512];
		if (this.anInt3903 > 0) {
			for (@Pc(30) int local30 = 0; local30 < 512; local30++) {
				this.aShortArray83[local30] = (short) Static367.method5542(this.anInt3903, local18);
			}
		}
	}
}
