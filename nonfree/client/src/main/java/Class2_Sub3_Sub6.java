import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class2_Sub3_Sub6 extends Class2_Sub3 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3016(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass51_41.method1730(arg0);
		if (super.aClass51_41.aBoolean89) {
			for (@Pc(22) int local22 = 0; local22 < Static53.anInt1184; local22++) {
				local16[local22] = Static43.anIntArray102[local22];
			}
		}
		return local16;
	}
}
