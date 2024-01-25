import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class3_Sub1_Sub23 extends Class3_Sub1 {

	@OriginalMember(owner = "client!op", name = "F", descriptor = "I")
	private int anInt7493 = 0;

	@OriginalMember(owner = "client!op", name = "H", descriptor = "I")
	private int anInt7497 = 4096;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub23() {
		super(1, true);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt7493 = arg1.method2028(-14795);
		} else if (arg0 == 1) {
			this.anInt7497 = arg1.method2028(-14795);
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9573(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass305_41.method6989(arg0);
		if (super.aClass305_41.aBoolean550) {
			@Pc(30) int[] local30 = this.method9577(0, arg0);
			for (@Pc(32) int local32 = 0; local32 < Static379.anInt5859; local32++) {
				@Pc(38) int local38 = local30[local32];
				local18[local32] = this.anInt7493 <= local38 && this.anInt7497 >= local38 ? 4096 : 0;
			}
		}
		return local18;
	}
}
