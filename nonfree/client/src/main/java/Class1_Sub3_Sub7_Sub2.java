import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public final class Class1_Sub3_Sub7_Sub2 extends Class1_Sub3_Sub7 {

	@OriginalMember(owner = "client!wt", name = "M", descriptor = "Lclient!wm;")
	public Class1_Sub19 aClass1_Sub19_8;

	@OriginalMember(owner = "client!wt", name = "O", descriptor = "B")
	public byte aByte105;

	@OriginalMember(owner = "client!wt", name = "P", descriptor = "I")
	public int anInt7391;

	@OriginalMember(owner = "client!wt", name = "g", descriptor = "(I)I")
	@Override
	public int method5947() {
		return this.aClass1_Sub19_8 == null ? 0 : this.aClass1_Sub19_8.anInt3698 * 100 / (this.aClass1_Sub19_8.aByteArray38.length - this.aByte105);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method5942() {
		if (super.aBoolean646 || this.aClass1_Sub19_8.anInt3698 < this.aClass1_Sub19_8.aByteArray38.length - this.aByte105) {
			throw new RuntimeException();
		}
		return this.aClass1_Sub19_8.aByteArray38;
	}
}
