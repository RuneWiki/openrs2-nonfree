import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public final class Class1_Sub2_Sub1_Sub1 extends Class1_Sub2_Sub1 {

	@OriginalMember(owner = "client!ab", name = "W", descriptor = "B")
	public byte aByte1;

	@OriginalMember(owner = "client!ab", name = "ab", descriptor = "Lclient!jj;")
	public Class1_Sub18 aClass1_Sub18_1;

	@OriginalMember(owner = "client!ab", name = "bb", descriptor = "I")
	public int anInt145;

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "(I)I")
	@Override
	public int method2547() {
		return this.aClass1_Sub18_1 == null ? 0 : this.aClass1_Sub18_1.anInt3911 * 100 / (this.aClass1_Sub18_1.aByteArray71.length - this.aByte1);
	}

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method2546() {
		if (this.aBoolean233 || this.aClass1_Sub18_1.aByteArray71.length - this.aByte1 > this.aClass1_Sub18_1.anInt3911) {
			throw new RuntimeException();
		}
		return this.aClass1_Sub18_1.aByteArray71;
	}
}
