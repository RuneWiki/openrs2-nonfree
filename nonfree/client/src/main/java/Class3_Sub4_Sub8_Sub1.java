import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public final class Class3_Sub4_Sub8_Sub1 extends Class3_Sub4_Sub8 {

	@OriginalMember(owner = "client!kaa", name = "F", descriptor = "Lclient!sd;")
	public Class294 aClass294_6;

	@OriginalMember(owner = "client!kaa", name = "J", descriptor = "I")
	public int anInt5577;

	@OriginalMember(owner = "client!kaa", name = "K", descriptor = "[B")
	public byte[] aByteArray65;

	@OriginalMember(owner = "client!kaa", name = "c", descriptor = "(I)I")
	@Override
	public int method7554() {
		return super.aBoolean781 ? 0 : 100;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method7551() {
		if (super.aBoolean781) {
			throw new RuntimeException();
		}
		return this.aByteArray65;
	}
}
