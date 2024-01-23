import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class1_Sub1_Sub35 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(IBI)I")
	private int method4095(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 * 57 + arg0;
		@Pc(24) int local24 = local9 ^ local9 << 1;
		return 4096 - (Integer.MAX_VALUE & local24 * (local24 * 15731 * local24 + 789221) + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method4459(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = this.aClass176_41.method4469(arg0);
		if (this.aClass176_41.aBoolean437) {
			@Pc(26) int local26 = Static219.anIntArray515[arg0];
			for (@Pc(28) int local28 = 0; local28 < Static131.anInt2513; local28++) {
				local14[local28] = this.method4095(Static105.anIntArray261[local28], local26) % 4096;
			}
		}
		return local14;
	}
}
