import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class8_Sub3_Sub18 extends Class8_Sub3 {

	@OriginalMember(owner = "client!hg", name = "P", descriptor = "I")
	private int anInt2125 = 0;

	@OriginalMember(owner = "client!hg", name = "U", descriptor = "I")
	private int anInt2130 = 0;

	@OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
	private int anInt2123 = 1;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V")
	@Override
	public void method4220() {
		Static111.method1828();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method4227(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = this.aClass59_41.method1366(arg0);
		if (this.aClass59_41.aBoolean131) {
			@Pc(19) int local19 = Static33.anIntArray50[arg0];
			@Pc(25) int local25 = local19 - 2048 >> 1;
			for (@Pc(27) int local27 = 0; local27 < Static239.anInt4789; local27++) {
				@Pc(38) int local38 = Static171.anIntArray258[local27];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(58) int local58;
				if (this.anInt2130 == 0) {
					local58 = this.anInt2123 * (local38 - local19);
				} else {
					@Pc(70) int local70 = local25 * local25 + local44 * local44 >> 12;
					local58 = (int) (Math.sqrt((double) ((float) local70 / 4096.0F)) * 4096.0D);
					local58 = (int) ((double) (local58 * this.anInt2123) * 3.141592653589793D);
				}
				local58 -= local58 & 0xFFFFF000;
				if (this.anInt2125 == 0) {
					local58 = Static19.anIntArray36[local58 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt2125 == 2) {
					local58 -= 2048;
					if (local58 < 0) {
						local58 = -local58;
					}
					local58 = 2048 - local58 << 1;
				}
				local11[local27] = local58;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt2130 = arg1.method2334();
		} else if (arg0 == 1) {
			this.anInt2125 = arg1.method2334();
		} else if (arg0 == 3) {
			this.anInt2123 = arg1.method2334();
		}
	}
}
