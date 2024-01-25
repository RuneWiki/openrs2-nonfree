import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public final class Class8_Sub5_Sub13_Sub1 extends Class8_Sub5_Sub13 {

	@OriginalMember(owner = "client!oe", name = "D", descriptor = "I")
	public int anInt7543;

	@OriginalMember(owner = "client!oe", name = "G", descriptor = "B")
	public byte aByte74;

	@OriginalMember(owner = "client!oe", name = "L", descriptor = "Lclient!ig;")
	public Class8_Sub8 aClass8_Sub8_9;

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)[B")
	@Override
	public byte[] method7301() {
		if (super.aBoolean624 || this.aClass8_Sub8_9.anInt10588 < this.aClass8_Sub8_9.aByteArray107.length - this.aByte74) {
			throw new RuntimeException();
		}
		return this.aClass8_Sub8_9.aByteArray107;
	}

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "(I)I")
	@Override
	public int method7304() {
		return this.aClass8_Sub8_9 == null ? 0 : this.aClass8_Sub8_9.anInt10588 * 100 / (this.aClass8_Sub8_9.aByteArray107.length - this.aByte74);
	}
}
