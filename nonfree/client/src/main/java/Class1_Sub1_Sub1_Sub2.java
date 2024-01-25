import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public final class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!fc", name = "F", descriptor = "B")
	public byte aByte12;

	@OriginalMember(owner = "client!fc", name = "G", descriptor = "Lclient!eb;")
	public Class1_Sub7 aClass1_Sub7_4;

	@OriginalMember(owner = "client!fc", name = "H", descriptor = "I")
	public int anInt1737;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)[B")
	@Override
	public byte[] method1692() {
		if (super.aBoolean154 || this.aClass1_Sub7_4.aByteArray58.length - this.aByte12 > this.aClass1_Sub7_4.anInt3368) {
			throw new RuntimeException();
		}
		return this.aClass1_Sub7_4.aByteArray58;
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(B)I")
	@Override
	public int method1688() {
		return this.aClass1_Sub7_4 == null ? 0 : this.aClass1_Sub7_4.anInt3368 * 100 / (this.aClass1_Sub7_4.aByteArray58.length - this.aByte12);
	}
}
