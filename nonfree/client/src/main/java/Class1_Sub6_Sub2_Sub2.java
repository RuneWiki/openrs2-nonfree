import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public final class Class1_Sub6_Sub2_Sub2 extends Class1_Sub6_Sub2 {

	@OriginalMember(owner = "client!uh", name = "F", descriptor = "B")
	public byte aByte114;

	@OriginalMember(owner = "client!uh", name = "H", descriptor = "I")
	public int anInt8892;

	@OriginalMember(owner = "client!uh", name = "I", descriptor = "Lclient!mo;")
	public Class1_Sub35 aClass1_Sub35_7;

	static {
		new Class324("", 76);
	}

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)I")
	@Override
	public int method7269() {
		return this.aClass1_Sub35_7 == null ? 0 : this.aClass1_Sub35_7.anInt7214 * 100 / (this.aClass1_Sub35_7.aByteArray85.length - this.aByte114);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method7266() {
		if (super.aBoolean688 || this.aClass1_Sub35_7.anInt7214 < this.aClass1_Sub35_7.aByteArray85.length - this.aByte114) {
			throw new RuntimeException();
		}
		return this.aClass1_Sub35_7.aByteArray85;
	}
}
