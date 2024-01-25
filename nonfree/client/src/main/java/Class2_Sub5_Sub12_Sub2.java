import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public final class Class2_Sub5_Sub12_Sub2 extends Class2_Sub5_Sub12 {

	@OriginalMember(owner = "client!op", name = "D", descriptor = "Lclient!sv;")
	public Class2_Sub13 aClass2_Sub13_7;

	@OriginalMember(owner = "client!op", name = "I", descriptor = "I")
	public int anInt4796;

	@OriginalMember(owner = "client!op", name = "L", descriptor = "B")
	public byte aByte55;

	@OriginalMember(owner = "client!op", name = "h", descriptor = "(I)[B")
	@Override
	public byte[] method3887() {
		if (super.aBoolean335 || this.aClass2_Sub13_7.anInt4347 < this.aClass2_Sub13_7.aByteArray52.length - this.aByte55) {
			throw new RuntimeException();
		}
		return this.aClass2_Sub13_7.aByteArray52;
	}

	@OriginalMember(owner = "client!op", name = "c", descriptor = "(B)I")
	@Override
	public int method3885() {
		return this.aClass2_Sub13_7 == null ? 0 : this.aClass2_Sub13_7.anInt4347 * 100 / (this.aClass2_Sub13_7.aByteArray52.length - this.aByte55);
	}
}
