import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public final class Class1_Sub2_Sub7_Sub2 extends Class1_Sub2_Sub7 {

	@OriginalMember(owner = "client!wf", name = "J", descriptor = "B")
	public byte aByte103;

	@OriginalMember(owner = "client!wf", name = "K", descriptor = "I")
	public int anInt7602;

	@OriginalMember(owner = "client!wf", name = "L", descriptor = "Lclient!lh;")
	public Class1_Sub1 aClass1_Sub1_8;

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "(I)I")
	@Override
	public int method5889() {
		return this.aClass1_Sub1_8 == null ? 0 : this.aClass1_Sub1_8.anInt5056 * 100 / (this.aClass1_Sub1_8.aByteArray66.length - this.aByte103);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method5887() {
		if (super.aBoolean481 || this.aClass1_Sub1_8.anInt5056 < this.aClass1_Sub1_8.aByteArray66.length - this.aByte103) {
			throw new RuntimeException();
		}
		return this.aClass1_Sub1_8.aByteArray66;
	}
}
