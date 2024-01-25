import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public final class Class5_Sub5_Sub8_Sub1 extends Class5_Sub5_Sub8 {

	@OriginalMember(owner = "client!ob", name = "x", descriptor = "Lclient!id;")
	public Class157 aClass157_4;

	@OriginalMember(owner = "client!ob", name = "F", descriptor = "[B")
	public byte[] aByteArray67;

	@OriginalMember(owner = "client!ob", name = "G", descriptor = "I")
	public int anInt6451;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)I")
	@Override
	public int method8531() {
		return super.aBoolean706 ? 0 : 100;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)[B")
	@Override
	public byte[] method8529() {
		if (super.aBoolean706) {
			throw new RuntimeException();
		}
		return this.aByteArray67;
	}
}
