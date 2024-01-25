import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public final class Class6_Sub2_Sub4_Sub1 extends Class6_Sub2_Sub4 {

	@OriginalMember(owner = "client!hfa", name = "E", descriptor = "[B")
	public byte[] aByteArray31;

	@OriginalMember(owner = "client!hfa", name = "L", descriptor = "I")
	public int anInt3864;

	@OriginalMember(owner = "client!hfa", name = "M", descriptor = "Lclient!kf;")
	public Class172 aClass172_1;

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(B)I")
	@Override
	public int method4909() {
		return super.aBoolean400 ? 0 : 100;
	}

	@OriginalMember(owner = "client!hfa", name = "d", descriptor = "(I)[B")
	@Override
	public byte[] method4908() {
		if (super.aBoolean400) {
			throw new RuntimeException();
		}
		return this.aByteArray31;
	}
}
