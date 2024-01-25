import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public final class Class2_Sub7_Sub17_Sub2 extends Class2_Sub7_Sub17 {

	@OriginalMember(owner = "client!wo", name = "H", descriptor = "I")
	public int anInt7074;

	@OriginalMember(owner = "client!wo", name = "M", descriptor = "B")
	public byte aByte78;

	@OriginalMember(owner = "client!wo", name = "O", descriptor = "Lclient!vt;")
	public Class2_Sub24 aClass2_Sub24_8;

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "(B)[B")
	@Override
	public byte[] method6090() {
		if (super.aBoolean502 || this.aClass2_Sub24_8.anInt6669 < this.aClass2_Sub24_8.aByteArray100.length - this.aByte78) {
			throw new RuntimeException();
		}
		return this.aClass2_Sub24_8.aByteArray100;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)I")
	@Override
	public int method6087() {
		return this.aClass2_Sub24_8 == null ? 0 : this.aClass2_Sub24_8.anInt6669 * 100 / (this.aClass2_Sub24_8.aByteArray100.length - this.aByte78);
	}
}
