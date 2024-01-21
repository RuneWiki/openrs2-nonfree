import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class2_Sub1_Sub4 extends Class2_Sub1 {

	@OriginalMember(owner = "client!bc", name = "Q", descriptor = "I")
	private int anInt310;

	@OriginalMember(owner = "client!bc", name = "X", descriptor = "I")
	private int anInt315;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method2801(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass81_39.method2606(arg0);
		if (super.aClass81_39.aBoolean153) {
			@Pc(27) int[] local27 = this.method2796(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static120.anInt2812; local29++) {
				@Pc(35) int local35 = local27[local29];
				local17[local29] = this.anInt315 <= local35 && this.anInt310 >= local35 ? 4096 : 0;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt315 = arg0.method1397();
		} else if (arg1 == 1) {
			this.anInt310 = arg0.method1397();
		}
	}
}
