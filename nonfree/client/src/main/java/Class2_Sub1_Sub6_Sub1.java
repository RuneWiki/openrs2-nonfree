import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public final class Class2_Sub1_Sub6_Sub1 extends Class2_Sub1_Sub6 {

	@OriginalMember(owner = "client!fu", name = "M", descriptor = "B")
	public byte aByte46;

	@OriginalMember(owner = "client!fu", name = "O", descriptor = "I")
	public int anInt3736;

	@OriginalMember(owner = "client!fu", name = "P", descriptor = "Lclient!ol;")
	public Class2_Sub8 aClass2_Sub8_4;

	@OriginalMember(owner = "client!fu", name = "i", descriptor = "(I)[B")
	@Override
	public byte[] method6765() {
		if (super.aBoolean566 || this.aClass2_Sub8_4.lb.length - this.aByte46 > this.aClass2_Sub8_4.anInt5725) {
			throw new RuntimeException();
		}
		return this.aClass2_Sub8_4.lb;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)I")
	@Override
	public int method6761() {
		return this.aClass2_Sub8_4 == null ? 0 : this.aClass2_Sub8_4.anInt5725 * 100 / (this.aClass2_Sub8_4.lb.length - this.aByte46);
	}
}
