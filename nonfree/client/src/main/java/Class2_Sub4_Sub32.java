import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class2_Sub4_Sub32 extends Class2_Sub4 {

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8900(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass348_41.method8072(arg0);
		if (super.aClass348_41.aBoolean680) {
			@Pc(24) int local24 = Static415.anIntArray482[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static395.anInt6816; local26++) {
				local11[local26] = this.method6256(local24, Static20.anIntArray40[local26]) % 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(III)I")
	private int method6256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(15) int local15 = local9 << 1 ^ local9;
		return 4096 - (Integer.MAX_VALUE & (local15 * local15 * 15731 + 789221) * local15 + 1376312589) / 262144;
	}
}
