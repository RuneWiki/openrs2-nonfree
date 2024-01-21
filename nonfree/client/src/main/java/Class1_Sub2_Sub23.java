import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class1_Sub2_Sub23 extends Class1_Sub2 {

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3126(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass5_39.method168(arg0);
		if (super.aClass5_39.aBoolean16) {
			Static184.method627(local17, 0, Static110.anInt2825, Static37.anIntArray125[arg0]);
		}
		return local17;
	}
}
