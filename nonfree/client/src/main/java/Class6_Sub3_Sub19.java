import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class6_Sub3_Sub19 extends Class6_Sub3 {

	@OriginalMember(owner = "client!kq", name = "B", descriptor = "I")
	private int anInt4442 = 2048;

	@OriginalMember(owner = "client!kq", name = "G", descriptor = "I")
	private int anInt4447 = 12288;

	@OriginalMember(owner = "client!kq", name = "F", descriptor = "I")
	private int anInt4446 = 0;

	@OriginalMember(owner = "client!kq", name = "K", descriptor = "I")
	private int anInt4450 = 4096;

	@OriginalMember(owner = "client!kq", name = "E", descriptor = "I")
	private int anInt4445 = 8192;

	@OriginalMember(owner = "client!kq", name = "M", descriptor = "I")
	private int anInt4452 = 0;

	@OriginalMember(owner = "client!kq", name = "J", descriptor = "I")
	private int anInt4449 = 2048;

	static {
		new Class84("", 73);
	}

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt4449 = arg1.method6006();
		} else if (arg0 == 1) {
			this.anInt4452 = arg1.method6006();
		} else if (arg0 == 2) {
			this.anInt4446 = arg1.method6006();
		} else if (arg0 == 3) {
			this.anInt4442 = arg1.method6006();
		} else if (arg0 == 4) {
			this.anInt4447 = arg1.method6006();
		} else if (arg0 == 5) {
			this.anInt4450 = arg1.method6006();
		} else if (arg0 == 6) {
			this.anInt4445 = arg1.method6006();
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(BII)Z")
	private boolean method3817(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20 = (arg0 - arg1) * this.anInt4447 >> 12;
		@Pc(30) int local30 = Static205.anIntArray395[local20 * 255 >> 12 & 0xFF];
		@Pc(37) int local37 = (local30 << 12) / this.anInt4447;
		@Pc(44) int local44 = (local37 << 12) / this.anInt4445;
		@Pc(51) int local51 = this.anInt4450 * local44 >> 12;
		return local51 > arg1 + arg0 && -local51 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7828(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method3731(arg0);
		if (super.aClass174_41.aBoolean271) {
			@Pc(29) int local29 = Static564.anIntArray703[arg0] - 2048;
			for (@Pc(31) int local31 = 0; local31 < Static447.anInt8568; local31++) {
				@Pc(39) int local39 = Static157.anIntArray321[local31] - 2048;
				@Pc(44) int local44 = this.anInt4449 + local39;
				@Pc(55) int local55 = local44 < -2048 ? local44 + 4096 : local44;
				@Pc(64) int local64 = local55 <= 2048 ? local55 : local55 - 4096;
				@Pc(70) int local70 = local29 + this.anInt4452;
				@Pc(81) int local81 = local70 >= -2048 ? local70 : local70 + 4096;
				@Pc(92) int local92 = local81 <= 2048 ? local81 : local81 - 4096;
				@Pc(97) int local97 = local39 + this.anInt4446;
				@Pc(106) int local106 = local97 < -2048 ? local97 + 4096 : local97;
				@Pc(117) int local117 = local106 <= 2048 ? local106 : local106 - 4096;
				@Pc(122) int local122 = this.anInt4442 + local29;
				@Pc(133) int local133 = local122 < -2048 ? local122 + 4096 : local122;
				@Pc(142) int local142 = local133 > 2048 ? local133 - 4096 : local133;
				local11[local31] = this.method3817(local92, local64) || this.method3818(local117, local142) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IZI)Z")
	private boolean method3818(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = (arg1 + arg0) * this.anInt4447 >> 12;
		@Pc(32) int local32 = Static205.anIntArray395[local13 * 255 >> 12 & 0xFF];
		@Pc(39) int local39 = (local32 << 12) / this.anInt4447;
		@Pc(46) int local46 = (local39 << 12) / this.anInt4445;
		@Pc(53) int local53 = this.anInt4450 * local46 >> 12;
		return arg1 - arg0 < local53 && -local53 < arg1 - arg0;
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "(B)V")
	@Override
	public void method7832() {
		Static369.method5426();
	}
}
