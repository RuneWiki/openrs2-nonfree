import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class126 {

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "[I")
	public static final int[] anIntArray260;

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
	public int anInt3914;

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
	public int anInt3915;

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
	public int anInt3919;

	static {
		new Class83("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
		anIntArray260 = new int[99];
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < 99; local16++) {
			@Pc(21) int local21 = local16 + 1;
			@Pc(34) int local34 = (int) ((double) local21 + Math.pow(2.0D, (double) local21 / 7.0D) * 300.0D);
			local14 += local34;
			anIntArray260[local16] = local14 / 4;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!iv;B)V")
	public void method3191(@OriginalArg(0) Class4_Sub12 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method2490();
			if (local11 == 0) {
				return;
			}
			this.method3194(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!iv;I)V")
	private void method3194(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt3914 = arg1.method2536();
			this.anInt3919 = arg1.method2490();
			this.anInt3915 = arg1.method2490();
		}
	}
}
