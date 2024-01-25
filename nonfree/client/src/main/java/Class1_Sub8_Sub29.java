import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qt")
public final class Class1_Sub8_Sub29 extends Class1_Sub8 {

	@OriginalMember(owner = "client!qt", name = "K", descriptor = "I")
	private int anInt6232 = 0;

	@OriginalMember(owner = "client!qt", name = "N", descriptor = "I")
	private int anInt6234 = 4096;

	static {
		new Class158("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
		new Class158("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
	}

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt6232 = arg1.method1177();
		} else if (arg0 == 1) {
			this.anInt6234 = arg1.method1177();
		} else if (arg0 == 2) {
			super.aBoolean508 = arg1.method1171() == 1;
		}
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6030(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass130_41.method3108(arg0);
		if (super.aClass130_41.aBoolean246) {
			@Pc(29) int[][] local29 = this.method6035(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static18.anInt439; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local41[local55];
				if (local61 < this.anInt6232) {
					local45[local55] = this.anInt6232;
				} else if (this.anInt6234 >= local61) {
					local45[local55] = local61;
				} else {
					local45[local55] = this.anInt6234;
				}
				if (this.anInt6232 > local65) {
					local49[local55] = this.anInt6232;
				} else if (local65 > this.anInt6234) {
					local49[local55] = this.anInt6234;
				} else {
					local49[local55] = local65;
				}
				if (this.anInt6232 > local69) {
					local53[local55] = this.anInt6232;
				} else if (this.anInt6234 >= local69) {
					local53[local55] = local69;
				} else {
					local53[local55] = this.anInt6234;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6031(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass225_41.method5085(arg0);
		if (super.aClass225_41.aBoolean421) {
			@Pc(21) int[] local21 = this.method6037(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static18.anInt439; local23++) {
				@Pc(29) int local29 = local21[local23];
				if (this.anInt6232 > local29) {
					local11[local23] = this.anInt6232;
				} else if (this.anInt6234 < local29) {
					local11[local23] = this.anInt6234;
				} else {
					local11[local23] = local29;
				}
			}
		}
		return local11;
	}
}
