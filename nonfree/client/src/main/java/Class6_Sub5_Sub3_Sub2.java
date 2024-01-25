import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public final class Class6_Sub5_Sub3_Sub2 extends Class6_Sub5_Sub3 {

	@OriginalMember(owner = "client!pi", name = "D", descriptor = "B")
	public byte aByte84;

	@OriginalMember(owner = "client!pi", name = "G", descriptor = "Lclient!jr;")
	public Class6_Sub12 aClass6_Sub12_5;

	@OriginalMember(owner = "client!pi", name = "H", descriptor = "I")
	public int anInt7227;

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(Z)[B")
	@Override
	public byte[] method5767() {
		if (super.aBoolean492 || this.aClass6_Sub12_5.anInt7556 < this.aClass6_Sub12_5.aByteArray97.length - this.aByte84) {
			throw new RuntimeException();
		}
		return this.aClass6_Sub12_5.aByteArray97;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)I")
	@Override
	public int method5769() {
		return this.aClass6_Sub12_5 == null ? 0 : this.aClass6_Sub12_5.anInt7556 * 100 / (this.aClass6_Sub12_5.aByteArray97.length - this.aByte84);
	}
}
