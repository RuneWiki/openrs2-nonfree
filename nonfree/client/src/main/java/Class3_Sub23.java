import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public final class Class3_Sub23 extends Class3 implements Interface2 {

	@OriginalMember(owner = "client!je", name = "m", descriptor = "I")
	public int anInt4788;

	@OriginalMember(owner = "client!je", name = "n", descriptor = "I")
	public int anInt4789;

	@OriginalMember(owner = "client!je", name = "s", descriptor = "J")
	public long aLong121;

	@OriginalMember(owner = "client!je", name = "v", descriptor = "I")
	public int anInt4795;

	@OriginalMember(owner = "client!je", name = "x", descriptor = "C")
	public char aChar1;

	static {
		new Class67("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(B)I")
	@Override
	public int method4017() {
		return this.anInt4795;
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(B)I")
	@Override
	public int method4019() {
		return this.anInt4788;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(B)I")
	@Override
	public int method4018() {
		return this.anInt4789;
	}

	@OriginalMember(owner = "client!je", name = "e", descriptor = "(B)C")
	@Override
	public char method4020() {
		return this.aChar1;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)J")
	@Override
	public long method4016() {
		return this.aLong121;
	}
}
