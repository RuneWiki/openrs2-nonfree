import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public final class Class5_Sub5_Sub7_Sub1 extends Class5_Sub5_Sub7 {

	@OriginalMember(owner = "client!ih", name = "E", descriptor = "I")
	public int anInt4302;

	@OriginalMember(owner = "client!ih", name = "y", descriptor = "B")
	public byte aByte64;

	@OriginalMember(owner = "client!ih", name = "B", descriptor = "Lclient!ib;")
	public Class5_Sub23 aClass5_Sub23_3;

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)I")
	@Override
	public int method7065() {
		return this.aClass5_Sub23_3 == null ? 0 : this.aClass5_Sub23_3.anInt9869 * 100 / (this.aClass5_Sub23_3.aByteArray102.length - this.aByte64);
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(B)[B")
	@Override
	public byte[] method7061() {
		if (super.aBoolean613 || this.aClass5_Sub23_3.anInt9869 < this.aClass5_Sub23_3.aByteArray102.length - this.aByte64) {
			throw new RuntimeException();
		}
		return this.aClass5_Sub23_3.aByteArray102;
	}
}
