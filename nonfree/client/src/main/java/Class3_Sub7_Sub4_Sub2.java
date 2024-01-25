import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public final class Class3_Sub7_Sub4_Sub2 extends Class3_Sub7_Sub4 {

	@OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
	public int anInt1763;

	@OriginalMember(owner = "client!dd", name = "w", descriptor = "[B")
	public byte[] aByteArray16;

	@OriginalMember(owner = "client!dd", name = "A", descriptor = "Lclient!kv;")
	public Class196 aClass196_2;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)I")
	@Override
	public int method1502() {
		return super.aBoolean126 ? 0 : 100;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method1504() {
		if (super.aBoolean126) {
			throw new RuntimeException();
		}
		return this.aByteArray16;
	}
}
