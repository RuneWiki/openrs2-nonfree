import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public final class Class6_Sub2_Sub1_Sub1 extends Class6_Sub2_Sub1 {

	@OriginalMember(owner = "client!af", name = "J", descriptor = "I")
	public int anInt176;

	@OriginalMember(owner = "client!af", name = "G", descriptor = "Lclient!jc;")
	public Class6_Sub15 aClass6_Sub15_6;

	@OriginalMember(owner = "client!af", name = "F", descriptor = "B")
	public byte aByte1;

	@OriginalMember(owner = "client!af", name = "h", descriptor = "(I)I")
	@Override
	public int method3115() {
		return this.aClass6_Sub15_6 == null ? 0 : this.aClass6_Sub15_6.anInt3174 * 100 / (this.aClass6_Sub15_6.aByteArray20.length - this.aByte1);
	}

	@OriginalMember(owner = "client!af", name = "i", descriptor = "(I)[B")
	@Override
	public byte[] method3112() {
		if (super.aBoolean259 || this.aClass6_Sub15_6.anInt3174 < this.aClass6_Sub15_6.aByteArray20.length - this.aByte1) {
			throw new RuntimeException();
		}
		return this.aClass6_Sub15_6.aByteArray20;
	}
}
