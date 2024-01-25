import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class1_Sub3_Sub5 extends Class1_Sub3 {

	@OriginalMember(owner = "client!am", name = "E", descriptor = "I")
	private int anInt475 = 0;

	@OriginalMember(owner = "client!am", name = "K", descriptor = "I")
	private int anInt480 = 4096;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub5() {
		super(1, true);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7123(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = super.aClass12_41.method502(arg0);
		if (super.aClass12_41.aBoolean23) {
			@Pc(28) int[] local28 = this.method7128(0, arg0);
			for (@Pc(30) int local30 = 0; local30 < Static452.anInt7734; local30++) {
				@Pc(36) int local36 = local28[local30];
				local13[local30] = local36 >= this.anInt475 && this.anInt480 >= local36 ? 4096 : 0;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt475 = arg0.method3967();
		} else if (arg1 == 1) {
			this.anInt480 = arg0.method3967();
		}
	}
}
