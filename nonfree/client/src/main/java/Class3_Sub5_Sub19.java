import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class3_Sub5_Sub19 extends Class3_Sub5 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3173(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass39_41.method1114(arg0);
		if (super.aClass39_41.aBoolean66) {
			for (@Pc(25) int local25 = 0; local25 < Static104.anInt2195; local25++) {
				local11[local25] = Static124.anIntArray355[local25];
			}
		}
		return local11;
	}
}
