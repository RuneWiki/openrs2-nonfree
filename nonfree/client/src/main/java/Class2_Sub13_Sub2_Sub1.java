import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public final class Class2_Sub13_Sub2_Sub1 extends Class2_Sub13_Sub2 {

	@OriginalMember(owner = "client!dea", name = "C", descriptor = "I")
	public int anInt1737;

	@OriginalMember(owner = "client!dea", name = "E", descriptor = "[B")
	public byte[] aByteArray43;

	@OriginalMember(owner = "client!dea", name = "K", descriptor = "Lclient!saa;")
	public Class257 aClass257_1;

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)I")
	@Override
	public int method5810() {
		return super.aBoolean514 ? 0 : 100;
	}

	@OriginalMember(owner = "client!dea", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method5809() {
		if (super.aBoolean514) {
			throw new RuntimeException();
		}
		return this.aByteArray43;
	}
}
