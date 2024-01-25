import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class4_Sub4_Sub25 extends Class4_Sub4 {

	@OriginalMember(owner = "client!og", name = "P", descriptor = "[I")
	public static final int[] anIntArray383 = new int[16384];

	@OriginalMember(owner = "client!og", name = "bb", descriptor = "[I")
	public static final int[] anIntArray384 = new int[16384];

	@OriginalMember(owner = "client!og", name = "T", descriptor = "I")
	private int anInt4715 = 3216;

	@OriginalMember(owner = "client!og", name = "K", descriptor = "[I")
	private final int[] anIntArray382 = new int[3];

	@OriginalMember(owner = "client!og", name = "V", descriptor = "I")
	private int anInt4717 = 3216;

	@OriginalMember(owner = "client!og", name = "ab", descriptor = "I")
	private int anInt4721 = 4096;

	static {
		@Pc(983) double local983 = 3.834951969714103E-4D;
		for (@Pc(985) int local985 = 0; local985 < 16384; local985++) {
			anIntArray384[local985] = (int) (Math.sin(local983 * (double) local985) * 32768.0D);
			anIntArray383[local985] = (int) (Math.cos(local983 * (double) local985) * 32768.0D);
		}
	}

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub25() {
		super(1, true);
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(Z)V")
	@Override
	public void method5392() {
		this.method3865();
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "(I)V")
	private void method3865() {
		@Pc(15) double local15 = Math.cos((double) ((float) this.anInt4715 / 4096.0F));
		this.anIntArray382[0] = (int) (local15 * Math.sin((double) ((float) this.anInt4717 / 4096.0F)) * 4096.0D);
		this.anIntArray382[1] = (int) (Math.cos((double) ((float) this.anInt4717 / 4096.0F)) * local15 * 4096.0D);
		this.anIntArray382[2] = (int) (Math.sin((double) ((float) this.anInt4715 / 4096.0F)) * 4096.0D);
		@Pc(73) int local73 = this.anIntArray382[0] * this.anIntArray382[0] >> 12;
		@Pc(85) int local85 = this.anIntArray382[1] * this.anIntArray382[1] >> 12;
		@Pc(97) int local97 = this.anIntArray382[2] * this.anIntArray382[2] >> 12;
		@Pc(111) int local111 = (int) (Math.sqrt((double) (local73 + local85 + local97 >> 12)) * 4096.0D);
		if (local111 != 0) {
			this.anIntArray382[2] = (this.anIntArray382[2] << 12) / local111;
			this.anIntArray382[0] = (this.anIntArray382[0] << 12) / local111;
			this.anIntArray382[1] = (this.anIntArray382[1] << 12) / local111;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt4721 = arg1.method2404();
		} else if (arg0 == 1) {
			this.anInt4717 = arg1.method2404();
		} else if (arg0 == 2) {
			this.anInt4715 = arg1.method2404();
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5380(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass207_41.method5470(arg0);
		if (super.aClass207_41.aBoolean572) {
			@Pc(27) int local27 = this.anInt4721 * Static241.anInt5028 >> 12;
			@Pc(37) int[] local37 = this.method5386(0, arg0 - 1 & Static59.anInt1278);
			@Pc(43) int[] local43 = this.method5386(0, arg0);
			@Pc(53) int[] local53 = this.method5386(0, Static59.anInt1278 & arg0 + 1);
			for (@Pc(55) int local55 = 0; local55 < Static124.anInt3576; local55++) {
				@Pc(70) int local70 = (local53[local55] - local37[local55]) * local27 >> 12;
				@Pc(90) int local90 = local27 * (local43[Static350.anInt6802 & local55 - 1] - local43[Static350.anInt6802 & local55 + 1]) >> 12;
				@Pc(94) int local94 = local90 >> 4;
				if (local94 < 0) {
					local94 = -local94;
				}
				@Pc(103) int local103 = local70 >> 4;
				if (local103 < 0) {
					local103 = -local103;
				}
				if (local94 > 255) {
					local94 = 255;
				}
				if (local103 > 255) {
					local103 = 255;
				}
				@Pc(140) int local140 = Class4_Sub12.aByteArray89[local94 + ((local103 + 1) * local103 >> 1)] & 0xFF;
				@Pc(146) int local146 = local90 * local140 >> 8;
				@Pc(152) int local152 = local140 * 4096 >> 8;
				@Pc(158) int local158 = local70 * local140 >> 8;
				@Pc(167) int local167 = local152 * this.anIntArray382[2] >> 12;
				@Pc(176) int local176 = local146 * this.anIntArray382[0] >> 12;
				@Pc(185) int local185 = this.anIntArray382[1] * local158 >> 12;
				local16[local55] = local167 + local176 + local185;
			}
		}
		return local16;
	}
}
