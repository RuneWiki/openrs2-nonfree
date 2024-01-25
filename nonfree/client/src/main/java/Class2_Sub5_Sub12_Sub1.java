import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public final class Class2_Sub5_Sub12_Sub1 extends Class2_Sub5_Sub12 {

	@OriginalMember(owner = "client!mu", name = "F", descriptor = "[B")
	public byte[] aByteArray48;

	@OriginalMember(owner = "client!mu", name = "G", descriptor = "I")
	public int anInt4268;

	@OriginalMember(owner = "client!mu", name = "H", descriptor = "Lclient!ro;")
	public Class217 aClass217_3;

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "(B)I")
	@Override
	public int method3885() {
		return super.aBoolean335 ? 0 : 100;
	}

	@OriginalMember(owner = "client!mu", name = "h", descriptor = "(I)[B")
	@Override
	public byte[] method3887() {
		if (super.aBoolean335) {
			throw new RuntimeException();
		}
		return this.aByteArray48;
	}
}
