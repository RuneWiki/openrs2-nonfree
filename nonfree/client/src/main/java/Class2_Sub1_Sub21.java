import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class2_Sub1_Sub21 extends Class2_Sub1 {

	@OriginalMember(owner = "client!rc", name = "N", descriptor = "[S")
	private short[] aShortArray38 = new short[512];

	@OriginalMember(owner = "client!rc", name = "U", descriptor = "I")
	private int anInt3268 = 5;

	@OriginalMember(owner = "client!rc", name = "T", descriptor = "[B")
	private byte[] aByteArray38 = new byte[512];

	@OriginalMember(owner = "client!rc", name = "cb", descriptor = "I")
	private int anInt3275 = 5;

	@OriginalMember(owner = "client!rc", name = "bb", descriptor = "I")
	private int anInt3274 = 2048;

	@OriginalMember(owner = "client!rc", name = "fb", descriptor = "I")
	private int anInt3278 = 1;

	@OriginalMember(owner = "client!rc", name = "W", descriptor = "I")
	private int anInt3270 = 2;

	@OriginalMember(owner = "client!rc", name = "X", descriptor = "I")
	private int anInt3271 = 0;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method3256(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass52_41.method1596(arg0);
		if (super.aClass52_41.aBoolean103) {
			@Pc(30) int local30 = Static81.anIntArray174[arg0] * this.anInt3268 + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static135.anInt2897; local40++) {
				Static59.anInt1456 = Integer.MAX_VALUE;
				Static176.anInt3607 = Integer.MAX_VALUE;
				Static97.anInt2089 = Integer.MAX_VALUE;
				Static94.anInt1983 = Integer.MAX_VALUE;
				@Pc(59) int local59 = Static107.anIntArray304[local40] * this.anInt3275 + 2048;
				@Pc(63) int local63 = local59 >> 12;
				@Pc(67) int local67 = local63 + 1;
				@Pc(155) int local155;
				for (@Pc(71) int local71 = local34 - 1; local71 <= local38; local71++) {
					@Pc(96) int local96 = this.aByteArray38[(local71 >= this.anInt3268 ? local71 - this.anInt3268 : local71) & 0xFF] & 0xFF;
					for (@Pc(100) int local100 = local63 - 1; local100 <= local67; local100++) {
						@Pc(128) int local128 = (this.aByteArray38[(local100 < this.anInt3275 ? local100 : local100 - this.anInt3275) + local96 & 0xFF] & 0xFF) * 2;
						@Pc(132) int local132 = local100 << 12;
						@Pc(136) int local136 = local128 + 1;
						@Pc(140) int local140 = local59 - local132 - this.aShortArray38[local128];
						@Pc(152) int local152 = local30 - this.aShortArray38[local136] - (local71 << 12);
						local155 = this.anInt3278;
						@Pc(188) int local188;
						if (local155 == 1) {
							local188 = local140 * local140 + local152 * local152 >> 12;
						} else if (local155 == 3) {
							local152 = local152 >= 0 ? local152 : -local152;
							local140 = local140 < 0 ? -local140 : local140;
							local188 = local152 >= local140 ? local152 : local140;
						} else if (local155 == 4) {
							local140 = (int) (Math.sqrt((double) ((float) (local140 >= 0 ? local140 : -local140) / 4096.0F)) * 4096.0D);
							local152 = (int) (Math.sqrt((double) ((float) (local152 < 0 ? -local152 : local152) / 4096.0F)) * 4096.0D);
							local188 = local152 + local140;
							local188 = local188 * local188 >> 12;
						} else if (local155 == 5) {
							local152 *= local152;
							local140 *= local140;
							local188 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local140 + local152) / 1.6777216E7F))) * 4096.0D);
						} else if (local155 == 2) {
							local188 = (local152 >= 0 ? local152 : -local152) + (local140 < 0 ? -local140 : local140);
						} else {
							local188 = (int) (Math.sqrt((double) ((float) (local140 * local140 + local152 * local152) / 1.6777216E7F)) * 4096.0D);
						}
						if (local188 < Static94.anInt1983) {
							Static59.anInt1456 = Static176.anInt3607;
							Static176.anInt3607 = Static97.anInt2089;
							Static97.anInt2089 = Static94.anInt1983;
							Static94.anInt1983 = local188;
						} else if (Static97.anInt2089 > local188) {
							Static59.anInt1456 = Static176.anInt3607;
							Static176.anInt3607 = Static97.anInt2089;
							Static97.anInt2089 = local188;
						} else if (Static176.anInt3607 > local188) {
							Static59.anInt1456 = Static176.anInt3607;
							Static176.anInt3607 = local188;
						} else if (local188 < Static59.anInt1456) {
							Static59.anInt1456 = local188;
						}
					}
				}
				local155 = this.anInt3270;
				if (local155 == 0) {
					local16[local40] = Static94.anInt1983;
				} else if (local155 == 1) {
					local16[local40] = Static97.anInt2089;
				} else if (local155 == 3) {
					local16[local40] = Static176.anInt3607;
				} else if (local155 == 4) {
					local16[local40] = Static59.anInt1456;
				} else if (local155 == 2) {
					local16[local40] = Static97.anInt2089 - Static94.anInt1983;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
	@Override
	public void method3260() {
		this.aByteArray38 = Static182.method2818(this.anInt3271);
		this.method2505();
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)V")
	private void method2505() {
		@Pc(18) Random local18 = new Random((long) this.anInt3271);
		this.aShortArray38 = new short[512];
		if (this.anInt3274 > 0) {
			for (@Pc(30) int local30 = 0; local30 < 512; local30++) {
				this.aShortArray38[local30] = (short) Static4.method87(local18, this.anInt3274);
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3275 = this.anInt3268 = arg0.method260();
		} else if (arg1 == 1) {
			this.anInt3271 = arg0.method260();
		} else if (arg1 == 2) {
			this.anInt3274 = arg0.method269();
		} else if (arg1 == 3) {
			this.anInt3270 = arg0.method260();
		} else if (arg1 == 4) {
			this.anInt3278 = arg0.method260();
		} else if (arg1 == 5) {
			this.anInt3275 = arg0.method260();
		} else if (arg1 == 6) {
			this.anInt3268 = arg0.method260();
		}
	}
}
