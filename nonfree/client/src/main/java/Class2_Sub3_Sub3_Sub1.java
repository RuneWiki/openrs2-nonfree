import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class2_Sub3_Sub3_Sub1 extends Class2_Sub3_Sub3 {

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method2894(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass12_39.method485(arg0);
		if (super.aClass12_39.aBoolean24 && this.method292()) {
			@Pc(28) int[] local28 = local7[0];
			@Pc(36) int local36 = super.anInt445 * (arg0 % super.anInt445);
			@Pc(40) int[] local40 = local7[1];
			@Pc(44) int[] local44 = local7[2];
			for (@Pc(46) int local46 = 0; local46 < Static54.anInt1423; local46++) {
				@Pc(58) int local58 = super.anIntArray28[local46 % super.anInt447 + local36];
				local44[local46] = (local58 & 0xFF) << 4;
				local40[local46] = local58 >> 4 & 0xFF0;
				local28[local46] = local58 >> 12 & 0xFF0;
			}
		}
		return local7;
	}
}
