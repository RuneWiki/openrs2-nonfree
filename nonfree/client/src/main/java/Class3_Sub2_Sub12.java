import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class3_Sub2_Sub12 extends Class3_Sub2 {

	@OriginalMember(owner = "client!jk", name = "D", descriptor = "I")
	private int anInt5319 = 4096;

	@OriginalMember(owner = "client!jk", name = "C", descriptor = "I")
	private int anInt5318 = 0;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub12() {
		super(1, true);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8710(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass340_41.method7837(arg0);
		if (super.aClass340_41.aBoolean687) {
			@Pc(30) int[] local30 = this.method8716(0, arg0);
			for (@Pc(32) int local32 = 0; local32 < Static30.anInt908; local32++) {
				@Pc(38) int local38 = local30[local32];
				local18[local32] = this.anInt5318 <= local38 && local38 <= this.anInt5319 ? 4096 : 0;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5318 = arg0.method4858();
		} else if (arg1 == 1) {
			this.anInt5319 = arg0.method4858();
		}
	}
}
