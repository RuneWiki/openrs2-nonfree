import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public final class Class2_Sub6_Sub8_Sub2 extends Class2_Sub6_Sub8 {

	@OriginalMember(owner = "client!qh", name = "A", descriptor = "I")
	public int anInt8427;

	@OriginalMember(owner = "client!qh", name = "D", descriptor = "Lclient!nw;")
	public Class233 aClass233_3;

	@OriginalMember(owner = "client!qh", name = "I", descriptor = "[B")
	public byte[] aByteArray110;

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "(I)I")
	@Override
	public int method7142() {
		return super.aBoolean601 ? 0 : 100;
	}

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)[B")
	@Override
	public byte[] method7144() {
		if (super.aBoolean601) {
			throw new RuntimeException();
		}
		return this.aByteArray110;
	}
}
