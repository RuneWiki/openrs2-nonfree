import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method2801(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass81_39.method2606(arg0);
		if (super.aClass81_39.aBoolean153) {
			Static184.method166(local18, 0, Static120.anInt2812, Static11.anIntArray8[arg0]);
		}
		return local18;
	}
}
