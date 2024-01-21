import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class1_Sub2_Sub27 extends Class1_Sub2 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3126(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass5_39.method168(arg0);
		if (super.aClass5_39.aBoolean16) {
			for (@Pc(22) int local22 = 0; local22 < Static110.anInt2825; local22++) {
				local16[local22] = Static86.anIntArray294[local22];
			}
		}
		return local16;
	}
}
