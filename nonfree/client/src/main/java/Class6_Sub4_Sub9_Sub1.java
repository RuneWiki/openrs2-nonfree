import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public final class Class6_Sub4_Sub9_Sub1 extends Class6_Sub4_Sub9 {

	@OriginalMember(owner = "client!lba", name = "E", descriptor = "B")
	public byte aByte51;

	@OriginalMember(owner = "client!lba", name = "H", descriptor = "Lclient!iaa;")
	public Class6_Sub26 aClass6_Sub26_2;

	@OriginalMember(owner = "client!lba", name = "I", descriptor = "I")
	public int anInt5546;

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(I)[B")
	@Override
	public byte[] method8037() {
		if (super.aBoolean715 || this.aClass6_Sub26_2.aByteArray65.length - this.aByte51 > this.aClass6_Sub26_2.anInt5769) {
			throw new RuntimeException();
		}
		return this.aClass6_Sub26_2.aByteArray65;
	}

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "(I)I")
	@Override
	public int method8038() {
		return this.aClass6_Sub26_2 == null ? 0 : this.aClass6_Sub26_2.anInt5769 * 100 / (this.aClass6_Sub26_2.aByteArray65.length - this.aByte51);
	}
}
