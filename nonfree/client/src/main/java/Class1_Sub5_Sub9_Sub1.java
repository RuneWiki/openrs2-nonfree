import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public final class Class1_Sub5_Sub9_Sub1 extends Class1_Sub5_Sub9 {

	@OriginalMember(owner = "client!nu", name = "E", descriptor = "I")
	public int anInt4931;

	@OriginalMember(owner = "client!nu", name = "G", descriptor = "Lclient!vs;")
	public Class257 aClass257_3;

	@OriginalMember(owner = "client!nu", name = "M", descriptor = "[B")
	public byte[] aByteArray58;

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)I")
	@Override
	public int method5308() {
		return super.aBoolean740 ? 0 : 100;
	}

	@OriginalMember(owner = "client!nu", name = "e", descriptor = "(I)[B")
	@Override
	public byte[] method5312() {
		if (super.aBoolean740) {
			throw new RuntimeException();
		}
		return this.aByteArray58;
	}
}
