import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public final class Class7_Sub1_Sub8_Sub1 extends Class7_Sub1_Sub8 {

	@OriginalMember(owner = "client!ej", name = "R", descriptor = "I")
	public int anInt1817;

	@OriginalMember(owner = "client!ej", name = "X", descriptor = "Lclient!an;")
	public Class13 aClass13_1;

	@OriginalMember(owner = "client!ej", name = "Y", descriptor = "[B")
	public byte[] aByteArray23;

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(Z)[B")
	@Override
	public byte[] method5172() {
		if (super.aBoolean447) {
			throw new RuntimeException();
		}
		return this.aByteArray23;
	}

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "(I)I")
	@Override
	public int method5169() {
		return super.aBoolean447 ? 0 : 100;
	}
}
