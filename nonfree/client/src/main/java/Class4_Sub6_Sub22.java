import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class Class4_Sub6_Sub22 extends Class4_Sub6 {

	@OriginalMember(owner = "client!lu", name = "J", descriptor = "I")
	private int anInt4463 = 32768;

	static {
		new Class83(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
		new Class83("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
	}

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub22() {
		super(3, false);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5510(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_41.method2265(arg0);
		if (super.aClass82_41.aBoolean243) {
			@Pc(29) int[] local29 = this.method5508(arg0, 1);
			@Pc(35) int[] local35 = this.method5508(arg0, 2);
			for (@Pc(37) int local37 = 0; local37 < Static80.anInt1616; local37++) {
				@Pc(47) int local47 = local29[local37] >> 4 & 0xFF;
				@Pc(56) int local56 = local35[local37] * this.anInt4463 >> 12;
				@Pc(64) int local64 = Static345.anIntArray416[local47] * local56 >> 12;
				@Pc(72) int local72 = local56 * Static277.anIntArray336[local47] >> 12;
				@Pc(80) int local80 = local37 + (local64 >> 12) & Static203.anInt3883;
				@Pc(88) int local88 = Static211.anInt3929 & (local72 >> 12) + arg0;
				@Pc(94) int[] local94 = this.method5508(local88, 0);
				local11[local37] = local94[local80];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt4463 = arg1.method2536() << 4;
		} else if (arg0 == 1) {
			super.aBoolean665 = arg1.method2490() == 1;
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Z)V")
	@Override
	public void method5509() {
		Static101.method1784();
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5514(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass153_41.method3679(arg0);
		if (super.aClass153_41.aBoolean437) {
			@Pc(21) int[] local21 = this.method5508(arg0, 1);
			@Pc(27) int[] local27 = this.method5508(arg0, 2);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			for (@Pc(41) int local41 = 0; local41 < Static80.anInt1616; local41++) {
				@Pc(53) int local53 = local21[local41] * 255 >> 12 & 0xFF;
				@Pc(62) int local62 = this.anInt4463 * local27[local41] >> 12;
				@Pc(70) int local70 = Static345.anIntArray416[local53] * local62 >> 12;
				@Pc(78) int local78 = Static277.anIntArray336[local53] * local62 >> 12;
				@Pc(86) int local86 = Static203.anInt3883 & local41 + (local70 >> 12);
				@Pc(94) int local94 = Static211.anInt3929 & arg0 + (local78 >> 12);
				@Pc(100) int[][] local100 = this.method5516(0, local94);
				local31[local41] = local100[0][local86];
				local35[local41] = local100[1][local86];
				local39[local41] = local100[2][local86];
			}
		}
		return local11;
	}
}
