import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fea")
public final class Class6_Sub3_Sub7_Sub1 extends Class6_Sub3_Sub7 {

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7822(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass103_41.method2141(arg0);
		if (super.aClass103_41.aBoolean172 && this.method2049()) {
			@Pc(31) int[] local31 = local19[0];
			@Pc(35) int[] local35 = local19[1];
			@Pc(39) int[] local39 = local19[2];
			@Pc(47) int local47 = arg0 % super.anInt2427 * super.anInt2427;
			for (@Pc(49) int local49 = 0; local49 < Static447.anInt8568; local49++) {
				@Pc(61) int local61 = super.anIntArray298[local49 % super.anInt2423 + local47];
				local39[local49] = (local61 & 0xFF) << 4;
				local35[local49] = local61 >> 4 & 0xFF0;
				local31[local49] = local61 >> 12 & 0xFF0;
			}
		}
		return local19;
	}
}
