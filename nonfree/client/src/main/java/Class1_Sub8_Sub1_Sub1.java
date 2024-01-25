import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public final class Class1_Sub8_Sub1_Sub1 extends Class1_Sub8_Sub1 {

	@OriginalMember(owner = "client!aw", name = "I", descriptor = "I")
	public int anInt619;

	@OriginalMember(owner = "client!aw", name = "J", descriptor = "[B")
	public byte[] aByteArray3;

	@OriginalMember(owner = "client!aw", name = "N", descriptor = "Lclient!sp;")
	public Class313 aClass313_1;

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(B)I")
	@Override
	public int method5911() {
		return super.aBoolean563 ? 0 : 100;
	}

	@OriginalMember(owner = "client!aw", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method5914() {
		if (super.aBoolean563) {
			throw new RuntimeException();
		}
		return this.aByteArray3;
	}
}
