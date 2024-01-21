import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class1_Sub5_Sub36 extends Class1_Sub5 {

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3143(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass2_41.method19(arg0);
		if (super.aClass2_41.aBoolean2) {
			for (@Pc(22) int local22 = 0; local22 < Static177.anInt4018; local22++) {
				local16[local22] = Static116.anIntArray275[local22];
			}
		}
		return local16;
	}
}
