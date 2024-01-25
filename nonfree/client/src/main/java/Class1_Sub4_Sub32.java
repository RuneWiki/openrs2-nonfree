import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class1_Sub4_Sub32 extends Class1_Sub4 {

	static {
		new Class7("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub32() {
		super(3, false);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5957(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass15_41.method508(arg0);
		if (super.aClass15_41.aBoolean17) {
			@Pc(26) int[] local26 = this.method5958(arg0, 0);
			@Pc(32) int[] local32 = this.method5958(arg0, 1);
			@Pc(38) int[] local38 = this.method5958(arg0, 2);
			for (@Pc(40) int local40 = 0; local40 < Static66.anInt1511; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local16[local40] = local26[local40];
				} else if (local46 == 0) {
					local16[local40] = local32[local40];
				} else {
					local16[local40] = local26[local40] * local46 + (4096 - local46) * local32[local40] >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5951(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass34_41.method823(arg0);
		if (super.aClass34_41.aBoolean47) {
			@Pc(29) int[] local29 = this.method5958(arg0, 2);
			@Pc(35) int[][] local35 = this.method5956(arg0, 0);
			@Pc(41) int[][] local41 = this.method5956(arg0, 1);
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			@Pc(57) int[] local57 = local35[0];
			@Pc(61) int[] local61 = local35[1];
			@Pc(65) int[] local65 = local35[2];
			@Pc(69) int[] local69 = local41[0];
			@Pc(73) int[] local73 = local41[1];
			@Pc(77) int[] local77 = local41[2];
			for (@Pc(79) int local79 = 0; local79 < Static66.anInt1511; local79++) {
				@Pc(85) int local85 = local29[local79];
				if (local85 == 4096) {
					local45[local79] = local57[local79];
					local49[local79] = local61[local79];
					local53[local79] = local65[local79];
				} else if (local85 == 0) {
					local45[local79] = local69[local79];
					local49[local79] = local73[local79];
					local53[local79] = local77[local79];
				} else {
					@Pc(100) int local100 = 4096 - local85;
					local45[local79] = local85 * local57[local79] + local100 * local69[local79] >> 12;
					local49[local79] = local61[local79] * local85 + local100 * local73[local79] >> 12;
					local53[local79] = local77[local79] * local100 + local65[local79] * local85 >> 12;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			super.aBoolean501 = arg1.method5366() == 1;
		}
	}
}
