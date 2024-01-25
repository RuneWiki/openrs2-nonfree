import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public final class Class1_Sub1_Sub6_Sub1 extends Class1_Sub1_Sub6 {

	@OriginalMember(owner = "client!cv", name = "H", descriptor = "[B")
	public byte[] aByteArray15;

	@OriginalMember(owner = "client!cv", name = "M", descriptor = "Lclient!pd;")
	public Class195 aClass195_1;

	@OriginalMember(owner = "client!cv", name = "N", descriptor = "I")
	public int anInt1776;

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "(B)[B")
	@Override
	public byte[] method6095() {
		if (super.aBoolean512) {
			throw new RuntimeException();
		}
		return this.aByteArray15;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)I")
	@Override
	public int method6098() {
		return super.aBoolean512 ? 0 : 100;
	}
}
