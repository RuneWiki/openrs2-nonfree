import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public final class Class1_Sub2_Sub1_Sub2 extends Class1_Sub2_Sub1 {

	@OriginalMember(owner = "client!fl", name = "F", descriptor = "I")
	public int anInt1877;

	@OriginalMember(owner = "client!fl", name = "K", descriptor = "Lclient!im;")
	public Class1_Sub16 aClass1_Sub16_6;

	@OriginalMember(owner = "client!fl", name = "Z", descriptor = "B")
	public byte aByte9;

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)I")
	@Override
	public int method1411() {
		return this.aClass1_Sub16_6 == null ? 0 : this.aClass1_Sub16_6.anInt3328 * 100 / (this.aClass1_Sub16_6.aByteArray39.length - this.aByte9);
	}

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "(B)[B")
	@Override
	public byte[] method1408() {
		if (this.aBoolean102 || this.aClass1_Sub16_6.anInt3328 < this.aClass1_Sub16_6.aByteArray39.length - this.aByte9) {
			throw new RuntimeException();
		}
		return this.aClass1_Sub16_6.aByteArray39;
	}
}
