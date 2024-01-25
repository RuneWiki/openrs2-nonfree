import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class1_Sub1_Sub9 extends Class1_Sub1 {

	@OriginalMember(owner = "client!f", name = "I", descriptor = "I")
	private int anInt1846 = 0;

	@OriginalMember(owner = "client!f", name = "S", descriptor = "I")
	private int anInt1854 = 0;

	@OriginalMember(owner = "client!f", name = "T", descriptor = "I")
	private int anInt1855 = 1;

	static {
		new Class106("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6007(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass98_41.method2856(arg0);
		if (super.aClass98_41.aBoolean210) {
			@Pc(24) int local24 = Static60.anIntArray122[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static85.anInt1910; local32++) {
				@Pc(38) int local38 = Static273.anIntArray414[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(67) int local67;
				if (this.anInt1846 == 0) {
					local67 = (local38 - local24) * this.anInt1855;
				} else {
					@Pc(57) int local57 = local30 * local30 + local44 * local44 >> 12;
					local67 = (int) (Math.sqrt((double) ((float) local57 / 4096.0F)) * 4096.0D);
					local67 = (int) ((double) (local67 * this.anInt1855) * 3.141592653589793D);
				}
				local67 -= local67 & 0xFFFFF000;
				if (this.anInt1854 == 0) {
					local67 = Static171.anIntArray265[local67 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt1854 == 2) {
					local67 -= 2048;
					if (local67 < 0) {
						local67 = -local67;
					}
					local67 = 2048 - local67 << 1;
				}
				local11[local32] = local67;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt1846 = arg1.method2132();
		} else if (arg0 == 1) {
			this.anInt1854 = arg1.method2132();
		} else if (arg0 == 3) {
			this.anInt1855 = arg1.method2132();
		}
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V")
	@Override
	public void method6008() {
		Static113.method2407();
	}
}
