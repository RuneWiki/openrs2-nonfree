import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public final class Class1_Sub4_Sub5_Sub1 extends Class1_Sub4_Sub5 {

	@OriginalMember(owner = "client!ca", name = "I", descriptor = "Lclient!pp;")
	public Class166 aClass166_1;

	@OriginalMember(owner = "client!ca", name = "M", descriptor = "[B")
	public byte[] aByteArray18;

	@OriginalMember(owner = "client!ca", name = "S", descriptor = "I")
	public int anInt1165;

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)I")
	@Override
	public int method4677() {
		return super.aBoolean519 ? 0 : 100;
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)[B")
	@Override
	public byte[] method4679() {
		if (super.aBoolean519) {
			throw new RuntimeException();
		}
		return this.aByteArray18;
	}
}
