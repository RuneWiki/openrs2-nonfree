import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public final class Class1_Sub2_Sub6_Sub1 extends Class1_Sub2_Sub6 {

	@OriginalMember(owner = "client!ck", name = "D", descriptor = "I")
	public int anInt798;

	@OriginalMember(owner = "client!ck", name = "H", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!ck", name = "J", descriptor = "Lclient!ng;")
	public Class111 aClass111_1;

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "(B)[B")
	@Override
	public byte[] method3364() {
		if (this.aBoolean325) {
			throw new RuntimeException();
		}
		return this.aByteArray12;
	}

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "(B)I")
	@Override
	public int method3362() {
		return this.aBoolean325 ? 0 : 100;
	}
}
