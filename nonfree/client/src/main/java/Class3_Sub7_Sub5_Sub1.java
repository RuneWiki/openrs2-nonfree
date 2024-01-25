import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public final class Class3_Sub7_Sub5_Sub1 extends Class3_Sub7_Sub5 {

	@OriginalMember(owner = "client!nn", name = "H", descriptor = "Lclient!ie;")
	public Class3_Sub26 aClass3_Sub26_4;

	@OriginalMember(owner = "client!nn", name = "O", descriptor = "B")
	public byte aByte88;

	@OriginalMember(owner = "client!nn", name = "T", descriptor = "I")
	public int anInt6455;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)I")
	@Override
	public int method7580() {
		return this.aClass3_Sub26_4 == null ? 0 : this.aClass3_Sub26_4.anInt8703 * 100 / (this.aClass3_Sub26_4.aByteArray213.length - this.aByte88);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Z)[B")
	@Override
	public byte[] method7579() {
		if (super.aBoolean636 || this.aClass3_Sub26_4.anInt8703 < this.aClass3_Sub26_4.aByteArray213.length - this.aByte88) {
			throw new RuntimeException();
		}
		return this.aClass3_Sub26_4.aByteArray213;
	}
}
