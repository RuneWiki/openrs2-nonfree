import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class1_Sub3_Sub14 extends Class1_Sub3 {

	@OriginalMember(owner = "client!mh", name = "B", descriptor = "[Lclient!nb;")
	public Class167[] aClass167Array1;

	@OriginalMember(owner = "client!mh", name = "G", descriptor = "[[B")
	private byte[][] aByteArrayArray89;

	@OriginalMember(owner = "client!mh", name = "E", descriptor = "I")
	private final int anInt4520;

	static {
		new Class142("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
		new Class142("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(I)V")
	public Class1_Sub3_Sub14(@OriginalArg(0) int arg0) {
		this.anInt4520 = arg0;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)Z")
	public boolean method3588(@OriginalArg(1) int arg0) {
		return this.aClass167Array1[arg0].aBoolean421;
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)Z")
	public boolean method3589(@OriginalArg(0) int arg0) {
		return this.aClass167Array1[arg0].aBoolean422;
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(Z)Z")
	public boolean method3590() {
		if (this.aClass167Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray89 == null) {
			if (!Static246.aClass185_69.method4021(this.anInt4520)) {
				return false;
			}
			@Pc(27) int[] local27 = Static246.aClass185_69.method3995(this.anInt4520);
			this.aByteArrayArray89 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray89[local34] = Static246.aClass185_69.method4002(this.anInt4520, local27[local34]);
			}
		}
		@Pc(59) boolean local59 = true;
		@Pc(82) int local82;
		for (local34 = 0; local34 < this.aByteArrayArray89.length; local34++) {
			@Pc(68) byte[] local68 = this.aByteArrayArray89[local34];
			local82 = (local68[0] & 0xFF) << 8 | local68[1] & 0xFF;
			local59 &= Static372.aClass185_98.method4000(local82);
		}
		if (!local59) {
			return false;
		}
		@Pc(107) Class14 local107 = new Class14();
		local82 = Static246.aClass185_69.method4011(this.anInt4520);
		this.aClass167Array1 = new Class167[local82];
		@Pc(123) int[] local123 = Static246.aClass185_69.method3995(this.anInt4520);
		for (@Pc(125) int local125 = 0; local125 < local123.length; local125++) {
			@Pc(132) byte[] local132 = this.aByteArrayArray89[local125];
			@Pc(146) int local146 = local132[1] & 0xFF | (local132[0] & 0xFF) << 8;
			@Pc(148) Class1_Sub16 local148 = null;
			for (@Pc(153) Class1_Sub16 local153 = (Class1_Sub16) local107.method203(); local153 != null; local153 = (Class1_Sub16) local107.method208()) {
				if (local153.anInt2065 == local146) {
					local148 = local153;
					break;
				}
			}
			if (local148 == null) {
				local148 = new Class1_Sub16(local146, Static372.aClass185_98.method3997(local146));
				local107.method205(local148);
			}
			this.aClass167Array1[local123[local125]] = new Class167(local132, local148);
		}
		this.aByteArrayArray89 = null;
		return true;
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(II)Z")
	public boolean method3591(@OriginalArg(0) int arg0) {
		return this.aClass167Array1[arg0].aBoolean423;
	}
}
