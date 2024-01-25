import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public final class Class3_Sub11_Sub2_Sub2 extends Class3_Sub11_Sub2 {

	@OriginalMember(owner = "client!fea", name = "F", descriptor = "Lclient!jp;")
	public Class3_Sub25 aClass3_Sub25_2;

	@OriginalMember(owner = "client!fea", name = "H", descriptor = "B")
	public byte aByte42;

	@OriginalMember(owner = "client!fea", name = "K", descriptor = "I")
	public int anInt3121;

	@OriginalMember(owner = "client!fea", name = "e", descriptor = "(I)I")
	@Override
	public int method2891() {
		return this.aClass3_Sub25_2 == null ? 0 : this.aClass3_Sub25_2.anInt9765 * 100 / (this.aClass3_Sub25_2.aByteArray106.length - this.aByte42);
	}

	@OriginalMember(owner = "client!fea", name = "d", descriptor = "(B)[B")
	@Override
	public byte[] method2889() {
		if (super.aBoolean237 || this.aClass3_Sub25_2.aByteArray106.length - this.aByte42 > this.aClass3_Sub25_2.anInt9765) {
			throw new RuntimeException();
		}
		return this.aClass3_Sub25_2.aByteArray106;
	}
}
