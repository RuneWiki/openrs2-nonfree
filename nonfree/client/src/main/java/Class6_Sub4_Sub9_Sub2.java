import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public final class Class6_Sub4_Sub9_Sub2 extends Class6_Sub4_Sub9 {

	@OriginalMember(owner = "client!wh", name = "C", descriptor = "I")
	public int anInt9636;

	@OriginalMember(owner = "client!wh", name = "G", descriptor = "Lclient!qn;")
	public Class266 aClass266_6;

	@OriginalMember(owner = "client!wh", name = "H", descriptor = "[B")
	public byte[] aByteArray125;

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)I")
	@Override
	public int method8038() {
		return super.aBoolean715 ? 0 : 100;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)[B")
	@Override
	public byte[] method8037() {
		if (super.aBoolean715) {
			throw new RuntimeException();
		}
		return this.aByteArray125;
	}
}
