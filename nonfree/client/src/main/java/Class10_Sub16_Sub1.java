import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public final class Class10_Sub16_Sub1 extends Class10_Sub16 {

	@OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
	public int anInt2200;

	@OriginalMember(owner = "client!ff", name = "q", descriptor = "J")
	public long aLong78;

	@OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
	public int anInt2204;

	@OriginalMember(owner = "client!ff", name = "x", descriptor = "I")
	public int anInt2206;

	static {
		new Class182("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)I")
	@Override
	public int method1924() {
		return this.anInt2206;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)I")
	@Override
	public int method1921() {
		return this.anInt2204;
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)J")
	@Override
	public long method1925() {
		return this.aLong78;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(Z)I")
	@Override
	public int method1923() {
		return this.anInt2200;
	}
}
