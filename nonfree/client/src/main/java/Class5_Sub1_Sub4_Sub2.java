import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public final class Class5_Sub1_Sub4_Sub2 extends Class5_Sub1_Sub4 {

	@OriginalMember(owner = "client!sv", name = "M", descriptor = "I")
	public int anInt8871;

	@OriginalMember(owner = "client!sv", name = "I", descriptor = "B")
	public byte aByte126;

	@OriginalMember(owner = "client!sv", name = "E", descriptor = "Lclient!wq;")
	public Class5_Sub36 aClass5_Sub36_8;

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "(Z)I")
	@Override
	public int method7594() {
		return this.aClass5_Sub36_8 == null ? 0 : this.aClass5_Sub36_8.anInt8456 * 100 / (this.aClass5_Sub36_8.aByteArray89.length - this.aByte126);
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(Z)[B")
	@Override
	public byte[] method7596() {
		if (super.aBoolean589 || this.aClass5_Sub36_8.anInt8456 < this.aClass5_Sub36_8.aByteArray89.length - this.aByte126) {
			throw new RuntimeException();
		}
		return this.aClass5_Sub36_8.aByteArray89;
	}
}
