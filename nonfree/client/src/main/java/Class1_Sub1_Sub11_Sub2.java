import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public final class Class1_Sub1_Sub11_Sub2 extends Class1_Sub1_Sub11 {

	@OriginalMember(owner = "client!ra", name = "R", descriptor = "I")
	public int anInt4763;

	@OriginalMember(owner = "client!ra", name = "T", descriptor = "[B")
	public byte[] aByteArray55;

	@OriginalMember(owner = "client!ra", name = "V", descriptor = "Lclient!nm;")
	public Class120 aClass120_2;

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)[B")
	@Override
	public byte[] method3719() {
		if (this.aBoolean340) {
			throw new RuntimeException();
		}
		return this.aByteArray55;
	}

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "(I)I")
	@Override
	public int method3721() {
		return this.aBoolean340 ? 0 : 100;
	}
}
