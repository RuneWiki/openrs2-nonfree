import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class2_Sub6_Sub4_Sub1 extends Class2_Sub6_Sub4 {

	@OriginalMember(owner = "client!d", name = "lb", descriptor = "Lclient!aq;")
	public static Class5 lb;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5641(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass208_41.method4986(arg0);
		if (super.aClass208_41.aBoolean443 && this.method975()) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			@Pc(39) int local39 = super.anInt1012 * (arg0 % super.anInt1012);
			for (@Pc(41) int local41 = 0; local41 < Static151.anInt2711; local41++) {
				@Pc(54) int local54 = super.anIntArray140[local39 + local41 % super.anInt1019];
				local31[local41] = (local54 & 0xFF) << 4;
				local27[local41] = local54 >> 4 & 0xFF0;
				local23[local41] = local54 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
