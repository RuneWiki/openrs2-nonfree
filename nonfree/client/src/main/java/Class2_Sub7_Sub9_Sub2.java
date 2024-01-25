import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public final class Class2_Sub7_Sub9_Sub2 extends Class2_Sub7_Sub9 {

	@OriginalMember(owner = "client!ue", name = "y", descriptor = "B")
	public byte aByte127;

	@OriginalMember(owner = "client!ue", name = "B", descriptor = "Lclient!sl;")
	public Class2_Sub17 aClass2_Sub17_9;

	@OriginalMember(owner = "client!ue", name = "H", descriptor = "I")
	public int anInt9374;

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)I")
	@Override
	public int method7966() {
		return this.aClass2_Sub17_9 == null ? 0 : this.aClass2_Sub17_9.anInt3378 * 100 / (this.aClass2_Sub17_9.aByteArray26.length - this.aByte127);
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)[B")
	@Override
	public byte[] method7965() {
		if (super.aBoolean672 || this.aClass2_Sub17_9.anInt3378 < this.aClass2_Sub17_9.aByteArray26.length - this.aByte127) {
			throw new RuntimeException();
		}
		return this.aClass2_Sub17_9.aByteArray26;
	}
}
