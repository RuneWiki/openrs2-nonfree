import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public final class Class2_Sub13_Sub9 extends Class2_Sub13 {

	@OriginalMember(owner = "client!kj", name = "w", descriptor = "I")
	public int anInt4580;

	@OriginalMember(owner = "client!kj", name = "x", descriptor = "I")
	public int anInt4581;

	@OriginalMember(owner = "client!kj", name = "z", descriptor = "I")
	public int anInt4582;

	@OriginalMember(owner = "client!kj", name = "C", descriptor = "I")
	public int anInt4583;

	@OriginalMember(owner = "client!kj", name = "E", descriptor = "I")
	public int anInt4584;

	@OriginalMember(owner = "client!kj", name = "y", descriptor = "Lclient!kv;")
	public final Class169 aClass169_1;

	@OriginalMember(owner = "client!kj", name = "A", descriptor = "Lclient!to;")
	public final Class274 aClass274_1;

	static {
		new Class202("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lclient!kv;Lclient!qv;)V")
	public Class2_Sub13_Sub9(@OriginalArg(0) Class169 arg0, @OriginalArg(1) Class6_Sub7 arg1) {
		this.aClass169_1 = arg0;
		this.aClass274_1 = this.aClass169_1.method4056();
		this.method3973();
	}

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "(I)V")
	public void method3973() {
		this.anInt4582 = this.aClass169_1.anInt4676;
		this.anInt4583 = this.aClass169_1.anInt4674;
		this.anInt4580 = this.aClass169_1.anInt4670;
		if (this.aClass169_1.aClass181_10 != null) {
			this.aClass169_1.aClass181_10.I(this.aClass274_1.anInt8369, this.aClass274_1.anInt8366, this.aClass274_1.anInt8361, Static105.anIntArray219);
		}
		this.anInt4581 = Static105.anIntArray219[0];
		this.anInt4584 = Static105.anIntArray219[2];
	}
}
