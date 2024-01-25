import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public final class Class1_Sub1_Sub11_Sub2 extends Class1_Sub1_Sub11 {

	@OriginalMember(owner = "client!ud", name = "x", descriptor = "Lclient!gw;")
	public Class1_Sub13 aClass1_Sub13_8;

	@OriginalMember(owner = "client!ud", name = "z", descriptor = "B")
	public byte aByte98;

	@OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
	public int anInt8234;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method6987() {
		if (super.aBoolean562 || this.aClass1_Sub13_8.anInt3400 < this.aClass1_Sub13_8.aByteArray45.length - this.aByte98) {
			throw new RuntimeException();
		}
		return this.aClass1_Sub13_8.aByteArray45;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)I")
	@Override
	public int method6986() {
		return this.aClass1_Sub13_8 == null ? 0 : this.aClass1_Sub13_8.anInt3400 * 100 / (this.aClass1_Sub13_8.aByteArray45.length - this.aByte98);
	}
}
