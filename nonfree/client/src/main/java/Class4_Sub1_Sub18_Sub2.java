import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public final class Class4_Sub1_Sub18_Sub2 extends Class4_Sub1_Sub18 {

	@OriginalMember(owner = "client!r", name = "E", descriptor = "Lclient!tq;")
	public Class4_Sub7 aClass4_Sub7_7;

	@OriginalMember(owner = "client!r", name = "L", descriptor = "B")
	public byte aByte67;

	@OriginalMember(owner = "client!r", name = "U", descriptor = "I")
	public int anInt5511;

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(I)I")
	@Override
	public int method4683() {
		return this.aClass4_Sub7_7 == null ? 0 : this.aClass4_Sub7_7.anInt2667 * 100 / (this.aClass4_Sub7_7.aByteArray42.length - this.aByte67);
	}

	@OriginalMember(owner = "client!r", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method4684() {
		if (super.aBoolean489 || this.aClass4_Sub7_7.anInt2667 < this.aClass4_Sub7_7.aByteArray42.length - this.aByte67) {
			throw new RuntimeException();
		}
		return this.aClass4_Sub7_7.aByteArray42;
	}
}
