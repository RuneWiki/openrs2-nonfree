import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public final class Class1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!a", name = "F", descriptor = "Lclient!rb;")
	public Class173 aClass173_1;

	@OriginalMember(owner = "client!a", name = "K", descriptor = "[B")
	public byte[] aByteArray1;

	@OriginalMember(owner = "client!a", name = "L", descriptor = "I")
	public int anInt44;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(I)[B")
	@Override
	public byte[] method1692() {
		if (super.aBoolean154) {
			throw new RuntimeException();
		}
		return this.aByteArray1;
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(B)I")
	@Override
	public int method1688() {
		return super.aBoolean154 ? 0 : 100;
	}
}
