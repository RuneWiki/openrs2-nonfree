import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class2_Sub1_Sub3 extends Class2_Sub1 {

	@OriginalMember(owner = "client!bj", name = "X", descriptor = "I")
	private int anInt514 = 0;

	@OriginalMember(owner = "client!bj", name = "ab", descriptor = "I")
	private int anInt516 = 4096;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub3() {
		super(1, true);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4940(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = this.aClass136_41.method3410(arg0);
		if (this.aClass136_41.aBoolean349) {
			@Pc(30) int[] local30 = this.method4946(arg0, 0);
			for (@Pc(32) int local32 = 0; local32 < Static114.anInt1359; local32++) {
				@Pc(39) int local39 = local30[local32];
				local19[local32] = this.anInt514 <= local39 && local39 <= this.anInt516 ? 4096 : 0;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt514 = arg0.method4242();
		} else if (arg1 == 1) {
			this.anInt516 = arg0.method4242();
		}
	}
}
