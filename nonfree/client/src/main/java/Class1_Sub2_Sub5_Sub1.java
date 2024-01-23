import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public final class Class1_Sub2_Sub5_Sub1 extends Class1_Sub2_Sub5 {

	@OriginalMember(owner = "client!ff", name = "L", descriptor = "I")
	public int anInt1918;

	@OriginalMember(owner = "client!ff", name = "S", descriptor = "Lclient!kb;")
	public Class71 aClass71_1;

	@OriginalMember(owner = "client!ff", name = "T", descriptor = "[B")
	public byte[] aByteArray24;

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "(I)[B")
	@Override
	public byte[] method3391() {
		if (super.aBoolean222) {
			throw new RuntimeException();
		}
		return this.aByteArray24;
	}

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "(I)I")
	@Override
	public int method3390() {
		return super.aBoolean222 ? 0 : 100;
	}
}
