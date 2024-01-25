import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class1_Sub3_Sub9_Sub1 extends Class1_Sub3_Sub9 {

	static {
		new Class45("Player ", "Spieler ", "Joueur ", "Jogador ");
		new Class45("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8190(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass281_41.method7073(arg0);
		if (super.aClass281_41.aBoolean590 && this.method3149()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[2];
			@Pc(44) int local44 = super.anInt3373 * (arg0 % super.anInt3373);
			for (@Pc(46) int local46 = 0; local46 < Static254.anInt4973; local46++) {
				@Pc(58) int local58 = super.anIntArray282[local44 + local46 % super.anInt3377];
				local36[local46] = (local58 & 0xFF) << 4;
				local32[local46] = local58 >> 4 & 0xFF0;
				local28[local46] = local58 >> 12 & 0xFF0;
			}
		}
		return local16;
	}
}
