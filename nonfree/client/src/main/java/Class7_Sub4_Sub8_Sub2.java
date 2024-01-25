import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public final class Class7_Sub4_Sub8_Sub2 extends Class7_Sub4_Sub8 {

	@OriginalMember(owner = "client!rp", name = "C", descriptor = "Lclient!gk;")
	public Class7_Sub14 aClass7_Sub14_7;

	@OriginalMember(owner = "client!rp", name = "F", descriptor = "B")
	public byte aByte63;

	@OriginalMember(owner = "client!rp", name = "G", descriptor = "I")
	public int anInt5636;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method4536() {
		if (super.aBoolean380 || this.aClass7_Sub14_7.aByteArray75.length - this.aByte63 > this.aClass7_Sub14_7.anInt4989) {
			throw new RuntimeException();
		}
		return this.aClass7_Sub14_7.aByteArray75;
	}

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "(I)I")
	@Override
	public int method4537() {
		return this.aClass7_Sub14_7 == null ? 0 : this.aClass7_Sub14_7.anInt4989 * 100 / (this.aClass7_Sub14_7.aByteArray75.length - this.aByte63);
	}
}
