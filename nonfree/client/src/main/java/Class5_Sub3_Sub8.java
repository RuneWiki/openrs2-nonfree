import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class5_Sub3_Sub8 extends Class5_Sub3 {

	@OriginalMember(owner = "client!fg", name = "M", descriptor = "I")
	private int anInt1642 = 0;

	@OriginalMember(owner = "client!fg", name = "V", descriptor = "I")
	private int anInt1649 = 4096;

	static {
		new Class85("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
	}

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub8() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method6011(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass188_41.method5318(arg0);
		if (super.aClass188_41.aBoolean490) {
			@Pc(28) int[] local28 = this.method6020(0, arg0);
			for (@Pc(30) int local30 = 0; local30 < Static7.anInt129; local30++) {
				@Pc(36) int local36 = local28[local30];
				local11[local30] = this.anInt1642 <= local36 && local36 <= this.anInt1649 ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1642 = arg0.method5106();
		} else if (arg1 == 1) {
			this.anInt1649 = arg0.method5106();
		}
	}
}
