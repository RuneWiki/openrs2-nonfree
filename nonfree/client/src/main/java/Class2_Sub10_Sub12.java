import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class2_Sub10_Sub12 extends Class2_Sub10 {

	@OriginalMember(owner = "client!nc", name = "D", descriptor = "[Lclient!it;")
	public Class112[] aClass112Array1;

	@OriginalMember(owner = "client!nc", name = "N", descriptor = "[[B")
	private byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!nc", name = "C", descriptor = "I")
	private final int anInt4000;

	static {
		new Class32("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(I)V")
	public Class2_Sub10_Sub12(@OriginalArg(0) int arg0) {
		this.anInt4000 = arg0;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)Z")
	public boolean method3682(@OriginalArg(0) int arg0) {
		return this.aClass112Array1[arg0].aBoolean224;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)Z")
	public boolean method3683(@OriginalArg(1) int arg0) {
		return this.aClass112Array1[arg0].aBoolean223;
	}

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)Z")
	public boolean method3686() {
		if (this.aClass112Array1 != null) {
			return true;
		}
		@Pc(32) int local32;
		if (this.aByteArrayArray11 == null) {
			if (!Static240.aClass171_59.method3742(this.anInt4000)) {
				return false;
			}
			@Pc(25) int[] local25 = Static240.aClass171_59.method3767(this.anInt4000);
			this.aByteArrayArray11 = new byte[local25.length][];
			for (local32 = 0; local32 < local25.length; local32++) {
				this.aByteArrayArray11[local32] = Static240.aClass171_59.method3745(this.anInt4000, local25[local32]);
			}
		}
		@Pc(52) boolean local52 = true;
		@Pc(79) int local79;
		for (local32 = 0; local32 < this.aByteArrayArray11.length; local32++) {
			@Pc(65) byte[] local65 = this.aByteArrayArray11[local32];
			local79 = (local65[0] & 0xFF) << 8 | local65[1] & 0xFF;
			local52 &= Static4.aClass171_2.method3739(local79);
		}
		if (!local52) {
			return false;
		}
		@Pc(100) Class30 local100 = new Class30();
		local79 = Static240.aClass171_59.method3750(this.anInt4000);
		this.aClass112Array1 = new Class112[local79];
		@Pc(116) int[] local116 = Static240.aClass171_59.method3767(this.anInt4000);
		for (@Pc(118) int local118 = 0; local118 < local116.length; local118++) {
			@Pc(124) byte[] local124 = this.aByteArrayArray11[local118];
			@Pc(138) int local138 = local124[1] & 0xFF | (local124[0] & 0xFF) << 8;
			@Pc(140) Class2_Sub39 local140 = null;
			for (@Pc(145) Class2_Sub39 local145 = (Class2_Sub39) local100.method694(); local145 != null; local145 = (Class2_Sub39) local100.method682()) {
				if (local145.anInt5371 == local138) {
					local140 = local145;
					break;
				}
			}
			if (local140 == null) {
				local140 = new Class2_Sub39(local138, Static4.aClass171_2.method3762(local138));
				local100.method685(local140);
			}
			this.aClass112Array1[local116[local118]] = new Class112(local124, local140);
		}
		this.aByteArrayArray11 = null;
		return true;
	}
}
