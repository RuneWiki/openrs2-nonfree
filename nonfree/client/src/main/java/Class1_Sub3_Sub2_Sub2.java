import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public final class Class1_Sub3_Sub2_Sub2 extends Class1_Sub3_Sub2 {

	@OriginalMember(owner = "client!tf", name = "I", descriptor = "Lclient!dh;")
	public Class1_Sub11 aClass1_Sub11_8;

	@OriginalMember(owner = "client!tf", name = "M", descriptor = "B")
	public byte aByte84;

	@OriginalMember(owner = "client!tf", name = "N", descriptor = "I")
	public int anInt6382;

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)I")
	@Override
	public int method4908() {
		return this.aClass1_Sub11_8 == null ? 0 : this.aClass1_Sub11_8.anInt5766 * 100 / (this.aClass1_Sub11_8.aByteArray64.length - this.aByte84);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method4906() {
		if (super.aBoolean524 || this.aClass1_Sub11_8.anInt5766 < this.aClass1_Sub11_8.aByteArray64.length - this.aByte84) {
			throw new RuntimeException();
		}
		return this.aClass1_Sub11_8.aByteArray64;
	}
}
