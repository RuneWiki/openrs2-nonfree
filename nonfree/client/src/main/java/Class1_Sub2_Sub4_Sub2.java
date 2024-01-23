import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public final class Class1_Sub2_Sub4_Sub2 extends Class1_Sub2_Sub4 {

	@OriginalMember(owner = "client!qo", name = "L", descriptor = "I")
	public int anInt4312;

	@OriginalMember(owner = "client!qo", name = "Q", descriptor = "Lclient!lf;")
	public Class1_Sub14 aClass1_Sub14_8;

	@OriginalMember(owner = "client!qo", name = "U", descriptor = "B")
	public byte aByte24;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Z)I")
	@Override
	public int method3665() {
		return this.aClass1_Sub14_8 == null ? 0 : this.aClass1_Sub14_8.anInt1480 * 100 / (this.aClass1_Sub14_8.aByteArray17.length - this.aByte24);
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "(B)[B")
	@Override
	public byte[] method3668() {
		if (this.aBoolean296 || this.aClass1_Sub14_8.anInt1480 < this.aClass1_Sub14_8.aByteArray17.length - this.aByte24) {
			throw new RuntimeException();
		}
		return this.aClass1_Sub14_8.aByteArray17;
	}
}
