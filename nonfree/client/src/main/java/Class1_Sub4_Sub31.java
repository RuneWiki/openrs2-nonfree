import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class1_Sub4_Sub31 extends Class1_Sub4 {

	static {
		new Class119(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
	}

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5683(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass2_41.method10(arg0);
		if (super.aClass2_41.aBoolean5) {
			@Pc(24) int local24 = Static419.anIntArray472[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static395.anInt6592; local26++) {
				local16[local26] = this.method4418(Static119.anIntArray146[local26], local24) % 4096;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "(III)I")
	private int method4418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 + arg1 * 57;
		@Pc(16) int local16 = local10 << 1 ^ local10;
		return 4096 - (Integer.MAX_VALUE & local16 * (local16 * local16 * 15731 + 789221) + 1376312589) / 262144;
	}
}
