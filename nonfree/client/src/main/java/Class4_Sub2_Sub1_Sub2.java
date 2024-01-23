import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public final class Class4_Sub2_Sub1_Sub2 extends Class4_Sub2_Sub1 {

	@OriginalMember(owner = "client!vg", name = "J", descriptor = "I")
	public int anInt5626;

	@OriginalMember(owner = "client!vg", name = "Q", descriptor = "B")
	public byte aByte22;

	@OriginalMember(owner = "client!vg", name = "W", descriptor = "Lclient!pi;")
	public Class4_Sub24 aClass4_Sub24_49;

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "(I)I")
	@Override
	public int method4498() {
		return this.aClass4_Sub24_49 == null ? 0 : this.aClass4_Sub24_49.anInt3822 * 100 / (this.aClass4_Sub24_49.aByteArray47.length - this.aByte22);
	}

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "(I)[B")
	@Override
	public byte[] method4495() {
		if (this.aBoolean388 || this.aClass4_Sub24_49.aByteArray47.length - this.aByte22 > this.aClass4_Sub24_49.anInt3822) {
			throw new RuntimeException();
		}
		return this.aClass4_Sub24_49.aByteArray47;
	}
}
