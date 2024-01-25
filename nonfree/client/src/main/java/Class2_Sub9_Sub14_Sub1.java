import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public final class Class2_Sub9_Sub14_Sub1 extends Class2_Sub9_Sub14 {

	@OriginalMember(owner = "client!mi", name = "bb", descriptor = "Lclient!ef;")
	public Class2_Sub12 aClass2_Sub12_4;

	@OriginalMember(owner = "client!mi", name = "db", descriptor = "I")
	public int anInt4411;

	@OriginalMember(owner = "client!mi", name = "fb", descriptor = "B")
	public byte aByte48;

	static {
		new Class140("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
	}

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "(I)I")
	@Override
	public int method5298() {
		return this.aClass2_Sub12_4 == null ? 0 : this.aClass2_Sub12_4.anInt3606 * 100 / (this.aClass2_Sub12_4.aByteArray30.length - this.aByte48);
	}

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method5297() {
		if (super.aBoolean557 || this.aClass2_Sub12_4.aByteArray30.length - this.aByte48 > this.aClass2_Sub12_4.anInt3606) {
			throw new RuntimeException();
		}
		return this.aClass2_Sub12_4.aByteArray30;
	}
}
