import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class3_Sub1_Sub34 extends Class3_Sub1 {

	@OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
	private int anInt5183 = 0;

	@OriginalMember(owner = "client!rj", name = "M", descriptor = "I")
	private int anInt5186 = 4096;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub34() {
		super(1, true);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5183 = arg0.method2767();
		} else if (arg1 == 1) {
			this.anInt5186 = arg0.method2767();
		}
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5550(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass4_41.method61(arg0);
		if (super.aClass4_41.aBoolean7) {
			@Pc(21) int[] local21 = this.method5547(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static238.anInt4221; local23++) {
				@Pc(29) int local29 = local21[local23];
				local11[local23] = this.anInt5183 <= local29 && this.anInt5186 >= local29 ? 4096 : 0;
			}
		}
		return local11;
	}
}
