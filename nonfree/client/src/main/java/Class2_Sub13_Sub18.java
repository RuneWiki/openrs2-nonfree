import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class2_Sub13_Sub18 extends Class2_Sub13 {

	@OriginalMember(owner = "client!vq", name = "u", descriptor = "[Lclient!vaa;")
	public Class292[] aClass292Array1;

	@OriginalMember(owner = "client!vq", name = "B", descriptor = "[[B")
	private byte[][] aByteArrayArray28;

	@OriginalMember(owner = "client!vq", name = "s", descriptor = "I")
	private final int anInt9011;

	static {
		new Class202("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
		new Class202("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
	}

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(I)V")
	public Class2_Sub13_Sub18(@OriginalArg(0) int arg0) {
		this.anInt9011 = arg0;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)Z")
	public boolean method7531() {
		if (this.aClass292Array1 != null) {
			return true;
		}
		@Pc(39) int local39;
		if (this.aByteArrayArray28 == null) {
			if (!Static425.aClass53_106.method1604(this.anInt9011)) {
				return false;
			}
			@Pc(32) int[] local32 = Static425.aClass53_106.method1595(this.anInt9011);
			this.aByteArrayArray28 = new byte[local32.length][];
			for (local39 = 0; local39 < local32.length; local39++) {
				this.aByteArrayArray28[local39] = Static425.aClass53_106.method1616(local32[local39], this.anInt9011);
			}
		}
		@Pc(60) boolean local60 = true;
		@Pc(83) int local83;
		for (local39 = 0; local39 < this.aByteArrayArray28.length; local39++) {
			@Pc(69) byte[] local69 = this.aByteArrayArray28[local39];
			local83 = (local69[0] & 0xFF) << 8 | local69[1] & 0xFF;
			local60 &= Static521.aClass53_145.method1621(local83);
		}
		if (!local60) {
			return false;
		}
		@Pc(104) Class249 local104 = new Class249();
		local83 = Static425.aClass53_106.method1592(this.anInt9011);
		this.aClass292Array1 = new Class292[local83];
		@Pc(120) int[] local120 = Static425.aClass53_106.method1595(this.anInt9011);
		for (@Pc(122) int local122 = 0; local122 < local120.length; local122++) {
			@Pc(129) byte[] local129 = this.aByteArrayArray28[local122];
			@Pc(143) int local143 = local129[1] & 0xFF | (local129[0] & 0xFF) << 8;
			@Pc(145) Class2_Sub49 local145 = null;
			for (@Pc(150) Class2_Sub49 local150 = (Class2_Sub49) local104.method6527(); local150 != null; local150 = (Class2_Sub49) local104.method6525()) {
				if (local143 == local150.anInt9262) {
					local145 = local150;
					break;
				}
			}
			if (local145 == null) {
				local145 = new Class2_Sub49(local143, Static521.aClass53_145.method1599(local143));
				local104.method6523(local145);
			}
			this.aClass292Array1[local120[local122]] = new Class292(local129, local145);
		}
		this.aByteArrayArray28 = null;
		return true;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)Z")
	public boolean method7533(@OriginalArg(0) int arg0) {
		return this.aClass292Array1[arg0].aBoolean635;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BI)Z")
	public boolean method7534(@OriginalArg(1) int arg0) {
		return this.aClass292Array1[arg0].aBoolean634;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZI)Z")
	public boolean method7536(@OriginalArg(1) int arg0) {
		return this.aClass292Array1[arg0].aBoolean633;
	}
}
