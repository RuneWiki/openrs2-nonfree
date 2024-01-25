import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public final class Class3_Sub7_Sub7_Sub1 extends Class3_Sub7_Sub7 {

	@OriginalMember(owner = "client!jga", name = "y", descriptor = "B")
	public byte aByte67;

	@OriginalMember(owner = "client!jga", name = "C", descriptor = "Lclient!ika;")
	public Class3_Sub2 aClass3_Sub2_3;

	@OriginalMember(owner = "client!jga", name = "x", descriptor = "I")
	public int anInt4923;

	@OriginalMember(owner = "client!jga", name = "e", descriptor = "(B)I")
	@Override
	public int method6875() {
		return this.aClass3_Sub2_3 == null ? 0 : this.aClass3_Sub2_3.anInt2178 * 100 / (this.aClass3_Sub2_3.aByteArray20.length - this.aByte67);
	}

	@OriginalMember(owner = "client!jga", name = "d", descriptor = "(B)[B")
	@Override
	public byte[] method6874() {
		if (super.aBoolean537 || this.aClass3_Sub2_3.anInt2178 < this.aClass3_Sub2_3.aByteArray20.length - this.aByte67) {
			throw new RuntimeException();
		}
		return this.aClass3_Sub2_3.aByteArray20;
	}
}
