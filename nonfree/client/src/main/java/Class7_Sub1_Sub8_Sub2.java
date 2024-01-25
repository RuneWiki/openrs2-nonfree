import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public final class Class7_Sub1_Sub8_Sub2 extends Class7_Sub1_Sub8 {

	@OriginalMember(owner = "client!uj", name = "O", descriptor = "B")
	public byte aByte73;

	@OriginalMember(owner = "client!uj", name = "P", descriptor = "I")
	public int anInt6122;

	@OriginalMember(owner = "client!uj", name = "R", descriptor = "Lclient!ap;")
	public Class7_Sub3 aClass7_Sub3_8;

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "(I)I")
	@Override
	public int method5169() {
		return this.aClass7_Sub3_8 == null ? 0 : this.aClass7_Sub3_8.anInt3005 * 100 / (this.aClass7_Sub3_8.aByteArray33.length - this.aByte73);
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(Z)[B")
	@Override
	public byte[] method5172() {
		if (super.aBoolean447 || this.aClass7_Sub3_8.aByteArray33.length - this.aByte73 > this.aClass7_Sub3_8.anInt3005) {
			throw new RuntimeException();
		}
		return this.aClass7_Sub3_8.aByteArray33;
	}
}
