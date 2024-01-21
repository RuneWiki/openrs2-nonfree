import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class3_Sub1_Sub10 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3130(@OriginalArg(0) int arg0) {
		@Pc(21) int[] local21 = super.aClass22_39.method849(arg0);
		if (super.aClass22_39.aBoolean53) {
			for (@Pc(27) int local27 = 0; local27 < Static129.anInt3285; local27++) {
				local21[local27] = Static146.anIntArray618[local27];
			}
		}
		return local21;
	}
}
