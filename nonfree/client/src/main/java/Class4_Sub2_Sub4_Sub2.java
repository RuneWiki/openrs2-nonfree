import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public final class Class4_Sub2_Sub4_Sub2 extends Class4_Sub2_Sub4 {

	@OriginalMember(owner = "client!hg", name = "L", descriptor = "I")
	public int anInt2102;

	@OriginalMember(owner = "client!hg", name = "P", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!hg", name = "T", descriptor = "Lclient!jg;")
	public Class79 aClass79_3;

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "(I)[B")
	@Override
	public byte[] method1606() {
		if (this.aBoolean157) {
			throw new RuntimeException();
		}
		return this.aByteArray28;
	}

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "(I)I")
	@Override
	public int method1601() {
		return this.aBoolean157 ? 0 : 100;
	}
}
