import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class48_Sub1_Sub1 extends Class48_Sub1 {

	@OriginalMember(owner = "client!nd", name = "J", descriptor = "[B")
	private byte[] aByteArray61;

	static {
		new Class83("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
	public Class48_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BII)V")
	@Override
	protected void method3752(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(11) int local11 = arg0 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray61[local14] = (byte) (local11 * 3 >> 5);
		this.aByteArray61[local15] = (byte) (local11 * 3 >> 5);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIII)[B")
	public byte[] method3759() {
		this.aByteArray61 = new byte[524288];
		this.method4400();
		return this.aByteArray61;
	}
}
