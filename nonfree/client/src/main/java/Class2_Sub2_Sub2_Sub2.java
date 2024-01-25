import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public final class Class2_Sub2_Sub2_Sub2 extends Class2_Sub2_Sub2 {

	@OriginalMember(owner = "client!laa", name = "F", descriptor = "Lclient!gk;")
	public Class2_Sub7 aClass2_Sub7_2;

	@OriginalMember(owner = "client!laa", name = "G", descriptor = "B")
	public byte aByte47;

	@OriginalMember(owner = "client!laa", name = "I", descriptor = "I")
	public int anInt4968;

	@OriginalMember(owner = "client!laa", name = "e", descriptor = "(I)I")
	@Override
	public int method4254() {
		return this.aClass2_Sub7_2 == null ? 0 : this.aClass2_Sub7_2.anInt5186 * 100 / (this.aClass2_Sub7_2.aByteArray52.length - this.aByte47);
	}

	@OriginalMember(owner = "client!laa", name = "f", descriptor = "(I)[B")
	@Override
	public byte[] method4255() {
		if (super.aBoolean390 || this.aClass2_Sub7_2.anInt5186 < this.aClass2_Sub7_2.aByteArray52.length - this.aByte47) {
			throw new RuntimeException();
		}
		return this.aClass2_Sub7_2.aByteArray52;
	}
}
