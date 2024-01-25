import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public final class Class1_Sub2_Sub8_Sub2 extends Class1_Sub2_Sub8 {

	@OriginalMember(owner = "client!pp", name = "O", descriptor = "I")
	public int anInt5358;

	@OriginalMember(owner = "client!pp", name = "P", descriptor = "Lclient!hp;")
	public Class1_Sub5 aClass1_Sub5_5;

	@OriginalMember(owner = "client!pp", name = "R", descriptor = "B")
	public byte aByte84;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)I")
	@Override
	public int method4411() {
		return this.aClass1_Sub5_5 == null ? 0 : this.aClass1_Sub5_5.anInt6475 * 100 / (this.aClass1_Sub5_5.aByteArray89.length - this.aByte84);
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(Z)[B")
	@Override
	public byte[] method4412() {
		if (super.aBoolean385 || this.aClass1_Sub5_5.anInt6475 < this.aClass1_Sub5_5.aByteArray89.length - this.aByte84) {
			throw new RuntimeException();
		}
		return this.aClass1_Sub5_5.aByteArray89;
	}
}
