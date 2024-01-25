import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public final class Class6_Sub5_Sub12_Sub1 extends Class6_Sub5_Sub12 {

	@OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
	public int anInt3886;

	@OriginalMember(owner = "client!gb", name = "C", descriptor = "Lclient!ji;")
	public Class6_Sub8 aClass6_Sub8_3;

	@OriginalMember(owner = "client!gb", name = "H", descriptor = "B")
	public byte aByte30;

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)I")
	@Override
	public int method7124() {
		return this.aClass6_Sub8_3 == null ? 0 : this.aClass6_Sub8_3.anInt10061 * 100 / (this.aClass6_Sub8_3.aByteArray102.length - this.aByte30);
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)[B")
	@Override
	public byte[] method7125() {
		if (super.aBoolean682 || this.aClass6_Sub8_3.aByteArray102.length - this.aByte30 > this.aClass6_Sub8_3.anInt10061) {
			throw new RuntimeException();
		}
		return this.aClass6_Sub8_3.aByteArray102;
	}
}
