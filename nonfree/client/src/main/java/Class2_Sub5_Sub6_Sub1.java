import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public final class Class2_Sub5_Sub6_Sub1 extends Class2_Sub5_Sub6 {

	@OriginalMember(owner = "client!gq", name = "H", descriptor = "B")
	public byte aByte75;

	@OriginalMember(owner = "client!gq", name = "J", descriptor = "Lclient!ud;")
	public Class2_Sub34 aClass2_Sub34_9;

	@OriginalMember(owner = "client!gq", name = "K", descriptor = "I")
	public int anInt4144;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Z)I")
	@Override
	public int method4186() {
		return this.aClass2_Sub34_9 == null ? 0 : this.aClass2_Sub34_9.anInt8188 * 100 / (this.aClass2_Sub34_9.aByteArray77.length - this.aByte75);
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)[B")
	@Override
	public byte[] method4188() {
		if (super.aBoolean400 || this.aClass2_Sub34_9.aByteArray77.length - this.aByte75 > this.aClass2_Sub34_9.anInt8188) {
			throw new RuntimeException();
		}
		return this.aClass2_Sub34_9.aByteArray77;
	}
}
