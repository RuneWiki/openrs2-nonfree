import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class12_Sub1_Sub36 extends Class12_Sub1 {

	@OriginalMember(owner = "client!us", name = "F", descriptor = "[I")
	public static final int[] anIntArray667 = new int[16384];

	@OriginalMember(owner = "client!us", name = "K", descriptor = "[I")
	public static final int[] anIntArray668 = new int[16384];

	@OriginalMember(owner = "client!us", name = "O", descriptor = "[I")
	private final int[] anIntArray669 = new int[3];

	@OriginalMember(owner = "client!us", name = "P", descriptor = "I")
	private int anInt9028 = 4096;

	@OriginalMember(owner = "client!us", name = "J", descriptor = "I")
	private int anInt9025 = 3216;

	@OriginalMember(owner = "client!us", name = "T", descriptor = "I")
	private int anInt9031 = 3216;

	static {
		@Pc(11) double local11 = 3.834951969714103E-4D;
		for (@Pc(13) int local13 = 0; local13 < 16384; local13++) {
			anIntArray667[local13] = (int) (Math.sin((double) local13 * local11) * 32768.0D);
			anIntArray668[local13] = (int) (Math.cos(local11 * (double) local13) * 32768.0D);
		}
	}

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub36() {
		super(1, true);
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(B)V")
	private void method7434() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt9025 / 4096.0F));
		this.anIntArray669[0] = (int) (local11 * 4096.0D * Math.sin((double) ((float) this.anInt9031 / 4096.0F)));
		this.anIntArray669[1] = (int) (Math.cos((double) ((float) this.anInt9031 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray669[2] = (int) (Math.sin((double) ((float) this.anInt9025 / 4096.0F)) * 4096.0D);
		@Pc(77) int local77 = this.anIntArray669[0] * this.anIntArray669[0] >> 12;
		@Pc(89) int local89 = this.anIntArray669[1] * this.anIntArray669[1] >> 12;
		@Pc(101) int local101 = this.anIntArray669[2] * this.anIntArray669[2] >> 12;
		@Pc(115) int local115 = (int) (Math.sqrt((double) (local101 + local77 + local89 >> 12)) * 4096.0D);
		if (local115 != 0) {
			this.anIntArray669[1] = (this.anIntArray669[1] << 12) / local115;
			this.anIntArray669[0] = (this.anIntArray669[0] << 12) / local115;
			this.anIntArray669[2] = (this.anIntArray669[2] << 12) / local115;
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7798(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method4392(arg0);
		if (super.aClass174_41.aBoolean403) {
			@Pc(26) int local26 = Static370.anInt6853 * this.anInt9028 >> 12;
			@Pc(36) int[] local36 = this.method7795(0, arg0 - 1 & Static162.anInt3758);
			@Pc(42) int[] local42 = this.method7795(0, arg0);
			@Pc(52) int[] local52 = this.method7795(0, arg0 + 1 & Static162.anInt3758);
			for (@Pc(54) int local54 = 0; local54 < Static357.anInt6670; local54++) {
				@Pc(68) int local68 = (local52[local54] - local36[local54]) * local26 >> 12;
				@Pc(89) int local89 = (local42[local54 - 1 & Static149.anInt3278] - local42[Static149.anInt3278 & local54 + 1]) * local26 >> 12;
				@Pc(93) int local93 = local89 >> 4;
				@Pc(97) int local97 = local68 >> 4;
				if (local93 < 0) {
					local93 = -local93;
				}
				if (local97 < 0) {
					local97 = -local97;
				}
				if (local93 > 255) {
					local93 = 255;
				}
				if (local97 > 255) {
					local97 = 255;
				}
				@Pc(134) int local134 = Class192.aByteArray64[((local97 + 1) * local97 >> 1) + local93] & 0xFF;
				@Pc(140) int local140 = local134 * 4096 >> 8;
				@Pc(146) int local146 = local134 * local89 >> 8;
				@Pc(152) int local152 = local134 * local68 >> 8;
				@Pc(161) int local161 = this.anIntArray669[2] * local140 >> 12;
				@Pc(170) int local170 = local146 * this.anIntArray669[0] >> 12;
				@Pc(179) int local179 = local152 * this.anIntArray669[1] >> 12;
				local11[local54] = local179 + local170 + local161;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9028 = arg0.method5199();
		} else if (arg1 == 1) {
			this.anInt9031 = arg0.method5199();
		} else if (arg1 == 2) {
			this.anInt9025 = arg0.method5199();
		}
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(I)V")
	@Override
	public void method7797() {
		this.method7434();
	}
}
