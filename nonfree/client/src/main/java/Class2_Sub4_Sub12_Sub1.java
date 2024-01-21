import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class2_Sub4_Sub12_Sub1 extends Class2_Sub4_Sub12 {

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3122(@OriginalArg(1) int arg0) {
		@Pc(7) int[][] local7 = super.aClass99_41.method2748(arg0);
		if (super.aClass99_41.aBoolean176 && this.method3135()) {
			@Pc(19) int[] local19 = local7[0];
			@Pc(23) int[] local23 = local7[1];
			@Pc(27) int[] local27 = local7[2];
			@Pc(35) int local35 = arg0 % super.anInt4463 * super.anInt4463;
			for (@Pc(37) int local37 = 0; local37 < Static118.anInt2608; local37++) {
				@Pc(50) int local50 = super.anIntArray401[local35 + local37 % super.anInt4470];
				local27[local37] = (local50 & 0xFF) << 4;
				local23[local37] = local50 >> 4 & 0xFF0;
				local19[local37] = local50 >> 12 & 0xFF0;
			}
		}
		return local7;
	}
}
