import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class4_Sub6_Sub4_Sub1 extends Class4_Sub6_Sub4 {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4379(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = this.aClass84_41.method2153(arg0);
		if (this.aClass84_41.aBoolean183 && this.method1072()) {
			@Pc(31) int[] local31 = local18[2];
			@Pc(39) int local39 = arg0 % this.anInt1297 * this.anInt1297;
			@Pc(43) int[] local43 = local18[0];
			@Pc(47) int[] local47 = local18[1];
			for (@Pc(49) int local49 = 0; local49 < Static2.anInt19; local49++) {
				@Pc(62) int local62 = this.anIntArray140[local39 + local49 % this.anInt1311];
				local31[local49] = (local62 & 0xFF) << 4;
				local47[local49] = local62 >> 4 & 0xFF0;
				local43[local49] = local62 >> 12 & 0xFF0;
			}
		}
		return local18;
	}
}
