import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public final class Class2_Sub13_Sub2_Sub2 extends Class2_Sub13_Sub2 {

	@OriginalMember(owner = "client!paa", name = "C", descriptor = "Lclient!ps;")
	public Class2_Sub29 aClass2_Sub29_7;

	@OriginalMember(owner = "client!paa", name = "F", descriptor = "I")
	public int anInt6823;

	@OriginalMember(owner = "client!paa", name = "H", descriptor = "B")
	public byte aByte88;

	static {
		new Class202("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(B)I")
	@Override
	public int method5810() {
		return this.aClass2_Sub29_7 == null ? 0 : this.aClass2_Sub29_7.anInt6132 * 100 / (this.aClass2_Sub29_7.aByteArray96.length - this.aByte88);
	}

	@OriginalMember(owner = "client!paa", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method5809() {
		if (super.aBoolean514 || this.aClass2_Sub29_7.aByteArray96.length - this.aByte88 > this.aClass2_Sub29_7.anInt6132) {
			throw new RuntimeException();
		}
		return this.aClass2_Sub29_7.aByteArray96;
	}
}
