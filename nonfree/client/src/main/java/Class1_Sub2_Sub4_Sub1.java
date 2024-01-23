import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public final class Class1_Sub2_Sub4_Sub1 extends Class1_Sub2_Sub4 {

	@OriginalMember(owner = "client!j", name = "L", descriptor = "[B")
	public byte[] aByteArray29;

	@OriginalMember(owner = "client!j", name = "M", descriptor = "I")
	public int anInt2550;

	@OriginalMember(owner = "client!j", name = "Q", descriptor = "Lclient!pj;")
	public Class138 aClass138_1;

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(B)[B")
	@Override
	public byte[] method3668() {
		if (this.aBoolean296) {
			throw new RuntimeException();
		}
		return this.aByteArray29;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)I")
	@Override
	public int method3665() {
		return this.aBoolean296 ? 0 : 100;
	}
}
