import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cv")
public final class Class5_Sub1_Sub2 extends Class5_Sub1 {

	static {
		new Class40("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	}

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7155(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass104_41.method2752(arg0);
		if (super.aClass104_41.aBoolean203) {
			@Pc(27) int local27 = Static295.anIntArray403[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static147.anInt3075; local29++) {
				local11[local29] = this.method1382(local27, Static315.anIntArray425[local29]) % 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(ZII)I")
	private int method1382(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(23) int local23 = local9 << 1 ^ local9;
		return 4096 - (local23 * (local23 * local23 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
