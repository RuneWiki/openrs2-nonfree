import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public final class Class3_Sub7_Sub5_Sub2 extends Class3_Sub7_Sub5 {

	@OriginalMember(owner = "client!uu", name = "O", descriptor = "I")
	public int anInt9661;

	@OriginalMember(owner = "client!uu", name = "R", descriptor = "[B")
	public byte[] aByteArray232;

	@OriginalMember(owner = "client!uu", name = "S", descriptor = "Lclient!mu;")
	public Class215 aClass215_10;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)I")
	@Override
	public int method7580() {
		return super.aBoolean636 ? 0 : 100;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Z)[B")
	@Override
	public byte[] method7579() {
		if (super.aBoolean636) {
			throw new RuntimeException();
		}
		return this.aByteArray232;
	}
}
