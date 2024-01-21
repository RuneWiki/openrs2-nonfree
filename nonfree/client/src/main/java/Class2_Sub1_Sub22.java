import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class2_Sub1_Sub22 extends Class2_Sub1 {

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method2801(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = super.aClass81_39.method2606(arg0);
		if (super.aClass81_39.aBoolean153) {
			for (@Pc(18) int local18 = 0; local18 < Static120.anInt2812; local18++) {
				local12[local18] = Static69.anIntArray117[local18];
			}
		}
		return local12;
	}
}
