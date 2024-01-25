import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public final class Class6_Sub4_Sub11_Sub2 extends Class6_Sub4_Sub11 {

	@OriginalMember(owner = "client!rha", name = "B", descriptor = "B")
	public byte aByte123;

	@OriginalMember(owner = "client!rha", name = "J", descriptor = "I")
	public int anInt8504;

	@OriginalMember(owner = "client!rha", name = "K", descriptor = "Lclient!gga;")
	public Class6_Sub23 aClass6_Sub23_7;

	@OriginalMember(owner = "client!rha", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method7235() {
		if (super.aBoolean588 || this.aClass6_Sub23_7.aByteArray101.length - this.aByte123 > this.aClass6_Sub23_7.anInt9901) {
			throw new RuntimeException();
		}
		return this.aClass6_Sub23_7.aByteArray101;
	}

	@OriginalMember(owner = "client!rha", name = "b", descriptor = "(B)I")
	@Override
	public int method7236() {
		return this.aClass6_Sub23_7 == null ? 0 : this.aClass6_Sub23_7.anInt9901 * 100 / (this.aClass6_Sub23_7.aByteArray101.length - this.aByte123);
	}
}
