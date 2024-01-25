import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class4_Sub6_Sub35 extends Class4_Sub6 {

	static {
		new Class159("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(III)I")
	private int method5184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = arg1 * 57 + arg0;
		@Pc(23) int local23 = local17 ^ local17 << 1;
		return 4096 - (local23 * (local23 * local23 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5698(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass133_41.method3738(arg0);
		if (super.aClass133_41.aBoolean318) {
			@Pc(26) int local26 = Static128.anIntArray265[arg0];
			for (@Pc(28) int local28 = 0; local28 < Static31.anInt797; local28++) {
				local11[local28] = this.method5184(Static339.anIntArray4[local28], local26) % 4096;
			}
		}
		return local11;
	}
}
