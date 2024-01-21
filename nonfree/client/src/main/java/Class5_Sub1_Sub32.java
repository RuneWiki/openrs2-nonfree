import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class5_Sub1_Sub32 extends Class5_Sub1 {

	@OriginalMember(owner = "client!s", name = "N", descriptor = "I")
	private int anInt3453 = 4096;

	@OriginalMember(owner = "client!s", name = "R", descriptor = "I")
	private int anInt3457 = 0;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub32() {
		super(1, true);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3457 = arg0.method3077();
		} else if (arg1 == 1) {
			this.anInt3453 = arg0.method3077();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3195(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass101_41.method2886(arg0);
		if (super.aClass101_41.aBoolean174) {
			@Pc(28) int[] local28 = this.method3196(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static174.anInt3489; local30++) {
				@Pc(36) int local36 = local28[local30];
				local18[local30] = this.anInt3457 <= local36 && this.anInt3453 >= local36 ? 4096 : 0;
			}
		}
		return local18;
	}
}
