import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public final class Class2_Sub33 extends Class2 {

	@OriginalMember(owner = "client!mp", name = "l", descriptor = "[B")
	public static final byte[] aByteArray94;

	@OriginalMember(owner = "client!mp", name = "j", descriptor = "[B")
	public final byte[] aByteArray93;

	static {
		new Class202(" days.", " Tage.", " jours.", " dias.");
		new Class202("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
		aByteArray94 = new byte[32896];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < 256; local18++) {
			for (@Pc(21) int local21 = 0; local21 <= local18; local21++) {
				aByteArray94[local16++] = (byte) (255.0D / Math.sqrt((double) ((float) (local21 * local21 + local18 * local18 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "([B)V")
	public Class2_Sub33(@OriginalArg(0) byte[] arg0) {
		this.aByteArray93 = arg0;
	}
}
