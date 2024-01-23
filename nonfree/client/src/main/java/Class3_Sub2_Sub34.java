import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class3_Sub2_Sub34 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ri", name = "N", descriptor = "I")
	private int anInt4858 = 4096;

	@OriginalMember(owner = "client!ri", name = "Q", descriptor = "I")
	private int anInt4860 = 2048;

	@OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
	private int anInt4861 = 0;

	@OriginalMember(owner = "client!ri", name = "V", descriptor = "I")
	private int anInt4865 = 2048;

	@OriginalMember(owner = "client!ri", name = "X", descriptor = "I")
	private int anInt4867 = 12288;

	@OriginalMember(owner = "client!ri", name = "U", descriptor = "I")
	private int anInt4864 = 0;

	@OriginalMember(owner = "client!ri", name = "Y", descriptor = "I")
	private int anInt4868 = 8192;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt4865 = arg1.method3948();
		} else if (arg0 == 1) {
			this.anInt4864 = arg1.method3948();
		} else if (arg0 == 2) {
			this.anInt4861 = arg1.method3948();
		} else if (arg0 == 3) {
			this.anInt4860 = arg1.method3948();
		} else if (arg0 == 4) {
			this.anInt4867 = arg1.method3948();
		} else if (arg0 == 5) {
			this.anInt4858 = arg1.method3948();
		} else if (arg0 == 6) {
			this.anInt4868 = arg1.method3948();
		}
	}

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "(III)Z")
	private boolean method4064(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = (arg0 - arg1) * this.anInt4867 >> 12;
		@Pc(23) int local23 = Static220.anIntArray542[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt4867;
		@Pc(37) int local37 = (local30 << 12) / this.anInt4868;
		@Pc(50) int local50 = this.anInt4858 * local37 >> 12;
		return local50 > arg0 + arg1 && -local50 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "(III)Z")
	private boolean method4067(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt4867 * (arg0 + arg1) >> 12;
		@Pc(27) int local27 = Static220.anIntArray542[local12 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local27 << 12) / this.anInt4867;
		@Pc(41) int local41 = (local34 << 12) / this.anInt4868;
		@Pc(48) int local48 = this.anInt4858 * local41 >> 12;
		return arg1 - arg0 < local48 && arg1 - arg0 > -local48;
	}

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "(I)V")
	@Override
	public void method4952() {
		Static66.method1029();
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4961(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.aClass168_41.method4366(arg0);
		if (this.aClass168_41.aBoolean373) {
			@Pc(28) int local28 = Static205.anIntArray450[arg0] - 2048;
			for (@Pc(30) int local30 = 0; local30 < Static22.anInt421; local30++) {
				@Pc(39) int local39 = Static185.anIntArray424[local30] - 2048;
				@Pc(44) int local44 = this.anInt4865 + local39;
				@Pc(50) int local50 = local28 + this.anInt4864;
				@Pc(61) int local61 = local50 < -2048 ? local50 + 4096 : local50;
				@Pc(70) int local70 = local44 < -2048 ? local44 + 4096 : local44;
				@Pc(81) int local81 = local61 <= 2048 ? local61 : local61 - 4096;
				@Pc(86) int local86 = local28 + this.anInt4860;
				@Pc(91) int local91 = this.anInt4861 + local39;
				@Pc(102) int local102 = local86 >= -2048 ? local86 : local86 + 4096;
				@Pc(111) int local111 = local102 <= 2048 ? local102 : local102 - 4096;
				@Pc(120) int local120 = local91 < -2048 ? local91 + 4096 : local91;
				@Pc(131) int local131 = local120 <= 2048 ? local120 : local120 - 4096;
				@Pc(142) int local142 = local70 > 2048 ? local70 - 4096 : local70;
				local17[local30] = this.method4064(local81, local142) || this.method4067(local131, local111) ? 4096 : 0;
			}
		}
		return local17;
	}
}
