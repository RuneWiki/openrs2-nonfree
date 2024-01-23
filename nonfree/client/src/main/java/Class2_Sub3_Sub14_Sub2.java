import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public final class Class2_Sub3_Sub14_Sub2 extends Class2_Sub3_Sub14 {

	@OriginalMember(owner = "client!ni", name = "W", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!ni", name = "cb", descriptor = "Lclient!co;")
	public Class35 aClass35_2;

	@OriginalMember(owner = "client!ni", name = "kb", descriptor = "I")
	public int anInt3793;

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(Z)I")
	@Override
	public int method3057() {
		return this.aBoolean320 ? 0 : 100;
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(B)[B")
	@Override
	public byte[] method3053() {
		if (this.aBoolean320) {
			throw new RuntimeException();
		}
		return this.aByteArray32;
	}
}
