import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class5_Sub1_Sub9 extends Class5_Sub1 {

	@OriginalMember(owner = "client!in", name = "y", descriptor = "[[B")
	private byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!in", name = "A", descriptor = "[Lclient!og;")
	public Class149[] aClass149Array1;

	@OriginalMember(owner = "client!in", name = "z", descriptor = "I")
	private final int anInt2690;

	static {
		new Class85("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(I)V")
	public Class5_Sub1_Sub9(@OriginalArg(0) int arg0) {
		this.anInt2690 = arg0;
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(B)Z")
	public boolean method2460() {
		if (this.aClass149Array1 != null) {
			return true;
		}
		@Pc(32) int local32;
		if (this.aByteArrayArray11 == null) {
			if (!Static343.aClass93_125.method2403(this.anInt2690)) {
				return false;
			}
			@Pc(25) int[] local25 = Static343.aClass93_125.method2420(this.anInt2690);
			this.aByteArrayArray11 = new byte[local25.length][];
			for (local32 = 0; local32 < local25.length; local32++) {
				this.aByteArrayArray11[local32] = Static343.aClass93_125.method2410(local25[local32], this.anInt2690);
			}
		}
		@Pc(52) boolean local52 = true;
		@Pc(74) int local74;
		for (local32 = 0; local32 < this.aByteArrayArray11.length; local32++) {
			@Pc(60) byte[] local60 = this.aByteArrayArray11[local32];
			local74 = (local60[0] & 0xFF) << 8 | local60[1] & 0xFF;
			local52 &= Static346.aClass93_131.method2414(local74);
		}
		if (!local52) {
			return false;
		}
		@Pc(99) Class103 local99 = new Class103();
		local74 = Static343.aClass93_125.method2418(this.anInt2690);
		this.aClass149Array1 = new Class149[local74];
		@Pc(115) int[] local115 = Static343.aClass93_125.method2420(this.anInt2690);
		for (@Pc(125) int local125 = 0; local125 < local115.length; local125++) {
			@Pc(131) byte[] local131 = this.aByteArrayArray11[local125];
			@Pc(145) int local145 = (local131[0] & 0xFF) << 8 | local131[1] & 0xFF;
			@Pc(147) Class5_Sub4 local147 = null;
			for (@Pc(152) Class5_Sub4 local152 = (Class5_Sub4) local99.method2756(); local152 != null; local152 = (Class5_Sub4) local99.method2748()) {
				if (local145 == local152.anInt216) {
					local147 = local152;
					break;
				}
			}
			if (local147 == null) {
				local147 = new Class5_Sub4(local145, Static346.aClass93_131.method2392(local145));
				local99.method2745(local147);
			}
			this.aClass149Array1[local115[local125]] = new Class149(local131, local147);
		}
		this.aByteArrayArray11 = null;
		return true;
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(IB)Z")
	public boolean method2461(@OriginalArg(0) int arg0) {
		return this.aClass149Array1[arg0].aBoolean368;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(BI)Z")
	public boolean method2462(@OriginalArg(1) int arg0) {
		return this.aClass149Array1[arg0].aBoolean369;
	}
}
