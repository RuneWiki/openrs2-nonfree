import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public final class Class4_Sub5_Sub2_Sub1 extends Class4_Sub5_Sub2 {

	@OriginalMember(owner = "client!kc", name = "F", descriptor = "Lclient!es;")
	public Class4_Sub11 aClass4_Sub11_8;

	@OriginalMember(owner = "client!kc", name = "H", descriptor = "B")
	public byte aByte74;

	@OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
	public int anInt4774;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method6084() {
		if (super.aBoolean535 || this.aClass4_Sub11_8.aByteArray107.length - this.aByte74 > this.aClass4_Sub11_8.anInt10466) {
			throw new RuntimeException();
		}
		return this.aClass4_Sub11_8.aByteArray107;
	}

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "(I)I")
	@Override
	public int method6087() {
		return this.aClass4_Sub11_8 == null ? 0 : this.aClass4_Sub11_8.anInt10466 * 100 / (this.aClass4_Sub11_8.aByteArray107.length - this.aByte74);
	}
}
