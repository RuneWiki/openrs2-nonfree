import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class3_Sub2_Sub25 extends Class3_Sub2 {

	static {
		new Class189("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
	}

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5901(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass249_41.method5303(arg0);
		if (super.aClass249_41.aBoolean583) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static406.anInt6694; local34++) {
				this.method4346(local34, arg0);
				@Pc(47) int[][] local47 = this.method5899(0, Static110.anInt2449);
				local24[local34] = local47[0][Static235.anInt4535];
				local28[local34] = local47[1][Static235.anInt4535];
				local32[local34] = local47[2][Static235.anInt4535];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(III)V")
	private void method4346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = Static86.anIntArray125[arg0];
		@Pc(13) int local13 = Static441.anIntArray522[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static235.anInt4535 = arg0;
			Static110.anInt2449 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static235.anInt4535 = arg1;
			Static110.anInt2449 = arg0;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static110.anInt2449 = arg0;
			Static235.anInt4535 = Static406.anInt6694 - arg1;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static110.anInt2449 = Static286.anInt1445 - arg1;
			Static235.anInt4535 = arg0;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static110.anInt2449 = Static286.anInt1445 - arg1;
			Static235.anInt4535 = Static406.anInt6694 - arg0;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static235.anInt4535 = Static406.anInt6694 - arg1;
			Static110.anInt2449 = Static286.anInt1445 - arg0;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static110.anInt2449 = Static286.anInt1445 - arg0;
			Static235.anInt4535 = arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static235.anInt4535 = Static406.anInt6694 - arg0;
			Static110.anInt2449 = arg1;
		}
		Static235.anInt4535 &= Static5.anInt72;
		Static110.anInt2449 &= Static350.anInt3654;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5895(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass62_41.method1670(arg0);
		if (super.aClass62_41.aBoolean169) {
			for (@Pc(21) int local21 = 0; local21 < Static406.anInt6694; local21++) {
				this.method4346(local21, arg0);
				@Pc(34) int[] local34 = this.method5894(0, Static110.anInt2449);
				local11[local21] = local34[Static235.anInt4535];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean650 = arg0.method2582() == 1;
		}
	}
}
