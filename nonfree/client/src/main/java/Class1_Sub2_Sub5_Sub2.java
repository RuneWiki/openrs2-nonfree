import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public final class Class1_Sub2_Sub5_Sub2 extends Class1_Sub2_Sub5 {

	@OriginalMember(owner = "client!re", name = "I", descriptor = "B")
	public byte aByte14;

	@OriginalMember(owner = "client!re", name = "O", descriptor = "Lclient!ql;")
	public Class1_Sub13 aClass1_Sub13_7;

	@OriginalMember(owner = "client!re", name = "S", descriptor = "I")
	public int anInt4496;

	@OriginalMember(owner = "client!re", name = "i", descriptor = "(I)[B")
	@Override
	public byte[] method3391() {
		if (super.aBoolean222 || this.aClass1_Sub13_7.anInt2395 < this.aClass1_Sub13_7.aByteArray29.length - this.aByte14) {
			throw new RuntimeException();
		}
		return this.aClass1_Sub13_7.aByteArray29;
	}

	@OriginalMember(owner = "client!re", name = "h", descriptor = "(I)I")
	@Override
	public int method3390() {
		return this.aClass1_Sub13_7 == null ? 0 : this.aClass1_Sub13_7.anInt2395 * 100 / (this.aClass1_Sub13_7.aByteArray29.length - this.aByte14);
	}
}
