import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public final class Class2_Sub1_Sub7_Sub2 extends Class2_Sub1_Sub7 {

	@OriginalMember(owner = "client!jn", name = "x", descriptor = "I")
	public int anInt3435;

	@OriginalMember(owner = "client!jn", name = "z", descriptor = "B")
	public byte aByte57;

	@OriginalMember(owner = "client!jn", name = "A", descriptor = "Lclient!hw;")
	public Class2_Sub17 aClass2_Sub17_3;

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "(I)I")
	@Override
	public int method2818() {
		return this.aClass2_Sub17_3 == null ? 0 : this.aClass2_Sub17_3.anInt7523 * 100 / (this.aClass2_Sub17_3.aByteArray94.length - this.aByte57);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method2817() {
		if (super.aBoolean225 || this.aClass2_Sub17_3.anInt7523 < this.aClass2_Sub17_3.aByteArray94.length - this.aByte57) {
			throw new RuntimeException();
		}
		return this.aClass2_Sub17_3.aByteArray94;
	}
}
