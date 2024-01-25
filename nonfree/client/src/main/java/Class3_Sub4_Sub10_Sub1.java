import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public final class Class3_Sub4_Sub10_Sub1 extends Class3_Sub4_Sub10 {

	@OriginalMember(owner = "client!hc", name = "J", descriptor = "B")
	public byte aByte77;

	@OriginalMember(owner = "client!hc", name = "L", descriptor = "Lclient!rba;")
	public Class3_Sub28 aClass3_Sub28_5;

	@OriginalMember(owner = "client!hc", name = "I", descriptor = "I")
	public int anInt4383;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(B)I")
	@Override
	public int method3688() {
		return this.aClass3_Sub28_5 == null ? 0 : this.aClass3_Sub28_5.anInt6241 * 100 / (this.aClass3_Sub28_5.aByteArray50.length - this.aByte77);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method3686() {
		if (super.aBoolean389 || this.aClass3_Sub28_5.aByteArray50.length - this.aByte77 > this.aClass3_Sub28_5.anInt6241) {
			throw new RuntimeException();
		}
		return this.aClass3_Sub28_5.aByteArray50;
	}
}
