import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sja")
public final class Class5_Sub2_Sub6_Sub1 extends Class5_Sub2_Sub6 {

	static {
		new BitSet(65536);
	}

	@OriginalMember(owner = "client!sja", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8943(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass180_41.method4548(arg0);
		if (super.aClass180_41.aBoolean464 && this.method7612()) {
			@Pc(31) int[] local31 = local19[0];
			@Pc(35) int[] local35 = local19[1];
			@Pc(39) int[] local39 = local19[2];
			@Pc(47) int local47 = arg0 % super.anInt8959 * super.anInt8959;
			for (@Pc(49) int local49 = 0; local49 < Static195.anInt3759; local49++) {
				@Pc(61) int local61 = super.anIntArray495[local47 + local49 % super.anInt8960];
				local39[local49] = (local61 & 0xFF) << 4;
				local35[local49] = local61 >> 4 & 0xFF0;
				local31[local49] = local61 >> 12 & 0xFF0;
			}
		}
		return local19;
	}
}
