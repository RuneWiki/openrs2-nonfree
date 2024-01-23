import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public final class Class1_Sub3_Sub4_Sub1 extends Class1_Sub3_Sub4 {

	@OriginalMember(owner = "client!dj", name = "ab", descriptor = "Lclient!ja;")
	public Class83 aClass83_1;

	@OriginalMember(owner = "client!dj", name = "bb", descriptor = "I")
	public int anInt1175;

	@OriginalMember(owner = "client!dj", name = "cb", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "(B)[B")
	@Override
	public byte[] method3229() {
		if (this.aBoolean275) {
			throw new RuntimeException();
		}
		return this.aByteArray39;
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(B)I")
	@Override
	public int method3228() {
		return this.aBoolean275 ? 0 : 100;
	}
}
