import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public final class Class5_Sub4_Sub12_Sub1 extends Class5_Sub4_Sub12 {

	@OriginalMember(owner = "client!ic", name = "F", descriptor = "B")
	public byte aByte76;

	@OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
	public int anInt3933;

	@OriginalMember(owner = "client!ic", name = "M", descriptor = "Lclient!ee;")
	public Class5_Sub12 aClass5_Sub12_3;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)I")
	@Override
	public int method4029() {
		return this.aClass5_Sub12_3 == null ? 0 : this.aClass5_Sub12_3.anInt10154 * 100 / (this.aClass5_Sub12_3.aByteArray104.length - this.aByte76);
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)[B")
	@Override
	public byte[] method4030() {
		if (super.aBoolean358 || this.aClass5_Sub12_3.anInt10154 < this.aClass5_Sub12_3.aByteArray104.length - this.aByte76) {
			throw new RuntimeException();
		}
		return this.aClass5_Sub12_3.aByteArray104;
	}
}
