import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public final class Class5_Sub3_Sub11_Sub2 extends Class5_Sub3_Sub11 {

	@OriginalMember(owner = "client!pq", name = "z", descriptor = "[B")
	public byte[] aByteArray74;

	@OriginalMember(owner = "client!pq", name = "E", descriptor = "Lclient!cr;")
	public Class71 aClass71_4;

	@OriginalMember(owner = "client!pq", name = "F", descriptor = "I")
	public int anInt7777;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)I")
	@Override
	public int method6565() {
		return super.aBoolean664 ? 0 : 100;
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)[B")
	@Override
	public byte[] method6567() {
		if (super.aBoolean664) {
			throw new RuntimeException();
		}
		return this.aByteArray74;
	}
}
