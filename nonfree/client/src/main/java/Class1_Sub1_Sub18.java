import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class1_Sub1_Sub18 extends Class1_Sub1 {

	@OriginalMember(owner = "client!jd", name = "bb", descriptor = "I")
	private int anInt2145 = 0;

	@OriginalMember(owner = "client!jd", name = "X", descriptor = "I")
	private int anInt2143 = 0;

	@OriginalMember(owner = "client!jd", name = "db", descriptor = "I")
	private int anInt2147 = 1;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3571(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass40_41.method1362(arg0);
		if (super.aClass40_41.aBoolean86) {
			@Pc(19) int local19 = Static187.anIntArray362[arg0];
			@Pc(25) int local25 = local19 - 2048 >> 1;
			for (@Pc(27) int local27 = 0; local27 < Static115.anInt2578; local27++) {
				@Pc(33) int local33 = Static45.anIntArray97[local27];
				@Pc(39) int local39 = local33 - 2048 >> 1;
				@Pc(65) int local65;
				if (this.anInt2143 == 0) {
					local65 = this.anInt2147 * (local33 - local19);
				} else {
					@Pc(55) int local55 = local39 * local39 + local25 * local25 >> 12;
					local65 = (int) (Math.sqrt((double) ((float) local55 / 4096.0F)) * 4096.0D);
					local65 = (int) ((double) (this.anInt2147 * local65) * 3.141592653589793D);
				}
				local65 -= local65 & 0xFFFFF000;
				if (this.anInt2145 == 0) {
					local65 = Static134.anIntArray243[local65 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt2145 == 2) {
					local65 -= 2048;
					if (local65 < 0) {
						local65 = -local65;
					}
					local65 = 2048 - local65 << 1;
				}
				local11[local27] = local65;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
	@Override
	public void method3569() {
		Static64.method1304();
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2143 = arg0.method2771();
		} else if (arg1 == 1) {
			this.anInt2145 = arg0.method2771();
		} else if (arg1 == 3) {
			this.anInt2147 = arg0.method2771();
		}
	}
}
