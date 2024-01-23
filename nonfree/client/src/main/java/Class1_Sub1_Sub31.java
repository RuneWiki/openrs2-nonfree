import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class1_Sub1_Sub31 extends Class1_Sub1 {

	@OriginalMember(owner = "client!r", name = "S", descriptor = "I")
	private int anInt4887 = 0;

	@OriginalMember(owner = "client!r", name = "U", descriptor = "I")
	private int anInt4889 = 4096;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub31() {
		super(1, true);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4717(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = this.aClass194_41.method4738(arg0);
		if (this.aClass194_41.aBoolean411) {
			@Pc(18) int[] local18 = this.method4716(0, arg0);
			for (@Pc(20) int local20 = 0; local20 < Static62.anInt1350; local20++) {
				@Pc(31) int local31 = local18[local20];
				local7[local20] = local31 >= this.anInt4887 && local31 <= this.anInt4889 ? 4096 : 0;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4887 = arg0.method2244();
		} else if (arg1 == 1) {
			this.anInt4889 = arg0.method2244();
		}
	}
}
