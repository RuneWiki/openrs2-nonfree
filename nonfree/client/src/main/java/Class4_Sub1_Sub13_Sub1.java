import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public final class Class4_Sub1_Sub13_Sub1 extends Class4_Sub1_Sub13 {

	@OriginalMember(owner = "client!ij", name = "P", descriptor = "Lclient!wn;")
	public Class4_Sub20 aClass4_Sub20_1;

	@OriginalMember(owner = "client!ij", name = "U", descriptor = "B")
	public byte aByte20;

	@OriginalMember(owner = "client!ij", name = "ab", descriptor = "I")
	public int anInt3349;

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "(B)[B")
	@Override
	public byte[] method5988() {
		if (super.aBoolean542 || this.aClass4_Sub20_1.aByteArray77.length - this.aByte20 > this.aClass4_Sub20_1.anInt5526) {
			throw new RuntimeException();
		}
		return this.aClass4_Sub20_1.aByteArray77;
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)I")
	@Override
	public int method5989() {
		return this.aClass4_Sub20_1 == null ? 0 : this.aClass4_Sub20_1.anInt5526 * 100 / (this.aClass4_Sub20_1.aByteArray77.length - this.aByte20);
	}
}
