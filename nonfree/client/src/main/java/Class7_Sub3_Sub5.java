import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class7_Sub3_Sub5 extends Class7_Sub3 {

	static {
		new Class55(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
	}

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BII)I")
	private int method846(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(15) int local15 = local9 ^ local9 << 1;
		return 4096 - (Integer.MAX_VALUE & (local15 * 15731 * local15 + 789221) * local15 + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5594(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass113_41.method2456(arg0);
		if (super.aClass113_41.aBoolean181) {
			@Pc(24) int local24 = Static203.anIntArray322[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static58.anInt1052; local26++) {
				local16[local26] = this.method846(local24, Static185.anIntArray298[local26]) % 4096;
			}
		}
		return local16;
	}
}
