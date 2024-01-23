import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class1_Sub2_Sub13 extends Class1_Sub2 {

	@OriginalMember(owner = "client!hd", name = "db", descriptor = "I")
	private int anInt1824 = 0;

	@OriginalMember(owner = "client!hd", name = "kb", descriptor = "I")
	private int anInt1830 = 1;

	@OriginalMember(owner = "client!hd", name = "X", descriptor = "I")
	private int anInt1822 = 0;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3505(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass102_41.method3129(arg0);
		if (super.aClass102_41.aBoolean239) {
			@Pc(24) int local24 = Static128.anIntArray362[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static105.anInt2391; local32++) {
				@Pc(38) int local38 = Static63.anIntArray182[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(70) int local70;
				if (this.anInt1822 == 0) {
					local70 = this.anInt1830 * (local38 - local24);
				} else {
					@Pc(60) int local60 = local44 * local44 + local30 * local30 >> 12;
					local70 = (int) (Math.sqrt((double) ((float) local60 / 4096.0F)) * 4096.0D);
					local70 = (int) ((double) (this.anInt1830 * local70) * 3.141592653589793D);
				}
				local70 -= local70 & 0xFFFFF000;
				if (this.anInt1824 == 0) {
					local70 = Static115.anIntArray331[local70 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt1824 == 2) {
					local70 -= 2048;
					if (local70 < 0) {
						local70 = -local70;
					}
					local70 = 2048 - local70 << 1;
				}
				local16[local32] = local70;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1822 = arg0.method895();
		} else if (arg1 == 1) {
			this.anInt1824 = arg0.method895();
		} else if (arg1 == 3) {
			this.anInt1830 = arg0.method895();
		}
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
	@Override
	public void method3503() {
		Static189.method2977();
	}
}
