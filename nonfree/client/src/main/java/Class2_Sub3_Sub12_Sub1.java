import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class2_Sub3_Sub12_Sub1 extends Class2_Sub3_Sub12 {

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5702(@OriginalArg(1) int arg0) {
		@Pc(23) int[][] local23 = super.aClass90_41.method2391(arg0);
		if (super.aClass90_41.aBoolean257 && this.method3240()) {
			@Pc(35) int[] local35 = local23[0];
			@Pc(39) int[] local39 = local23[1];
			@Pc(43) int[] local43 = local23[2];
			@Pc(51) int local51 = super.anInt3721 * (arg0 % super.anInt3721);
			for (@Pc(53) int local53 = 0; local53 < Static263.anInt5504; local53++) {
				@Pc(65) int local65 = super.anIntArray281[local53 % super.anInt3724 + local51];
				local43[local53] = (local65 & 0xFF) << 4;
				local39[local53] = local65 >> 4 & 0xFF0;
				local35[local53] = local65 >> 12 & 0xFF0;
			}
		}
		return local23;
	}
}
