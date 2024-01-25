import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public final class Class3_Sub4_Sub1_Sub1 extends Class3_Sub4_Sub1 {

	@OriginalMember(owner = "client!bb", name = "D", descriptor = "Lclient!sk;")
	public Class228 aClass228_1;

	@OriginalMember(owner = "client!bb", name = "I", descriptor = "I")
	public int anInt841;

	@OriginalMember(owner = "client!bb", name = "N", descriptor = "[B")
	public byte[] aByteArray10;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method4715() {
		if (super.aBoolean527) {
			throw new RuntimeException();
		}
		return this.aByteArray10;
	}

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)I")
	@Override
	public int method4713() {
		return super.aBoolean527 ? 0 : 100;
	}
}
