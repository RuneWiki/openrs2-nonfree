import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public final class Class6_Sub4_Sub11_Sub1 extends Class6_Sub4_Sub11 {

	@OriginalMember(owner = "client!nda", name = "I", descriptor = "Lclient!pn;")
	public Class274 aClass274_4;

	@OriginalMember(owner = "client!nda", name = "J", descriptor = "[B")
	public byte[] aByteArray73;

	@OriginalMember(owner = "client!nda", name = "K", descriptor = "I")
	public int anInt6516;

	@OriginalMember(owner = "client!nda", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method7235() {
		if (super.aBoolean588) {
			throw new RuntimeException();
		}
		return this.aByteArray73;
	}

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "(B)I")
	@Override
	public int method7236() {
		return super.aBoolean588 ? 0 : 100;
	}
}
