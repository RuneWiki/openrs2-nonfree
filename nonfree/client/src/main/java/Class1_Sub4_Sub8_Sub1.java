import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class1_Sub4_Sub8_Sub1 extends Class1_Sub4_Sub8 {

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4756(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass85_41.method2339(arg0);
		if (this.aClass85_41.aBoolean171 && this.method1207()) {
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			@Pc(47) int local47 = this.anInt1288 * (arg0 % this.anInt1288);
			for (@Pc(49) int local49 = 0; local49 < Static182.anInt3492; local49++) {
				@Pc(67) int local67 = this.anIntArray114[local47 + local49 % this.anInt1298];
				local39[local49] = (local67 & 0xFF) << 4;
				local35[local49] = local67 >> 4 & 0xFF0;
				local31[local49] = local67 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
