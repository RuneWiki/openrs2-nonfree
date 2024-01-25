import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public final class Class6_Sub1_Sub10_Sub1 extends Class6_Sub1_Sub10 {

	@OriginalMember(owner = "client!ie", name = "A", descriptor = "Lclient!dga;")
	public Class6_Sub14 aClass6_Sub14_3;

	@OriginalMember(owner = "client!ie", name = "B", descriptor = "B")
	public byte aByte51;

	@OriginalMember(owner = "client!ie", name = "E", descriptor = "I")
	public int anInt3611;

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method7037() {
		if (super.aBoolean607 || this.aClass6_Sub14_3.anInt7244 < this.aClass6_Sub14_3.aByteArray88.length - this.aByte51) {
			throw new RuntimeException();
		}
		return this.aClass6_Sub14_3.aByteArray88;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)I")
	@Override
	public int method7036() {
		return this.aClass6_Sub14_3 == null ? 0 : this.aClass6_Sub14_3.anInt7244 * 100 / (this.aClass6_Sub14_3.aByteArray88.length - this.aByte51);
	}
}
