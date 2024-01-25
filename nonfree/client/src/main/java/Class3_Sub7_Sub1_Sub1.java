import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public final class Class3_Sub7_Sub1_Sub1 extends Class3_Sub7_Sub1 {

	@OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
	public int anInt603;

	@OriginalMember(owner = "client!bb", name = "N", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!bb", name = "S", descriptor = "Lclient!at;")
	public Class22 aClass22_1;

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)[B")
	@Override
	public byte[] method5380() {
		if (super.aBoolean458) {
			throw new RuntimeException();
		}
		return this.aByteArray4;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)I")
	@Override
	public int method5382() {
		return super.aBoolean458 ? 0 : 100;
	}
}
