import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public final class Class2_Sub1_Sub7_Sub1 extends Class2_Sub1_Sub7 {

	@OriginalMember(owner = "client!is", name = "y", descriptor = "Lclient!bh;")
	public Class24 aClass24_1;

	@OriginalMember(owner = "client!is", name = "A", descriptor = "[B")
	public byte[] aByteArray41;

	@OriginalMember(owner = "client!is", name = "C", descriptor = "I")
	public int anInt3276;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method2817() {
		if (super.aBoolean225) {
			throw new RuntimeException();
		}
		return this.aByteArray41;
	}

	@OriginalMember(owner = "client!is", name = "c", descriptor = "(I)I")
	@Override
	public int method2818() {
		return super.aBoolean225 ? 0 : 100;
	}
}
