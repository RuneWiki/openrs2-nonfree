import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class2_Sub7_Sub20 extends Class2_Sub7 {

	@OriginalMember(owner = "client!kg", name = "M", descriptor = "I")
	private int anInt4538 = 32768;

	static {
		new Class202("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub20() {
		super(3, false);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
	@Override
	public void method7583() {
		Static50.method896();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			this.anInt4538 = arg1.method5229() << 4;
		} else if (arg0 == 1) {
			super.aBoolean649 = arg1.method5170() == 1;
		}
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7587(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass221_41.method5903(arg0);
		if (super.aClass221_41.aBoolean523) {
			@Pc(26) int[] local26 = this.method7581(arg0, 1);
			@Pc(32) int[] local32 = this.method7581(arg0, 2);
			for (@Pc(34) int local34 = 0; local34 < Static352.anInt6485; local34++) {
				@Pc(44) int local44 = local26[local34] >> 4 & 0xFF;
				@Pc(53) int local53 = this.anInt4538 * local32[local34] >> 12;
				@Pc(61) int local61 = Static314.anIntArray485[local44] * local53 >> 12;
				@Pc(69) int local69 = local53 * Static336.anIntArray502[local44] >> 12;
				@Pc(77) int local77 = Static38.anInt733 & (local61 >> 12) + local34;
				@Pc(86) int local86 = Static126.anInt7690 & arg0 + (local69 >> 12);
				@Pc(92) int[] local92 = this.method7581(local86, 0);
				local16[local34] = local92[local77];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7585(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass180_41.method4533(arg0);
		if (super.aClass180_41.aBoolean392) {
			@Pc(27) int[] local27 = this.method7581(arg0, 1);
			@Pc(33) int[] local33 = this.method7581(arg0, 2);
			@Pc(37) int[] local37 = local17[0];
			@Pc(41) int[] local41 = local17[1];
			@Pc(45) int[] local45 = local17[2];
			for (@Pc(47) int local47 = 0; local47 < Static352.anInt6485; local47++) {
				@Pc(59) int local59 = local27[local47] * 255 >> 12 & 0xFF;
				@Pc(68) int local68 = this.anInt4538 * local33[local47] >> 12;
				@Pc(76) int local76 = local68 * Static314.anIntArray485[local59] >> 12;
				@Pc(84) int local84 = Static336.anIntArray502[local59] * local68 >> 12;
				@Pc(92) int local92 = Static38.anInt733 & local47 + (local76 >> 12);
				@Pc(100) int local100 = (local84 >> 12) + arg0 & Static126.anInt7690;
				@Pc(106) int[][] local106 = this.method7589(0, local100);
				local37[local47] = local106[0][local92];
				local41[local47] = local106[1][local92];
				local45[local47] = local106[2][local92];
			}
		}
		return local17;
	}
}
