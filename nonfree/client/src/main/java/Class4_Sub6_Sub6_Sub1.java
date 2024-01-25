import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public final class Class4_Sub6_Sub6_Sub1 extends Class4_Sub6_Sub6 {

	@OriginalMember(owner = "client!ew", name = "J", descriptor = "Lclient!ek;")
	public Class4_Sub13 aClass4_Sub13_3;

	@OriginalMember(owner = "client!ew", name = "K", descriptor = "I")
	public int anInt2956;

	@OriginalMember(owner = "client!ew", name = "N", descriptor = "B")
	public byte aByte50;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method6777() {
		if (super.aBoolean619 || this.aClass4_Sub13_3.aByteArray88.length - this.aByte50 > this.aClass4_Sub13_3.anInt9170) {
			throw new RuntimeException();
		}
		return this.aClass4_Sub13_3.aByteArray88;
	}

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "(I)I")
	@Override
	public int method6779() {
		return this.aClass4_Sub13_3 == null ? 0 : this.aClass4_Sub13_3.anInt9170 * 100 / (this.aClass4_Sub13_3.aByteArray88.length - this.aByte50);
	}
}
