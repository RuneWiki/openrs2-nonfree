import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class1_Sub3_Sub7 extends Class1_Sub3 {

	@OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
	private int anInt623 = 0;

	@OriginalMember(owner = "client!cj", name = "ab", descriptor = "I")
	private int anInt626 = 4096;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub7() {
		super(1, true);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt623 = arg1.method2178();
		} else if (arg0 == 1) {
			this.anInt626 = arg1.method2178();
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3475(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass79_41.method2341(arg0);
		if (super.aClass79_41.aBoolean125) {
			@Pc(21) int[] local21 = this.method3468(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static76.anInt1531; local23++) {
				@Pc(29) int local29 = local21[local23];
				local7[local23] = local29 >= this.anInt623 && local29 <= this.anInt626 ? 4096 : 0;
			}
		}
		return local7;
	}
}
