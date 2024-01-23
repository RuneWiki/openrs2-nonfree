import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class1_Sub3_Sub34_Sub1 extends Class1_Sub3_Sub34 {

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3467(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass56_41.method1552(arg0);
		if (super.aClass56_41.aBoolean90 && this.method2870()) {
			@Pc(19) int[] local19 = local7[1];
			@Pc(23) int[] local23 = local7[2];
			@Pc(27) int[] local27 = local7[0];
			@Pc(35) int local35 = super.anInt3569 * (arg0 % super.anInt3569);
			for (@Pc(37) int local37 = 0; local37 < Static76.anInt1531; local37++) {
				@Pc(49) int local49 = super.anIntArray384[local35 + local37 % super.anInt3565];
				local23[local37] = (local49 & 0xFF) << 4;
				local19[local37] = local49 >> 4 & 0xFF0;
				local27[local37] = local49 >> 12 & 0xFF0;
			}
		}
		return local7;
	}
}
