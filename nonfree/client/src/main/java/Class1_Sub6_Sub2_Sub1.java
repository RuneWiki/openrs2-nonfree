import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public final class Class1_Sub6_Sub2_Sub1 extends Class1_Sub6_Sub2 {

	@OriginalMember(owner = "client!jj", name = "D", descriptor = "I")
	public int anInt4512;

	@OriginalMember(owner = "client!jj", name = "E", descriptor = "[B")
	public byte[] aByteArray50;

	@OriginalMember(owner = "client!jj", name = "F", descriptor = "Lclient!wo;")
	public Class360 aClass360_1;

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(I)I")
	@Override
	public int method7269() {
		return super.aBoolean688 ? 0 : 100;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method7266() {
		if (super.aBoolean688) {
			throw new RuntimeException();
		}
		return this.aByteArray50;
	}
}
