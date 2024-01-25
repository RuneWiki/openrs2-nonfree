import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class4_Sub4_Sub30_Sub1 extends Class4_Sub4_Sub30 {

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6043(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass163_41.method3181(arg0);
		if (super.aClass163_41.aBoolean296 && this.method6050()) {
			@Pc(33) int[] local33 = local19[0];
			@Pc(37) int[] local37 = local19[1];
			@Pc(41) int[] local41 = local19[2];
			@Pc(49) int local49 = arg0 % super.anInt7649 * super.anInt7649;
			for (@Pc(51) int local51 = 0; local51 < Static419.anInt6404; local51++) {
				@Pc(63) int local63 = super.anIntArray574[local49 + local51 % super.anInt7645];
				local41[local51] = (local63 & 0xFF) << 4;
				local37[local51] = local63 >> 4 & 0xFF0;
				local33[local51] = local63 >> 12 & 0xFF0;
			}
		}
		return local19;
	}
}
