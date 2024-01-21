import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class4_Sub3_Sub6 extends Class4_Sub3 {

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3161(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass64_41.method2211(arg0);
		if (super.aClass64_41.aBoolean127) {
			for (@Pc(25) int local25 = 0; local25 < Static134.anInt3188; local25++) {
				local19[local25] = Static67.anIntArray170[local25];
			}
		}
		return local19;
	}
}
