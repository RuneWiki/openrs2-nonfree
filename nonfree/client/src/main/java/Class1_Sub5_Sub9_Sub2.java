import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public final class Class1_Sub5_Sub9_Sub2 extends Class1_Sub5_Sub9 {

	@OriginalMember(owner = "client!ul", name = "B", descriptor = "I")
	public int anInt6768;

	@OriginalMember(owner = "client!ul", name = "G", descriptor = "Lclient!ug;")
	public Class1_Sub28 aClass1_Sub28_9;

	@OriginalMember(owner = "client!ul", name = "I", descriptor = "B")
	public byte aByte103;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)I")
	@Override
	public int method5308() {
		return this.aClass1_Sub28_9 == null ? 0 : this.aClass1_Sub28_9.anInt6812 * 100 / (this.aClass1_Sub28_9.aByteArray86.length - this.aByte103);
	}

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "(I)[B")
	@Override
	public byte[] method5312() {
		if (super.aBoolean740 || this.aClass1_Sub28_9.aByteArray86.length - this.aByte103 > this.aClass1_Sub28_9.anInt6812) {
			throw new RuntimeException();
		}
		return this.aClass1_Sub28_9.aByteArray86;
	}
}
