import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class65_Sub1_Sub1 extends Class65_Sub1 {

	@OriginalMember(owner = "client!eh", name = "J", descriptor = "[B")
	private byte[] aByteArray19;

	static {
		new Class55("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
	public Class65_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIBI)[B")
	public byte[] method1593() {
		this.aByteArray19 = new byte[524288];
		this.method3912();
		return this.aByteArray19;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(BII)V")
	@Override
	protected void method1591(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(11) int local11 = arg0 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray19[local14] = (byte) (local11 * 3 >> 5);
		this.aByteArray19[local15] = (byte) (local11 * 3 >> 5);
	}
}
