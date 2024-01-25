import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public final class Class3_Sub4_Sub10_Sub2 extends Class3_Sub4_Sub10 {

	@OriginalMember(owner = "client!hh", name = "G", descriptor = "[B")
	public byte[] aByteArray27;

	@OriginalMember(owner = "client!hh", name = "K", descriptor = "I")
	public int anInt4514;

	@OriginalMember(owner = "client!hh", name = "J", descriptor = "Lclient!dka;")
	public Class73 aClass73_1;

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(B)I")
	@Override
	public int method3688() {
		return super.aBoolean389 ? 0 : 100;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method3686() {
		if (super.aBoolean389) {
			throw new RuntimeException();
		}
		return this.aByteArray27;
	}
}
