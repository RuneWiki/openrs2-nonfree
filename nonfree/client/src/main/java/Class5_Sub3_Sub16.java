import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class5_Sub3_Sub16 extends Class5_Sub3 {

	static {
		new Class85("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
		new Class85("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
	}

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "(III)I")
	private int method2781(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 * 57 + arg0;
		@Pc(15) int local15 = local9 ^ local9 << 1;
		return 4096 - ((local15 * local15 * 15731 + 789221) * local15 + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method6011(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass188_41.method5318(arg0);
		if (super.aClass188_41.aBoolean490) {
			@Pc(24) int local24 = Static345.anIntArray627[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static7.anInt129; local26++) {
				local16[local26] = this.method2781(Static164.anIntArray337[local26], local24) % 4096;
			}
		}
		return local16;
	}
}
