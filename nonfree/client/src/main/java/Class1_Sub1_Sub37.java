import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class1_Sub1_Sub37 extends Class1_Sub1 {

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3008(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass80_41.method2742(arg0);
		if (super.aClass80_41.aBoolean288) {
			for (@Pc(21) int local21 = 0; local21 < Static65.anInt1933; local21++) {
				local15[local21] = Static106.anIntArray284[local21];
			}
		}
		return local15;
	}
}
